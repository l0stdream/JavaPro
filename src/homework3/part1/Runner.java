package homework3.part1;

public class Runner {
    public static void main(String[] args) {
        AreaReturner[] areaReturner = new AreaReturner[5];
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10);
        Square square = new Square(4);

        areaReturner[0] = circle;
        areaReturner[1] = circle;
        areaReturner[2] = square;
        areaReturner[3] = square;
        areaReturner[4] = triangle;

        System.out.println(square.getArea());
        System.out.println(triangle.getArea());
        System.out.println(circle.getArea());

        System.out.println(areaCalculate(areaReturner));
    }

    private static int areaCalculate(AreaReturner[] areaReturner) {
        int sum = 0;
        for (int i = 0; i < areaReturner.length; i++) {
            sum += areaReturner[i].getArea();
        }
        return sum;
    }

}
