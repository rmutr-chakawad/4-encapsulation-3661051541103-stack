import java.util.Scanner;

public class testAccount {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Input code:");
        String code = Keyboard.next();

        System.out.println("Input name:");
        String name = Keyboard.next();

        System.out.println("Input balance:");
        double balance = Keyboard.nextDouble();

        Account pantip = new Account(code, name, balance);
        pantip.show();

        //ฝากเงิน 1000 และแสดงผล
        System.out.print("In Deposit money 1000");
        double money = Keyboard.nextDouble();
        pantip.deposit(money);
        pantip.show();

        //ถอน 900 และแสดงผล
        System.out.print("In withdraw money 900");
        pantip.withdraw(900);
        pantip.show();


    }
}
