public class Main {
    public static void main(String[] args) {
        int limit = 1000;
        int balance = 100;
        int phoneRecharge;
        int bonus;
        phoneRecharge = 1100;
        if(phoneRecharge > limit) {
            bonus = phoneRecharge / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus + balance + phoneRecharge);
    }
}
