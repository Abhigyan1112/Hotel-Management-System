import java.util.*;
import Seats.*;
import Water.WaterType;
import Bill.*;
import Feedback.*;
public class Main1 
{   
    static boolean validInput=false;
    static int seatType;
    static int seatNo=-1;
    static double bill=0.0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OccupanyCheck object=new OccupanyCheck();
        Reciept b=new Reciept();
        Rate r=new Rate();
        object.Seatfile();
        System.out.println("\n\n||  Step into our cozy restaurant, where great food and warm hospitality await your delightful evening  ||");
        System.out.println("\n\n");
        System.out.println("Are you a Customer or staff");
        String S=(sc.next()).toUpperCase();
        if(S.equals("STAFF"))
        {
            System.out.println("\n Here is the current status of all the seats\n");
            object.TableStatus();
            System.out.println("Do you want to initialize all of them at once: Y/N\n");
            if((sc.next().toUpperCase()).equals("Y"))
            {
                System.out.println("Are they all to be set occupied or not: 1/0\n");
                object.initialization(sc.nextInt());
                object.TableStatus();
            }
            System.out.println("Do you wish to change the status of any perticular seat? :: Y/N\n");
            if((sc.next().toUpperCase()).equals("Y"))
            {
                int flag=1;
                do
                {
                    System.out.println("Enter the Type of seat: 2/4/6/8");
                    int t=sc.nextInt();
                    System.out.println("Enter the seat no.");
                    int n=sc.nextInt();
                    System.out.println("Is it occupied or not: 1/0\n");
                    int o=sc.nextInt();
                    object.Update(t, n, o);
                    System.out.println("\n changes have been successfully made\n");
                    System.out.println("Do you want to update any other seat: Y/N\n");
                    if((sc.next().toUpperCase()).equals("Y"));
                    else
                    {
                        flag=0;
                        System.out.println("do you want to look at the status of the seats?: Y/N\n");
                        if((sc.next().toUpperCase()).equals("Y"))
                        {
                            object.TableStatus();
                            System.out.println("\n");
                        }
                    }
                }while(flag==1);
            }
        System.exit(1);
        }
        System.out.println("| Please choose the Type of Seat you want to book for your meal |\n");
        System.out.println("1> A nice 2 seater Table for a couple");
        System.out.println("2> A 4 seater for a small family or group of friends");
        System.out.println("3> A 6 seater for a big family");
        System.out.println("4> An 8 seater for a huge family or a large group\n");
        System.out.println(" Enter the serial no. of the type of seat you want to book");
        while(!validInput)
        { 
            if(sc.hasNextInt())
            {
                seatType=sc.nextInt();
                if(seatType<=4 && seatType>=1) 
                {
                    seatNo=object.occupancyCheck(seatType);
                    if(seatNo==0)
                    {
                    validInput=false;
                    System.out.println("\nSorry for the Inconvenience but there is no seat available of this type");
                    System.out.println("Please enter another seat Type serial no. \n");
                    }
                    else
                    {
                    System.out.println("\n Your seat has been booked");
                    System.out.println("your seat no. is "+seatNo+" of the requested seat Type\n");
                    validInput=true;
                    }
                }
                else
                {
                    System.out.println("\n!Invalid Entry, Please enter a valid serial no.!\n");
                }
            }   
        } 
        System.out.println("Before heading towards your seats. Please Select the type of Water you would like on your Table.\n");
        WaterType w=new WaterType();
        System.out.println(String.format("%-30s Rs %.1f","1> Normal Water",9.9));
        System.out.println(String.format("%-30s Rs %.1f","2> Mineral Water",14.9));
        System.out.println(String.format("%-30s Rs %.1f","3> Chilled Water",9.9));
        System.out.println(String.format("%-30s Rs %.1f\n","4> Sparkling Water",19.9));
        boolean type=false;
        while(!type)
        {
            if(sc.hasNextInt())
            {
                int water=sc.nextInt();
                if(water==1 || water==2 || water==3 || water==4)
                {
                    System.out.println("Enter Quantity: ");
                    int quant=sc.nextInt();
                    b.getwater(quant,water);
                    bill=(quant*w.waterType(water));
                    type=true;
                }
                else
                System.out.println("Invalid Entry. Enter valid serial no.\n");
            }
        }
        b.StartersList();
        b.MainCourseList();
        b.RotiList();
        b.AppetizersList();
        b.DessertList();
        b.BeverageList();
        b.display();
        System.out.println("\nPlease select your items with the serial No. mentioned ahead of it\n");
        boolean meal=false;
        while(!meal)
        {
            boolean input=false;
            while(!input)
            {
                int s=sc.nextInt();
                System.out.println("");
                if(s>=1 && s<=66)
                {
                    input=true;
                    System.out.println("Enter Quantity:\n");
                    int itemquantity=sc.nextInt();
                    bill+=(itemquantity*b.item(s));
                    b.MenuReciept(s, itemquantity);
                    meal=true;
                    System.out.println("\n Do you want to add anything else? Y/N\n");
                    if(sc.next().toUpperCase().equals("Y"))
                    {
                        System.out.println("\nEnter the serial No.\n");
                        meal=false;
                    }
                    else
                    break;
                }
                else
                {
                    System.out.println("Please enter valid serial No.\n");
                }
            }
        }
        System.out.println("\nYour food is being prepared. Please wait for a while and enjoy your meal\n");
        System.out.println("Your bill is being generated");
        System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.");
        b.print(bill);
        System.out.println("\n\n");
        r.printTaste();
        r.addReview("Taste",sc.nextInt());
        r.printService();
        r.addReview("Service",sc.nextInt());
        System.out.println("Would you like to suggest anything else? Y/N");
        if(sc.next().toUpperCase().equals("Y"))
        {
            r.addsuggestion(sc.next());
            r.addtofile();
        }
    } 
}  