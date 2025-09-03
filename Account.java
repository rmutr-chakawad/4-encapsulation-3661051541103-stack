public class Account {
   private String code;
   private String name;
   private double balance;

   //constructor method เมธอดถูกเรียกใช้เมื่อ instance object
    public Account(String code, String name, double balance){
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    public void  setName(String newName ){
        this.name = newName;
    }
    public double getBalance(){
        return balance;
    }

    //เมธอดฝากเงอน (deposit) เงินที่นำฝากต้องมีค่ามากกว่า 0
    public  void deposit(double money){
        if (money>0){
            this.balance+=money;
        }

    }

    //เมธอดถอนเงิน (withdraw) เงินคงเหลือต้องมีค่ามากกว่าเท่ากับเงินที่ถอน
    public void withdraw(double money){
        if (balance>=money){
            this.balance-=money;
        }

    }
    public void show(){
        System.out.printf("code : %s", code);
        System.out.printf("name : %s", name);
        System.out.printf("balance : %f baht", balance);
    }
}
