package week1;

import java.util.Scanner;
	
	//	**����**
	//  ������ ����� �� ���� �ϳ��� ��� ����� ��Ÿ�� �� �ִ�. �׷��� ���� ���� ��� ����� �ʿ��� ��쿡�� ���� ��� ����� ���� ����� �־� �ϴ� ���ŷο��� �־���.
	//  �÷��̾�� �̷��� ���� �ذ��ϱ� ���ؼ� �� ���⸦ �������. �� ����� ���� ���� ������ �Է¹��� ��, ������ ��� ����� ��� ���ؼ� ����ϴ� ����� ������ �ִ�.
	//  �� ���⿡ �Է��� �� �ִ� ������ �Ʒ� ������ �����ؾ� �Ѵ�.
	//  ������ <����> <���� ��ȣ> <����> �����̴�.
	//  <���� ��ȣ> ���� ���ϱ�, ����, ���ϱ�, �������� �� ���� ��Ģ ���� ��ȣ�� �� �� �ִ�. �̶�, ������ ����� �������� ������.
	//  �� ���⿡ �Է��� T���� ������ �־��� ��, �� ������ ��� ����� ���غ���.
	//	**�Է�**
	//  ù° �ٿ� ���� ���� T�� �־�����.
	//  ���� T���� �ٿ��� ������ �־�����.
	//  1��T��100
	//  ������ <����><���� ��ȣ><����>���·� �־�����.
	//  �������� 1 �̻� 1000 ������ ������ �־�����.
	//  ���� ��ȣ���� +,-,*,/�� �ϳ��� ���ڰ� �־�����. ���� ���ϱ�, ����, ���ϱ�, ������ ��ȣ�� �ǹ��Ѵ�.


public class Day03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� T �Է�
		int T = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		//T�� ���ڸ�ŭ for�� ����
		for (int i = 0; i < T; i++) {
			String formula = sc.nextLine();
			String[] formulaArray = formula.split(" ");
			int num1 = Integer.parseInt(formulaArray[0]);
			int num2 = Integer.parseInt(formulaArray[2]);
			// ���̽��� ���� ���� ������
			if (formulaArray[1].equals("+")) {
				sum += num1 + num2;
			} else if (formulaArray[1].equals("-")) {
				sum += num1 - num2;
			} else if (formulaArray[1].equals("*")) {
				sum += num1 * num2;
			} else if (formulaArray[1].equals("/")) {
				sum += num1 / num2;
			}
		}
		// �� ���� �� ���
		System.out.println(sum);
	}
}
