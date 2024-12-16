package homework5.phonebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Phonebook {
    private List<Record> phoneRecords;


    public Phonebook(List<Record> phoneRecords) {
        this.phoneRecords = phoneRecords;
    }

    public void add(Record record) {
        phoneRecords.add(record);
    }

    public List<Record> find(String name) {
        LinkedList<Record> resultRecord = new LinkedList<>();
        for (Record currentRecord : this.phoneRecords) {
            if (currentRecord.getName().equals(name)) {
                add(currentRecord);
                break;
            }
        }
        return resultRecord;
    }

    public List<Record> findAll(String name) {
        LinkedList<Record> matches = new LinkedList<>();
        for (Record currentRecord : phoneRecords) {
            if (currentRecord.getName().equals(name)) {
                matches.add(currentRecord);
            }
        }
        return matches.isEmpty() ? new LinkedList<>() : matches;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phoneRecords=" + phoneRecords +
                '}';
    }
}



