import java.util.Scanner;

public class percb1 {

static int i;
static int menu, dataBarang, jumMasuk, jumKeluar, jumRusak;
static String[] barang = {"Komputer", "Keyboard", "Headset", "Mouse", "Speaker"};
static int[] arrBarang;
static int[] arrTotal= {0, 0, 0, 0, 0};
static int[] arrTambah;

static int masukBarang(int n){
    Scanner sc = new Scanner(System.in);
    arrBarang = new int[n]; 
    for (int i = 0; i < arrBarang.length; i++){
        System.out.print("Masukkan jumlah barang "+ (i + 1) +" : ");
        arrBarang[i] = sc.nextInt();       
    }
    return i;
}

static int jumBarangMasuk(int m){
    Scanner sm = new Scanner(System.in);
    arrTambah = new int[m];

    for (int i = 0; i < arrTotal.length; i++){
        System.out.print("Masukkan jumlah barang masuk ke-"+ (i + 1) +" : ");
        arrTambah[i] = sm.nextInt();  
        arrTotal[i] = arrTambah[i] + arrBarang[i]; 
    }
    return i;
}

static int jumBarangKeluar(int k){
   
     for (int i = 0; i < arrTotal.length; i++){
        System.out.println(arrTotal[i]); 
    }
    return i;
}

static int jumBarangRusak(int r){
    Scanner sr = new Scanner(System.in);
    int[] arrRusak = new int[r];

    for (int i = 0; i < arrRusak.length; i++){
        System.out.print("Masukkan jumlah barang yang rusak ke-"+ (i + 1) +" : ");
        arrRusak[i] = sr.nextInt();       
    }
    return i;

}

public static void main(String[] args) {
int pilihLanjut;
boolean lanjut = true;
int jumBarang = 5;

Scanner input = new Scanner(System.in);
    while(lanjut){
    System.out.println("|===================================================|");
    System.out.println("|==================[ Menu Projek ]==================|");
    System.out.println("|===================================================|");
    System.out.println("[1]\tInput Data Barang");
    System.out.println("[2]\tMasukkan Barang");
    System.out.println("[3]\tTampil");
    System.out.println("[4]\tInput Jumlah Barang Rusak");

System.out.print("Pilih menu =>");
menu = input.nextInt();

if(menu==1){
    dataBarang = masukBarang(jumBarang);
} else if(menu==2){
    jumMasuk = jumBarangMasuk(jumBarang);
} else if (menu==3){
    jumKeluar = jumBarangKeluar(jumMasuk);
} else if (menu==4){
    jumRusak = jumBarangRusak(jumBarang);
} else {

}

System.out.println("Apakah mau lanjut ke menu? ");
System.out.println("Ketik 1 Untuk Lanjut ");
System.out.println("Ketik 0 Untuk Berhenti ");
pilihLanjut = input.nextInt();

if (pilihLanjut == 1) {
            lanjut = true;
        } else if (pilihLanjut == 0) {
            lanjut = false;
        } else {
            System.out.println("Input yang Anda masukkan salah");
        }
}
}
}