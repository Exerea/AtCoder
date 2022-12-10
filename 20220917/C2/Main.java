import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        List<Integer> oneDigits = OneDigits(n);

        List<Integer> results = Check(n, oneDigits);

        // 結果出力
        System.out.println("0");
        for (int result : results) {
            System.out.println(result);
        }

    }

    // "1"を持つ桁数をリスト化
    static List<Integer> OneDigits(int n) {
        List<Integer> resultList = new ArrayList<>();
        String binN = Integer.toBinaryString(n);
        binN = String.format("%60s", binN).replace(" ", "0");
        for (int str_i = 0; str_i < binN.length(); str_i++) {
            String word = String.valueOf(binN.charAt(str_i));

            if (word.equals("1")) {
                resultList.add(str_i);
            }
        }

        return resultList;
    }

    // チェック
    static List<Integer> Check(int n, List<Integer> OneDigits) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            String binI = Integer.toBinaryString(i);
            binI = String.format("%60s", binI).replace(" ", "0");
            for (int str_i = 0; str_i < binI.length(); str_i++) {

                String word = String.valueOf(binI.charAt(str_i));

                if (word.equals("1")) {

                    if (OneDigits.contains(str_i)) {
                        resultList.add(i);
                    }

                }
            }
        }
        return resultList;
    }

}
