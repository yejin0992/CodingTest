package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 구름톤 해설 Pair, Comparable, collection.sort() 사용

class Pair implements Comparable<Pair> {
    int bits;
    int num;
    
    public Pair(int bits, int num) {
        this.bits = bits;
        this.num = num;
    }

    public int compareTo(Pair o) {
        if (this.bits == o.bits) {
            return o.num - this.num;
        } else {
            return o.bits - this.bits;
        }
    }
}

public class Day05_02 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        ArrayList<Pair> pairs = new ArrayList<>();

	        for(int i = 0; i < N; ++i) {
	            int num = sc.nextInt();
	            int bits = Integer.bitCount(num);
	            pairs.add(new Pair(bits, num));
	        }

	        Collections.sort(pairs);

	        System.out.println(pairs.get(K-1).num);
	}
}
