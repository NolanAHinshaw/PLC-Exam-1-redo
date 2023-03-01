import java.util.Scanner;
public class EvenAOddB {

    public static int count_B = 0;
    public static int count_A = 0;
    public static int index_of_CorD;

    public static void evenAoddB(String userInput) {
        for(int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'b')
                count_B++;
            else if(userInput.charAt(i) == 'a')
                count_A++;
            else {
                index_of_CorD = i;
                break;
            }
        }

    }

    public static boolean evenCBAD(String userInput) {

        int lastIndex = 0;
        int count_CBAD = 0;
        String target = "cbad";
        while(lastIndex != -1){

            lastIndex = userInput.indexOf(target,lastIndex);
        
            if(lastIndex != -1){
                count_CBAD++;
                lastIndex += target.length();
            }
        }

        if(count_CBAD % 2 == 0 && count_CBAD > 1)
            return true;
        else {
            return false;
        }
    } 

    public static boolean anyCorD(String userInput, int index) {
        int countCorD = 0;
        for(int i = index; i < userInput.length(); i++)
        {
            if(userInput.charAt(i) == 'c' || userInput.charAt(i) == 'd'){
                countCorD++;
            }
            else if((userInput.charAt(index) != 'c') || (userInput.charAt(index) != 'd'))
                return false;
        }
        if(countCorD > 0)
            return true;
        else {
            return false;
        }
    } 
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a statement consisting of a's and b's followed by c's or d's OR even number of cbad:");
        String user_input = user.nextLine();

        evenAoddB(user_input);
        boolean isEvenCBAD = evenCBAD(user_input);
        boolean hasCorD = anyCorD(user_input, index_of_CorD);
        if(((count_A % 2 == 0) && (count_B % 2 == 1) && hasCorD) || isEvenCBAD)
            System.out.println(user_input + " is a valid statement.");
        else {
            System.out.println(user_input + " is not a valid statement.");
        }
        user.close();
    }
}
