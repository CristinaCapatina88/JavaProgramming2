package day37_Inheritance.ScrumTask;

public class AmazonINC {
    public static void main(String[] args) {
        String company = "AmazonINC";
       ProductOwner po= new ProductOwner("Ilia",23,'M',56,company,562389) ;
       BusinessAnalyst ba = new BusinessAnalyst("Vica",56,'F',89,company,8956);
       ScrumMaster sm = new ScrumMaster("Ana", 89,'F',23,company,4578);


        Tester tester1=new Tester("Chinara",32,'F',"QA",1415,company,5689);

        Tester tester2=new Tester("Yasaman",31,'F', "QE",1416,company,56892);

        Tester tester3=new Tester("Irena",29,'F',"SDET",1417,company,2356);

        Tester tester4=new Tester("Cihad",26,'M',"QA",1418,company,56894);

        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Chinara",32,'F',"Developer",1415,company,5689);

        ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);


        System.out.println(scrumTeam);

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : "+ tester.salary);
        }



    }
}
