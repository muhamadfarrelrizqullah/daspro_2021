import java.util.Scanner;

public class coba2 {

static int i;
static int menu, dataBarang, jumMasuk, jumKeluar, jumRusak, laporan, pencarian;
static String[] barang = {"Komputer", "Keyboard", "Headset", "Earphone", "Speaker"};
static int[] arrBarang;
static int[] arrTambah;
static int[] arrKurang;
static int[] arrRusak;
static int[] arrLapor;
static int[] arrCari;
static int[] arrTotalTambah= {0, 0, 0, 0, 0};
static int[] arrTotalKurang= {0, 0, 0, 0, 0};
static int[] totFinal = new int[99];
static Scanner sc = new Scanner(System.in);

static int masukBarang(int n){
    arrBarang = new int[n]; 

    for (int i = 0; i < arrBarang.length; i++){
        System.out.print("Masukkan jumlah barang "+ barang[i] + " : ");
        arrBarang[i] = sc.nextInt();
        totFinal[i]+=  arrBarang[i];       
    }
    return i;
}

static int jumBarangMasuk(int m){
    arrTambah = new int[m];

    for (int i = 0; i < arrTambah.length; i++){
        System.out.print("Masuk barang "+ barang[i] +" \t: ");
        arrTambah[i] = sc.nextInt();
        totFinal[i]+= arrTambah[i];

    }

    for (int i = 0; i < arrTambah.length; i++){
        System.out.println(totFinal[i]); 
    }
    return i;
}

static int jumBarangKeluar(int k){
    arrKurang = new int[k];

    for (int i = 0; i < arrKurang.length; i++){
        System.out.print("Ambil barang "+ barang[i] +" \t: ");
        arrKurang[i] = sc.nextInt();  
        arrTotalKurang[i] = arrBarang[i] - arrKurang[i]; 
        totFinal[i]-=  arrKurang[i];

    }

     for (int i = 0; i < arrKurang.length; i++){
        System.out.println(totFinal[i]); 
    }
    return i;
}

static int jumBarangRusak(int r){
    arrRusak = new int[r]; 

    for (int i = 0; i < arrRusak.length; i++){
        System.out.print("Masukkan jumlah barang "+ barang[i]  +" yang Rusak : ");
         arrRusak[i] = sc.nextInt();       
    }
    return i;
}

static int lapor(int l){
    arrLapor = new int[l];

    System.out.println("===================================================================================================================================================");
    System.out.println("\t\t\t\t\t\t            Laporan Barang            \t\t\t\t\t\t\t");
    System.out.println("\t\t\t\t\t\t             Warnet Pi'i            \t\t\t\t\t\t\t");
    System.out.println("===================================================================================================================================================");
    System.out.println("\t Nama Barang \t\t|\t Jumlah Awal \t|\t Barang Masuk \t|\t Barang Keluar \t|\t Barang Rusak \t|\t Sisa \t");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
     for (int i = 0; i < arrLapor.length; i++){
        System.out.println(String.format("\t %s \t\t|\t %s \t\t|\t   %s \t\t|\t %s \t\t|\t %s \t\t|\t %s \t", barang[i], arrBarang[i], arrTambah[i], arrKurang[i], arrRusak[i], totFinal[i]));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");      
    }
    return i;
}

static int cari1(){
int dicari = 0;

System.out.print("Masukkan Nama Barang yang Anda Cari : ");
String cari = sc.next();

        for (i = 0; i < barang.length; i++) {
                if (cari.equalsIgnoreCase ( barang[i] )) {
                        dicari = i;
                        break;
                }
        }

System.out.println( cari + " Ada sebanyak " + totFinal[dicari] + " dan Rusak sebanyak " + arrRusak[dicari]);
return i;

}

public static void main(String[] args) {
int pilihLanjut;
boolean lanjut = true;
int jumBarang = 5;

while(lanjut){
    System.out.println("===================================================");
    System.out.println(" =================[ Menu Projek ]================= ");
    System.out.println("===================================================");
    System.out.println("[1]\tInput Data Barang");
    System.out.println("[2]\tMasukkan Barang");
    System.out.println("[3]\tAmbil Barang");
    System.out.println("[4]\tInput Jumlah Barang Rusak");
    System.out.println("[5]\tLaporan Barang");
    System.out.println("[6]\tCari Data Barang");
    System.out.println("[7]\tExit");

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
    laporan = lapor(jumBarang);
} else if (menu==6){
    pencarian = cari1();
} else if (menu==7){
    System.exit(0);
} else {
    
}

System.out.println("Apakah mau lanjut ke menu? ");
System.out.println("Klik '1' untuk Lanjut ke Menu");
System.out.println("Klik '0' untuk Stop ");
System.out.print("Pilih => ");
pilihLanjut = sc.nextInt();

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