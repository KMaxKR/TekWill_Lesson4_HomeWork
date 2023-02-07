public class Circle {
    private int radius;
    public int calculateAria(){
        return (int) (2* 3.14 * radius);
    }
    public int getRadius(){
        return radius;
    }

    public Circle(int myRadius) {
        this.radius = myRadius;
    }
}
