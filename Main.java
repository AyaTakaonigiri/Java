//クラス名は必ずMainにする必要があります。
import java.util.*;
import java.util.Arrays; 

public class Main {

    private static long gcf(long aaa, long bbb) {
		// ユークリッド互除法にて最大公倍数を算出
		while(aaa!=bbb) {
			if(aaa>bbb) {
				aaa -= bbb;
			}else {
				bbb -= aaa;
			}

		}
		
		return aaa;

	}

    private static long lcm(long aa, long bb) {
		return aa * bb / gcf(aa, bb);
	}

    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        long a[] = new long[nums];
        for (int i = 0; i < nums; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(a);

        int index = nums - 1;



        long d = lcm(a[index], a[index-1]);
        for (int i = 2; i <= index; i++) {
            d = lcm(d, a[index-i]);
        } 
        
        
        System.out.println(d);
    }
}
