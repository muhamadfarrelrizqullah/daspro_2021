import java.util.Scanner;

public class uts1{
   public static void main(String[] args) {

Scanner input = new Scanner(System.in);
int totalHargaKubik, hargaKubik;
int jumlahKubik;

System.out.println("Jumlah pemakaian dalam kubik : ");
jumlahKubik = input.nextInt();

if (jumlahKubik > 0){
   if (jumlahKubik <= 50){
      hargaKubik = 1000;
      totalHargaKubik = jumlahKubik * hargaKubik;
       System.out.println("Harga pemakain kubik : " + totalHargaKubik);
   } else if (jumlahKubik <= 100){
      hargaKubik = 1500;
      totalHargaKubik = jumlahKubik * hargaKubik;
       System.out.println("Harga pemakain kubik : " + totalHargaKubik);
   } else if (jumlahKubik <= 150){
      hargaKubik = 2000;
      totalHargaKubik = jumlahKubik * hargaKubik;
       System.out.println("Harga pemakain kubik : " + totalHargaKubik);
   } else if (jumlahKubik > 150){
      hargaKubik = 2000;
      totalHargaKubik = jumlahKubik * hargaKubik;
       System.out.println("Harga pemakain kubik : " + totalHargaKubik);
      }  

}
else {
    System.out.println("Jumlah pemakaian dalam kubik yang anda masukkan salah ");
}

}
}
