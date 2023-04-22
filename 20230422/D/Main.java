import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();
        String inputString = scanner.next();
        char[] charArray = inputString.toCharArray();
        for (int turn = 0; turn < 20; turn++) {

            String query = scanner.next();
            int value = scanner.nextInt();
            for (int i = 0; i < N_number; i++) {

                int num = Character.getNumericValue(charArray[i]);
                if (num == value) {
                    System.out.println(i);
                }
                if (query.equals("!")) {
                    return;
                }
            }

        }

        // スキャナーを閉じる
        scanner.close();
    }

}
