package week1;

import java.util.ArrayList;
import java.util.Scanner;

	//	**문제**
	//	플레이어는 구름 프로젝트의 일정을 관리하는 PM(프로젝트 매니저)이자 유일한 개발자다.
	//	현재 구름 프로젝트를 완수하기 위해서는 개의 기능 개발이 추가로 필요하다.
	//	각 기능에는 1번부터 N번까지 번호가 붙어 있고,
	//	i번째 기능을 개발하는 데는 분의 시간이 걸린다.
	//	플레이어는 프로젝트를 기한 안에 끝내기 위해 철야 작업에 들어갔다.
	//	플레이어가 철야 작업을 시작한 시각은 T시 M분이다.
	//	플레이어는 번 기능부터 순서대로 개발을 진행하고,
	//	한 기능 개발을 끝마치면 바로 다음 기능의 개발을 시작한다.
	//	플레이어가 모든 기능 개발을 끝마친 시각을 구해보자.
	//	**입력**
	//	첫째줄에 기능의 개수 N
	//	둘째줄에 시간 T M (공백으로 구분)
	//	다음 N번째 줄에 i번째 기능 개발하는 시간 C
	//	출력 : 23시 59분에서 1분이 지난 시각은 0시 0분

public class Day02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 기능의 개수 N
		int N = Integer.parseInt(sc.nextLine());

		// 현재시각 T시 M분
		String time = sc.nextLine();
		String[] splitTimeArray = time.split(" ");
		int T = Integer.parseInt(splitTimeArray[0]);
		int M = Integer.parseInt(splitTimeArray[1]);
		// 입력 확인
		// System.out.println(T+"시 "+M+"분 ");

		ArrayList<Integer> c = new ArrayList<>();
		int timeSum = 0;

		// N번만큼 걸리는 시간 c 배열에 입력, 시간 합 같이 구하기
		for (int i = 0; i < N; i++) {
			c.add(sc.nextInt());
			timeSum += c.get(i);
			// System.out.println("시간 합 : "+ timeSum);
		}

		int totalMinute = M + timeSum;

		int plusT = totalMinute / 60;
		int resultM = totalMinute % 60;
		int resultT = (T + plusT) % 24;

		System.out.print(resultT + " " + resultM);

	}

}
