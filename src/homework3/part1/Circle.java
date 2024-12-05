package homework3.part1;

public class Circle implements AreaReturner {
    private int area;

    public Circle(int area) {
        this.area = area;
    }


    @Override
    public int getArea() {
        return area;
    }
}
