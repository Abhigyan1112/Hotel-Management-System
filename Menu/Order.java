package Menu;

public class Order extends MenuDisplay{
    public double item(int n)
    {
        if(n>=1 && n<=12)
        {
            System.out.println(StartersIndex[n-1]+" has been added to your order");
            return starter.get(n);
        }
        else if(n>=13 && n<=32)
        {
            System.out.println(MainCourseIndex[n-13]+" has been added to your order");
            return maincourse.get(n-12);
        }
        else if(n>=33 && n<=39)
        {
            System.out.println(RotiIndex[n-33]+" has been added to your order");
            return roti.get(n-32);
        }
        else if(n>=40 && n<=46)
        {
            System.out.println(AppetizersIndex[n-40]+" has been added to your order");
            return appetizer.get(n-39);
        }
        else if(n>=47 && n<=52)
        {
            System.out.println(DessertIndex[n-47]+" has been added to your order");
            return dessert.get(n-46);
        }
        else 
        {
            System.out.println(BeveragesIndex[n-53]+" has been added to your order");
            return beverage.get(n-52);
        }
    }
}
