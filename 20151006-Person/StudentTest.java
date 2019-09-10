
/**
 * Write a description of class StudentTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTest extends Student
{
    public static void main ( String[] args )
    {
        Student s1=new Student();
        Student s2=new Student("Tom", 21);
        Student s3=new Student("Ann", 46);
       
        System.out.println("Student s1: ");
        s1.printDetails();
        System.out.println("Student s2: ");
        s2.printDetails();
        System.out.println("Student s3: ");
        s3.printDetails();
    }
}
