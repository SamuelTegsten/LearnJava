package Course1027.Task1;

import java.time.LocalDate;
public class PostIt {
    private String note;
    private LocalDate localDate = LocalDate.now();
    private static int PostItNumber;
    public PostIt(String note) {
        this.note = note;
        this.PostItNumber++;
    }

    public void addNote(String s){
        note += "\n";
        note += s;
    }

    public static int getPostItNumber() {
        return PostItNumber;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "PostIt { " + "PostIt number: " + PostItNumber + "\'" +
                " note = '" + note + '\'' +
                ", Last Updated : " + localDate +
                '}';
    }
}
