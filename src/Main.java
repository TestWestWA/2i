import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // current issues:
        //1. not checking for non int number input, will throw exception for anything nthats not an int.
        //2. when number not input outwit=dth range (1-100), i should catch and either let user correct or handle it some other way.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers = get10Numbers(9);
        Collections.sort(numbers, Collections.reverseOrder());

        //Not asked for, but ive outputted the list to console using the below code
        for(int str: numbers){
            System.out.println(str);
        }
    }

    public static ArrayList<Integer> get10Numbers(int number) {
        //there is an issue when inputting non integers.
        //given time id add an exception handler and/or possibly function to check input before addign to array list
        int i, j;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner getInput = new Scanner(System.in);

        for (i=0; i<10; i++) {
            System.out.println("Input 10 numbers between 1 and 100 : ");
            j = getInput.nextInt();
            if (j>=1 && j<=100 && !numbers.contains(j)) {
                numbers.add(j);
            }
        }
        return numbers;
    }


}