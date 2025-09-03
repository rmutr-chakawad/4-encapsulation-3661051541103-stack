public class Pizza {
    private final int maxTopping = 10;
    private String[] toppings;
    private int totalTopping;


    public Pizza() {
        toppings = new String[maxTopping];
        totalTopping = 0;
    }


    public void addTopping(String topping) {
        if (totalTopping < maxTopping) {
            toppings[totalTopping] = topping;
            totalTopping++;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุงได้อีกแล้ว (เต็ม 10 อย่าง)");
        }
    }


    public int getTotalToppings() {
        return totalTopping;
    }


    public int getPrice() {
        return 100 + (totalTopping * 10);
    }


    public void printAllTopping() {
        System.out.println("รายการเครื่องปรุง:");
        for (int i = 0; i < totalTopping; i++) {
            System.out.println("- " + toppings[i]);
        }
    }
}
