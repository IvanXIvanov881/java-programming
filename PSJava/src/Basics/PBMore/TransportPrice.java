import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:

        //Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.

        //Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.

        //Вход
        //От конзолата се четат два реда:
        //Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
        //Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта

        //Изход
        //Да се отпечата на конзолата най-ниската цена за посочения брой километри, форматирана до втория знак след десетичния разделител.


        int km = Integer.parseInt(scanner.nextLine());
        String dayornight = scanner.nextLine();

        double taxipriceday = 0.70 + km * 0.79;
        double taxipricenight = 0.70 + (km * 0.90);
        double busprice = km * 0.09;
        double trainprice = km * 0.06;

        if (km >= 100) {
            System.out.printf("%.2f", trainprice);
        } else if (km >= 20) {
            System.out.printf("%.2f", busprice);
        } else if (dayornight.equals("day")) {
            System.out.printf("%.2f", taxipriceday);
        } else if (dayornight.equals("night")) {
            System.out.printf("%.2f", taxipricenight);
        }


    }
}