public class test{
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int taunKelahiran, usia;
 int taunSekarang;

 Calendar kalender = Calendar.getInstance();
 taunSekarang = kalender.get(Calendar.YEAR);
 System.out.println("Masukkan Tahun kelahiran :");
 taunKelahiran = input.nextInt();
 usia = taunSekarang - taunKelahiran;

 System.out.println("Usia saat ini :" + usia);


}
}