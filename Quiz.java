import java.util.Scanner;
public class Quiz{
   public static void main(String[] args) {


int angka =1;
int n;

Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai N : ");
n = input.nextInt();

for (int i = 0; i < n; i++){
   System.out.print( angka +" ");
        angka = angka*3;

    }

}
}
