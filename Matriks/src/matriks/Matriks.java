/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

import java.util.Scanner;

/**
 *
 * @author 17523220
 */
public class Matriks {
     int M1[][]=new int[10][10];                                                //Menentukan batas besar matriks
     int M2[][]=new int[10][10];
     int M3[][]=new int[10][10];
     int nB,nK;                                                                 //nB = banyak baris, nK = banyak kolom
     Scanner sc = new Scanner(System.in);
    
    public void ordo(){                                                                       
        System.out.print("Masukan jumlah baris Matriks = ");                    //Memasukkan Ukuran Matriks
        nB=sc.nextInt();
        System.out.print("Masukan jumlah Kolom Matriks = ");
        nK=sc.nextInt();
   
    }
    public void  inputMatriks(){
        System.out.println();                                                   // Memasukkan Isi untuk Matriks1
        System.out.println("Masukan Matriks 1 ordo("+nB+","+nK+") : ");
        for (int baris =0;baris<nB;baris++){
            for (int kolom=0;kolom<nK;kolom++){
                System.out.print("Matriks1("+baris+","+kolom+") : ");
                M1[baris][kolom]=sc.nextInt();
            }
        }
        System.out.println();
                                                                                //Memasukkan Isi untuk Matriks2
        System.out.println("Masukan Matriks 2 ordo("+nB+","+nK+") : ");
        for (int baris =0;baris<nB;baris++){
            for (int kolom=0;kolom<nK;kolom++){
                System.out.print("Matriks1("+baris+","+kolom+") : ");
                M2[baris][kolom]=sc.nextInt();
            }
        }
    }    
        public void outputMatriks(int n){
            if (n==1){                                                          //Mengeluarkan matriks1
                System.out.println();
                System.out.println("Matriks 1 = ");
                for (int baris =0;baris<nB;baris++){
                    for (int kolom=0;kolom<nK;kolom++){
                        System.out.print(M1[baris][kolom]+" ");
                }
                System.out.println();

                }
            }else if(n==2){                                                     //Mengeluarkan matriks2
                System.out.println();
                System.out.println("Matriks 2 = ");
                for (int baris =0;baris<nB;baris++){
                    for (int kolom=0;kolom<nK;kolom++){
                        System.out.print(M2[baris][kolom]+" ");
                }
                System.out.println();

                }
            }
            else if(n==3){                                                      //Mengeluarkan matriks3(Hasil Operasi)
                System.out.println();
                System.out.println("Matriks 3 = ");
                for (int baris =0;baris<nB;baris++){
                    for (int kolom=0;kolom<nK;kolom++){
                        System.out.print(M3[baris][kolom]+" ");
                }
                System.out.println();

                }
            }
    }
        public void penjumlahan(){                                              //Metode Penjumlahan
            System.out.println("Hasil dari penjumlahan Matriks : ");
            for (int baris=0;baris<nB;baris++){
                for (int kolom=0;kolom<nK;kolom++){
                    M3[baris][kolom]=M1[baris][kolom]+M2[baris][kolom];
                }
        
            }
        }
        public void pengurangan(){                                              //Metode Pengurangan
            System.out.println("Hasil dari penjumlahan Matriks : ");
            for (int baris=0;baris<nB;baris++){
                for (int kolom=0;kolom<nK;kolom++){
                    M3[baris][kolom]=M1[baris][kolom]-M2[baris][kolom];
                }
        
            }
        }
        public void perkalian(){                                                //Metode Perkalian
            System.out.println();
            for (int baris = 0;baris<nB;baris++){
                 for (int kolom =0;kolom<nK;kolom++){
                    M3[baris][kolom]=0;
                    for (int i =0;i<nK;i++){
                        int hasilkali=M1[baris][i]*M2[i][kolom];
                        M3[baris][kolom]=M3[baris][kolom]+hasilkali;
                    }   
                }
            }
            System.out.println("Transpose Matriks : ");
        }
        public void transpose(){                                                //Metode Transpose Matriks
            System.out.println();
            for (int baris = 0;baris<nB;baris++){
                for (int kolom =0;kolom<nK;kolom++){
                    M3[kolom][baris]=M1[baris][kolom];
                }
            }
        }
        public void scalar(){                                                   //Metode Perkalian Skalar Matriks
            System.out.println();
            System.out.print("Masukan nilai yang akan dikali kan :");
            int n = sc.nextInt();
            for (int baris = 0;baris<nB;baris++){
                for (int kolom =0;kolom<nK;kolom++){
                    M3[kolom][baris]=M1[baris][kolom]*n;
                }
            }
        }
        public void proses(int n){                                              //Pemrosesan Matriks sesuai Pilihan
            if(n==1){
                penjumlahan();
                outputMatriks(3);
            }else if(n==2){
                pengurangan();
                outputMatriks(3);
            }else if(n==3){
                perkalian();
                outputMatriks(3);
            }else if(n==4){
                scalar();
                outputMatriks(3);
            }else if(n==5){
                transpose();
                outputMatriks(3);
            }else{
                System.out.println("Terima Kasih :)");
            }
        }
        public int Menu(){                                                      //Tampilan Menu Pilihan Operasi
            System.out.println();
            System.out.println("Menu Operasi Matriks");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Perkalian Scalar");
            System.out.println("5. Transpose");
            System.out.println("0. Keluar");
            int p;
            do {
            System.out.print("Masukan pilihan(0-5) : ");
            p = sc.nextInt();
            }while(p<0 && p>5);
            return p;
        }
    
            
    public static void main(String[] args) {
        Matriks m = new Matriks();
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        
        int k;
        m.ordo();
        m.inputMatriks();
        m.outputMatriks(1);
        m.outputMatriks(2);
        do{
            k=m.Menu();
            m.proses(k);   
        }while(k!=0);
        
    }
    
}
