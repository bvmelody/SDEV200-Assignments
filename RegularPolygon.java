public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public static void main(String[] args) {
        RegularPolygon Poly1 = new RegularPolygon();
        RegularPolygon Poly2 = new RegularPolygon(6, 4);
        RegularPolygon Poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The area is " + Poly1.getArea() + " the perimeter is " + Poly1.getPerimeter());
        System.out.println("The area is " + Poly2.getArea() + " the perimeter is " + Poly2.getPerimeter());
        System.out.println("The area is " + Poly3.getArea() + " the perimeter is " + Poly3.getPerimeter());
    }

    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int sides, double length){
        n = sides;
        side = length;
    }

    RegularPolygon(int sides, double length, double X, double Y){
        n = sides;
        side = length;
        x = X;
        y = Y;
    }

    public void setNumSides(int num){
        n = num;
    }
    public int getNumSides(){
        return n;
    }
    public void getSide(double length){
        side = length;
    }
    public double getSide(){
        return side;
    }
    public double getX(double X){
        x = X;
        return x;
    }
    public double getX(){
        return x;
    }
    public double getY(double Y){
        y = Y;
        return y;
    }
    public double getY(){
        return y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return n * (Math.pow(side, 2) / 4 * Math.tan(Math.PI / n));
    }
}
