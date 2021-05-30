package Exam14;
import Exam14.Account.*;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(1000);
        a1.setAccountNumber("4649");

        Account a2 = new Account();
        a2.setBalance(2000);
        a2.setAccountNumber("4649 ");

        Account a3 = new Account();
        a3.setBalance(2000);
        a3.setAccountNumber("4648");

        System.out.println(a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a1));
        System.out.println(a2.equals(a3));
    }
    
}
