import java.util.Scanner;

public class Percb2{
   public static void main(String[] args) {

Scanner input=new Scanner(System.in);
int angka, faktorial=1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
while(i<=angka){
   faktorial*=i;
   i++;
}
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);




}
}