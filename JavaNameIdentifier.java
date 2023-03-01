import java.util.regex.Pattern; // 9
import java.util.regex.Matcher; // 9
import java.util.Scanner; // 7

public class JavaNameIdentifier { // 4
   public static void main(String[] args) { // 11
        Scanner input = new Scanner(System.in); // 11
        System.out.println("Enter a java name identifier (variable, class, method): "); // 9
        String user_input = input.nextLine(); // 9

        boolean isJavaName = isJavaName(user_input); // 8
        if(isJavaName) // 4
            System.out.println(user_input + " is a java name identifier. "); // 11
        else { // 2
            System.out.println(user_input + " is not a java name identifier. "); // 11
        } // 1
        input.close(); // 6
    } // 1
    public static boolean isJavaName(String userInput) { // 9
        Pattern pattern = Pattern.compile("[A-Za-z_$][A-Za-z0-9_$]*"); // 10
        Matcher matcher = pattern.matcher(userInput); // 10
        return matcher.matches(); // 7
    } // 1
} // 1
// 151 lexemes
