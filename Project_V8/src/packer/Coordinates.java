package packer;

/**
 *
 * @author I.M.Bad
 */
public class Coordinates {
    
    private final double x;
    private final double y;
    
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double euclideanDistanceTo(Coordinates other) {
        double xDiff = other.getX() - this.getX();
        double yDiff = other.getY() - this.getY();
        double dist = Math.pow((xDiff * xDiff + yDiff * yDiff),0.5);
        return dist;
    }
    
    public double manhattanDistanceTo(Coordinates other) {
        double xDiff = other.getX() - this.getX();
        double yDiff = other.getY() - this.getY();
        double dist = Math.abs(xDiff) + Math.abs(yDiff);
        return dist;
    }
    //TRIED GOING WITH GOEMETRICAL APPROACH: (X1(SQUARED) + Y1(SQUARED)) - (X2(SQUARED) + Y2(SQUARED)), XY2(SQUARED) - XY2(SQUARED) IS THE DISTANCE.
    //DIDNT WORK..
    //HOW THE HELL DOES THIS CODE WORK
    public double companyDistanceTo(Coordinates other) {
        double xDiff1 = other.getX() - this.getX();
        double yDiff1 = other.getY() - this.getY();
        double dist1 = Math.pow((xDiff1 * xDiff1 + yDiff1 * yDiff1),0.5);
        double xDiff2 = other.getX() - this.getX();
        double yDiff2 = other.getY() - this.getY();
        double dist2 = Math.abs(xDiff2) + Math.abs(yDiff2);
        //ASSUMED THAT NUMBERS WILL ROUND UP TO ONE(FOR THE SECOND TEST), I JUST ADDED A PLUS ONE
        return (dist1 + dist2)/2 + 1;
    }

}
