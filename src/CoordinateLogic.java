import java.util.Scanner;


public class CoordinateLogic {
    private Coordinate coordinate;
    private Scanner myScanner;


    public CoordinateTracker (){
        Coordinate = null;
        myScanner = new Scanner(System.in);
    }
    public void start(){
        getCoordInfo();
    }
    public void getCoordInfo() {
        System.out.print("Enter x1: ");
        int x1 = myScanner.nextInt();
        System.out.println("Enter y1: ");
        int y1 = myScanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = myScanner.nextInt();
        System.out.println("Enter y2: ");
        int y2 = myScanner.nextInt();
        Coordinate  = new Coordinate();
    }
}




