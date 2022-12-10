import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 文字列の入力
        int a = sc.nextInt();
        int b = sc.nextInt();

        solve(a);
        solve(b);

        System.out.println(calc());
    }

    static public ArrayList<Integer> result = new ArrayList<Integer>();

    static public ArrayList<Integer> solve(int sum) {

        if (sum == 1) {
            collect(1);
        }
        if (sum == 2) {
            collect(2);
        }
        if (sum == 3) {
            collect(1);
            collect(2);
        }
        if (sum == 4) {
            collect(4);
        }

        if (sum == 5) {
            collect(1);
            collect(4);
        }

        if (sum == 6) {
            collect(2);
            collect(4);
        }
        if (sum == 7) {
            collect(1);
            collect(2);
            collect(4);
        }

        return result;
    }

    static public void collect(int i) {
        if (!result.contains(i)) {
            result.add(i);
        }
    }

    static public int calc() {
        int resultValue = 0;
        for (int element : result) {
            resultValue += element;
        }
        return resultValue;
    }
}
