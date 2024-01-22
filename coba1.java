import java.util.Scanner;

public class coba1{


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;

System.out.println("Masukkan jumlah jenis barang: ");
n = sc.nextInt();

sc.nextLine();
String[] array = new String[n];

for (int i = 0; i < array.length; i++){
        System.out.print("Masukkan nama barang: ");
        array[i] = sc.nextLine();       
    }

for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);    
    }
}
}
