package StudentApplication1;

public class Student {
    private int studRollNo;
    private String studName;
    private int studAge;
    private Subject studSub;

    public Student(){}
    public Student(int studRollNo, String studName, int studAge,Subject studSub) {
        this.studRollNo = studRollNo;
        this.studName = studName;
        this.studAge = studAge;
        this.studSub=studSub;
    }

    public int getStudRollNo() {
        return studRollNo;
    }
    public void setStudRollNo(int studRollNo) {
        this.studRollNo = studRollNo;
    }
    public String getStudName() {
        return studName;
    }

    public void setStudName() {
        this.studName = studName;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }
    public Subject getStudSub(){
        return studSub;
    }
    public void setStudSub(Subject studSub){
        this.studSub=studSub;
    }
    public String toString(){
        return studRollNo+"  "+studName+"  "+studAge+"  "+studSub;
    }
}
