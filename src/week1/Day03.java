package week1;

import java.util.Scanner;
	
	//	**문제**
	//  보통의 계산기는 한 번에 하나의 계산 결과만 나타낼 수 있다. 그래서 여러 개의 계산 결과가 필요한 경우에는 이전 계산 결과를 따로 기록해 둬야 하는 번거로움이 있었다.
	//  플레이어는 이러한 점을 해결하기 위해서 합 계산기를 만들었다. 합 계산기는 여러 개의 계산식을 입력받은 뒤, 각각의 계산 결과를 모두 합해서 출력하는 기능을 가지고 있다.
	//  합 계산기에 입력할 수 있는 계산식은 아래 조건을 만족해야 한다.
	//  계산식은 <정수> <연산 기호> <정수> 형태이다.
	//  <연산 기호> 에는 더하기, 빼기, 곱하기, 나누기의 네 가지 사칙 연산 기호가 들어갈 수 있다. 이때, 나눗셈 결과의 나머지는 버린다.
	//  합 계산기에 입력할 T개의 계산식이 주어질 때, 합 계산기의 출력 결과를 구해보자.
	//	**입력**
	//  첫째 줄에 식의 개수 T가 주어진다.
	//  다음 T개의 줄에는 계산식이 주어진다.
	//  1≤T≤100
	//  계산식은 <정수><연산 기호><정수>형태로 주어진다.
	//  정수에는 1 이상 1000 이하의 정수가 주어진다.
	//  연산 기호에는 +,-,*,/중 하나의 문자가 주어진다. 각각 더하기, 빼기, 곱하기, 나누기 기호를 의미한다.


public class Day03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 T 입력
		int T = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		//T의 숫자만큼 for문 실행
		for (int i = 0; i < T; i++) {
			String formula = sc.nextLine();
			String[] formulaArray = formula.split(" ");
			int num1 = Integer.parseInt(formulaArray[0]);
			int num2 = Integer.parseInt(formulaArray[2]);
			// 케이스에 따라 계산식 나누기
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
		// 총 더한 값 출력
		System.out.println(sum);
	}
}
