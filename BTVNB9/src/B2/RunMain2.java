package B2;

public class RunMain2 {
    public static void main(String[] args) {
        IShape[] shapeps=new IShape[3];
        shapeps[0] = new Rectangle(3.4,5.3);
        shapeps[1]=new Circle(5.5);
        shapeps[2]=new Rectangle(7.4,4.3);
        for(int i=0;i<3;i++) {
            System.out.println("Area of shapes[" + i + "]: " + shapeps[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapeps[i].getPerimeter());
        }

    }
}
