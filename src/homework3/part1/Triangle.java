package homework3.part1;

public class Triangle implements AreaReturner {
    private int area;


    public Triangle(int area) {
        this.area = area;

    }

    @Override
    public int getArea() {
        return area;
    }
}
