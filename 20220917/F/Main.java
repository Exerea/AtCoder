
public class Main {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // // 文字列の入力
    // String str = sc.next();

    // // 条件１：1pin
    // char OnePin = str.charAt(0);
    // if (OnePin != 0) {
    // System.out.println("No");
    // } else {
    // Boolean alivePinLeft = false;
    // Boolean alivePinRight = false;
    // int[] remakeNarabi = {7,4,8,2,5,1,9,3,6,10};

    // if(remakeNarabi[1] == 0 && remakeNarabi[2] == 0){
    // for(int i = 0 ; i < 1 ; ++i){
    // if(remakeNarabi[i] == 1){
    // alivePinLeft = true;
    // }
    // }

    // for(int i = 3 ; i < 10 ; ++i){
    // if(remakeNarabi[i] == 1){
    // alivePinLeft = true;
    // }
    // }
    // }

    // // 条件２：行間0pin
    // ArrayList<Integer> left = new ArrayList<>();
    // ArrayList<Integer> right = new ArrayList<>();
    // ArrayList<Integer> here = new ArrayList<>();

    // for (int i = 0; i < str.length(); ++i) {
    // char targetpin = str.charAt(i);

    // int pinNumber = i +1 ;
    // if (targetpin == 0) {

    // // 左側入れる
    // if (pinNumber == 4) {
    // left.add(7);
    // } else if (pinNumber == 8 || pinNumber == 2) {
    // left.add(7);
    // left.add(4);
    // here.add(8);
    // here.add(2);
    // } else if (i == 4) {
    // left.add(8);
    // left.add(2);
    // left.add76);
    // left.add(4);
    // } else if (i == 8 || i == 2) {
    // left.add(4);
    // left.add(1);
    // left.add(6);
    // left.add(3);
    // left.add(7);
    // here.add(8);
    // here.add(2);
    // } else if (i == 5) {
    // left.add(8);
    // left.add(2);
    // left.add(4);
    // left.add(1);
    // left.add(6);
    // left.add(3);
    // left.add(7);
    // }

    // // 右側入れる
    // for (int loop = 0; loop < str.length(); ++loop) {
    // if (!left.contains(loop + 1) && loop != 0 && !here.contains(loop + 1)) {
    // right.add(loop);
    // }
    // }

    // // 左側生存確認
    // alivePinLeft = false;
    // for (Integer integer : left) {
    // if (integer == 1) {
    // alivePinLeft = true;
    // break;
    // }
    // }

    // // 右側生存確認
    // alivePinRight = false;
    // for (Integer integer : right) {
    // if (integer == 1) {
    // alivePinRight = true;
    // break;
    // }
    // }

    // }

    // }

    // // 判定
    // if (alivePinLeft && alivePinRight) {
    // System.out.println("Yes");

    // } else {
    // System.out.println("No");
    // }
    // sc.close();
    // }
    // }

}
