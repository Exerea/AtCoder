// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // 文字列の入力
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         String result = "white";

//         if ((a == 1) || (b == 1)) {
//             result = "black";
//         }

//         for (int i = 3; i < 15; i += 2) {
//             if ((a == i && (b >= i && b <= 16 - i)) || (b == i && (a >= i && a <= 16 - i))) {
//                 result = "black";
//             }
//         }

//         for(int i = 4 ; i <13 ; i +=2){

//             if ((a == i ) && (b == 3 || b == 13)) 
//             || ((b == 4 || b == 12) && (a == 3 || a == 13))) {
//         result = "black";
//     }

//         }


//         if (((a == 4 || a == 12) && (b == 3 || b == 13)) 
//                 || ((b == 4 || b == 12) && (a == 3 || a == 13))) {
//             result = "black";
//         }
//         if (((a == 6 || a == 10) && (b == 3 || b == 5 || b == 13 || b == 11))
//                 || ((b == 6 || b == 10) && (a == 3 || a == 5 || a == 13 || a == 11))) {
//             result = "black";
//         }

//         if ((a == 8 && (b == 3 || b == 5 || b == 7 || b == 13 || b == 11 || b == 9))
//                 || (b == 8 && (a == 3 || a == 5 || a == 7 || a == 13 || a == 11 || a == 9))) {
//             result = "black";
//         }

//         if ((a == 15) || (b == 15)) {
//             result = "black";
//         }

//         System.out.println(result);

//     }
// }
