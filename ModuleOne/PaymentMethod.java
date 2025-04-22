package ModuleOne;

import java.util.Scanner;

interface CashInterface{
    void paymoney();
}

interface CardInterface{
    void validateCard();
}

interface upiInterface{
    int checkBalance();
}

abstract class PaymentAbstract{

    abstract void doTransaction();

}

abstract class CashAbstract extends PaymentAbstract{
    
    @Override
    public void doTransaction(){
        System.out.println("Money transaction has completed");
    }

    abstract boolean hasCash(int moneyToBePaid);

}

abstract class CreditCardInterface extends PaymentAbstract implements CardInterface{

    abstract boolean checklimit();
    public void validateCard(){
        System.out.println("validating card");
        System.out.println("Card validated");
    }

}

abstract class DebitCardInterface extends PaymentAbstract implements CardInterface{

    abstract int checkBalance();

    abstract void withdrawcash(int moneyToBeWithdrawed);

    public void validateCard(){
        System.out.println("validating card");
        System.out.println("Card validated");
    }
    
}

abstract class upiAbstract extends PaymentAbstract{


    abstract boolean transfer(int moneyToBeTransferred);

    abstract void paybill();

}

class Cash extends CashAbstract{

    int moneyToBePaid;
    int remainingMoney;
    Cash(int remainingMoney){
        this.remainingMoney = remainingMoney;
    }

    public boolean hasCash(int moneyToBePaid){
      return remainingMoney < moneyToBePaid;
    }

}

class CreditCard extends CreditCardInterface{
    int balance;
    CreditCard(int balance){
        this.balance = balance;
    }

    

    @Override
    public boolean checklimit(){
        return (balance < 40000)? true: false;
    }

    public void doTransaction(){
        System.out.println("Transaction is successful");
    }

}

class DebitCard extends DebitCardInterface{
    int balance;
    DebitCard(int balance){
        this.balance = balance;
    }
    
    @Override
    int checkBalance() {
        return balance;
    }
    @Override
    void withdrawcash(int moneyToBeWithdrawed) {
        this.balance = this.balance - moneyToBeWithdrawed;
        System.out.println("Money withdrawal is successful");
    }
    @Override
    void doTransaction() {
        System.out.println("Transaction is successful");
    }
}

class UPI extends upiAbstract{

    String appName;
    int balance;

    UPI(String appName, int balance){
        this.appName = appName;
        this.balance = balance;
    }

    @Override
    boolean transfer(int moneyToBeTransferred) {
        if(moneyToBeTransferred < balance){
        this.balance = this.balance - moneyToBeTransferred;
        System.out.println("Transfer is successful");
        return true;
        }
        System.out.println("Transfer not possible due to not sufficient balance");
        return false;
    }

    @Override
    void paybill() {
        
    }

    @Override
    void doTransaction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doTransaction'");
    }
    
}


public class PaymentMethod {
    
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        int moneyToBePaid, withdrawcash;

        while(true){
            System.out.println("Enter the type of payment\n1. Credit card\n2. Debit card\n3. UPI\n4. Cash\n5. Exit");
            option=sc.nextInt();
            switch (option) {
                case 1 : {
                      
                          break;
                        }  
                case 2 : {
                          ;
                          break;
                        }
                case 3 : {
                         
                        }
                default:
                    break;
            }
        }
    }

    

    
}