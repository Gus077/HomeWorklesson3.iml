import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static Random rand = new Random();


    public static void main(String[] args) {
        guessNumber();

        guessFruit();
    }

    public static void guessNumber(){

        Scanner sc = new Scanner(System.in);
        do {
            int number = rand.nextInt(10);
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введите число");
                int inputNumber = readIntNumberFromConsole();
                if (inputNumber == number) {
                    System.out.println("Поздравляю! Вы угадали!!!");
                    break;
                } else if (inputNumber < number) {
                    System.out.println("Загаданное число больше");
                } else if (inputNumber > number) {
                    System.out.println("Загаданное число меньше");
                }
                if (i - 1 > 0) {
                    System.out.println(" у вас осталось " + (i - 1) + " попыток");
                } else System.out.println("Попытки закончились");
            }
            System.out.println("Повторить игру еще раз? 1 - да; 0 - нет");
        } while (sc.nextInt() == 1);
    }

    static int readIntNumberFromConsole() {
        Scanner sc = new Scanner(System.in);

        do {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Введите ЦЕЛОЕ ЧИСЛО!");
        } while (true);
    }

    public static void guessFruit (){
        String [] fruits = {"apple", "orange","lemon","banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "peper", "pineapple", "pumpkin", "potato"};


        int wordIndex = rand.nextInt(fruits.length -1);
        String word = fruits[wordIndex];
        int rangeWord = word.length();
        System.out.println("Я загадал слово, попробуй отгадать его!");
//        System.out.println(word);

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Введите ответ:");
            String answer = sc.nextLine();
            if (answer.equals(word)){
                System.out.println("Поздравляю, вы угадали!!");
                break;
            }
            char[] coment = new char [15];
            for (int i = 0; i < coment.length; i++) {
                coment[i] = '#';
            }
            char [] charsAnswer = answer.toCharArray();
            for (int i = 0; i < rangeWord; i++){
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) == charsAnswer[i]) coment[i] = word.charAt(i);
            }
            System.out.println(coment);
        }while (true);
    }
}
