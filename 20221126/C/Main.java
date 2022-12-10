import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h_line = sc.nextInt();
        int w_column = sc.nextInt();
        ArrayList<String> words_s = words(sc, h_line, w_column);
        ArrayList<String> words_t = words(sc, h_line, w_column);

        System.out.println(solve(words_s, words_t));
        sc.close();

    }

    static ArrayList<String> words(Scanner sc, int h_line, int w_column) {
        // 文字列の入力

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < h_line; i++) {
            String line = sc.next();
            list.add(line);
        }

        ArrayList<String> crossLine = new ArrayList<>();

        for (int i = 0; i < w_column; ++i) {

            String columnStr = new String();
            for (String line : list) {
                columnStr = columnStr + String.valueOf(line.charAt(i));
            }
            crossLine.add(columnStr);
        }
        return crossLine;
    }

    static String solve(ArrayList<String> words_s, ArrayList<String> words_t_mo) {
        for (String str : words_t_mo) {

            Boolean remove = false;
            for (String line : words_s) {
                if (line.equals(str)) {
                    words_s.remove(str);
                    remove = true;
                    break;
                }
            }
            if (!remove && words_s.size() != 0) {
                return "No";
            }
        }
        return "Yes";
    }
}
