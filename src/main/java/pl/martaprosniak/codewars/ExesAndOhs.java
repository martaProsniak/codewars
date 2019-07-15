package pl.martaprosniak.codewars;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(getXO("xxxoooo"));
    }


    public static boolean getXO (String str) {
        if (str.isEmpty()){
            return false;
        }

        int sumOfX = 0;
        int sumOfO = 0;

        for (int i = 0; i < str.length(); i++) {
           if (String.valueOf(str.charAt(i)).equalsIgnoreCase("x")){
               sumOfX++;
           }
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("o")){
                sumOfO++;
            }
        }
        return sumOfX == sumOfO;


        /* LAMBDAS EXERCISE
        for (int i = 0; i < str.length(); i++) {
            charactersToCheck.add(String.valueOf(str.charAt(i)).toUpperCase());
        }

       int sumOfX = (charactersToCheck.stream()
               .filter(s -> s.equalsIgnoreCase("x"))
               .collect(Collectors.toList())).size();

        int sumOfY = (charactersToCheck.stream()
               .filter(s -> s.equalsIgnoreCase("o"))
               .collect(Collectors.toList())).size();

        return sumOfY == sumOfX;
        */
    }
}
