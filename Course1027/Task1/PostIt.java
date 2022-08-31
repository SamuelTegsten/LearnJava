package Course1027.Task1;

import java.time.LocalDate;
public class PostIt {
    private String note;
    private LocalDate localDate = LocalDate.now();
    private static int PostItNumber;
    private int PostItId;
    public PostIt(String note) {
        this.note = note;
        this.PostItNumber++;
        this.PostItId = PostItNumber;
    }

    public void addNote(String s){
        note += "\n";
        note += s;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public static int getPostItNumber() {
        return PostItNumber;
    }

    public int getPostItId() {
        return PostItId;
    }

    @Override
    public String toString() {
        return "PostIt { " +
                " note ='" + note + '\'' +
                ", localDate = " + localDate +
                ", PostItId = " + PostItId +
                " Total PostIt = " + PostItNumber +
                '}';
    }
}
