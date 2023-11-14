package week1;

import java.util.Scanner;

	//**문제**
	//N개의 10진수 정수가 주어진다. 플레이어에게 정수를 그냥 정렬하는 것은 너무 쉽기 때문에, 아래 기준에 따라 정수를 정렬하기로 한다.
	//	1. 10진수 정수를 2진수로 나타냈을 때, 2진수에 포함된 1의 개수를 기준으로 내림차순 정렬한다.
	//	2. 1의 개수가 같다면, 원래 10진수를 기준으로 내림차순 정렬한다.
	//플레이어가 정수를 잘 정렬했을 떄, 앞에서 K번째에 위치한 수는 어떤 수가 될지 구해보자.
	//**입력**
	//첫째 줄에 주어지는 정수의 수 N과 플레이어가 찾으려는 정수의 위치 K가 공백을 두고 주어진다.
	//둘째 줄에 정수 a1, a2,...,an이 공백을 두고 주어진다
	// - 1≤N≤500000
	// - 1≤K≤N
	// - 1≤ai<2의 20제곱

public class Day05_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		// N개의 개수만큼 for문을 통해 배열에 숫자 입력
		int[] numsArray = new int[N];
		for (int i = 0; i < N; i++) {
			numsArray[i] = sc.nextInt();
		}
		// N개의 개수만큼 for문을 통해 배열에 2진수로 출력되는 1의 개수 입력
		int[] nBitCount = new int[N];
		for (int i = 0; i < N; i++) {
			nBitCount[i] = Integer.bitCount(numsArray[i]);
		}

		// bubblesort 정렬을 통해 내림차순 정렬
		for (int i = 0; i < nBitCount.length; i++) {
			for (int j = i + 1; j < nBitCount.length; j++) {

				// bit의 값이 같을 때 숫자끼리 대소비교 후 정렬
				if (nBitCount[i] == nBitCount[j]) {
					if (numsArray[i] < numsArray[j]) {
						int temp = nBitCount[j];
						nBitCount[j] = nBitCount[i];
						nBitCount[i] = temp;

						temp = numsArray[j];
						numsArray[j] = numsArray[i];
						numsArray[i] = temp;
					}
					// 그 외의 값은 bit개수로 대소비교 후 정렬
				} else if (nBitCount[j - 1] < nBitCount[j]) {
					int temp = nBitCount[j];
					nBitCount[j] = nBitCount[j - 1];
					nBitCount[j - 1] = temp;

					temp = numsArray[j];
					numsArray[j] = numsArray[j - 1];
					numsArray[j - 1] = temp;
				}
			}
		}
		// 내가 알고싶은 K번째의 값 출력
		System.out.println(numsArray[K - 1]);
	}
}
