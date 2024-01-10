package HW9_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HW9_4 {
    public static void main(String[] args) {
        BankApplication a = new BankApplication("Kaspi");
        BankApplication b = new BankApplication("Halyk");
        BankApplication c = new BankApplication("VTB");
        a.addAccount(new Account(0, "A", "A",1000));
        a.addAccount(new Account(1, "B", "B",2000));
        a.addAccount(new Account(2, "C", "C",1000));
        a.addAccount(new Account(3, "D", "D",3000));
        a.addAccount(new Account(4, "E", "E",3000));
        a.addAccount(new Account(5, "F", "F",4000));
        a.addAccount(new Account(6, "G", "G",2000));
        a.addAccount(new Account(7, "H", "H",1000));
        a.addAccount(new Account(8, "I", "I",5000));
        a.addAccount(new Account(9, "J", "J",3000));
        b.addAccount(new Account(0, "A", "A",5000));
        b.addAccount(new Account(1, "B", "B",3000));
        b.addAccount(new Account(2, "C", "C",1000));
        b.addAccount(new Account(3, "D", "D",1000));
        b.addAccount(new Account(4, "E", "E",4000));
        b.addAccount(new Account(5, "F", "F",2000));
        b.addAccount(new Account(6, "G", "G",2000));
        b.addAccount(new Account(7, "H", "H",4000));
        b.addAccount(new Account(8, "I", "I",6000));
        b.addAccount(new Account(9, "J", "J",4000));
        c.addAccount(new Account(0, "A", "A",7000));
        c.addAccount(new Account(1, "B", "B",4000));
        c.addAccount(new Account(2, "C", "C",2000));
        c.addAccount(new Account(3, "D", "D",1000));
        c.addAccount(new Account(4, "E", "E",5000));
        c.addAccount(new Account(5, "F", "F",6000));
        c.addAccount(new Account(6, "G", "G",4000));
        c.addAccount(new Account(7, "H", "H",3000));
        c.addAccount(new Account(8, "I", "I",4000));
        c.addAccount(new Account(9, "J", "J",2000));
        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(a);
        allBanks.add(b);
        allBanks.add(c);
        Collections.sort(allBanks, new Comparator<BankApplication>() {
            @Override
            public int compare(BankApplication o1, BankApplication o2) {
                if(o1.getAverageBalance()>o2.getAverageBalance())
                    return -1;
                else if(o2.getAverageBalance()>o1.getAverageBalance())
                    return 1;
                else return 0;
            }
        });
        for (int i=0;i<allBanks.size();i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
class Account{
    int id;
    String name;
    String surname;
    double balance;

    public Account(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return "ID:"+this.id+" Name:"+this.name+" Surname:"+this.surname+" Balance:"+this.balance;
    }
}
class BankApplication{
    String name;
    ArrayList<Account> accounts = new ArrayList<>();
    public BankApplication(String name){
        this.name = name;
    }
    public BankApplication(){
    }
    void addAccount(Account a){
        accounts.add(a);
    } // Добавляет новый объект Account
    void removeAccount(int i){
        accounts.remove(i);// Удаляет объект со списка под индексом i
    }
    Account getMaxAccount(){
        int max=0;
        for(int i =0;i<accounts.size();i++){
            if(accounts.get(i).getBalance()>max)
                max=i;
        }
        return accounts.get(max);
    } // Возвращает объект Account у кого самый высокий баланс
    double getAverageBalance(){
        double mid=0;
        for(int i=0;i<accounts.size();i++){
            mid+=accounts.get(i).getBalance();
        }
        return mid/accounts.size();
    } // Возвращает среднее значение баланса пользователей
    double getTotalBalance(){
        double sum=0;
        for(int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        return sum;
    }; // Возвращает сумму баланса пользователей
    int totalAccounts(){
        int total=0;
        for(int i=0;i<accounts.size();i++){
            total++;
        }
        return total;
    }; // Возвращает количество пользователей
    String getBankData(){
        return "Банк: "+name+" Счетов: "+totalAccounts()+" Баланс: "+getTotalBalance()+" Средний баланс: "+getAverageBalance();
    }; // Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
}

