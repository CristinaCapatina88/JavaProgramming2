package day26_CustomMethodsPractice.day31_Constructors.scrumTask;

public class MyScrumTeam {
  public static void main(String[] args) {


    //4 testers objects
    Tester tester1 = new Tester("Cristina", 56238, "SDET", 130000);
    Tester tester2 = new Tester("Ana", 12458, "QA", 100000);
    Tester tester3 = new Tester("IOn", 158, "QA", 120000);
    Tester tester4 = new Tester("Vica", 458, "QA", 10000);

    Tester[] testers = {tester2, tester3, tester4};

    //5 developers objects
    Developer developer1 = new Developer("Olga", 45, "Java Developer", 150000);
    Developer developer2 = new Developer("Rita", 55, "Senior Developer", 170000);
    Developer developer3 = new Developer("Ali", 65, "Master Developer", 180000);
    Developer developer4 = new Developer("Muhtar", 45879, " Senior Engineer", 250000);
    Developer developer5 = new Developer("Sinem", 13, "Senior Developer", 200.000);

    Developer[] developers = {developer2, developer3, developer4};

    //1 ScrumTeam Object
    ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);

    scrum.addTester(tester1);
    scrum.addDeveloper( developer1);

    scrum.addTesters(testers);
    scrum.addDevelopers(developers);

    System.out.println(scrum);
    System.out.println("------------------------------------------------------");

    for(Tester eachTester : scrum.testersList ){
      System.out.println(eachTester.name + " : "+ eachTester.salary);
    }
    System.out.println("------------------------------------------------------");
    for (Developer eachDeveloper : scrum.devopsList) {
      System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
    }

    System.out.println("------------------------------------------------------");

    scrum.removeTester( 23 );
    scrum.removeDeveloper( 22 );

    System.out.println(scrum);




  }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */