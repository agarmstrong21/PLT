import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args){
        Scanner readIn = new Scanner(System.in);

        System.out.println("Enter first name");
        String first = readIn.next();

        System.out.println("Enter last name");
        String last = readIn.next();

        System.out.println(first + " " + last);


    }

    public static int test(int a, int b){
        if(a > b){
            return a;
        }
        return 4;
    }
}
