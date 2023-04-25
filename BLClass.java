package StudentApplication1;
import java.util.*;
public class BLClass {
    private static List<Student> data=new ArrayList<>();
    public void addStudent(Student s) {
        data.add(s);
    }
    public void removeByRollNo(int studRollNo){
        for(Student s:data){
            if(studRollNo==s.getStudRollNo()){
                data.remove(s);
                break;
            }
        }
    }
    public void displayStudent(){
        for (Student s:data){
            System.out.println(s);
        }
    }
    public void displayStudentBySubject(String studSub){
     for (Student s:data){
        if(studSub.equals(s.getStudSub().getSubName())){
            System.out.println(s);
        }
     }
    }
    public void updateSubjectById(int rollNo,String subName) {

        for(int i=0;i<data.size();i++){
            if(rollNo==data.get(i).getStudRollNo()){
                data.get(i).getStudSub().setSubName(subName);
            }
        }
    }
    public void serachStudentByRollNo(int subId){
        for (Student s:data){
         if(subId==s.getStudSub().getSubId()){
             System.out.println(s);
             break;
         }
        }
    }
}
