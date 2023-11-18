package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	//**문제**
	//구름 햄버거는 다양한 재료를 사용하여 만들어서 맛있기로 유명하다. 구름 햄버거는 N개의 재료를 순서대로 쌓아서 만들고,
	//구름 햄버거의 맛은 사용된 맛의 정도를 더한 값이다.
	//완벽한 구름 햄버거를 만들기 위해서는 맛의 정도가 가장 높은 재료를 기준으로 위랑 아래로 갈수록 재료의 맛의 정도가 감소하거나 같아야 한다.
	//플레이어는 N개의 재료를 순서대로 쌓아서 구름 햄버거를 하나 만들었다. i번째로 쌓은 재료의 맛의 정도가 ki라고 할때,
	//플레이어가 만든 구름 햄버거의 맛을 구해보자. 만약 플레이어가 완벽하지 않은 구름 햄버거를 만들었다면 0을 출력한다.
	//**입력**
	//첫째줄에 구름 햄버거에 들어가는 재료의 수 N개가 주어진다.
	//그다음 줄에 플레이어가 햄버거를 만들 때 쓴 재료의 맛의 정도는 공백을 두고 주어진다.

public class Day04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");

		ArrayList<Integer> arrList = new ArrayList<>();
		for (String a : arr) {
			arrList.add(Integer.parseInt(a));
		}

		int maxIndex = arrList.indexOf(Collections.max(arrList));

		ArrayList<Integer> left = new ArrayList<>(arrList.subList(0, maxIndex));
		ArrayList<Integer> right = new ArrayList<>(arrList.subList(maxIndex, N));

		Collections.sort(left);
		Collections.sort(right, Collections.reverseOrder());

		ArrayList<Integer> arrSum = new ArrayList<>();
		arrSum.addAll(left);
		arrSum.addAll(right);

		if (arrSum.equals(arrList)) {
			int sum = arrSum.stream().mapToInt(Integer::intValue).sum();
			System.out.println(sum);
		} else {
			System.out.println(0);
		}

	}
}
