public class Main {
    public static void main(String[] args) {
        //переменная для хранения стоимости билета
        int price = 21_512;
        // переменная для хранения количества рублей для одной бонусной мили
        int oneReward = 20;
        //расчет количества бонусных миль с использованием значений заведенных переменных
        int miles = price / oneReward;
        System.out.println("Бонусные мили: " + miles);
    }
}
