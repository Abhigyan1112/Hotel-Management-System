package Feedback;
import java.util.Map;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
public class Rate {
    String suggestion;
    public Map<String,Integer> rate=new HashMap<>();
    public void printTaste()
    {
        System.out.println("Please rate your experience with us...\n");
        System.out.println("TASTE");
        System.out.println("1> Very Bad");
        System.out.println("2> Bad");
        System.out.println("3> Okay");
        System.out.println("4> Good");
        System.out.println("5> Very Good\n");
    }
    public void addReview(String s,int n)
    {
        rate.put(s,n);
    }
    public void printService()
    {
        System.out.println("\n\nService");
        System.out.println("1> Very Slow");
        System.out.println("2> Slow");
        System.out.println("3> Fine");
        System.out.println("4> Fast\n");
    }
    public void addsuggestion(String s)
    {
        suggestion=s;
    }
    public void addtofile()
    {
        try(FileOutputStream fos = new FileOutputStream("Reviews.txt");ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(rate);
            oos.writeObject(suggestion);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
