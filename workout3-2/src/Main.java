import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.next();
        System.out.println("Sub Strings of "+string+" are:");
        for (int i=0;i<string.length();i++)
        {
            String subString = "";
            for (int j = i; j < string.length(); j++) {
                subString = subString + string.charAt(j);
                System.out.println(subString);
            }
        }
    }
}
