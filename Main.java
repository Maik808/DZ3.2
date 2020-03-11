public class Main {

    public static void main(String[] args) {
        double balance = 100;
        double changeBalance = 5000.55;
        double totalBalance;
        if (changeBalance > 1000) {
            int bonus = (int) changeBalance / 100;
            totalBalance = bonus + changeBalance + balance;
        } else {
            totalBalance = balance + changeBalance;
        }
        System.out.println(totalBalance);
    }

}
