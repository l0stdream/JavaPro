package homework3.part1;

public class Square implements AreaReturner {
    private int area;

    public Square(int area) {
        this.area = area;
    }

    @Override
    public int getArea() {

        return this.area;
    }
}
