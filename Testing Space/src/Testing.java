import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner readin = new Scanner(System.in);

        String test = readin.next();

        System.out.println(Character.getNumericValue(test.charAt(0)) - 10);
        System.out.println(alphabet.charAt(Character.getNumericValue(test.charAt(0)) - 10));
        /*for(int row = 1; row <= 3; row++){
            for(int col = 1; col < row*2; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 2; row > 0; row--){
            for(int col = 1; col < row*2; col++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*// runtime of n^3
        for (int dummy = 0; dummy < 1; dummy++) {
            System.out.println("****");

            for (int row = 2; row <= 3; row++) {
                System.out.print("*");
                for (int col = 2; col <= 3; col++) {
                    System.out.print("a");
                }
                System.out.println("*");
            }

            System.out.println("****");
        }

        //runtime of n^2
        for (int row = 1; row <= 2; row++) {
            System.out.println("****");
            for (int col = 1; col <= 2 && row == 1; col++) {
                System.out.println("*aa*");
            }
        }

        System.out.print(randomMeth());*/

        //box(5,5);
    }

    public static int randomMeth() {
        return 4;
    }

    public static void box(int row, int col){
        for(int rowTemp = 1; rowTemp <= row; rowTemp++){
            for(int colTemp = 1; colTemp <= col && (rowTemp == 1 || rowTemp == row); colTemp++){
                System.out.print("*");
            }
            System.out.println();
            System.out.print("*");
            for(int colTemp = 2; colTemp <= col-1 && rowTemp != row; colTemp++ ){
                System.out.print("a");
            }
            System.out.print("*");
            System.out.println();
        }
    }

}
