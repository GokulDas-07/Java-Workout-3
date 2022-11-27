
import java.util.Scanner;

class InvalidPan extends Exception
{
    public InvalidPan(String s)
    {
        super(s);
    }

}
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=input.next();
        System.out.println("Enter PAN number");
        String pan=input.next();
        try{
            if(name.charAt(0)==pan.charAt(4)){
                System.out.println("Valid PAN");
            }else{
                throw new InvalidPan("Invalid PAN");
            }
        }
        catch(InvalidPan e){
            System.out.println("Exception:"+e.getMessage());
        }


    }
}