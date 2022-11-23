package exercise;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("String X with Recursion: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(getStringXUnitUsingRecursion(i) + "\t");
        }
   
        System.out.println("\nString X with non-Recursion: ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(getStringXUnitUsingNonRecursion(i) + "\t");
        }
    }

    // StringX using recursion
    private static int getStringXUnitUsingRecursion(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return i + getStringXUnitUsingRecursion(i - 1) + getStringXUnitUsingRecursion(i - 2);
        }
    }

    // StringX using non-recursion
    private static int getStringXUnitUsingNonRecursion(int i) {
        int si = 0, si1 = 1, si2 = 1;
        /* si  is value at i position of String X 
            si1 is value at i-1 position of string X
            si2 is value at i-2 position of String X 
        */
        if (i == 0) {
            return si2;

        } else if (i == 1) {
            return si1;
        } else {
            for (int index = 2; index <= i; index++) {
                si = index + si1 + si2;
                //change value of si2, si1
                si2 = si1;
                si1 = si;
            }
            return si;
        }
    }
}
    
    