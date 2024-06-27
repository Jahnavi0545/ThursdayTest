import java.util.Scanner;

public class AgeChecker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("The age is above 18");
        } else {
            System.out.println("The age is 18 or below");
        }
    }
}