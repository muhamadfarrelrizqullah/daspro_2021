import java.util.Scanner;
public class test1{

public static void main(String[] args) {
String nama [] = {"Desi", "Rofan", "Lala", "Beky", "Ega"};
int array[][] = {
    {19, 51, 155},
    {18, 55, 163},
    {18, 45, 153},
    {20, 46, 158},
    {18, 58, 160},
};
String tertua;
double rata;
int total, min = 60, max = 0;
    
for (int i = 0; i < array.length; i++){
    for (int j = 0; j < array[0].length; j++){
        if (j == 1){
            if (array[i][j] < min){
                min = array[i][j];
            } 
        }
        if (j == 0){
            if (array [i][j] > max){
                max = array[i][j];
                tertua = nama[i];
            }
        }
        if (j == 2){
            total+= array[i][j];
        }
        
    }
}

rata = total / array[0].length;
System.out.println("Berat badan terendah adalah " + min);
System.out.println("Rata rata tinggi badan adalah " + rata);
System.out.println("Mahasiswa dengan umur tertua adalah " + tertua);


}
}