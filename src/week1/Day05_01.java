package week1;

import java.util.Scanner;

	//**����**
	//N���� 10���� ������ �־�����. �÷��̾�� ������ �׳� �����ϴ� ���� �ʹ� ���� ������, �Ʒ� ���ؿ� ���� ������ �����ϱ�� �Ѵ�.
	//	1. 10���� ������ 2������ ��Ÿ���� ��, 2������ ���Ե� 1�� ������ �������� �������� �����Ѵ�.
	//	2. 1�� ������ ���ٸ�, ���� 10������ �������� �������� �����Ѵ�.
	//�÷��̾ ������ �� �������� ��, �տ��� K��°�� ��ġ�� ���� � ���� ���� ���غ���.
	//**�Է�**
	//ù° �ٿ� �־����� ������ �� N�� �÷��̾ ã������ ������ ��ġ K�� ������ �ΰ� �־�����.
	//��° �ٿ� ���� a1, a2,...,an�� ������ �ΰ� �־�����
	// - 1��N��500000
	// - 1��K��N
	// - 1��ai<2�� 20����

public class Day05_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		// N���� ������ŭ for���� ���� �迭�� ���� �Է�
		int[] numsArray = new int[N];
		for (int i = 0; i < N; i++) {
			numsArray[i] = sc.nextInt();
		}
		// N���� ������ŭ for���� ���� �迭�� 2������ ��µǴ� 1�� ���� �Է�
		int[] nBitCount = new int[N];
		for (int i = 0; i < N; i++) {
			nBitCount[i] = Integer.bitCount(numsArray[i]);
		}

		// bubblesort ������ ���� �������� ����
		for (int i = 0; i < nBitCount.length; i++) {
			for (int j = i + 1; j < nBitCount.length; j++) {

				// bit�� ���� ���� �� ���ڳ��� ��Һ� �� ����
				if (nBitCount[i] == nBitCount[j]) {
					if (numsArray[i] < numsArray[j]) {
						int temp = nBitCount[j];
						nBitCount[j] = nBitCount[i];
						nBitCount[i] = temp;

						temp = numsArray[j];
						numsArray[j] = numsArray[i];
						numsArray[i] = temp;
					}
					// �� ���� ���� bit������ ��Һ� �� ����
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
		// ���� �˰���� K��°�� �� ���
		System.out.println(numsArray[K - 1]);
	}
}
