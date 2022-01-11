package day36_Inheritance.employee;

public class ITcompany {
    public static void main(String[] args) {

        Developer dev1 = new Developer();
        dev1.setInfo("Anna","Developer","Oracle",'M',36,65,200000);

        dev1.work();
        dev1.isDeveloping();


        Tester tester1 = new Tester();
        tester1.setInfo("Cristina","SDET","Oracle",'F',34,15,120000);

        tester1.isTesting();
        tester1.work();

        Teacher teach1 = new Teacher();
        teach1.setInfo("Lena","Teacher","School",'F',23,56,85000);

      teach1.isTeaching();
      teach1.work();

      Driver driver1 = new Driver();
      driver1.setInfo("Anatol","driver","MoldElectrica",'M',63,56,5000);

      driver1.isDriving();
      driver1.work();

        System.out.println(dev1);
        System.out.println(teach1);
        System.out.println(tester1);
        System.out.println(driver1);

    }
}
