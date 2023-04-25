package StudentApplication1;

import java.util.*;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static BLClass bl = new BLClass();
    public static void main(String[] args) {
        boolean status=true;

        while (status){
            System.out.println("Select Mode Of Operation");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student By Roll No");
            System.out.println("3. Display All Student");
            System.out.println("4. Update Subject By Student RollNo");
            System.out.println("5. Search Student By Subject Id");
            System.out.println("6. Display All Student By Subject");
            System.out.println("7. Exit");
            int option=sc.nextInt();

            switch (option){
                case 1:
                     addStudent();
                       break;
                case 2:
                     removeStudentByRollNo();
                     break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    updateSubjectById();
                    break;
                case 5:
                    serachStudentByRollNo();
                    break;
                case 6:
                    displayStudentBySubject();
                    break;
                case 7:
                    status=false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
    private static void addStudent(){
        System.out.println("Enter Student RollNo");
        int studRollNo=sc.nextInt();
        System.out.println("Enter Student Name");
        String studName=sc.next();
        System.out.println("Enter Student Age");
        int studAge=sc.nextInt();
        Subject s = addSubject();
        Student s1=new Student(studRollNo,studName,studAge,s);
        bl.addStudent(s1);
    }
    private static Subject addSubject(){
        System.out.println("Enter Subject Id");
        int subId=sc.nextInt();
        System.out.println("Enter Subject Name");
        String subName=sc.next();
        System.out.println("Enter Subject Fees");
        double subFee=sc.nextDouble();

        return new Subject(subId,subName,subFee);
    }
    private static void removeStudentByRollNo(){
        System.out.println("Enter Student Id You Want to Delete");
        int studRollNo= sc.nextInt();
        bl.removeByRollNo(studRollNo);
    }
    private static void displayStudent(){
        bl.displayStudent();
    }
    private static void updateSubjectById(){
        System.out.println("Enter Student RollNo You Want To Update");
        int rollNo= sc.nextInt();
        System.out.println("Enter New Subject Name");
        String subName=sc.next();
        bl.updateSubjectById(rollNo,subName);
    }

    private static void serachStudentByRollNo(){
        System.out.println("Enter Subject ID ");
        int subId=sc.nextInt();
        bl.serachStudentByRollNo(subId);
    }
    private static void displayStudentBySubject(){
        System.out.println("Enter Student Subject ");
        String studsub=sc.next();
        bl.displayStudentBySubject(studsub);

    }
}
