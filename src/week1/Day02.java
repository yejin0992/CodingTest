package week1;

import java.util.ArrayList;
import java.util.Scanner;

	//	**����**
	//	�÷��̾�� ���� ������Ʈ�� ������ �����ϴ� PM(������Ʈ �Ŵ���)���� ������ �����ڴ�.
	//	���� ���� ������Ʈ�� �ϼ��ϱ� ���ؼ��� ���� ��� ������ �߰��� �ʿ��ϴ�.
	//	�� ��ɿ��� 1������ N������ ��ȣ�� �پ� �ְ�,
	//	i��° ����� �����ϴ� ���� ���� �ð��� �ɸ���.
	//	�÷��̾�� ������Ʈ�� ���� �ȿ� ������ ���� ö�� �۾��� ����.
	//	�÷��̾ ö�� �۾��� ������ �ð��� T�� M���̴�.
	//	�÷��̾�� �� ��ɺ��� ������� ������ �����ϰ�,
	//	�� ��� ������ ����ġ�� �ٷ� ���� ����� ������ �����Ѵ�.
	//	�÷��̾ ��� ��� ������ ����ģ �ð��� ���غ���.
	//	**�Է�**
	//	ù°�ٿ� ����� ���� N
	//	��°�ٿ� �ð� T M (�������� ����)
	//	���� N��° �ٿ� i��° ��� �����ϴ� �ð� C
	//	��� : 23�� 59�п��� 1���� ���� �ð��� 0�� 0��

public class Day02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����� ���� N
		int N = Integer.parseInt(sc.nextLine());

		// ����ð� T�� M��
		String time = sc.nextLine();
		String[] splitTimeArray = time.split(" ");
		int T = Integer.parseInt(splitTimeArray[0]);
		int M = Integer.parseInt(splitTimeArray[1]);
		// �Է� Ȯ��
		// System.out.println(T+"�� "+M+"�� ");

		ArrayList<Integer> c = new ArrayList<>();
		int timeSum = 0;

		// N����ŭ �ɸ��� �ð� c �迭�� �Է�, �ð� �� ���� ���ϱ�
		for (int i = 0; i < N; i++) {
			c.add(sc.nextInt());
			timeSum += c.get(i);
			// System.out.println("�ð� �� : "+ timeSum);
		}

		int totalMinute = M + timeSum;

		int plusT = totalMinute / 60;
		int resultM = totalMinute % 60;
		int resultT = (T + plusT) % 24;

		System.out.print(resultT + " " + resultM);

	}

}
