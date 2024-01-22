import java.util.Scanner;

public class Percb3{
   public static void main(String[] args) {

Scanner input=new Scanner(System.in);
int angka, faktorial=1;

System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN DO-WHILE=====");
System.out.print("Masukkan Bilangan : ");
angka = input.nextInt();
int i=1;
do{
   faktorial*=i;
   i++;
}
while(i<=angka);
System.out.print("Nilai faktorial bilangan tersebut adalah : "+ faktorial);




}
}