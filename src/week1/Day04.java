package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

	//**����**
	//���� �ܹ��Ŵ� �پ��� ��Ḧ ����Ͽ� ���� ���ֱ�� �����ϴ�. ���� �ܹ��Ŵ� N���� ��Ḧ ������� �׾Ƽ� �����,
	//���� �ܹ����� ���� ���� ���� ������ ���� ���̴�.
	//�Ϻ��� ���� �ܹ��Ÿ� ����� ���ؼ��� ���� ������ ���� ���� ��Ḧ �������� ���� �Ʒ��� ������ ����� ���� ������ �����ϰų� ���ƾ� �Ѵ�.
	//�÷��̾�� N���� ��Ḧ ������� �׾Ƽ� ���� �ܹ��Ÿ� �ϳ� �������. i��°�� ���� ����� ���� ������ ki��� �Ҷ�,
	//�÷��̾ ���� ���� �ܹ����� ���� ���غ���. ���� �÷��̾ �Ϻ����� ���� ���� �ܹ��Ÿ� ������ٸ� 0�� ����Ѵ�.
	//**�Է�**
	//ù°�ٿ� ���� �ܹ��ſ� ���� ����� �� N���� �־�����.
	//�״��� �ٿ� �÷��̾ �ܹ��Ÿ� ���� �� �� ����� ���� ������ ������ �ΰ� �־�����.

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
