import java.util.*;

public class Main {
    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		// 整数の入力
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
            int d = sc.nextInt();
    		int e = sc.nextInt();

    		// 文字列の入力
            int[] list =  {a,b,c,d,e};
            Boolean tf = false;
for(int i : list){
    int count = 0;
    for(int j : list){
        if(i == j){
            count++;
        }
    }
    if(count < 2){
        System.out.println("No");
        tf = true;
        break;
    }
}

if(!tf){
System.out.println("Yes");
    }

        //     ArrayList used =new ArrayList<>();
        //     if(used.size()>2 ) {
        //         System.out.println("No");
        //     }

        //     else{
    	// 	System.out.println("Yes");
        //     }
        // }
}
}
