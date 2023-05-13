import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Empty arraylist
        List<String> inputList = new ArrayList<String>();

        // Asks for strings
        System.out.println("Enter one string at a time, Type 'exit' to finish:");
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            inputList.add(input);
            input = scanner.nextLine();
        }

        // Finds palindromes
        List<String> palindromeList = getPalindromes(inputList);

        // Prints on terminal
        System.out.println("Palindromes found:");
        for (String palindrome : palindromeList) {
            System.out.println(palindrome);
        }
    }

    public static List<String> getPalindromes(List<String> inputList) {
        List<String> outputList = new ArrayList<String>();

        for (String str : inputList) {
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                outputList.add(str);
            }
        }

        return outputList;
    }
}