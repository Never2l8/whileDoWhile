import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter low number: ");
        int lowNumber = input.nextInt();
        System.out.print("Enter high number: ");
        int highNumber = input.nextInt();
        int i = lowNumber;
        int counter = 0;
        int sum = 0;
        int average;
        while (i <= highNumber) {
            sum += i;
            i++;
            counter++;
        }
        average = sum / counter;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        i = lowNumber;
        sum = 0;
        counter = 0;
        do {
            sum += i;
            i++;
            counter++;
        } while (i <= highNumber);
        average = sum / counter;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);


    }


}
