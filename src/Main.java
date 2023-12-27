
// public class Main {
// public static void main(String[] args) {
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной мили
// int amount = 25_897;
// int miles = 20;
// Рассчитываете количество бонусных миль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран
// System.out.printf((amount / miles) + " миль начислено");

// или без ввода int miles
// System.out.println(amount/20 + " миль начислено");
//}
//}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 125_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}
