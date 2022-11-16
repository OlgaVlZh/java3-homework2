public class Main {
    public static void main(String[] args) {

        int currentAccount = 100; // переменная для хранения ден. ср-в на счете клиента
        int deposit = 1100; // переменная для хранения суммы пополнения

        if (deposit > 1000) {
            currentAccount = currentAccount + deposit + deposit / 100;
        } else {
            currentAccount = currentAccount + deposit;
        }

        System.out.println(currentAccount);
    }
}