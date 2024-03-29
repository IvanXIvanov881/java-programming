import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {

        //зеленчуци за N лева на килограм и плодове за M лева за килограм
        //Напишете програма, която да пресмята приходите от реколтата в евро(ако приемем, че едно евро е равно на 1.94лв).


        //Вход
        //От конзолата се четат 4 числа, по едно на ред:
        //⦁	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //⦁	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //⦁	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //⦁	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        Scanner scanner = new Scanner(System.in);

        double vegetableprice = Double.parseDouble(scanner.nextLine());
        double fruitprice = Double.parseDouble(scanner.nextLine());
        int vegetable = Integer.parseInt(scanner.nextLine());
        int fruit = Integer.parseInt(scanner.nextLine());

        double leva = (vegetableprice * vegetable) + (fruitprice * fruit);
        double total = leva / 1.94;

        System.out.printf("%.2f",total);

        //Изход
        //Да се отпечата на конзолата едно число: приходите от всички плодове и зеленчуци в евро.
        //Резултата да се форматира до втория знак след десетичния разделител.



    }
}
