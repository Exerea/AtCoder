import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int N_number = scanner.nextInt();

        // Sを入力
        List<String[]> strList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String a = scanner.next();
            String b = scanner.next();
            String[] ab = { a, b };
            strList.add(ab);
        }

        // 答えを出力
        String ans = solve(strList);
        System.out.println(ans);

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String[]> strList) {
        
       strList =  strList.sort();

   List<String[]> a = new ArrayList<>();
String to =  new String() ;


        for(String[]str : strList){

            if(){
              str[0];
            }
        }


        int ans = 0;
        return ans;
    }
}
