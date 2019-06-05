import java.util.Scanner;

public class main {

    //takes values from keyboard
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

         /**
         static methods are used (no NEW keyword)
         **/


        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {

            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));


    }
        public static int[] getIntegers(int number) {
            System.out.println("Enter " + number + " integer values.\r");

            //initialize an array
            int[] values = new int[number];

            //loop through an array
            for(int i=0; i<values.length; i++) {
                values[i] = scanner.nextInt();
            }

            return values;
        }

        public static double getAverage(int[] array) {

            int sum = 0;

            for(int i=0; i< array.length; i++) {
                sum += array[i];
            }

            //casting
            return (double) sum / (double)array.length;

        }

    }

