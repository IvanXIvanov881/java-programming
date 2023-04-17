import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която генерира и принтира на конзолата четирицифрени числа, в които първата и
        // втората двойка цифри образуват двуцифрени прости числа (пример за такова число 1723).
        // Крайната стойност до която трябва да се генерират двойките се определя от други 2 цифри, подадени като вход,
        // които определят с колко крайната стойност е по-голяма от началната.
        //Вход
        //От конзолата се четат четири реда:
        //На първия ред – началната стойност на първите първата двойка числа – цяло положително число в диапазона [10… 90]
        //На втория ред – началната стойност на втората двойка числа – цяло положително число в диапазона [10… 90]
        //На третия ред – разликата между началната и крайната стойност на  първата двойка числа – цяло положително число в диапазона [1… 9]
        //На четвъртия ред – разликата между началната и крайната стойност на  втората двойка числа – цяло положително число в диапазона [1… 9]
        //Изход:
        //Да се отпечатат на конзолата четирицифрените числа, в които първите две и вторите две цифри са прости двуцифрени числа.

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int difnum1 = Integer.parseInt(scanner.nextLine());
        int difnum2 = Integer.parseInt(scanner.nextLine());

        int num1end = num1 + difnum1;
        int num2end = num2 + difnum2;


        for (int i = num1; i <= num1end; i++) {
            for (int j = num2; j <= num2end; j++) {


                //проверка за просто число (моя)
                        if (i % 2 != 0 && j % 2 != 0 && i % 3 != 0 && j % 3 != 0 && i % 5 != 0 && j % 5 != 0 && i % 7 != 0 && j % 7 != 0
                                && i % 9 != 0 && j % 9 != 0 ){
                            System.out.printf("%d%d\n", i, j);
                    }






            }
        }
    }
}
