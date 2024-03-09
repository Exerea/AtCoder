import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int l = scanner.nextInt();
        int[] C = new int[l];
        for (int i = 0; i < l; i++) {
            C[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (isPossibleSum(A, B, C, x))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        // スキャナーを閉じる
        scanner.close();
    }

    public static boolean isPossibleSum(int[] A, int[] B, int[] C, int x) {

        for (int a : A) {
            if (x < a) {
                continue;
            }

            for (int b : B) {
                if (x < b || x < a + b) {
                    continue;
                }
                if (binarySearch(C, x - (a + b))) {

                    return true;
                }
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
