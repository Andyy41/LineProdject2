public class CoordinateRunner {
    public static void main(String[] args) {
        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        Coordinate equation = new Coordinate(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.lineEquation());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Slope: " + equation.slope());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));




    }
}




