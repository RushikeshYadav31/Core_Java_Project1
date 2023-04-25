package StudentApplication1;

public class Subject {
    private int subId;
    private String subName;
    private double subFee;

    public Subject(){}
    public Subject(int subId, String subName, double subFee) {
        this.subId = subId;
        this.subName = subName;
        this.subFee = subFee;
    }
    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {

        this.subName = subName;
    }
    public double getSubFee() {
        return subFee;
    }
    public void setSubFee(double subFee) {
        this.subFee = subFee;
    }
    public String toString(){
        return subId+"  "+subName+"  "+subFee;
    }
}
