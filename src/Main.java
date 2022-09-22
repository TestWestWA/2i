import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        get10Numbers(9);    }

    public static ArrayList<Integer> get10Numbers(int number) {
        int i, j;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner getInput = new Scanner(System.in);
        System.out.println("Input 10 numbers between 1 and 100 : ");
        j = getInput.nextInt();
        for (i=0; i<10; i++) {
            if (j>=1 && j<=100) {
                numbers.add(getInput.nextInt());
            } else {
                System.out.println("Number not between 1 and 100");
                i = i-1;
            }
        }
        return numbers;
    }


}