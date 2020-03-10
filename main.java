public class main {
    public static void main(String[] args) {
        double balance = 100;
        double change_balance =5000.55;
        double total_balance;
           if (change_balance>1000){
               int bonus =(int) change_balance/100;

               total_balance=bonus+change_balance+ balance;
           }
               else{
               total_balance = balance + change_balance;
           }
        System.out.println(total_balance);
    }
}
