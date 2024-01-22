package Bill;
import java.util.Map;
import java.util.HashMap;
import Menu.*;
public class Reciept extends Order
{
    int nprice=1;
    int count=0;
    String watername;
    double wateramount;
    int waterquantity;
    public Map<String,Integer> bill=new HashMap<>();
    public Map<Integer,Double> prices=new HashMap<>();
    public Map<Integer,String> itemname =new HashMap<>();
    public void MenuReciept(int s,int itemquantity)
    {
        if(s>=1 && s<=12)
        {
            bill.put(StartersIndex[s-1],itemquantity);
            itemname.put(nprice,StartersIndex[s-1]);
            prices.put(nprice,itemquantity*starter.get(s));
            nprice++;
        }
        else if(s>=13 && s<=32)
        {
            bill.put(MainCourseIndex[s-13],itemquantity);
             itemname.put(nprice,MainCourseIndex[s-13]);
            prices.put(nprice,itemquantity*maincourse.get(s-12));
            nprice++;
        }
        else if(s>=33 && s<=39)
        {
            bill.put(RotiIndex[s-33],itemquantity);
             itemname.put(nprice,RotiIndex[s-33]);
            prices.put(nprice,itemquantity*roti.get(s-32));
            nprice++;
        }
        else if(s>=40 && s<=46)
        {
            bill.put(AppetizersIndex[s-40],itemquantity);
             itemname.put(nprice,AppetizersIndex[s-40]);
            prices.put(nprice,itemquantity*appetizer.get(s-39));
            nprice++;
        }
        else if(s>=47 && s<=52)
        {
            bill.put(DessertIndex[s-47],itemquantity);
             itemname.put(nprice,DessertIndex[s-47]);
            prices.put(nprice,itemquantity*appetizer.get(s-46));
            nprice++;
        }
        else 
        {
            bill.put(BeveragesIndex[s-53],itemquantity);
             itemname.put(nprice,BeveragesIndex[s-53]);
            prices.put(nprice,itemquantity*beverage.get(s-52));
            nprice++;
        }
    }
    public void getwater(int quant,int w)
    {
        waterquantity=quant;
        switch(w)
        {
            case 1:watername="NORMAL WATER";wateramount=9.9*quant;break;
            case 2:watername="MINERAL WATER";wateramount=14.9*quant;break;
            case 3:watername="CHILLED WATER";wateramount=9.9*quant;break;
            case 4:watername="SPARKLING WATER";wateramount=19.9*quant;break;
        }
        
    }
    public void print(double Finalbill)
    {
       
        System.out.println("\n||    RECEIPT     ||\n");
        int n;
        for(n=1;n<nprice;n++)
        {
            System.out.println(String.format("%-1d %-30s(Qt.)%-4d Rs %.1f",n,itemname.get(n),bill.get(itemname.get(n)),prices.get(n)));
        }
        System.out.println(String.format("%-1d %-30s(Qt.)%-4d Rs %.1f\n",n,watername,waterquantity,wateramount));
        System.out.println(String.format("%-41s Rs %.1f","YOUR TOTAL AMOUNT IS : ",Finalbill));
    }
}
