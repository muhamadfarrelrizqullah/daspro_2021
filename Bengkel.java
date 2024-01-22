import java.util.Scanner;

public class Bengkel{
   public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int oli, busi, dop, kampasRem, pilox;
 int diskon, totalBersih, totalKeseluruhan;
 int hargaOli = 40000, hargaBusi = 15000, hargaDop = 10000, hargaKampasRem = 25000, hargaPilox = 16000;
 int totalhargaOli,totalhargaBusi, totalhargaDop, totalhargaKampasRem, totalhargaPilox;

 System.out.print("Masukkan Jumlah Oli \t\t:\t");
 oli = sc.nextInt();

 totalhargaOli = oli * hargaOli;

 System.out.print("Masukkan Jumlah Busi \t\t:\t");
 busi = sc.nextInt();

 totalhargaBusi = busi * hargaBusi;

 System.out.print("Masukkan Jumlah Dop \t\t:\t");
 dop = sc.nextInt();

 totalhargaDop = dop * hargaDop;

 System.out.print("Masukkan Jumlah KampasRem \t:\t");
 kampasRem = sc.nextInt();

 totalhargaKampasRem = kampasRem * hargaKampasRem;

 System.out.print("Masukkan Jumlah Pilox \t\t:\t");
 pilox = sc.nextInt();

 totalhargaPilox = pilox * hargaPilox;
 
 totalKeseluruhan = totalhargaOli + totalhargaBusi + totalhargaDop + totalhargaKampasRem + totalhargaPilox;
 
 System.out.println("========================================================================================");
 System.out.println("\t\t\t\t Struk Total Harga Pembelian \t\t\t\t");
 System.out.println("\t\t\t\t        Bengkel Arya         \t\t\t\t");
 System.out.println("========================================================================================");
 System.out.println("\t Nama Barang \t|\t Harga \t|\t Jumlah \t|\t Total Harga \t");
 System.out.println("----------------------------------------------------------------------------------------");
 System.out.println(String.format("\t Oli \t\t|\t %s \t|\t   %s \t\t|\t %s \t", hargaOli, oli, totalhargaOli)); 
 System.out.println(String.format("\t Busi \t\t|\t %s \t|\t   %s \t\t|\t %s \t", hargaBusi, busi, totalhargaBusi)); 
 System.out.println(String.format("\t Dop \t\t|\t %s \t|\t   %s \t\t|\t %s \t", hargaDop, dop, totalhargaDop));
 System.out.println(String.format("\t Kampas Rem \t|\t %s \t|\t   %s \t\t|\t %s \t", hargaKampasRem, kampasRem, totalhargaKampasRem)); 
 System.out.println(String.format("\t Pilox \t\t|\t %s \t|\t   %s \t\t|\t %s \t", hargaPilox, pilox, totalhargaPilox));  
 System.out.println("----------------------------------------------------------------------------------------");
 
 if (totalKeseluruhan > 2000000)
 diskon= totalKeseluruhan * 15/100;
 else if (totalKeseluruhan > 1000000)
 diskon= totalKeseluruhan * 10/100;
 else if (totalKeseluruhan > 500000)
 diskon= totalKeseluruhan * 5/100;
 else if (totalKeseluruhan > 200000)
 diskon= totalKeseluruhan * 2/100;
 else
 diskon= 0;

System.out.println("Total Harga \t\t=\t"+ totalKeseluruhan);
System.out.println("Diskon \t\t\t=\t"+ diskon);

totalBersih = totalKeseluruhan - diskon;

System.out.println("Total Harga Bersih \t=\t"+ totalBersih);
}
}