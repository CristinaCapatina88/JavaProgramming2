package day26_CustomMethodsPractice.day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount();
  account1.setInfo("CristinaCapatina",23568914);

    account1.deposit(1000);
   account1.checkBalance();
   account1.withdraw(900);
   account1.checkBalance();

        System.out.println("__________________________________________");

        BankAccount account2= new BankAccount();
    account2.setInfo("Aygun",123456789);

   account2.deposit(500);
   account2.checkBalance();

   account2.withdraw(300);
   account2.checkBalance();


    }
}
