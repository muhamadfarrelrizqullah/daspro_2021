import java.util.Scanner;
public class Quiz2{
   public static void main(String[] args) {

int [][] bil1 = new int[2][2];
int [][] bil2 = new int[2][2];
int [][] hasil = new int[2][2];

        for (int b = 0; b < bil1.length; b++){
            for (int k = 0; k < bil1[0].length; k++){
                System.out.println(" Input Matriks Pertama : ");
                bil1[b][k] = sc.nextInt();
            }
        }
        for (int b = 0; b < bil2.length; b++){
            for (int k = 0; k < bil2[0].length; k++){
                System.out.println(" Input Matriks Kedua : ");
                bil2[b][k] = sc.nextInt();
            }
        }
        for (int b = 0; b < jum.length; b++){
            for (int k = 0; k < jum[0].length; k++){
                hasil[b][k] = bil1[b][k] + bil2[b][k];
            }

            
        }
        System.out.println(hasil[][]);

    }
}