import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FloatingPointConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating-point literal: ");
        String user_input = input.nextLine();
        
        boolean isFloat = isFloatingPointLiteral(user_input);
        if(isFloat)
            System.out.println(user_input + " is a floating-point literal. ");
        else {
            System.out.println(user_input + " is not a floating-point literal. ");
        }
        input.close();
    }

    public static boolean isFloatingPointLiteral(String userInput) {
        Pattern pattern = Pattern.compile("[-+]?((\\d+(\\.\\d+)?)|(\\d+)?)([eEfFlL][-+]?[\\d+]?[fFlL]?|[fFlL]?)?");
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }
}
