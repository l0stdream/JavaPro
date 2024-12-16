package homework5;

public class OccurrenceWords {
    private String name;
    private int occurrence;

    @Override
    public String toString() {
        return "OccurrenceWords{" +
                "name: \"" + name + '\"' +
                ", occurrence: " + occurrence +
                '}';
    }

    public OccurrenceWords(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }
}
