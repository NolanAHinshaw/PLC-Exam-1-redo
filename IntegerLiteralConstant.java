import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class IntegerLiteralConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer-literal constant: ");
        String user_input = input.nextLine();

        boolean isIntLitConstant = isIntegerLiteral(user_input);
        if(isIntLitConstant)
            System.out.println(user_input + " is a integer-literal constant.");
        else {
            System.out.println(user_input + " is not a integer-literal constant.");
        }
        input.close();
    }

    public static boolean isIntegerLiteral(String userInput) {
        Pattern pattern = Pattern.compile("^([+-]?)((0[xX][0-9a-uA-U]+)|(0[0-7]*|[1-9][0-9]*|0)|([0-9a-uA-U]+))$");
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }
}

