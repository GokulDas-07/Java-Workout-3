import java.util.Scanner;

class ExceptionLineTooLong extends Exception{
    public ExceptionLineTooLong(String s){
        super(s);
    }
}
class ExceptionLineTooShort extends Exception{
    public ExceptionLineTooShort(String s){
        super(s);
    }
}



public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter String:");
        String str = input.nextLine();
        try{
            if(str.length()>10){
                throw new ExceptionLineTooLong("The input is too long");

            } else if (str.length()<5) {
                throw new ExceptionLineTooShort("The input is too short");

            }else {
                System.out.println("Input is neither long nor short");
            }
        }
        catch (ExceptionLineTooLong s){
            System.out.println("Exception: "+s.getMessage());
        }
        catch (ExceptionLineTooShort s){
            System.out.println("Exception: "+s.getMessage());
        }
    }
}