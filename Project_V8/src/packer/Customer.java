package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I.M.Bad
 */
public class Customer {
    
    private String name;
    private List<Address> addresses;

    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    public String getName() {
        return name;
    }
    //ERROR IS DEFINETELY HERE
    //TRIED AGAIN GOING WITH GOEMETRICAL APPROACH: (X1(SQUARED) + Y1(SQUARED)) - (X2(SQUARED) + Y2(SQUARED)), XY2(SQUARED) - XY2(SQUARED) IS THE DISTANCE.
    //STILL DIDNT WORK.. MAYBE THERE IS SOMETHING WRONG WITH MY CALCULATIONS
    //FFS HOW DOES THIS WORK
    public Address getClosestAddressTo(Depot d) {
        //WAS EXPERIMENTING WITH VARIABLES AND SAW THAT bestDistanceXY does not get used anymore..(assumed that best distance is the closest distance)
        double bestDistanceXY = Double.MAX_VALUE;
        Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistanceXY) {
                bestAddress = a;
                //if i corretly understand it: a.getCoordinates - d.getCoordinates = whats left(distance)= bestDistanceXY 
                //Tested CoordinatesTest.java and it WORKED FFS I SPENT A DAY ON JUST THIS
                bestDistanceXY = distance;
            }
        }
        return bestAddress;
    }

    public String toString() {
        return this.getName();
    }
}
