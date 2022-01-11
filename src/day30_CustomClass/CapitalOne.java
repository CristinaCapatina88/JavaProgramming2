package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

       Employee employee1 =new Employee();
       employee1.setInfo("Ion", "SDET",'F',5698,25000,true);

        Employee employee2 =new Employee();
        employee2.setInfo("Vanea","QA",'M',5632,10000,true);

        Employee employee3 =new Employee();
        employee3.setInfo("Ali","banker",'M',89623,56000,false);

        Employee employee4 =new Employee();
        employee4.setInfo("Cristina","SDET",'F',1588,120000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Capatina", "QA", 'F', 11588, 130000,true);

Employee [] employees ={employee1,employee2,employee3,employee4,employee5};

        for (Employee each : employees) {
            if(each.id== 1588){
                System.out.println(each);
            }
        }
        for (Employee each : employees) {
            if(each.name.equals("Cristina")&& each.isfullTime){
                System.out.println(each);
            }
        }

int count =0;
        for (Employee each : employees) {
            if(each.isfullTime){
                count++;
            }
        }

        System.out.println("Fulltime employee = " + count);

       double maxSalary = employees[0].salary;//assuming first object has the maxsalary
        double minSalary = employees[0].salary;
        for (Employee each : employees) {
            if(each.salary>maxSalary){
                maxSalary=each.salary;
            }
        }
        for (Employee each : employees) {
            if(each.salary<minSalary){
                minSalary= each.salary;
            }
        }
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);

        employee1.work();

    }
}
