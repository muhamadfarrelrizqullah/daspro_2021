import java.util.Scanner;

public class coba {

static int i;
static int menu, dataBarang, jumMasuk, jumKeluar, jumRusak, pindah, laporan, pencarian;
static String[] barang = {"Monitor", "Keyboard", "Headset", "Controller", "Speaker", "Printer", "Flashdisk"};
static int[] arrBarang;
static int[] arrTambah;
static int[] arrTambahFinal = {0, 0, 0, 0, 0, 0, 0};
static int[] arrKurangFinal = {0, 0, 0, 0, 0, 0, 0};
static int[] arrKurang;
static int[] arrRusak;
static String[] arrGudang;
static int[] arrLapor;
static int[] arrTotalKurang= {0, 0, 0, 0, 0, 0, 0};
static int[] totFinal = new int[99];
static Scanner sc = new Scanner(System.in);

static void cls(){

    try{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch(Exception C){
        System.out.println(C);
    }

}

static int masukBarang(int n){

    cls();
    arrBarang = new int[n]; 

    System.out.println("=====================================================================");
    System.out.println("\t\t\t  [ Data Barang ]  \t\t\t");
    System.out.println("=====================================================================");

    for (int i = 0; i < arrBarang.length; i++){
        System.out.print("Masukkan Jumlah Barang "+ barang[i] + " sebanyak \t: ");
        arrBarang[i] = sc.nextInt();
        totFinal[i]+=  arrBarang[i];       
    }
    return i;

}

static int jumBarangMasuk(int m){

    cls();
    arrTambah = new int[m];

    System.out.println("=====================================================================");
    System.out.println("\t\t\t  [ Tambah Barang ]  \t\t\t");
    System.out.println("=====================================================================");

    for (int i = 0; i < arrTambah.length; i++){
        System.out.print("Jumlah Barang "+ barang[i] +" yang Akan di Masukkan \t: ");
        arrTambah[i] = sc.nextInt();
        totFinal[i]+= arrTambah[i];
        arrTambahFinal[i]+= arrTambah[i];

    }
    return i;

}

static int jumBarangKeluar(int k){

    cls();
    arrKurang = new int[k];

    System.out.println("====================================================================");
    System.out.println("\t\t\t  [ Ambil Barang ]  \t\t\t");
    System.out.println("====================================================================");

    for (int i = 0; i < arrKurang.length; i++){
        System.out.print("Jumlah Barang "+ barang[i] +" yang Akan di Ambil \t: ");
        arrKurang[i] = sc.nextInt();  
        arrTotalKurang[i] = arrBarang[i] - arrKurang[i]; 
        totFinal[i]-=  arrKurang[i];
        arrKurangFinal[i]+= arrKurang[i];

    }
    return i;

}

static int jumBarangRusak(int r){

    cls();
    arrRusak = new int[r]; 

    System.out.println("====================================================================");
    System.out.println("\t\t\t  [ Barang Rusak ]  \t\t\t");
    System.out.println("====================================================================");

    for (int i = 0; i < arrRusak.length; i++){
        System.out.print("Masukkan Jumlah Barang "+ barang[i]  +" yang Rusak \t: ");
         arrRusak[i] = sc.nextInt();       
    }
    return i;

}

static int pindahGudang(int p){

    cls();
    arrGudang = new String[p];

    System.out.println("=====================================================================");
    System.out.println("\t\t\t  [ Pindah Barang ]  \t\t\t");
    System.out.println("=====================================================================");

    for (int i = 0; i < arrGudang.length; i++){
        System.out.print("Pindah Barang "+ barang[i] +" ke Gudang (A/B/C) \t\t: ");
        arrGudang[i] = sc.next(); 
    }
    return i;

}

static int lapor(int l){

    cls();
    arrLapor = new int[l];

    System.out.println("===================================================================================================================================================");
    System.out.println("\t\t\t\t\t\t\t\t   [  Laporan Barang  ]   \t\t\t\t\t\t\t\t");
    System.out.println("===================================================================================================================================================");
    System.out.println("\t Nama Barang \t\t|\t Jumlah Awal \t|\t Barang Masuk \t|\t Barang Keluar \t|\t Barang Rusak \t|\t Sisa \t");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
     for (int i = 0; i < arrLapor.length; i++){
        System.out.println(String.format("\t %s \t\t|\t %s \t\t|\t  %s \t\t|\t  %s \t\t|\t %s \t\t|\t %s \t", barang[i], arrBarang[i], arrTambahFinal[i], arrKurangFinal[i], arrRusak[i], totFinal[i]));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");      
    }
    return i;

}

static int cari1(){

    cls();
    int dicari = 0;

    System.out.println("=====================================================================");
    System.out.println("\t\t\t  [ Cari Barang ]  \t\t\t");
    System.out.println("=====================================================================");

    System.out.print("Masukkan Nama Barang yang Anda Cari : ");
    String cari = sc.next();

        for (i = 0; i < barang.length; i++) {
                if (cari.equalsIgnoreCase ( barang[i] )) {
                        dicari = i;
                        break;
                }
        }

System.out.println( cari + " ada sebanyak " + totFinal[dicari] + " ,Rusak sebanyak " + arrRusak[dicari] + " ,dan Berada di Gudang " + arrGudang[dicari]);
return i;

}

public static void main(String[] args) {

int pilihLanjut;
boolean lanjut = true;
int jumBarang = 7;

while(lanjut){

    cls();
    System.out.println("===================================================");
    System.out.println("\t\t  [ Menu Projek ]  \t\t");
    System.out.println("===================================================");
    System.out.println("[1]\tInput Data Barang");
    System.out.println("[2]\tTambah Barang");
    System.out.println("[3]\tAmbil Barang");
    System.out.println("[4]\tJumlah Barang Rusak");
    System.out.println("[5]\tPindah barang");
    System.out.println("[6]\tLaporan Barang");
    System.out.println("[7]\tCari Data Barang");
    System.out.println("[8]\tExit");

System.out.println("\n");
System.out.print("Pilih menu => ");
menu = sc.nextInt();

if(menu==1){
    dataBarang = masukBarang(jumBarang);
} else if(menu==2){
    jumMasuk = jumBarangMasuk(jumBarang);
} else if (menu==3){
    jumKeluar = jumBarangKeluar(jumBarang);
} else if (menu==4){
    jumRusak = jumBarangRusak(jumBarang);
} else if (menu==5){
    pindah = pindahGudang(jumBarang);
} else if (menu==6){
    laporan = lapor(jumBarang);
} else if (menu==7){
    pencarian = cari1();
} else if (menu==8){
    System.out.print("\n");
    System.out.println("Terima Kasih");
    System.exit(0);
} else {
    System.out.println("Input yang Anda Masukkan Salah");
}

System.out.println("\n");
System.out.println("Beralih ke Menu ? ");
System.out.println("Klik '1' untuk Beralih ke Menu ");
System.out.println("Klik '0' untuk Stop ");

System.out.print("Pilih => ");
pilihLanjut = sc.nextInt();

if (pilihLanjut == 1) {
            lanjut = true;
        } else if (pilihLanjut == 0) {
            System.out.print("\n");
            System.out.println("Terima Kasih");
            lanjut = false;
        } else {
            System.out.println("Input yang Anda Masukkan Salah");
            }

        }

    }

}