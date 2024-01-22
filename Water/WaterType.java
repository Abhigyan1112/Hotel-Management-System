package Water;
import Seats.OccupanyCheck;
public class WaterType extends OccupanyCheck{
    public double waterType(int n)
    {
        switch(n)
        {
        case 1:System.out.println("\nNormal Water it is!. Please be seated on your seats and select your meal\n");return 9.9;
        case 2:System.out.println("\nMineral Water it is!. Please be seated on your seats and select your meal\n");return 14.9; 
        case 3:System.out.println("\nChilled Water it is!. Please be seated on your seats and select your meal\n");return 9.9; 
        case 4:System.out.println("\nSparkling Water it is!. Please be seated on your seats and select your meal\n");return 19.9; 
        default:System.out.println("\nInvalid Entry! Please Enter correct serial No.\n");return 0.0;
        }
    }
}
