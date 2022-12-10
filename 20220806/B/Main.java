import java.util.*;

public class Main {
    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		// int b = sc.nextInt();

            
    		// 文字列の入力
            ArrayList<Integer> list = new ArrayList<>();
            while(sc.hasNextInt()){
                list.add(Integer.valueOf(sc.nextInt()));
            }

            int size = list.size();
            // if(list.get(size) != 1){
            //     System.out.println((list.size())+1);
            // }else{

            System.out.println(size);
//        }
        }  
}
