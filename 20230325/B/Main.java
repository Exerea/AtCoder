import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N：個数 を入力
        int R_number = scanner.nextInt();
        int C_number = scanner.nextInt();
        int[][] area = new int[R_number][C_number];

        ArrayList<String>str =  new ArrayList<>();
        for(int i = 0 ; i < R_number; i++){
            str.add(scanner.next());
        }

        // スキャナーを閉じる
        scanner.close();
    }

    // 解答を求めるメソッド
    public static ArrayList<String> solve(String[] list,int R_number, int C_number) {




        int[][] area = new int[R_number][C_number];
        
        for(int i = 0 ; i< R_number; i++){
            for(int j = 0 ; j < C_number ; j++){
                area[i][j] = 0;
            }
        }

        

        return null;
    }
}
