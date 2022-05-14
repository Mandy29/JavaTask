import java.util.Scanner;

public class BalancedBraces {

    // recursive function to test a string is balanced
    public static boolean isBalanced(String parenthesis) {

        if (parenthesis.length() <= 1) return true;
        char beginingChar = parenthesis.charAt(0);
        char lastChar = parenthesis.charAt(parenthesis.length() - 1);
        if ((beginingChar == '(' && lastChar == ')') || (beginingChar == '[' && lastChar == ']') || (beginingChar == '{' && lastChar == '}')) {

            return isBalanced(parenthesis.substring(1, parenthesis.length() - 1));
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression to test: ");
        String expression = scanner.nextLine();
        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }

    }
}