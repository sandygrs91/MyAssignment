public class GradeTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudent("Ravi",94.00f);
        student2.setStudent("Sonam",85.66f);
        student3.setStudent("jake", 76.00f);

        student1.calculateGrade();
        student2.calculateGrade();
        student3.calculateGrade();




    }
}
class Student
{
    char yourGrade; //must be surrounded by single quotes
    String yourName; // must be surrounded by double quotes
    float yourMarks;

    void setStudent(String yn, float ym) { //mutation on name and marks
        System.out.println("setting the initial name and marks for the student....");
        yourName=yn;
        yourMarks=ym;
    }
    //no return     no argument
    void calculateGrade() //mutation to the grade
    {
        if(yourMarks >=1 && yourMarks <35) // 34.99999999999999999 is included, but not 35
            yourGrade='F';
        else if(yourMarks >=35 && yourMarks <45)
            yourGrade='E';
        else if(yourMarks >=45 && yourMarks <65)
            yourGrade='D';
        else if(yourMarks >=65 && yourMarks <75)
            yourGrade='C';
        else if(yourMarks >=75 && yourMarks <90)
            yourGrade='B';
        else if(yourMarks >=90 && yourMarks <=100)
            yourGrade='A';

        printGradeCard(); //no need of .(dot) here ...
    }
    void printGradeCard() //non-mutator
    {
        System.out.println(yourName+", your marks are :"+yourMarks+" hence your grade is : "+yourGrade);
    }
}