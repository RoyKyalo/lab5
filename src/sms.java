import java.util.ArrayList;
import java.util.List;

public class sms
{
    private List<Grade> grades;

    public sms()
    {
        this.grades = new ArrayList<>();
    }

    public void assignGrade(String studentName, int grade)
    {
        try {
            if (grade < 0 || grade > 100)
            {
                throw new IllegalArgumentException("The grade entered is invalid : " + grade);
            }


            //list storage
            grades.add(new Grade(studentName, grade));
            System.out.println("The grade has been successfully entered for: " + studentName + " - " + grade);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        finally
        {
            System.out.println("The attempt was for the entry of : " + studentName);
        }
    }

    public static void main(String[] args) {
        sms system = new sms();

        // Attempt to assign valid and invalid grades
        system.assignGrade("Wabosha", 85);
        system.assignGrade("Mikaela", 105); // Invalid grade because it exceeds the 100 limit
        system.assignGrade("Chantal", -10); // Invalid grade because it is a negative number
    }

    private static class Grade
    {
        private String studentName;
        private int grade;

        public Grade(String studentName, int grade)
        {
            this.studentName = studentName;
            this.grade = grade;
        }

        //getter for the name
        public String getStudentName()
        {
            return studentName;
        }


        //setter for the name
        public void setStudentName(String studentName)
        {
            this.studentName = studentName;
        }


        //getter for the grade
        public int getGrade() {
            return grade;
        }


        //setter for the grade
        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
}
