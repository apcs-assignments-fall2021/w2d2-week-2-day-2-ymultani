import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double doub_num = scan.nextDouble();
        while (doub_num > 1000000.0 || doub_num < 0){
            inputDouble();
        }
        System.out.println(doub_num);

        return doub_num;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int count = 0;
        while(money - .25 >= 0) {
            count++;
            money = money -.25;


        }
        System.out.println(money + " in quarters is " + count);
        return count;
    }



    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int count = 0;
        while(money - .1 >= 0) {
            count++;
            money = money -.1;


        }
        System.out.println(money + " in dimes is " + count);
        return count;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money) {
        int count = 0;
        while(money - .05 >= 0) {
            count++;
            money = money -.05;


        }
        System.out.println(money + " in nickels is " + count);
        return count;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money) {
        int count = 0;
        while(money - .01 >= 0) {
            count++;
            money = money -.01;
        }
        System.out.println(money + " in pennies is " + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amout of money you have: ");
        double x = scan.nextDouble();

        // You should test inputDouble yourself!
        inputDouble();
        numQuarters(x);
        numDimes(x);
        numNickels(x);
        numPennies(x);

        // Some code to test numQuarters

        scan.close();
    }
}