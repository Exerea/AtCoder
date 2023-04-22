import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nInteger = scanner.nextInt();
        for (int i = 0; i < nInteger; i++) {
            Integer num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // スキャナーを閉じる
        scanner.close();
    }

}
