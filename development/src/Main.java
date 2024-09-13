import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the password that you want: ");
        int digit = input.nextInt();

        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()-+<>?/.,;:'[]{}|";

        String password = "";

        for (int i = 0; i < digit; i++) {
            int random = (int) (Math.random() * 5);

            switch (random) {
                case 0:
                    password += lowerCase.charAt((int) (Math.random() * lowerCase.length()));
                    break;
                case 1:
                    password += upperCase.charAt((int) (Math.random() * upperCase.length()));
                    break;
                case 2:
                    password += numbers.charAt((int) (Math.random() * numbers.length()));
                    break;
                case 3:
                    password += specialCharacters.charAt((int) (Math.random() * specialCharacters.length()));
                    break;
            }
        }
        System.out.println("Your Generated Password is " + password);
    }
}