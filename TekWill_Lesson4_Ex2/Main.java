public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(12);
        System.out.println("Aria cercului cu radiusul de " + circle.getRadius() +" cm este " + circle.calculateAria() + " cm");
    }
}
