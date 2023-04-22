import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean contain = false;
        String[] strs = { "and", "not", "that", "the", "you" };
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (Arrays.asList(strs).contains(scanner.next())) {
                contain = true;
                break;
            }
        }
        String str = contain ? "Yes" : "No";
        System.out.println(str);
        scanner.close();

    }
}
