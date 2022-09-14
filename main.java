import java.util.Random;

public class main {

    public static void main (String[] args){
        short[] a = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        double[] x;
        x = new double[12];
        Random numbs = new Random();

        for (int i = 0; i < x.length; i++) {
            //наполняем массив рандомными числами (-12 нужно для того, чтобы поставить границы)
            x[i] = numbs.nextDouble(22) - 12;
        }

        double [][] c;
        c = new double[15][12];
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[1].length; j++){
                    if (a[i] == 10){
                        c[i][j] = Math.tan(Math.cbrt(Math.asin((x[j] - 1) / 22)));
                    }
                    else if ((a[i] == 4) || (a[i] == 5) || (a[i] == 6) || (a[i] == 7) || (a[i] == 12) || (a[i] == 16) || (a[i] == 18)){
                        c[i][j] = 3 * Math.sin(Math.pow(2/x[j],3));
                    }
                    else {
                        c[i][j] = Math.pow(Math.PI * (Math.atan(1 / Math.pow(Math.E, Math.pow(Math.E, Math.tan(Math.pow(x[j], x[j] * (x[j] + 1)))))) - Math.PI) , 3);
                    }
            }
        }
        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[1].length; j++){
                System.out.printf("%.2f ", c[i][j]);
            }
            System.out.println();
        }
    }
}
