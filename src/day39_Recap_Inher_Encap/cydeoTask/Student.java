package day39_Recap_Inher_Encap.cydeoTask;

public class Student extends Person{


   private int studentID;
   private String fieldofStudy;

    public Student(String name, int age, char gender, int studentID, String fieldofStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldofStudy(fieldofStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldofStudy() {
        return fieldofStudy;
    }

    public void setFieldofStudy(String fieldofStudy) {
        this.fieldofStudy = fieldofStudy;
    }

    public void study(){
        System.out.println(getName() + " "+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldofStudy='" + fieldofStudy + '\'' +
                '}';
    }
}
