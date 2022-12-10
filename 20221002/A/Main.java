import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();
        Long m = sc.nextLong();

        sc.close();
        ArrayList<Long> collectiLongs = createCollectiLongs(n);

        // 出力
        Long max = maxBaisu(collectiLongs, m);
        if (max == 0L) {
            System.out.println("-1");
        } else {

            System.out.println(max);
        }
    }

    public static ArrayList<Long> createCollectiLongs(Long nLong) {

        ArrayList<Long> collections = new ArrayList<>();

        ArrayList<biginte> oneGirls = new ArrayList<>();

        Long oneBoys = 0L;
        for (int ketaJ = 0; ketaJ < nLong; ketaJ++) {
            Double val = (Math.pow(10, ketaJ));
            oneBoys = oneBoys + val.longValue();

            oneGirls.add(oneBoys);
        }

        for (Long girlI : oneGirls) {
            Long zoromeBoys = 0L;
            for (int nineLoop = 1; nineLoop <= 9; nineLoop++) {
                zoromeBoys = girlI * Long.valueOf(nineLoop);
                collections.add(zoromeBoys);
            }
        }

        // StringBuilder oneBoys_str = new StringBuilder();

        // oneBoys_str.append("1");
        // String one = new String();

        // for (int ketaI = 0; ketaI < nLong; ketaI++) {
        // oneBoys_str.append("1");

        // one = oneBoys_str.toString();
        // Long oneBoys = Long.valueOf(one);
        // if (oneBoys == 1111111111111111111L) {
        // System.out.println("hi");
        // }
        // Long zoromeBoys = 0L;
        // for (int nineLoop = 1; nineLoop <= 9; nineLoop++) {
        // zoromeBoys = oneBoys * Long.valueOf(nineLoop);
        // collections.add(zoromeBoys);
        // }
        // }

        return collections;
    }

    public static Long maxBaisu(ArrayList<Long> collectiLongs, Long mLong) {

        Long maxBaisuLong = 0L;
        for (Long num : collectiLongs) {

            if ((num % mLong) == 0) {
                if (maxBaisuLong < num) {
                    maxBaisuLong = num;
                }

            }

        }

        return maxBaisuLong;

    }
}
