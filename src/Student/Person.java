import java.text.MessageFormat;

public class Person {
    private String curp;
    private String name;
    private int age;
    private String sex;
    private String nationality;

    /*public Person(String curp, String name, int age, String sex, String nationality) {
        this.curp = curp;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }*/

    public String getPerson() {
        System.out.println(this.getClass());
        return MessageFormat.format("CURP: {0}\nName: {1}\nAge: {2}\nSex: {3}\nNationality: {4}", this.getCurp(), this.getName(), this.getAge(), this.getSex(), this.getNationality());
    }

    public String getPerson(int x) {
        System.out.println(this.getClass());
        return MessageFormat.format("CURP: {0}\nName: {1}\nAge: {2}\nSex: {3}\nNationality: {4}", this.curp, this.name, this.age, this.sex, this.nationality);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
