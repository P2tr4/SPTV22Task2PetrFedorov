import java.util.Scanner;

public class SPTV22Task2PetrFedorov{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехначное число:");
        int num = scanner.nextInt();
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = num / 100;
        System.out.println(ones+tens+hundreds);
    }
}
