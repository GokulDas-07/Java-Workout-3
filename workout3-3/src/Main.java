import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int vowels=0,lines=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input:");
        String str =input.nextLine();
        String[] words = str.split("\\s+");
        for (int i=0;i<str.length();i++)
        {
            char s=str.charAt(i);
            if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u' || s=='A' || s=='E' || s=='I' || s=='O' || s=='U')
            {
                vowels++;

            }
            if (s =='.')
            {
               lines++;
            }

        }
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of lines: "+lines);
        System.out.println("Number of words: "+words.length);


    }
}