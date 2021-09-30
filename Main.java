public class Main {

    public static void main(String[] args) {

        Account udaysAccount = new Account("121212",0,"Abhay","uday@xyz.com","1212121");

        udaysAccount.DepositMoney(50);
        udaysAccount.DepositMoney(150);

        udaysAccount.WithDrawMoney(100);
    
    }
}