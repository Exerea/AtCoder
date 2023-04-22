import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> sameValue = new ArrayList<>();

        int count = 0;

        ArrayList<ArrayList<Integer>> in = new ArrayList<>();
        for (int i = 0; i < M; i++) {

            Integer a = sc.nextInt();
            Integer b = sc.nextInt();

            ArrayList<Integer> integers = new ArrayList<>();
            integers.addAll(Arrays.asList(a, b));
            Collections.sort(integers);
            in.add(integers);
        }

        for (ArrayList<Integer> li : in) {
            Integer a = li.get(0);
            Integer b = li.get(1);

            ArrayList<Integer> integers = new ArrayList<>();
            integers.addAll(Arrays.asList(a, b));
            Collections.sort(integers);

            Boolean have = false;
            for (ArrayList<Integer> list : lists) {
                Boolean haveA = list.contains(a);
                Boolean haveB = list.contains(b);

                if (haveA || haveB) {
                    have = true;
                }

                if (haveA && !haveB) {
                    list.add(b);
                    break;
                }

                if (haveB && !haveA) {
                    list.add(a);
                    break;
                }

            }

            if (!have) {
                ArrayList<Integer> neoList = new ArrayList<>();
                neoList.addAll(Arrays.asList(a, b));
                lists.add(neoList);
            }

        }

        for (

        ArrayList<Integer> list : lists) {
            String ans = lists.size() == count ? "Yes" : "No";
            System.out.println(ans);
        }

        sc.close();
    }
}
