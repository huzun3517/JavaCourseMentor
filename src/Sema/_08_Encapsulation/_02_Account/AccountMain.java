package Sema._08_Encapsulation._02_Account;

public class AccountMain {

    public static void main(String[] args) {

        Account account1=new Account(11111,"ALi","aaaa@gmail.com",1000);

        System.out.println(account1.getAcc_no()+" "+account1.getName()+" "+account1.getEmail()+" "+account1.getAmount());


//        Account account2=new Account();
//        account2.setAcc_no(1000);

    }
}
