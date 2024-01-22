package Menu;
public class MenuDisplay extends MenuPrice
{
    public void display()
    {
        System.out.println("||  HERE IS OUR MENU, PLEASE SELECT YOUR ORDER  ||\n");
        System.out.println("|   STARTERS   |\n");
        int i=1;
        for(int pointer=0;starter.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,StartersIndex[pointer],starter.get(pointer+1)));
            i++;
        } // 1 to 12
        System.out.println("\n\n|   MAIN COURSE    |\n");
        for(int pointer=0;maincourse.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,MainCourseIndex[pointer],maincourse.get(pointer+1)));
            i++;
        } // 13 to 32
        System.out.println("\n\n|   BREADS    |\n");
        for(int pointer=0;roti.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,RotiIndex[pointer],roti.get(pointer+1)));
            i++;
        } // 33 to 39
        System.out.println("\n\n|   APPETIZERS    |\n");
        for(int pointer=0;appetizer.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,AppetizersIndex[pointer],appetizer.get(pointer+1)));
            i++;
        } // 40 to 46
        System.out.println("\n\n|   DESSERTS    |\n");
        for(int pointer=0;dessert.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,DessertIndex[pointer],dessert.get(pointer+1)));
            i++;
        } // 47 to 52
        System.out.println("\n\n|   BEVERAGES    |\n");
        for(int pointer=0;beverage.containsKey(pointer+1);pointer++)
        {
            System.out.println(String.format("%-2d %-40s Rs %.1f",i,BeveragesIndex[pointer],beverage.get(pointer+1)));
            i++;
        } //53 to 66
    }
}
