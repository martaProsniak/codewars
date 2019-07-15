package pl.martaprosniak.codewars;

public class GrassHopper {

    public static int summation(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n){
            sum+= i;
            i++;
        }
        return sum;
    }
}
