public class testPizza {
    public static void main(String[] args) {
        Pizza Pizza = new Pizza();
        
        Pizza.addTopping("ไส้กรอก");
        Pizza.addTopping("เห็ด");
        Pizza.addTopping("แฮม");
        Pizza.addTopping("ปูอัด");

        Pizza.printAllTopping();

        System.out.println("จำนวนเครื่องปรุงทั้งหมด: " + Pizza.getTotalToppings());

        System.out.println("ราคาพิซซ่า: " + Pizza.getPrice() + " บาท");
    }
}
