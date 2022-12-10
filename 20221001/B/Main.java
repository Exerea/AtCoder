import java.util.*;

public class Main {
    public static void main(String[] args) {

        int suretu = sc.nextInt();
        int query = sc.nextInt();

        ArrayList<ArrayList<Integer>> allLine = new ArrayList<>();
        for (int makeI = 0; makeI < suretu; makeI++) {
            allLine.add(createOneLine());
        }

        ArrayList<ArrayList<Integer>> queryAllLine = new ArrayList<>();
        for (int makeI = 0; makeI < query; makeI++) {
            queryAllLine.add(createQueryOneLine());
        }

        for (int queryI = 0; queryI < queryAllLine.size(); queryI++) {
            int QueryX = queryAllLine.get(queryI)
                    .get(0);
            int QueryY = queryAllLine.get(queryI)
                    .get(1);

            ArrayList<Integer> line = allLine.get(QueryX - 1);

            Integer val = line.get(QueryY - 1);

            System.out.println(val);
        }
        sc.close();
    }

    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<Integer> createOneLine() {
        ArrayList<Integer> oneLine = new ArrayList<>();
        int have = sc.nextInt();
        for (int haveI = 0; haveI < have; haveI++) {
            oneLine.add(sc.nextInt());
        }
        return oneLine;
    }

    public static ArrayList<Integer> createQueryOneLine() {
        ArrayList<Integer> oneLine = new ArrayList<>();
        int have = 2;
        for (int haveI = 0; haveI < have; haveI++) {
            oneLine.add(sc.nextInt());
        }
        return oneLine;
    }

}
