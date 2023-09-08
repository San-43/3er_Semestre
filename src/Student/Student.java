import java.text.MessageFormat;

public class Student extends Person {
    private int  account;
    private String degree;
    private int semester;
    private int group;
    private double gradeAverage;
    private String shift;
    private String status;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudent() {
        return MessageFormat.format("Account: {0}\nSemester: {1}\nGroup: {2}\nDegree: {3}\nGrade Average: {4}\nShift: {5}\nStatus: {6}\n{7}", getAccount(),getSemester(),getGroup(),getDegree(),getGradeAverage(),getShift(),getStatus(),super.getPerson());
    }
}