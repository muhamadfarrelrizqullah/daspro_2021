import java.util.Scanner;

public class Struk4{
   public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int angka, total=0, count;
double avg;
count=0;
System.out.println("===PROGRAM FOR LOOP DENGAN CONTINUE===");
for(int i=0;i<5;i++){
   System.out.print("Masukkan Bilangan : ");
   angka=input.nextInt();
   if(angka>=50) continue;
   total+=angka;
   count++;
}
System.out.println("Jumlah angka-angka yang kurang dari 50 : "+total);
avg=(double)total/count;
System.out.println("Rata-rata angka yang kurang dari 50 : "+avg);





}
}