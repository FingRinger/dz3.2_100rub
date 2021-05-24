public class Main {
    public static void main(String[] args) {

//topupAmount - сумма пополнения счета
        long topupAmount = 100;
        boolean i = topupAmount > 1000;

       long bonus;
        if (i) {

            bonus = topupAmount / 100;
        }
        else {
             bonus = 0;
        }
 long currentBalance = 100;
 long total = currentBalance + topupAmount + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}