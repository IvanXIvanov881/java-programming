import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {

        //Котката Том обича по цял ден да спи, за негово съжаление стопанинът му си играе с него винаги когато  има свободно време.
        //За да се наспи добре, нормата за игра на Том е 30 000  минути в година.

        //. Времето за игра на Том зависи от почивните дни на стопанина му:
        //Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //Когато почива, стопанинът му си играе с него  по 127 минути на ден.

        //Напишете програма, която въвежда броя почивни дни и отпечатва дали Том
        // може да се наспи добре и колко е разликата от нормата за текущата година, като приемем че годината има 365 дни.

        //Пример: 20 почивни дни -> работните дни са 345 (365 – 20 = 345). Реалното време за игра е 24 275 минути (345 * 63 + 20 *127).
        // Разликата от нормата е 5 725 минути (30 000 – 24 275 = 5 725) или 95 часа и 25 минути.

        //Вход
        //Входът се чете от конзолата и се състои от едно число – броят почивни дни – цяло число в интервала [0...365]

        //Изход
        //На конзолата трябва да се отпечатат два реда.
        //Ако времето за игра на Том е над нормата за текущата година:
        // На първия ред отпечатайте: “Tom will run away”
        // На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes more for play”
        //Ако времето за игра на Том е под нормата за текущата година:
        //На първия ред отпечатайте: “Tom sleeps well”
        // На втория ред отпечатайте разликата от нормата във формат:
        //“{H} hours and {M} minutes less for play”

        Scanner scanner = new Scanner(System.in);

        int restdays = Integer.parseInt(scanner.nextLine());
        double tomnormal = 30000;
        double workdays = 365 - restdays;

        double playtime = workdays * 63 + restdays * 127;

        if (tomnormal <= playtime) {
            double left = playtime - tomnormal;
            double hours = (int) left / 60;
            double minutes = left % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",hours,minutes);
        } else {
            double left = tomnormal - playtime ;
            double hours = (int) left / 60;
            double minutes = left % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);

        }
    }
}