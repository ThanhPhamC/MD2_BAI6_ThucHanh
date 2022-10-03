public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Shape---------------");

        Shape shape1=new Shape();
        System.out.println(shape1);
        shape1=new Shape("red",false);
        System.out.println(shape1);
        System.out.println("----------------Circle---------------");
        Circle cir1=new Circle();
        System.out.println(cir1);
        cir1 =new Circle(3.5);
        System.out.println(cir1);
        cir1=new Circle("red",true,3.5);
        System.out.printf(cir1.toString());
        System.out.println();
        System.out.println("----------------Retange---------------");
        Rectangle re=new Rectangle();
        System.out.println(re);
        re=new Rectangle(1.2,2.2);
        System.out.println(re.toString());
        re=new Rectangle("grennn",true,3.3,2.2);
        System.out.println(re.toString());
        System.out.println("-----------------Square----------------");
        Square square=new Square();
        System.out.println(square);
        square=new Square(3.0);
        System.out.println(square);
        square= new Square("orange",false,2.0);
    }
}