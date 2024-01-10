package HW4_2;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1, 1000);
        acc.setAnnualInterestRate(0.12);
        System.out.println(acc.getMonthlyInterestRate());
        System.out.println(acc.getMonthlyInterest());
        acc.withdraw(1000);
        acc.deposit(500);
        System.out.println(acc.getBalance());
        System.out.println(acc.getId());
    }
}
