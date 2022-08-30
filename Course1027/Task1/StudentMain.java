package Course1027.Task1;

public class StudentMain {
    public static void main(String[] args){
        Student s = new Student("Samuel", "Engineering");
        System.out.println(s.toString());

        s.addCreditPoints(8);
        int credits = s.getCredits();
        System.out.println("Current credits is: " + credits);

        System.out.println(s.toString());

        s.setProgram("Computer Science");
        System.out.println(s.toString());
    }
}
