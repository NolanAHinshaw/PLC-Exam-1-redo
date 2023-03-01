import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String user_input = input.nextLine();

        boolean isEmail = isEmail(user_input);
        if(isEmail)
            System.out.println(user_input + " is a valid email address.");
        else {
            System.out.println(user_input + " is not a valid email address.");
        }
        input.close();
    }

    public static boolean isEmail(String userInput) {
        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher(userInput);
        return matcher.matches();
    }
}
