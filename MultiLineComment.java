import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class MultiLineComment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a multiline comment in C based languages.");
        String user_input = input.nextLine();

        boolean isMultilineComment = isCPlusPlusMultilineComment(user_input);
        if(isMultilineComment)
            System.out.println(user_input + " is a C++ multiline comment. " );
        else {
            System.out.println(user_input + " is not a C++ multiline comment. " );
        }
        input.close();
    }

    public static boolean isCPlusPlusMultilineComment(String input) {
        Pattern pattern = Pattern.compile("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
