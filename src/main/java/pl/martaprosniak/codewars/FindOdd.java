package pl.martaprosniak.codewars;


public class FindOdd {
    public static int findIt(int[] a) {

        int counter;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]){
                    counter++;
                }
            }
            if (counter % 2 != 0){
                odd = a[i];
            }
        }
        return odd;
    }
}
