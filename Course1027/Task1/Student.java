package Course1027.Task1;

public class Student {
    private String name;
    private String education;
    private int credits;

    public Student(String _name, String _education){
        name = _name;
        education = _education;
    }

    public int getCredits(){
        return credits;
    }

    public void addCreditPoints(int score){
        if(score >= 0){
            credits += score;
        }
        else{
            System.out.println("Cannot add negative values in credits");
        }
    }

    public void setProgram(String swap){
        education = swap;
    }

    public String toString(){
        String info = "Name: " + name + " " + ", Education: " + education + ", Credits:";
        info += String.format("%d", credits);
        return info;
    }
}
