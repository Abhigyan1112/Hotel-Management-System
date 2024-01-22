package Menu;
import java.util.HashMap;
import java.util.Map;

public class MenuPrice extends MenuIndexing {
    // creating a HashMap to store the menu items and their prices
    public Map<Integer,Double> starter=new HashMap<>();
    public Map<Integer,Double> maincourse=new HashMap<>();
    public Map<Integer,Double> roti=new HashMap<>();
    public Map<Integer,Double> appetizer=new HashMap<>();
    public Map<Integer,Double> dessert=new HashMap<>();
    public Map<Integer,Double> beverage=new HashMap<>();
    // Making the Menu
    public void StartersList()
    {
        //Starters
        starter.put(1,99.9);
        starter.put(2,159.9);
        starter.put(3,159.9);
        starter.put(4,159.9);
        starter.put(5,159.9);
        starter.put(6,159.9);
        starter.put(7,159.9);
        starter.put(8,169.9);
        starter.put(9,179.9);
        starter.put(10,179.9);
        starter.put(11,169.9);
        starter.put(12,179.9);
    }
    public void MainCourseList()
    {
        //Main Course
        maincourse.put(1,79.9);
        maincourse.put(2,89.9);
        maincourse.put(3,89.9);
        maincourse.put(4,99.9);
        maincourse.put(5,79.9);
        maincourse.put(6,89.9);
        maincourse.put(7,89.9);
        maincourse.put(8,69.9);
        maincourse.put(9,74.9);
        maincourse.put(10,69.9);
        maincourse.put(11,69.9);
        maincourse.put(12,79.9);
        maincourse.put(13,89.9);
        maincourse.put(14,79.9);
        maincourse.put(15,69.9);
        maincourse.put(16,89.9);
        maincourse.put(17,99.9);
        maincourse.put(18,79.9);
        maincourse.put(19,69.9);
        maincourse.put(20,69.9);
    }
    public void RotiList()
    {
        roti.put(1,30.0);
        roti.put(2,30.0);
        roti.put(3,30.0);
        roti.put(4,35.0);
        roti.put(5,40.0);
        roti.put(6,40.0);
        roti.put(7,40.0);
    }
    public void AppetizersList()
    {
        appetizer.put(1,29.9);
        appetizer.put(2,39.9);
        appetizer.put(3,39.9);
        appetizer.put(4,39.9);
        appetizer.put(5,39.9);
        appetizer.put(6,39.9);
        appetizer.put(7,39.9);
    }
    public void DessertList()
    {
        dessert.put(1,39.9);
        dessert.put(2,39.9);
        dessert.put(3,49.9);
        dessert.put(4,39.9);
        dessert.put(5,39.9);
        dessert.put(6,59.9);
    }
    public void BeverageList()
    {
        beverage.put(1,19.9);
        beverage.put(2,29.9);
        beverage.put(3,29.9);
        beverage.put(4,29.9);
        beverage.put(5,14.9);
        beverage.put(6,39.9);
        beverage.put(7,19.9);
        beverage.put(8,19.9);
        beverage.put(9,19.9);
        beverage.put(10,49.9);
        beverage.put(11,49.9);
        beverage.put(12,49.9);
        beverage.put(13,49.9);
        beverage.put(14,49.9);
    }
}
