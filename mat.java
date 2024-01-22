public class mat{
   public static void main(String[] args) {

 double min = -3;
 double max = 3;
 
double[] x = new double[13];
double[] y = new double[13];

for (int i = 0; i < x.length; i++){
    x[i] = min;
    y[i] = (min * min) + (1 / min);
    min += 0.5; 
}

for (int i = 0; i < 13; i++){
    System.out.printf("X value : %s and Y value : %s \n",x[i], y[i]);
}
}
}