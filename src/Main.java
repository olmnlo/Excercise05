import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        1 - Write a Java method to find the smallest number among three
//        numbers.
        System.out.print("Enter first number: ");
        int n1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scn.nextInt();
        System.out.print("Enter third number: ");
        int n3 = scn.nextInt();

        System.out.printf("the max number is: %d\n", findMin(n1,n2,n3));


//        2 - Write a Java method that check if the entered number is negative or
//        positive or zero.

        System.out.print("Enter number: ");
        int number = scn.nextInt();
        checkNumber(number);


//        3 - Write a Java method to check whether a string is a valid password.
//        Password rules:
        System.out.println("""
                1. A password must have at least eight characters.
                2. A password consists of only letters and digits.
                3. A password must contain at least two digits
                """);
        System.out.print("Enter password: ");
        String user_password = scn.next();

        if (passwordChecker(user_password)){
            System.out.println("You are agreeing to the above Terms and Conditions.");
        }else{
            System.out.println("You are not agreeing to the above Terms and Conditions.");
        }

    }

    public static int findMin(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= n3){
            return n1;
        } else if (n2 <= n1 && n2 <= n3) {
            return n2;
        }else {
            return n3;
        }
    }

    public static void checkNumber(int number){
        if(number < 0){
            System.out.println("Number is negative");
        } else if (number > 0) {
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is zero");
        }
    }


    public static boolean passwordChecker(String password){
        if(password.length() < 8){
            return false;
        } else if (password.matches(".*[^a-zA-Z0-9].*")) {
            return false;
        }else {
            int countOfDigits = 0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))){
                    countOfDigits++;
                }
            }
            if (countOfDigits < 2){
                return false;
            }else {
                return true;
            }
        }
    }
}