import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        int haveSize_N = sc.nextInt();

        for (int i = 0; i < haveSize_N; i++) {
            haveList.add(sc.nextInt());
        }

        createIraneList();
        solve();

        System.out.println("hi");

    }

    public static ArrayList<Integer> haveList = new ArrayList<>();
    public static ArrayList<Integer> uniqueList = new ArrayList<>();
    public static ArrayList<Integer> iraneList = new ArrayList<>();
    public static int nowReading = 1;

    public static void createIraneList() {
        // 重複を捨てる
        for (int no : haveList) {
            if (!uniqueList.contains(no)) {
                uniqueList.add(no);
            } else {
                iraneList.add(no);
            }
        }

        // 連番以降を捨てる

        for (int i = 0; i < uniqueList.size(); i++) {
            if (uniqueList.get(i) != (i + 1)) {
                iraneList.add(uniqueList.get(i));
                uniqueList.remove(uniqueList.get(i));

            }
        }

    }

    public static void solve() {
        if (iraneList.size() > 2) {
            nowReading++;
            uniqueList.add(nowReading);
        }
    }
}
