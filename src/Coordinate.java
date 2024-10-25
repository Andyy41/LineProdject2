public class Coordinate {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int X;
    private int y;
    public Coordinate(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        X=0;
        y=0;
    }






    public String slope(){
        double X = x2-x1;
        double y = y2-y1;
        return X + "/" + y;
    }




    public double Convert(){
        return (double) X/y;
    }
    public double length(){
        return (.5)*(X*y);
    }


    public double distance (){
        return Math.sqrt((Math.pow(X,2) + (Math.pow(y,2))));
    }


    public double B() {
        return Convert() * x1 -y1;
    }




    public double xIntercept(){
        return Convert() / B();
    }
    public double yIntercept(){
        return B();
    }
    public String lineEquation(){
        return "The equation of this line is y=" + slope() + "x" + B();
    }
}



