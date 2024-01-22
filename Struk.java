import java.util.Scanner;

public class Struk{
   public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int angka, total;
System.out.println("===PROGRAM FOR LOOP DENGAN BREAK===");
for(total=0;true;){
   System.out.print("Masukkan Bilangan : ");
   angka=input.nextInt();
   total+=angka;
   if(total>50) break;
}
System.out.println("Jumlah angka-angka yang telah dimasukkan : "+total);





}
}