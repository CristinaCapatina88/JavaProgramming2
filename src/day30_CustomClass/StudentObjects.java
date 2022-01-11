package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

       Student student1= new Student();
       student1.setInfo("Vica",'F',41,256,'A');

        Student student2= new Student();
        student2.setInfo("Igor", 'M',32,5698,'F');

        Student student3= new Student();
        student3.setInfo("Hulya", 'F',26,5698,'B');

        Student student4= new Student();
        student4.setInfo("Elimur", 'M', 28,5511,'A');

        Student student5= new Student();
        student5.setInfo("Mert", 'M',26,2252,'C');

        Student [] students ={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("_____________________________________________________");
        ArrayList<Student> angryBirds = new ArrayList<>();
        ArrayList<Student> earlyBirds = new ArrayList<>();//grade A
        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);





    }
}
