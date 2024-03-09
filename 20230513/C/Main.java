import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] s1 = new int[26];
        int[] s2 = new int[26];

        String alphabet = scanner.nextLine().toUpperCase()

        String str = scanner.next().toUpperCase(); // 標準入力から文字列を受け取る
        String str2 = scanner.next().toUpperCase(); // 標準入力から文字列を受け取る

        int count1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '@') { // 文字列の各文字をチェック
                char ch = str.charAt(i);
                int position = ch - 'A';
                s1[position]++;
            }else{
                count1 ++;
            }
        }
        int count2 = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str.charAt(i) != '@') { // 文字列の各文字をチェック
                char ch = str.charAt(i);
                int position = ch - 'A';
                s2[position]++;
            }else{
                count2 ++;
            }
        }


        boolean tf= false;
        int[] indices = {1, 20, 3, 15, 4, 5, 18};
        for(int i = 0 ; i<26;i++){
            if(s1[i] == s2[i]){
                continue;
            }

            if(Arrays.asList(indices).contains(i)){
                if(s1[i]  < s2[i]&&count1 > 0){
                    count1 -- ;
                    s1[i] ++ ;
                }
                else if(s2[i]  < s1[i]&&count2 > 0){
                    count2 -- ;
                    s2[i] ++ ;
                }
                else{
                    break;
                }
            }else{
                break;
            }
        }


        System.out.println(tf);
        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static int solve(List<String> strList, int N_number) {
        int ans = 0;
        return ans;
    }
}
