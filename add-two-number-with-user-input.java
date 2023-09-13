// add two numbers with user input

import java.util.*; // import the whole package

class MyClass {
    public static void main(String[] args) {
        int x, y, sum;

        // creat Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");       
        // read user input
        x = scanner.nextInt();

        System.out.print("Type another number: ");
        // read user input
        y = scanner.nextInt();

        sum = x + y;
        System.out.println("The sum is: " + sum);
    }
}
