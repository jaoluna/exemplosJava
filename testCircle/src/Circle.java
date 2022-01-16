public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }

}

