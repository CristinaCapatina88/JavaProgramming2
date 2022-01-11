package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1= new Student("Ahmed");

       Student student2 = new Student("Valik",'F');
       Student student3 = new Student("Ana",1245);

        Student student4 =new Student("Paula",'F',23,8956,'A');
        Student student5 =new Student("Cihad",'M',29);
        Student student6 = new Student("Camila",'F',22,66,'A');
        Student student7 = new Student("Paula",'F',23,8956);


        Student [] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));


    }
}
