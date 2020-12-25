import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import javax.swing.text.DefaultEditorKit.BeepAction;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.Iterator;




public class main {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException  {
		
		
		
		// [1000번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("A 와 B의 값을 순서대로 입력해 주세요!");
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		System.out.println("입력하신 두수의 합은"+ (A + B));
		
		
		
///////////////////////////////////////////////////////////////////////////////////////
		
		// [1001번] 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("A 와 B의 값을 순서대로 입력해 주세요!");
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		System.out.println("입력하신 두수의 차는"+ (A - B));
		

///////////////////////////////////////////////////////////////////////////////////////	
		
		
		// [1002번] 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 
		
//		다음은 조규현과 백승환의 사진이다. (대충 스타크래프트 터렛사진)
//		이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 
//		조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
//
//		조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 
//		조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 
//		류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
		
		
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 이루어져 있다.
//
//		한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 
//		10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스를 입력해주세요!");
//		int T = scan.nextInt();
//		int x1, x2, y1, y2, r1, r2;
//		double location;
//		
//		for(int i = 0; i < T; i++) {
//			System.out.println("조규현의 자표와 계산한 거리를 입력해주세요(값3개)");
//			System.out.println("x1 좌표는?");
//			x1  = scan.nextInt();
//			System.out.println("y1 좌표는?");
//			y1  = scan.nextInt();
//			System.out.println("r1 거리는?");
//			r1  = scan.nextInt();
//			
//			System.out.println();
//			System.out.println();
//			
//			System.out.println("류재명의 자표와 계산한 거리를 입력해주세요(값3개)");
//			System.out.println("x2 좌표는?");
//			x2  = scan.nextInt();
//			System.out.println("y2 좌표는?");
//			y2  = scan.nextInt();
//			System.out.println("r1 거리는?");
//			r2  = scan.nextInt();
//			
//			
//			distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
//			
//			if(x1 == x2 && y1 == y2 && r1 == r2) {
//				System.out.println("위치가 겹치기 때문에 -1일 출력합니다.");
//			}else if(distance == r1+r2 || Math.abs(r1-r2) == distance) {
//				System.out.println("한점에서 만나기 때문에 1을 출력합니다.");
//			}else if(distance > r1 + r2 || x1 == x2 && y1 == y2 && r1!=r2 || distance <Math.abs(r1-r2)) {
//				System.out.println("서로 만나지 않기 때문에 0을 출력합니다.");
//			}else {
//				System.out.println("두점에서 만나기 때문에 2를 출력합니다.");
//				
//			}
//
//		break;}
		

///////////////////////////////////////////////////////////////////////////////////////		
		

		// [1003번] 	fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.	
		
//
//		fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
//		fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
//		두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
//		fibonacci(0)은 0을 출력하고, 0을 리턴한다.
//		fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
//		첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
//		fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
//		1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 
//		0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("3이상 40 이하의 값을 입력해주세요");
//		int t = scan.nextInt();
//		
//		int a = 1;
//		int b = 0;	
//		int c = 1;
//		
//		if(t==0) {
//			System.out.println("1");
//		}else if(t==1) {
//			System.out.println("0");
//		}else {
//			for(int i = 1; i<t; i++ ) {
//				a=b;
//				b=c;
//				c=a+b;
//			}
//		System.out.print("1의 개수는 : "+ a +" ");
//		System.out.print("0의 개수는 : "+ b);}
		
///////////////////////////////////////////////////////////////////////////////////////
		
//		[2557번]Hello World!를 출력하시오.	
		
		
//		Hello World!를 출력하시오.
		
//		System.out.println("Hello World!");
	
	
		
		
///////////////////////////////////////////////////////////////////////////////////////
		
//[10171번]Hello World!를 출력하시오.	
		
//		
//		아래 예제와 같이 고양이를 출력하시오.
//		\    /\
//		 )  ( ')
//		(  /  )
//		 \(__)|
//		
//		
//		System.out.println("\\  /\\\n" +
//							 ") ( ') \n" +
//						"(  / )\n" +
//							"\\(__)|");
		
		
///////////////////////////////////////////////////////////////////////////////////////
		
//[10998번]두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.	
//		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("A와 B를 순서대로 입력해주세요.");
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		System.out.println("A * B의 값은 : " + (A*B) + "입니다.");
//		
		
///////////////////////////////////////////////////////////////////////////////////////	
		//[10869번] 두 자연수 A와 B가 주어진다. 
//		이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//		두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

//		Scanner scan = new Scanner(System.in);
//		System.out.println("A와 B를 순서대로 입력해주세요.");
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		System.out.println("A + B = "+(A+B));
//		System.out.println("A - B = "+(A-B));
//		System.out.println("A / B = 몫 "+(A/B)+ "나머지 =" +(A%B));
//		System.out.println("A * B = "+(A*B));
	
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[10430번](A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//		(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//		세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("A , B , C를 순서대로 입력해주세요.");
//		int A = scan.nextInt();
//		int B = scan.nextInt();		
//		int C = scan.nextInt();
//		
//		
//		if(((A+B)%C) == (((A%C) + (B%C))%C)) {
//			int D = ((A+B)%C);
//			int F = (((A%C) + (B%C))%C);
//			System.out.println("(A+B)%C와 ((A%C) + (B%C))%C 는 "+ D + " 로 같은 값을 가집니다.");
//		}else {
//			System.out.println("서로 다른 값을 가집니다." );
//		}
//	
//		if(((A*B)%C) == (((A%C) * (B%C))%C)) {
//			int D = ((A*B)%C);
//			int F = (((A%C) * (B%C))%C);
//			System.out.println("((A*B)%C)와((A%C) * (B%C))%C) 는 "+ D + " 로 같은 값을 가집니다.");
//		}else {
//			System.out.println("서로 다른 값을 가집니다." );
//		}
//		
//		
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[2588번](세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.	
		//	472 (1)
		//* 385 (2)
		//2360	(3)
	//   3776	(4)
	//  1416	(5)
	//181720	(6)

//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
//		(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
	
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("세자리 자연수 2개를 입력해 주세요");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a * (b % 10));
//		System.out.println(a * ((b % 100)/10) );
//		System.out.println(a * (b / 100));
//		System.out.println(a * b);

		
///////////////////////////////////////////////////////////////////////////////////////	

//		[1330번] 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.		
		
//		첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다.
		
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("A와 B에 정수값을 입력해라");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if( a>b) {
//			System.out.println("A가 B보다 크다.");
//		}else if(b>a) {
//			System.out.println("B가 A보다 크다.");
//		}else {
//			System.out.println("A와 B는 같다.");
//		}
//		
//		
//	
//	

		
///////////////////////////////////////////////////////////////////////////////////////	

//		[9498번] 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
//		70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학생의 점수를 입력해라");
//		int a = scan.nextInt();
//		
//		if(90 <= a && a <= 100) {
//			System.out.println("A");
//			
//		}else if (80 <= a && a <= 89) {
//			System.out.println("B");
//		}else if (70 <= a && a <= 79) {
//			System.out.println("C");
//		}else if (60 <= a && a <= 69) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//	
	
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[2753번] 윤년
	
//		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
//		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
//		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("연도를 입력하세요");
//		int a = scan.nextInt();
//		
//		if(((a % 4 == 0 && a % 100 !=0) ||(a % 400 == 0 && a % 100 !=0))) {
//			System.out.println(1);		}
//			else {
//			System.out.println(0);
//		}
	
		
///////////////////////////////////////////////////////////////////////////////////////	

//   	[2753번] 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
//		사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//		예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
//		점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

//		점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
//		단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("x 좌표를 입력하세요");
//		int x = scan.nextInt();
//		System.out.println("y 좌표를 입력하세요");
//		int y = scan.nextInt();
//	
//		if(x < 0 && y > 0 ) {
//			System.out.println("2분면");
//		}else if(x > 0 && y > 0 ) {
//			System.out.println("1분면");
//		}else if(x < 0 && y < 0 ) {
//			System.out.println("3분면");
//	}else {
//		System.out.println("4분면");
//	}
//			
	

///////////////////////////////////////////////////////////////////////////////////////	

//		[2884번] 상근이는 매일 아침 알람을 듣고 일어난다. 
//		알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
//
//		방법 : 바로 "45분 일찍 알람 설정하기"이다.
//		이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
//		어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 
//		이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
//		
//		첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
//		그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
//		입력 시간은 24시간 표현을 사용한다. 
//		24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 
//		시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("시간을 입력해주세요");
//		int a = scan.nextInt();
//		System.out.println("분을 입력해주세요");
//		int b = scan.nextInt();
//
//		if((a > 0 && a<= 23) && b < 45) {
//			System.out.println(a - 1 + " 시 " + (60 + (b - 45))+" 분에 알람이 설정되었습니다.");
//		}else if((a >=0 && a<= 23) && (b > 45 && b < 60)) {
//			System.out.println(a + " 시 " + (b - 45)+" 분에 알람이 설정되었습니다.");
//		}else if((a == 0 ) && b < 45){
//			System.out.println((a + 23)  + " 시 " + (60 + (b - 45))+" 분에 알람이 설정되었습니다.");
//		}else {
//			System.out.println("다시 입력해주세요");
//		}
//	
//	
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[2739번] N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
//		출력 형식에 맞춰서 출력하면 된다.		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("원하는 구구단 단수를 입력해 주세요.");
//		int a = scan.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(a +" * " + i + " = " + a*i);
//		}
//		
		
///////////////////////////////////////////////////////////////////////////////////////	

// 		[10950번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.	
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스를 입력해주세요. 1");
//		int t = scan.nextInt();
//			
//		for(int i = 0; i < t; i++) {
//			System.out.println("두 정수 A, B를 순차적으로 입력해 주세요.");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			System.out.println(a +" 와 "+ b +" 의합은? " + (a + b));
//		}
//	
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[8393번] n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n번 까지 합을 구하기 위한 n을 입력해 주세요.");
//		int a = scan.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i <= a; i++) {
//			sum += i;
//		} System.out.println("n번까지의 합은 " + sum + " 입니다.");
	

///////////////////////////////////////////////////////////////////////////////////////	

//		[2741번] 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//		첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다
//		첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n값을 입력해주세요.");
//		int a = scan.nextInt();
//		
//		for(int i = 1; i <= a; i++){
//			System.out.println(i);
//		}
//		
//		
//	
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[2742번] 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.		
//		첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
//		첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n값을 입력해주세요.");
//		int a = scan.nextInt();
//		
//		for(int i = a; i >= 1; i--) {
//			System.out.println(i);
//		}
//		
//	

		
///////////////////////////////////////////////////////////////////////////////////////	

// 		[11021번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 
//		테스트 케이스 번호는 1부터 시작한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스를 입력해주세요.");
//		int t = scan.nextInt();
//	
//		for(int i= 1; i <= t; i++) {
//			System.out.println("정수 A B 를 입력해주세요.");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			System.out.println("Case #"+ i + " : "+(a+b));
//		}
//	
//	
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[11022번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.	
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
//		x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스를 입력해주세요.");
//		int t = scan.nextInt();
//		
//		for(int i = 1; i <= t; i++) {
//		System.out.println("정수 A B 를 입력해주세요.");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		System.out.println("Case #" + i + ": " + a + " + " + b + " = " +( a + b ));
//		}
	

///////////////////////////////////////////////////////////////////////////////////////	

//		[2438번] 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("출력하고자 하는 n을 입력해주세요.");
//		int a = scan.nextInt();
//		
//		for(int i = 0; i <= a; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}


///////////////////////////////////////////////////////////////////////////////////////	

//		[2439번] 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제		

//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("출력하고자 하는 n을 입력해주세요.");
//		int a = scan.nextInt();	
//		
//
//	       for(int i=0; i<a; i++) { 
//	    	   for(int j=i+1; j<a; j++) {
//	                System.out.print(" ");
//	            }
//               for(int k=a-i; k<=a; k++) {
//	                System.out.print("*");   
//	            }            
//	                     
//	            System.out.println();            
//	        }
		
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[10871번] 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
//		이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//		첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//		둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
//		주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//		X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
//		X보다 작은 수는 적어도 하나 존재한다.
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("a 수열의 크기를 입력해주세요.");
//		int n = scan.nextInt();
//		int [] a = new int[n];
//			
//		
//		for(int i = 0; i <= a.length - 1; i++) {
//			System.out.println("a의 들어갈 수를 입력해 주세요.");
//			a[i] = scan.nextInt();
//		}
//		
//		System.out.println("--------------------------");
//		System.out.println("비교하고자 하는 숫자를 입력해주세요.");
//		int x = scan.nextInt();
//		
//		for(int j = 0; j <=a.length -1; j++) {
//			if(a[j] < x) {
//				System.out.print(a[j] + " ");
//			}else {
//				System.out.print("");
//			}
//		}
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[10952번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		입력의 마지막에는 0 두 개가 들어온다.
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("정수 값 A B 를 차례로 입력해 주세요.");
//			System.out.println("종룔를 원하시면 0 0 을 입력해주세요.");
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			if(a == 0 && b== 0) {
//				break;
//			}
//			System.out.println(a+b);
//		}
		
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[10951번] 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		입력은 여러 개의 테스트 케이스로 이루어져 있다.
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 
//		각 줄에 A와 B가 주어진다. (0 < A, B < 10)	
		
//		Scanner scan = new Scanner(System.in);
//		
//		while(scan.hasNextInt()) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			System.out.println(a+b);
//		}

		
///////////////////////////////////////////////////////////////////////////////////////	

//		[1110번] 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
//		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
//		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
//		다음 예를 보자.

//		26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 
//		8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
//		첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("값을 입력해 주세요.");
//		int n = scan.nextInt();
//		scan.close();
//		
//		int a = n;
//		int count = 0 ;
//		
//		do {
//			a = a % 10 * 10 + (a / 10  + a % 10) % 10;
//			System.out.println(a);
//			count ++;
//		} while (n != a);
//		
//		System.out.println(count);
				
//		
//		int a = 0;
//		int b = 0;
//		int bTemp = 0;
//		int count = 0;
//		
//		a = n / 10; //2
//		b = n % 10; //6
//		
//		while(true) {
//			count++;
//			bTemp = b; //6
//			b = (a + b) % 10; //8 
//			a = bTemp;
//			
//			if(n == a*10 + b) {
//				break;
//			}
//		}System.out.println(count);
//		
//			
//	
//		int N = scan.nextInt();
//		int sum = 0;
//		int a = N / 10;
//		int b = N % 10;
//		int count = 0;
//		int temp = 0;
//		
//		while(true) {
//			sum = a + b;
//			if(sum >= 10) {
//				sum = sum % 10;
//			}
//			a = b;
//			b = sum;
//			temp = (a * 10) + b; 
//			System.out.println(temp);
//			count++;
//			if(temp == N) 
//				break;			
//		}
//		System.out.println(count);
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[10039번] 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.

//		어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 
//		기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
//		하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 
//		보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.
//		학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.
//		
//		입력은 총 5줄로 이루어져 있고, 원섭이의 점수, 세희의 점수, 상근이의 점수, 숭이의 점수, 강수의 점수가 순서대로 주어진다.
//		점수는 모두 0점 이상, 100점 이하인 5의 배수이다. 따라서, 평균 점수는 항상 정수이다. 
//		첫째 줄에 학생 5명의 평균 점수를 출력한다.		
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학생 5명의 점수를 순서대로 입력하시오.");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int f = scan.nextInt();
//		
//		if(a < 40) {
//			a = 40;
//		}else {
//			a = a;
//		}
//		
//		if(b < 40) {
//			b = 40;
//		}else {
//			b = b;
//		}
//		
//		if(c < 40) {
//			c = 40;
//		}else {
//			c = c;
//		}
//		
//		if(d < 40) {
//			d = 40;
//		}else {
//			d = d;
//		}
//		
//		if(f < 40) {
//			f = 40;
//		}else {
//			f = f;
//		}
//		int score = a + b + c + d + f;
//		int result = score/5;
//		
//		System.out.println(result);
		
		
//////////////다른 방법 //////////////////
//		int result = 0; 
//		int [] a = new int [5];
//		
//		for(int i = 0; i < 5; i++) {
//			a[i] = scan.nextInt();
//			if(a[i] < 40) {
//				a[i] = 40;
//					}
//			 result = result + a[i];	
//					} 
//		
//		int b = result/5;
//		
//		System.out.println(b);
//	


///////////////////////////////////////////////////////////////////////////////////////	

//		[5543번] 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 
//		세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.

//		햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
//		햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
//		입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 
//		셋째 줄에는 하덕버거의 가격이 주어진다. 넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 
//		모든 가격은 100원 이상, 2000원 이하이다.
//		
//		첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다
	
//		Scanner scan = new Scanner(System.in);
//		
//		
//		int [] a = new int [5];
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println("햄버거 가격 3개와 음료수 가격 2개를 순서대로 입력해주세요.");
//			for(int j = 0; j < 5; j++) {
//				a[j] = scan.nextInt();	
//			}
//			
//			int result = 0;
//			int result1 = 0;			
//			
//			if(a[0] < a[1] && a[0] < a[2]) {
//				result = result + a[0];
//			}else if(a[1] < a[0] && a[1] < a[2]){
//				result =  result + a[1];
//			}else {
//				result = result + a[2];
//			}
//			if(a[3] < a[4]) {
//				result1 = result1 + a[3]; 
//			}else {
//				result1 = result1 + a[4]; 
//			}
//			
//			System.out.println(((result + result1)-50));
//			}
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[10817번] 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
//		첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("비교하고자 하는 3정수를 입력해 주세요.");
//		int a= scan.nextInt();
//		int b= scan.nextInt();
//		int c= scan.nextInt();
//	
//		if((a >= b && a <= c) || (a <= b && a >= c)) {
//			System.out.println(a);
//		}else if((b >= a && b <= c) || (b <= a && b >= c)) {
//			System.out.println(b);
//		}else {
//			System.out.println(c);
//		}
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[2523번] 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		ex) 3
		
//		*
//		**
//		***
//		**
//		*
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n 값을 입력해주세요.");
//		int a = scan.nextInt();
//		
//		
//		for(int i = 0; i <= a; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		for(int k = a-1; k >= 0; k--) {
//			for(int l = k-1; l >= 0; l--) {
//				System.out.print("*");
//			}System.out.println();
//
//	}
	
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[2446번]예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.	
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		ex)5
//		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("n 값을 입력해주세요.");
//		int a = scan.nextInt();
//
//		for(int i = 0; i < a; i++) {
//			for(int j = 0; j < i; j++) {
//			System.out.print("-");
//		}
//			
//			for(int i1 = 0; i1 < (2 * a -1) - (2 * i); i1++) {
//				System.out.print("*");
//			}
//			
//				System.out.println();
//		}
//		
//		
//	for(int k = a-1; k >= 0; k--) {
//		for(int l = k-1; l >= 0; l--) {
//			System.out.print("-");
//		}
//		
//		for(int k1 = (2 * a -1) - (2 * k); k1 > 0; k1--) {
//			System.out.print("*");
//		}
//		
//		
//		
//		System.out.println();
//		
//	}
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[10996번] 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.	
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//		ex)3
//		
//		* *
//		 *
//		* *
//		 *
//		* *
//		 *

//		Scanner scan = new Scanner(System.in);
//		System.out.println("n의 값을 입력해주세요.");
//		int n = scan.nextInt();
//		
//		for(int i = 1; i <= 2 * n; i++) {
//		
//			if(i % 2 == 1) {
//				for(int j =1; j <=n; j++ ) {
//					if(j % 2 == 1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//				}
//			}
//			}
//			
//			
//			else {
//				for(int j = 1; j <=n; j++) {
//					if(j % 2 == 1) {
//						System.out.print(" ");
//					}else {
//						System.out.print("*");
//					}
//				}
//			}
//			
//			System.out.println();
//			}
//		
//		
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[10818번] N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//		
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("배열의 크기를 입력해주세요.");
//		int input = scan.nextInt();
//		
//		int[] a = new int[input]; 
//		
//		int max = 0;
//		int min = 0;
//		
//		System.out.println("배열에 들어갈 숫자를 입력해 주세요.");
//		for(int i = 0; i < input; i++) {
//			a[i] = scan.nextInt();
//			
//			
//		}
//		
//		Arrays.sort(a);
//		
//		System.out.println("최솟값 " +a[0]+" "+ "최댓값 "+ a[input -1]);
//	
//		
//	
///////////////////////////////////////////////////////////////////////////////////////	

//		[2562번] 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

//		예를 들어, 서로 다른 9개의 자연수
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다
//		
//		첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//		첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
//		
//		Scanner scan = new Scanner(System.in);
//		int [] arr = new int [9];
//		int max = 0;
//		int number = 0;
//		
//		System.out.println("9개의 정수를 입력해주세요.");
//		for(int i = 0; i < 9; i++) {
//			arr[i] = scan.nextInt();
//			
//			if(arr[i] > max) {
//				max = arr[i];
//				number = i + 1;
//			}
//
//		} 
//		System.out.print("위치" + number + "최댓값 " + max);
		
///////////////////////////////////////////////////////////////////////////////////////	

//		[2577번] [완료]
//		세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가
//		몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//
//		예를 들어 A = 150, B = 266, C = 427 이라면 
//		A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//		계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. 
//		A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
//		
//		첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
//		마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 A B C 를 입력해주세요.");
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		
//		int [] arr = new int [10];
//		int multi = A * B * C;
//		
//		while(multi > 0) {
//			arr[multi % 10]++;
//			//0부터 새기 때문에 바로 10을 나눈 나머지값이 배열의 현재 위치이기 때문에
//			//배열의 현재위치를 하나씩 더해주면, 그 숫자가 얼만큼 나왔는지 알 수 있다.
//			multi /= 10;
//			//다음 숫자 비교를 위해 10으로 나누어줌
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		}
//	
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[3052번] [완료]			
//		두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
//		예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//		
//		첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//		첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		
//		import java.util.Scanner;
//
//		public class TemplateA {
//				public static void main(String[] args)  {
//					
//					Scanner scan = new Scanner(System.in);
//					 int [] arr = new int [10];
//					 int [] nmg = new int [42];
//					 
//					 int count = 0;
//					 for(int i = 0; i < 10; i++) {
//						 arr[i] = scan.nextInt();
//						 
//						 int temp = arr[i] % 42;
//						 for(int j = 0; j < nmg.length; j++) {
//							if(nmg[temp] == 0) {
//								count ++;
//								nmg[temp] = 1;
//							}
//						 }
//						 
//					 }
//					
//					 System.out.println(count);
//				}
//		    }
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[1546번]		
//		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
//		일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//		
//		첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
//		둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//		첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("과목의 갯수를 입력해주세요");
//		int input = scan.nextInt();
//		double [] arr = new double[input];
//		
//		double max = 0;
//		double temp = 0;
//		double average = 0;
//		
//		System.out.println("과목별 점수를 입력해주세요.");
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		} 
//			
//			Arrays.sort(arr);
//			max = arr[input -1];	
//			temp = max/max * 100;
//			average += temp;
//
//
//		for (int j = 0; j < input -1; j++) {			
//			arr[j] = (arr[j] / max) * 100;
//			average += arr[j];
//		}
//		
//		System.out.println("평균점수는 : " + Math.round((average / arr.length) * 100)/100);
//		
		

		
///////////////////////////////////////////////////////////////////////////////////////	

//		[8958번]	[완료]			
		
//		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
//		O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
//		예를 들어, 10번 문제의 점수는 3이 된다.
//		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
//		첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 
//		길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
//		
//		
//		import java.util.Scanner;
//
//		public class TemplateA {
//				public static void main(String[] args)  {
//					
//					Scanner scan = new Scanner(System.in);
//					int n = scan.nextInt();
//					
//					
//					for(int i = 0; i <n; i++) {
//						String str = scan.next();
//						int sum = 0;
//						//점수 총합 변수
//						int plus = 0;
//						//O의 연속된 갯수만큼 하나씩 더해줄 변수
//						for(int j = 0; j < str.length(); j++) {
//							if(str.charAt(j) == 'O') {
//								//str의 j 번째 문자가 O인지 체크
//								plus++;
//								//하나씩 더해줌
//								sum += plus;
//								//총합에 더해줌
//							}else {
//								plus = 0;
//								//X일 경우 plus 초기화
//							}
//						}
//						System.out.println(sum);
//					}
//					
//					
//				}
//		    }

		
		
///////////////////////////////////////////////////////////////////////////////////////629공부
		

///////////////////////////////////////////////////////////////////////////////////////	

//		[4344번]		
		
//		대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
//		당신은 그들에게 슬픈 진실을 알려줘야 한다.
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
//		이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스 C를 입력해주세요.");
//		int C = scan.nextInt();
//		
//		System.out.println("학생의 수를 입력해주세요.");
//		int StudentNo = scan.nextInt();
//		System.out.println("학생별 점수를 입력해주세요.");
//		int [] score = new int [StudentNo];
//		int sum = 0;
//		double ratio = 0;
//		
//		for(int i = 0; i < C; i++) {
//		for(int j = 0; j < StudentNo; j++) {
//			score[j] = scan.nextInt();
//			sum += score[j];
//		}
//		for(int k = 0; k < StudentNo; k++) {	
//			if(sum / StudentNo < score[k]) {
//			ratio++;
//		}
//		}
//		ratio = (ratio/StudentNo) * 100;
//		System.out.println("평균이 넘는 학생의 비율은 : " + Math.round((ratio * 1000)) / 1000.0  + "%");
//		System.out.println();
//		}
//		
	

///////////////////////////////////////////////////////////////////////////////////////	

//		[15596번]				
		
//		정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//		작성해야 하는 함수는 다음과 같다.
//		
//		Java: long sum(int[] a); (클래스 이름: Test)
//		a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//		리턴값: a에 포함되어 있는 정수 n개의 합
//	
//		int [] b = new int[1000];
//		
//		a.sum(b);


///////////////////////////////////////////////////////////////////////////////////////	

//		[4673번]	
//		셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 
//		양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 
//		예를 들어, d(75) = 75+7+5 = 87이다.
//
//		양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), 
//		...과 같은 무한 수열을 만들 수 있다. 
//
//		예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 
//		이런식으로 다음과 같은 수열을 만들 수 있다.
//		33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
//		n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 
//		생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다. 
//		생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 
//		1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
//
//		10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//	
//	      boolean[] isNotSelfNumber = new boolean[10001];
//	         
//	        for (int i = 1; i <= 10000; ++i) {
//	            int dn = getDn(i);
//	            if (dn <= 10000) {
//	                isNotSelfNumber[dn] = true;             
//	            }
//	        }
//	         
//	        for (int i = 1; i < isNotSelfNumber.length; ++i) {
//	            if (!isNotSelfNumber[i]) {
//	                System.out.println(i);              
//	            }
//	        }
//	    }
//
//		private static int getDn(int n) {
//				int dn = n;
//					while(n > 0) {
//							dn += n % 10;
//								n /= 10;
//						}
//					return dn;

	
	
	
///////////////////////////////////////////////////////////////////////////////////////	

//		[1065번]
		
//		어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
//		등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
//		N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
//	
//		첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//		첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
	
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//         
//        if (n < 100) {
//            System.out.println(n);
//        } else {
//            int result = 99;
//             
//            for (int i = 100; i <= n; ++i) {
//                result += checkHanNumber(i);
//            }
//             
//            if (n == 1000) result--;
//             
//            System.out.println(result);
//        }
//	
//	}
//	 private static int checkHanNumber(int number) {
//	        int num1 = number / 100 % 10;
//	        int num2 = number / 10 % 10;
//	        int num3 = number % 10;
//	         
//	        if (num2 * 2 == num1 + num3) {
//	            return 1;
//	        }
//	        return 0;
	   
	
///////////////////////////////////////////////////////////////////////////////////////		
	
//		[11654번] 	
//		알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
//		주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
//		알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
//		입력으로 주어진 글자의 아스키 코드 값을 출력한다.
//	
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("알파벳을 입력해주세요.");
//		char text = scan.nextLine().charAt(0);
//		int text1 = (int) text;
//		
//		System.out.println(text1);
		
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[11720번]
		
//		N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//		첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//		입력으로 주어진 숫자 N개의 합을 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자의 갯수를 입력해주세요");
//		int number = scan.nextInt();
//		System.out.println("숫자를 입력해주세요");
//		String text = scan.next();
//		scan.close();
//		
//		int result = 0;
//		for(int i = 0; i < number; ++i) {
//			result += text.charAt(i) - '0';
////			result += Integer.parseInt(inputs.substring(i, i + 1));
//		}
//		System.out.println(result);
	
/////////////////////////////////////////////////////////////////////////////////////630공부		
///////////////////////////////////////////////////////////////////////////////////////		
		
//			[10809번]	
//		
//		알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
//		단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
//		포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
//		
//		첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
//		각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, 
//		... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
//
//		만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 
//		단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
//	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("단어를 입력해주세요.");
//		String s = scan.next();
//
//		for(char c = 'a'; c <='z'; c++) {
//			System.out.print(s.indexOf(c)+ " ");
//		}
	

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2675번]	
//		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
//		
//		문제
//		문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
//		즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
//		S에는 QR Code "alphanumeric" 문자만 들어있다.
//		QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
//		각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
//		S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
//
//		출력
//		각 테스트 케이스에 대해 P를 출력한다.
//
//		Scanner scan = new Scanner(System.in);
//		System.out.println("테스트 케이스를 입력해주세요.");
//		int N = scan.nextInt();
//		System.out.println("문자를 입력해주세요.");		
//		
//		for(int i = 0; i < N; i++) {
//			int n = scan.nextInt();
//			String str = scan.next();
//			
//				for(int j = 0; j < str.length(); j++) {
//					for(int k = 0; k < n; k++) {
//						System.out.print(str.charAt(j));
//					}
//					
//				}
//			}
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1157번] 단어 공부 [완료]
		
//		import java.util.Arrays;
//		import java.util.Scanner;
//
//		public class TemplateA {
//				public static void main(String[] args)  {
//					
//					Scanner scan = new Scanner(System.in);
//					String str = scan.next();
//					
//					str = str.toUpperCase();
//					//모든 문자를 대문자로 변환
//					//대소문자 신경쓰지 않기 때문
//					//계산 편하기 하기 위함
//					
//					int [] arr = new int [26];
//					int [] Tarr = new int [26];
//					//두개의 알파벳 수만큼의 배열 생성
//					
//					
//					for(int i = 0; i < str.length(); i++) {
//						int temp = str.charAt(i) - 'A';
//						//주어진 스티링 알파벳에서 아스키코드 A(65)를 빼주면
//						//그 알파벳 순서대로 들어감 ex) A는 0 B는 1 .. Z는 25
//						arr[temp] += 1;
//						Tarr[temp] += 1;
//					}
//					
//					
//					Arrays.sort(Tarr);
//					//임시 Arr를 정렬 해줌 이는 
//					//가장 많이 나온 알파벳이 두가지 이상인지 체크하기 위함
//					
//					int max = 0;
//					int count = 0;
//					if(Tarr[25] == Tarr[24]) {
//						System.out.println("?");
//						//가장 많이 나온 알파벳이 두개 이상이면 ? 출력
//					}else {
//						
//						for(int i = 0; i < arr.length; i++) {
//							if(max < arr[i]) {
//								max = arr[i];
//								count = i;
//								//가장 많이 나온 알파벳수 체크
//								//그리고 해당 알파벳 위치 저장
//							}
//							
//						}
//					}
//					
//					count  = count + 65;
//					//해당 알파벳 위치에 처음에 빼준 A를 더해줌
//					char answer = (char) count;	
//					//출력을 위해 char형태로 변환 
//					//이는 그대로 출력하면 아스키코드로 나오기 때문
//					System.out.println(answer);
//					
//					
//				}
//		    }


///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1152번]	
	
//		문제
//		영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 
//		이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
//		단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
//
//		입력
//		첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 
//		문자열의 길이는 1,000,000을 넘지 않는다.
//		단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
//		또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
//
//		출력
//		첫째 줄에 단어의 개수를 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		int count = 0;
//		
//		for(int i = 1; i < str.length()-1; i++) {
//			if(str.charAt(i) == ' '){
//				count ++;
//			}
//		}System.out.println(count + 1);
//		
	
	
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2908번]		
//		문제
//		상근이의 동생 상수는 수학을 정말 못한다. 
//		상수는 숫자를 읽는데 문제가 있다. 
//		이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
//		상근이는 세 자리 수 두 개를 칠판에 써주었다. 
//		그 다음에 크기가 큰 수를 말해보라고 했다.
//
//		상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
//		예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
//		따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//		두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
//		두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//
//		출력
//		첫째 줄에 상수의 대답을 출력한다.
//	
//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 두개를 입력해주세요.");
//		String a = scan.next();
//		String b = scan.next();
//		String max = "";
//		
//		for(int i = a.length()-1; i >= 0; i--) {
//			max +=a.charAt(i);
//	}
//		a = max;
//		
//		max = ""; // 맥스값 초기화
//		
//		for(int i = b.length()-1; i >= 0; i--) {
//			max +=b.charAt(i);
//	}
//		b = max;
//	
//		int ano = Integer.parseInt(a);
//		int bno = Integer.parseInt(b);
//		
//		if(ano > bno) {
//			System.out.println(ano);
//		}else {
//			System.out.println(bno);
//		}
//		

		
///////////////////////////////////////////////////////////////////////////////////////701공부		
		
//		[5622번]				
		
//		문제
//		상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
//		전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
//		숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//		숫자 1을 걸려면 총 2초가 필요하다. 
//		1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 
//		각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.
//
//		출력
//		첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자에 해당하는 문자를 입력해주세요.");
//		
//		final int no [] = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
//		
//		String number = scan.nextLine().toUpperCase();
//		int sum =0;
//		
//		
//		for(int i = 0; i < number.length(); i++) {
//			sum += no[number.charAt(i) -65];
//		}
//		
//		System.out.println(sum);

		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2941번]			
		
//		
//		문제
//		예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 
//		따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
//		크로아티아 알파벳	변경
//		č	c=
//		ć	c-
//		dž	dz=
//		đ	d-
//		lj	lj
//		nj	nj
//		š	s=
//		ž	z=
//		예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
//		단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
//		dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다.
//		위 목록에 없는 알파벳은 한 글자씩 센다.
//
//		입력
//		첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
//		단어는 크로아티아 알파벳으로 이루어져 있다. 
//		문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
//
//		출력
//		입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	
//		Scanner scan = new Scanner(System.in);
//		
//		final String str [] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
//		System.out.println("문자를 입력해주세요.");
//		String input = scan.nextLine();
//		int sum = 0;
//		
//		
//		for(int i = 0; i < input.length(); i++) {
//			if(input.contains(str[i])){
//				input = input.replaceAll(str[i], "x");
//			}
//		}
//		sum = input.length();
//		System.out.println(sum);

		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1316번]				

//		
//		문제
//		그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
//		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
//		kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
//		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 단어의 개수 N이 들어온다.
//		N은 100보다 작거나 같은 자연수이다.
//		둘째 줄부터 N개의 줄에 단어가 들어온다. 
//		단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//		출력
//		첫째 줄에 그룹 단어의 개수를 출력한다.		
//		
//		System.out.println("테스트 케이스를 입력해주세요.");
//		int N = scan.nextInt();
//		int count = 0;
//		
//		System.out.println("문자를 입력해주세요.");
//		for(int i = 0; i < N; i++) {
//			if(check() == true) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//	
//	public static boolean check() {
//		boolean[] check = new boolean[26];
//		int prev = 0;
//		String str = scan.next();
//		
//		for(int i = 0; i < str.length(); i++) {
//			int now =str.charAt(i);
//			if(prev != now) {
//				if(check[now - 'a'] == false) {
//					check[now - 'a'] = true;
//					prev = now;
//				}else {
//					return false;
//				}
//			}
//			else {
//				continue;
//			}
//		}
//	return true; }

///////////////////////////////////////////////////////////////////////////////////////	702공부	
		
//		[1712번]				
		
//		문제
//		월드전자는 노트북을 제조하고 판매하는 회사이다. 
//		노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 
//		한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
//		예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 
//		열 대 생산하는 데는 총 1,700만원이 든다.
//		노트북 가격이 C만원으로 책정되었다고 한다. 
//		일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 
//		최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
//		A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
//
//		출력
//		첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int a = scan.nextInt();
//		int b = scan.nextInt();	
//		int c = scan.nextInt();
//		
//		int count = 0;
//		int cPrice = 0;
//		
//		while(true) {
//			a += b;
//			cPrice += c; 
//			count ++;
//			if( cPrice >= a ) {
//				System.out.println(count);
//				break;
//			}if( a >= 210000000 || c >= 210000000 ) {
//				System.out.println(-1);
//				break;
//			}
//			
//		}
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2839번]			
//		문제
//		상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
//		설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//		상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
//		예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
//		5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//		상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
//
//		출력
//		상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		
//		int a = scan.nextInt();
//		int count = 0;
//		
//
//		while(true) {
//			if(a % 5 == 0) {
//				System.out.println(a / 5 + count);
//				break;
//			}else if(a <= 0) {
//				System.out.println(-1);
//				break;
//			}else {
//				a = a-3;
//				count++;
//			}
//		}
//		
//		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2292번]		
		
//		문제
//		위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 
//		그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
//		숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 
//		몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
//		예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
//
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
//
//		출력
//		입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int input = scan.nextInt();
//		int count = 1;
//		int start = 1;
//		int addno = 6;
//		
//		while(true) {
//			if(start >= input) {
//				break;
//			}else {
//				start += addno;
//				addno += 6;
//				count++;
//			}
//			
//		}System.out.println(count);

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1193번]	분수찾기 [완료]		
		
		
		//사실 이 문제는 배열문제 처럼 보이지만 굳이 배열을 사용할 필요없이
		//변수와 약간의 수학적 접근만으로 충분히 풀 수 있는 문제이다.


//		import java.util.Arrays;
//		import java.util.Scanner;
//
//		public class TemplateA {
//				public static void main(String[] args)  {
//
//					
//					int n = scan.nextInt();
//					
//					int max = 1;
//					//대각선 상에서 커질수 있는 최대 수
//					//대각선의 줄 수라고도 볼 수 있다.
//					while(n != 0) {
//						int top = 0;
//						//분자 값 초기화
//						int bottom = max + 1;
//						//분모 값 초기화
//						for(int i = 1; i <= max; i++) {
//							n--;
//							top++;
//							bottom--;
//							//분자 분모가 하나씩 더해지고 빼지는 만큼
//							//n의 순서값도 하나씩 빼줌
//							if(n == 0) {
//								if(max % 2 != 0) {
//									System.out.println(bottom + " / " + top);
//								}else {
//									System.out.println(top + " / " + bottom);	
//								}
//								break;
//								//배열자체가 지그재그 형식이다보니 max 값이 홀수이면 분모가 위로가고
//								//짝수면 분모가 다시 아래로 간다.
//							}
//						}
//						max++;
//						//대각선의 길이가 하나씩 커지기 때문에 한 대각선을 다돌면
//						//max 값 하나씩 더해줌
//
//					}
//					
//				}
//		    }

		

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2869번]			
		
//		문제
//		땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
//		달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
//		또, 정상에 올라간 후에는 미끄러지지 않는다.
//		달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
//
//		출력
//		첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int V = scan.nextInt();
//		int sum = 0;
//		int count = 0;
//		
//		while(true) {
//			sum += A;
//			if(V > sum) {
//				sum -=B;
//				count++;
//			}else if(sum >= V) {
//				count++;
//				System.out.println(count);
//				break;
//			}
//
//			}
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[10250번	] [완료]
		
//		문제
//		ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다. 
//		고객 설문조사에 따르면 손님들은 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호한다고 한다. 
//		여러분은 지우를 도와 줄 프로그램을 작성하고자 한다. 
//		즉 설문조사 결과 대로 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램을 작성하고자 한다.
//
//		문제를 단순화하기 위해서 호텔은 직사각형 모양이라고 가정하자. 
//		각 층에 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). 
//		그리고 엘리베이터는 가장 왼쪽에 있다고 가정하자(그림 1 참고). 이런 형태의 호텔을 H × W 형태 호텔이라고 부른다. 
//		호텔 정문은 일층 엘리베이터 바로 앞에 있는데, 정문에서 엘리베이터까지의 거리는 무시한다. 
//		또 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)라고 가정하고 호텔의 정면 쪽에만 방이 있다고 가정한다.
//
//
//
//		그림 1. H = 6 이고 W = 12 인 H × W 호텔을 간략하게 나타낸 그림
//		방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 
//		즉, 그림 1 에서 빗금으로 표시한 방은 305 호가 된다.
//
//		손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 
//		다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호한다. 
//		예를 들면 102 호 방보다는 301 호 방을 더 선호하는데, 
//		102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다. 
//		같은 이유로 102 호보다 2101 호를 더 선호한다.
//
//		여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에 
//		이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 
//		첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 
//		그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
//
//		입력
//		프로그램은 표준 입력에서 입력 데이터를 받는다. 
//		프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다. 
//		각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수,
//		각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 
//
//		출력
//		프로그램은 표준 출력에 출력한다. 
//		각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");	
//		int H = scan.nextInt();
//		int W = scan.nextInt();
//		int N = scan.nextInt();
//		
//		int Wcount = 1;
//		int count = 0;
//		count = N;
//
//			while(true) {
//				if(count > H) {
//					Wcount++;
//					count = count - H;
//				}else {
//					if(Wcount < 10)
//					System.out.println(count +"0"+ Wcount );
//					else {
//						System.out.println(count +""+ Wcount );
//					}
//				break;}
//			}

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[2775번]	부녀회장이 될테야 [완료]
		
//		Scanner in = new Scanner(System.in);
//		
//		// 아파트 생성 
//		int[][] APT = new int[15][15];
// 
//		for(int i = 0; i < 15; i++) {
//			APT[i][1] = 1;	// i층 1호
//			APT[0][i] = i;	// 0층 i호
//		}
// 
// 
//		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
// 
//			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
//				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
//			}
//		}
//		
//		// 테스트 부분 		
//		int T = in.nextInt();
//		
//		for(int i = 0; i < T; i++) {
//			int n = in.nextInt();
//			int k = in.nextInt();
//			System.out.println(APT[n][k]);
//		}
//	}

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1011번]		
		
//		문제
//		우현이는 어린 시절, 지구 외의 다른 행성에서도 인류들이 살아갈 수 있는 미래가 오리라 믿었다. 
//		그리고 그가 지구라는 세상에 발을 내려 놓은 지 23년이 지난 지금, 
//		세계 최연소 ASNA 우주 비행사가 되어 새로운 세계에 발을 내려 놓는 영광의 순간을 기다리고 있다.
//
//		그가 탑승하게 될 우주선은 Alpha Centauri라는 새로운 인류의 보금자리를 개척하기 위한 대규모 생활 유지 시스템을 탑재하고 있기 때문에,
//		크기와 질량이 엄청난 이유로 최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다. 
//		하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서, 
//		이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다. 
//		예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 
//		음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. 
//		( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
//
//
//
//		김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 
//		x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 
//		하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
//
//		김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.
//
//		입력
//		입력의 첫 줄에는 테스트케이스의 개수 T가 주어진다. 
//		각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며,
//		x는 항상 y보다 작은 값을 갖는다. (0 ≤ x < y < 231)
//
//		출력
//		각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 회수를 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");	
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		int count = 0;
//		int sum = 0;
//		
//			while(x - 1 <= y){
//			if(x >= 0) {
//				sum = x + 1;
//				x = sum + 1;
//				count++;
//			}
//		}System.out.println(count);
//		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1978번]			
	
//		문제
//		주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//		입력
//		 자연수이다.
//
//		출력
//		주어진 수들 중 소수의 개수를 출력한다.
		
//		Scanner sc = new Scanner(System.in);
//		 
//		System.out.println("N을 입력해주세요.");
//        int N = sc.nextInt();
//        Boolean flag = true;
//        int count = 0;
//        
//        System.out.println("숫자를 입력해주세요.");
//        for (int i = 0; i < N; i++) {
//            int pNum = sc.nextInt();
//             if (pNum <= 1) 
//                flag = false;
//            else {
//                for (int j = 2; j <= pNum / 2; j++)
//                    if (pNum % j == 0)
//                        flag = false;
//            }
//            if (flag) 
//                count++;
//            flag = true;
//        }
// 
//        System.out.println(count);
//        sc.close();

///////////////////////////////////////////////////////////////////////////////////////	705공부	
		
//		[2581번]	
//		
//		
//		문제
//		자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//		예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
//		이들 소수의 합은 620이고, 최솟값은 61이 된다.
//
//		입력
//		입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
//		M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
//
//		출력
//		M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
//		단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int M = scan.nextInt();
//		int N = scan.nextInt();
//		
//		int min = 10001;
//		int sum = 0;
//		int count =0;
//		
//		for(int i = M; i <= N; i++) {
//			for(int j = 2; j < i / 2; j++) {
//				if(i % j == 0)
//					count ++;
//			}
//			if(count == 0 && i !=1) {
//				sum += i;
//				if(min > i) 
//					min = i;
//				
//			}
//		 count = 0;
//		}
//		
//		if(min == 10001) {
//			System.out.println(-1);
//		}else {
//			System.out.println(sum);
//			System.out.println(min);
//		}

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[1929번]	[완료]
		
//		문제
//		M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) 
//		M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
//
//		출력
//		한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
//		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int M = scan.nextInt();
//		int N = scan.nextInt();
//		
//		int count = 0;
//		
//		for(int i = M; i <= N; i++) {
//		for(int j = 2; j < i; j++) {
//			if(i % j == 0)
//				count ++;
//		}		
//			if(count == 0 && i !=0) {
//			System.out.println(i);
//			}
//			count = 0;
//		}
		

///////////////////////////////////////////////////////////////////////////////////////		
		
//		[4948번]	
		
		
//		문제
//		베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//		이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//		예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. 
//		(11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//		n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
//
//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
//		입력의 마지막에는 0이 주어진다.
//
//		출력
//		각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
	
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//		int M = scan.nextInt();
//		int N = M * 2;
//		
//		if(M == 0) {
//			break;
//		}
//		
//		int[] nums = new int[(N+1)];
//		for(int i=2; i<=N; i++) {
//			nums[i] = i;
//		}
//		
//		for(int i=2; i<=Math.sqrt(N); i++) {
//			if(nums[i] == 0) {
//				continue;
//			}
//			
//			int temp = i;
//			for(int j = i+1; j<=N; j++) {
//				if(j % temp == 0) {
//					nums[j] = 0;
//				}
//			}
//		}
//		
//		int count = 0;
//		for(int i = M+1; i <nums.length; i++){
//			if(nums[i] != 0)
//				count++;
//		}
//		System.out.println(count);
//		
//	}
		
///////////////////////////////////////////////////////////////////////////////////////		
		
//		[9020번] 
		
//		문제
//		1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 
//		예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
//		골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 
//		이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 
//		예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 
//		10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
//		2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
//		만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)
//
//		출력
//		각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
//		 
//		
//		 Scanner input = new Scanner(System.in);
//	      int i = 0;
//	      int a = 0,b = 0; //소수의 곱 
//	      int n = 0;
//	      int z = input.nextInt();
//	      for(int j = 0 ;j < z; j++)
//	      {
//	      n=input.nextInt();
//	      for(a = n/2, b = n/2;; a++,b--)
//	      {
//	         n=a+b;
//	         if(check(a)&&check(b))
//	         {
//	            System.out.println(b+" "+a);
//	            break;
//	         }
//	      }
//	      }
//	      //1. 입력을 받는다
//	      
//	      //2 . 입력받은 값을 소수의 곱으로 표현한다.
//
//	}
//	
//	 public static boolean check(int n)
//	   {
//	      //자기 자신과 1 말고는 나누어 져서는 안됨.
//	      
//	      
//	      for(int i = 2; i <= n/2; i++)
//	      {
//	         if(n%i == 0)
//	            return false;
//	      }
//	      return true;
//	   }

///////////////////////////////////////////////////////////////////////////////////////707공부		
		
//		[1085번]		
		
//		
//		문제
//		한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 
//		오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, 
//		w-1보다 작거나 같은 자연수이고, y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에 문제의 정답을 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		ArrayList<Integer> List = new ArrayList<Integer>();
//		System.out.println("숫자를 입력해주세요.");
//		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		int w = scan.nextInt();
//		int h = scan.nextInt();
//		
//		
//		List.add(x);
//		List.add(y);
//		List.add(w-x);
//		List.add(h-y);
//		Collections.sort(List);
//		System.out.println("최소거리는~~");
//		System.out.println(List.get(0));
		
///////////////////////////////////////////////////////////////////////////////////////707공부		
		
//		[3009번]	[완료]
		
//		문제
//		세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//
//		입력
//		세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
//
//		출력
//		직사각형의 네 번째 점의 좌표를 출력한다.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		
//		int [] x = new int [3];
//		int [] y = new int [3];
//		int x1 = 0;
//		int y1 = 0;
//		
//		for(int i = 0; i < x.length; i++) {
//			x[i] = scan.nextInt();
//			if(x[0] == x[1]) {
//				x1 = x[2];
//			}else if(x[0] == x[2]){
//				x1 = x[1];
//			}else {
//				x1 = x[0];
//			}	
//
//		}
//
//		for(int i = 0; i < y.length; i++) {
//			y[i] = scan.nextInt();
//			if(y[0] == y[1]) {
//				y1 = y[2];
//			}else if(y[0] == y[2]){
//				y1 = y[1];
//			}else {
//				y1 = y[0];
//			}
//			
//		}
		
//		System.out.println(x1+ " " + y1);
///////////////////다른풀이//////////////////////////		
//		int x1 = scan.nextInt();
//		int y1 = scan.nextInt();
//		
//		int x2 = scan.nextInt();		
//		int y2 = scan.nextInt();
//		
//		int x3 = scan.nextInt();
//		int y3 = scan.nextInt();
//		
//		int x4 = 0;
//		int y4 = 0;
//		
//
//		if(x1 == x2) {
//			x4 = x3;
//		}else if(x1 == x3){
//			x4 = x2;
//		}else if(x2 == x3){
//			x4 = x1;
//		}else {
//			System.out.println(-1);
//		}
//		
//		if(y1 == y2) {
//			y4 = y3;
//		}else if(y1 == y3){
//			y4 = y2;
//		}else if(y2 == y3) {
//			y4 = y1;
//		}else {
//			System.out.println(-1);
//		}
//
//		System.out.println(x4+ " " +y4);

		
///////////////////////////////////////////////////////////////////////////////////////	
		
//		[4153번]		
		
//		문제
//		과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
//		주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
//
//		입력
//		입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 
//		각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//
//		출력
//		각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int T = scan.nextInt();
//		
//		for(int i = 0; i < T; i++) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = scan.nextInt();
//		
//			if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2)) {
//				System.out.println("right");
//			}else {
//				System.out.println("wrong");
//			}
//		
//		}
		
///////////////////////////////////////////////////////////////////////////////////////	
		
//		[3053번]				
		
//		문제
//		19세기 독일 수학자 헤르만 민코프스키는 비유클리드 기하학 중 택시 기하학을 고안했다.
//		택시 기하학에서 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리는 다음과 같이 구할 수 있다.
//		D(T1,T2) = |x1-x2| + |y1-y2|
//		두 점 사이의 거리를 제외한 나머지 정의는 유클리드 기하학에서의 정의와 같다.
//		따라서 택시 기하학에서 원의 정의는 유클리드 기하학에서 원의 정의와 같다.
//		원: 평면 상의 어떤 점에서 거리가 일정한 점들의 집합
//		반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 반지름 R이 주어진다. R은 10,000보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에는 유클리드 기하학에서 반지름이 R인 원의 넓이를, 둘째 줄에는 택시 기하학에서 반지름이 R인 원의 넓이를 출력한다. 
//		정답과의 오차는 0.0001까지 허용한다.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int r = scan.nextInt();
//		
//		double area = 0;
//		double area1 = 0;
//		
//		area = Math.pow(r,2) * Math.PI;
//		area1 = (2*r) * r;
//		
//		System.out.println(String.format("%.5f", area));
//		System.out.println(String.format("%.5f", area1));

///////////////////////////////////////////////////////////////////////////////////////	708공부
		
//		[10872번]				
		
//		문제
//		0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
//
//		출력
//		첫째 줄에 N!을 출력한다.
		
		
//		Scanner scna = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int input = scan.nextInt();
//		int [] arr = new int[input];
//		int sum = 1;
//		
//		for(int i = 0; i < input; i++) {
//			arr[i] = i+1;
//			sum *= arr[i];
//		
//		}
//		System.out.println(sum);
//		

		
///////////////////////////////////////////////////////////////////////////////////////	
		
//		[10870번]
		
//		문제
//		피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
//		그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
//
//		이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
//
//		n=17일때 까지 피보나치 수를 써보면 다음과 같다.
//
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
//
//		n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
//
//		출력
//		첫째 줄에 n번째 피보나치 수를 출력한다.
		
//		Scanner scna = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");	
//		int N = scan.nextInt();
//		int a = 1;
//		int b = 1;
//		int result = 0;
//		
//		for(int i = 0; i < N-2; i++) {
//			result = a + b;
//			b = a;
//			a = result;
//			
//		}
//		if(N == 1) {
//			System.out.println(0);
//		}else if(N == 2 || N == 3) {
//			System.out.println(1);
//		}else {
//			System.out.println(result);
//		}
		
///////////////////////////////////////////////////////////////////////////////////////	
		
//		[2447번]	별 찍기 - 10[skip_]
		
///import java.util.Scanner;
//
//public class Main {
//	static char[][] arr;
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//
//		arr = new char[N][N];
//       
//		star(0, 0, N, false);
//
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				sb.append(arr[i][j]);
//			}
//			sb.append('\n');
//		}
//		System.out.print(sb);
//	}
//
//	static void star(int x, int y, int N, boolean blank) {
//
//		// 공백칸일 경우
//		if (blank) {
//			for (int i = x; i < x + N; i++) {
//				for (int j = y; j < y + N; j++) {
//					arr[i][j] = ' ';
//				}
//			}
//			return;
//		}
//
//		// 더이상 쪼갤 수 없는 블록일 때
//		if (N == 1) {
//			arr[x][y] = '*';
//			return;
//		}
//
//		/*
//		   N=27 일 경우 한 블록의 사이즈는 9이고, 
//		   N=9 일 경우 한 블록의 사이즈는 3이듯
//		   해당 블록의 한 칸을 담을 변수를 의미 size
//          
//		   count는 별 출력 누적을 의미
//		 */
//
//		int size = N / 3;
//		int count = 0;
//		for (int i = x; i < x + N; i += size) {
//			for (int j = y; j < y + N; j += size) {
//				count++;
//				if (count == 5) { // 공백 칸일 경우
//					star(i, j, size, true);
//				} else {
//					star(i, j, size, false);
//				}
//			}
//		}
//	}
//}
		
///////////////////////////////////////////////////////////////////////////////////////	
		
//		[11729번]		(외워 그냥)
		
//		문제
//		세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 
//		각 원판은 반경이 큰 순서대로 쌓여있다. 
//		이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
//		한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
//		쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
//		이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라.
//		단, 이동 횟수는 최소가 되어야 한다.
//		아래 그림은 원판이 5개인 경우의 예시이다.
//
//		입력
//		첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
// 
//
//		출력
//		첫째 줄에 옮긴 횟수 K를 출력한다.
//		두 번째 줄부터 수행 과정을 출력한다.
//		두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
//		이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요/");
//		n = scan.nextInt();
//		hanoi(n,1,2,3);
//		System.out.println(cnt);
//		System.out.println(sb);
//	}
//	
//	public static int n, cnt = 0;
//	public static StringBuilder sb = new StringBuilder();
//	public static void hanoi(int n, int A, int B, int C) {
//		cnt++;
//		if(n == 1) {
//			sb.append(A +" "+ C +"\n");
//			return;
//		}else {
//			hanoi(n-1, A, C, B);
//			sb.append(A +" "+ C +"\n");
//			hanoi(n-1, B, A, C);
//		}
			
///////////////////////////////////////////////////////////////////////////////////////	709공부
		
//		[2798번]		
	
//		문제
//		카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 
//		카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 
//		블랙잭은 카지노마다 다양한 규정이 있다.
//		한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
//		김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 
//		그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 
//		그런 후에 딜러는 숫자 M을 크게 외친다.
//		이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
//		블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//		N장의 카드에 써져 있는 숫자가 주어졌을 때, 
//		M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
//
//		입력
//		첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
//		둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.
//		합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
//
//		출력
//		첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
		
		
//		System.out.println("숫자를 입력해주세요.");
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		int [] arr = new int [N];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int max = 0;
//		loop : for(int i = 0; i < N-2; i++) {
//			for(int j = i + 1; i < N-1; j++) {
//				for(int k = j + 1; k < N; k++) {
//					int sum = arr[i] + arr[j] + arr[k];
//					if(max <= sum) {
//						max = Math.max(max, sum);
//					}
//					if(max == M) {
//						break loop;
//					}
//				}
//			}
//		}
//		System.out.println(max);

		
///////////////////////////////////////////////////////////////////////////////////////	709공부
		
//		[2231번]				

//		문제
//		어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
//		어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
//		예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 
//		따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 
//		반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
//		자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
//
//		출력
//		첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
		
//		int N = scan.nextInt();
//		int M = 0;
//		
//		for(int i = N; i > 0;  i--) {
//			int sum = 0;
//			String value = String.valueOf(i);
//			
//			for(int j = 0; j < value.length(); j++) {
//				sum += value.charAt(j) - 48;
//			}
//			if(i + sum == N) {
//				M = i;
//			}
//			
//		} if(M == 0) {
//			System.out.println(-1);
//		}else {
//			System.out.println(M);
//		}
//		
//		
//		
///////////////////////////////////////////////////////////////////////////////////////	709공부
		
//		[7568번]				
//		문제
//		우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 
//		어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x,y)로 표시된다. 
//		두 사람 A 와 B의 덩치가 각각 (x,y), (p,q)라고 할 때 x>p 그리고 y>q 이라면 
//		우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 
//		예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56,177), (45,165) 라고 한다면 A의 덩치가 B보다 큰 셈이 된다. 
//		그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다. 
//		예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55,173)이라면 몸무게는 D가 C보다 더 무겁고, 
//		키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.
//
//		N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다.
//		만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 
//		이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 
//		아래는 5명으로 이루어진 집단에서 각 사람의 덩치와 그 등수가 표시된 표이다.
//
//		이름	<몸무게, 키>	덩치 등수
//		A	<55, 185>	2
//		B	<58, 183>	2
//		C	<88, 186>	1
//		D	<60, 175>	2
//		E	<46, 155>	5
//		위 표에서 C보다 더 큰 덩치의 사람이 없으므로 C는 1등이 된다. 
//		그리고 A, B, D 각각의 덩치보다 큰 사람은 C뿐이므로 이들은 모두 2등이 된다. 
//		그리고 E보다 큰 덩치는 A, B, C, D 이렇게 4명이므로 E의 덩치는 5등이 된다. 
//		위 경우에 3등과 4등은 존재하지 않는다.
//		여러분은 학생 N명의 몸무게와 키가 담긴 입력을 읽어서 각 사람의 덩치 등수를 계산하여 출력해야 한다.
//
//		입력
//		첫 줄에는 전체 사람의 수 N이 주어진다. 
//		그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다. 
//		단, 2 ≤ N ≤ 50, 10 ≤ x,y ≤ 200 이다.
//
//		출력
//		여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.	
		
//		int N = scan.nextInt();
//		int [][] KgCm = new int[N][2];
//		int [] count = new int[N];
//		
//		
//		for(int i = 0; i < N; i++) {
//			KgCm [i][0] = scan.nextInt();
//			KgCm [i][1] = scan.nextInt();
//			
//		}
//		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				if(i == j)
//					continue;
//				if(KgCm[i][0] < KgCm[j][0] && KgCm[i][1] < KgCm[j][1]) {
//					count[i]++;
//				}
//			}
//		}
//		for(int i=0; i<N;i++) {
//			count[i] += 1;
//			System.out.print(count[i]+" ");
//
//	}
				
		
///////////////////////////////////////////////////////////////////////////////////////	713공부
		
//		[1018번]				
		
//		문제
//		지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M*N 크기의 보드를 찾았다. 
//		어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 
//		지민이는 이 보드를 잘라서 8*8 크기의 체스판으로 만들려고 한다.
//		체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
//		변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 
//		따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 
//		하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
//		보드가 체스판처럼 칠해져 있다는 보장이 없어서, 
//		지민이는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
//		당연히 8*8 크기는 아무데서나 골라도 된다. 
//		지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
//		둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
//
//		출력
//		첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
//		
		
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		int min = N * M;
//		char [][] Chess = new char[N][M];
//		
//		char[][] Test1 = {
//				{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
//                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
//                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
//                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'}
//                };
//		
//		char[][] Test2 = {
//				{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
//                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
//                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
//                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'}
//                };
//			
//
//		 for( int i = 0 ;i < N ; i++){
//        String line = scan.next();
//        for(int j = 0; j < M ; j++){
//            Chess[i][j] = line.charAt(j);
//        }
//    }
//    for(int i =0 ; i < N-7 ; i++) {
//        for (int j = 0; j < M - 7; j++) {
//            int ChangeCount1 = 0;
//            int ChangeCount2 = 0;
//            int Exchange=0;
//            
//            for(int x = 0; x < 8; x++){
//                for(int y = 0; y < 8 ; y++){
//                    if(Chess[i+x][j+y] != Test1[x][y]){
//                        ChangeCount1++;                          
//                    }	                      
//                }
//            }
//            for(int x = 0; x < 8;x++){
//                for(int y = 0; y < 8 ; y++){
//                    if(Chess[i+x][j+y] != Test2[x][y]){
//                        ChangeCount2++;
//                       
//                    }
//                }
//            }
//            
//            Exchange = (ChangeCount1 > ChangeCount2) ? ChangeCount2 : ChangeCount1;
//            if(min > Exchange) min = Exchange;
//        }
//    }
//            System.out.print(min);


///////////////////////////////////////////////////////////////////////////////////////	713공부
		
//		[2309번]		(다시 보기)		
		
//		문제
//		왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다.
//		일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
//		아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 
//		뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//		아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
//
//		입력
//		아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며,
//		아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
//
//		출력
//		일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
//		
//		
//		int max = 100;
//		int number = 9;
//		int sum = 0;
//		int [] dwarfs = new int [number];
//		
//		for(int i = 0 ; i < 9; i++) {
//			dwarfs[i] = scan.nextInt();
//			sum += dwarfs[i]; 
//		}
//		
//		boolean check = false;
//		for(int i = 0; i < number; i++) {
//			for(int j = i+1; j < number; j++) {
//				if( sum - (dwarfs[i] + dwarfs[j]) == max) {
//					dwarfs[i] = -1;
//					dwarfs[j] = -1;
//					check = true;
//					break;
//				}
//			}
//		}
//		
//			Arrays.sort(dwarfs);
//			
//			for(int dwarf : dwarfs) {
//				if(dwarf != -1) {
//					System.out.println(dwarf);
//				}
//			}
//			
	
///////////////////////////////////////////////////////////////////////////////////////	713공부
		
//		[1476번]		
	
//		문제
//		준규가 사는 나라는 우리가 사용하는 연도와 다른 방식을 이용한다. 
//		준규가 사는 나라에서는 수 3개를 이용해서 연도를 나타낸다.
//		각각의 수는 지구, 태양, 그리고 달을 나타낸다.
//		지구를 나타내는 수를 E, 태양을 나타내는 수를 S, 달을 나타내는 수를 M이라고 했을 때, 이 세 수는 서로 다른 범위를 가진다. 
//		(1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
//		우리가 알고있는 1년은 준규가 살고있는 나라에서는 1 1 1로 나타낼 수 있다. 
//		1년이 지날 때마다, 세 수는 모두 1씩 증가한다. 만약, 어떤 수가 범위를 넘어가는 경우에는 1이 된다.
//		예를 들어, 15년은 15 15 15로 나타낼 수 있다. 
//		하지만, 1년이 지나서 16년이 되면 16 16 16이 아니라 1 16 16이 된다. 이유는 1 ≤ E ≤ 15 라서 범위를 넘어가기 때문이다.
//		E, S, M이 주어졌고, 1년이 준규가 사는 나라에서 1 1 1일때, 
//		준규가 사는 나라에서 E S M이 우리가 알고 있는 연도로 몇 년인지 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 세 수 E, S, M이 주어진다. 문제에 나와있는 범위를 지키는 입력만 주어진다.
//
//		출력
//		첫째 줄에 E S M으로 표시되는 가장 빠른 연도를 출력한다. 1 1 1은 항상 1이기 때문에, 정답이 음수가 나오는 경우는 없다.
		
		
//
//		Scanner scan = new Scanner(System.in);
//		int e = scan.nextInt(), s = scan.nextInt(), m = scan.nextInt();
//		
//		int year = 0;
//		while(true) {
//			year++;
//			if((year-e)%15 == 0 && (year-s)%28 == 0 && (year-m)%19 == 0) break;
//		}
//		System.out.print(year);
//	
	
///////////////////////////////////////////////////////////////////////////////////////	713공부
		
// 		[10992번]			
		
//		int n = scan.nextInt();
//		
//		for(int i=0;i<n;i++) { // 별의 범위에서 양 끝에 속하는 열을 출력해야 하므로, 0부터 시작한다.
//			// 예를들어 n이 4일 경우 첫 번째 행은 4번 열에만 별이 찍히고, 
//            // 두 번째 행은 4-1, 4+1 열에만 별이 찍히게 된다.
//	for(int j=1;j<2*n;j++) { // 열의 범위는 별 찍기-16과 동일하다.
//		if(j>n+i) break; // 마지막 별을 찍었으면 반복문을 벗어난다.
//		if(i==n-1) { // 마지막 행에 도착하면 모든 열에 별을 찍는다.
//			System.out.print("*");
//			continue;
//		}
//		if(j==n-i || j==n+i) { // 범위의 양 끝에 별을 찍는다.
//			System.out.print("*");
//		}else
//			System.out.print(" ");
//	}
//	System.out.println();
//	
//}
		
		
///////////////////////////////////////////////////////////////////////////////////////	715공부
		
//		[1026번]		
//		
//		System.out.println("N 값을 입력해주세요.");
//		int N = scan.nextInt();
//		int [] A = new int [N];
//		int [] B = new int [N];
//
//		int sum = 0;
//
//		
//		System.out.println("A 값을 입력해주세요.");
//		for(int i = 0; i < N; i++) {
//			A[i] = scan.nextInt();
//		}
//		
//		System.out.println("B 값을 입력해주세요.");
//		for(int i = 0; i < N; i++) {			
//			B[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(A);
//		Arrays.sort(B);
//		
//		for(int i = 0 ; i < N; i++) {
//			sum += A[i] * B[N - 1 - i];
//		}
//
//		System.out.println("최솟값은 " + sum);
//	
//	}
//		}
	
///////////////////////////////////////////////////////////////////////////////////////	715공부
		
//	[1032번]		

		
//		 String[] strArr;
//		 int count;
//		 String str="";
//		 boolean isSame=true;
//
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        
//        int n=Integer.parseInt(br.readLine().trim());
//        strArr=new String[n];
//        
//        for(int i=0;i<n;i++) {
//            strArr[i]=br.readLine();
//        }
//        
//        
//        for(int i=0;i<strArr[0].length();i++) {
//            for(int j=1;j<n;j++) {
//                if(strArr[0].charAt(i)==strArr[j].charAt(i)) {
//                    isSame=true;
//                }else {
//                    isSame=false;
//                    break;
//                }
//            }
//            if(isSame==false) {
//                str+="?";
//            }else {
//                str+=strArr[0].charAt(i);
//            }
//        }
//        System.out.println(str);
//        br.close();
		
		
///////////////////////////////////////////////////////////////////////////////////////	715공부

//		[1037번]		
		
//		System.out.println("N을 적어주세요.");
//		int N = scan.nextInt();
//		int [] arr = new int[N];
//		int max = 1;
//		
//		for(int i = 0; i < N; i++){
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		
//	
//			max = arr[0] * arr[N - 1];
//			System.out.println(max);
	
///////////////////////////////////////////////////////////////////////////////////////	715공부

//		[1920번]				
	
//		System.out.println("N을 적어주세요.");		
//		int N = scan.nextInt();
//		int [] sum = new int [N];
//		
//		int [] Narr = new int [N];		
//		for(int i = 0; i < N; i++) {
//			Narr[i] = scan.nextInt(); 
//		}
//		
//		System.out.println("M을 적어주세요.");
//		int M = scan.nextInt();
//		int [] Marr = new int [M];
//		for(int i = 0; i < N; i++) {
//			Marr[i] = scan.nextInt(); 
//		}
//		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				if(Marr[i] == Narr[j]) {
//					sum[i] = 1;
//					break;
//				}
//				else {
//					sum[i] = 0;		
//				}
//			}			
//		}
//		
//		for(int i = 0; i < N; i++) {
//			System.out.println(sum[i]);
//		}
//		

///////////////////////////////////////////////////////////////////////////////////////	716공부		
		
//		[1009번]	
		
		
//		System.out.println("T를 입력해주세요.");
//		int T = scan.nextInt();
//		int Last = 0;
//		
//		for(int i = 0; i < T; i++) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			
//			if((int) Math.pow(a, b) % 10 == 0) {
//				System.out.println(10);
//			}
//			else {
//			Last = (int) Math.pow(a, b) % 10;
//			System.out.println(Last);
//			}
//		}
//		
		
//		Scanner s = new Scanner(System.in);
//		int T = s.nextInt();
//		int a,b,r;
//		for(int j=0;j<T;j++) {
//			a=s.nextInt();
//			b=s.nextInt();
//			r=1;
//			
//			for (int i=0;i<b;i++) 
//			r=(r*a)%10;
//			if(r==0) r=10;
//			System.out.println(r);
//		}
//		
//	
		 	
///////////////////////////////////////////////////////////////////////////////////////	716공부		
		
//		[2420번]	
		
//		
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		
//		System.out.println(Math.abs(N - M));
		
///////////////////////////////////////////////////////////////////////////////////////	716공부		
		
//		[1913번]	 달팽이 [완료]
		
///import java.util.Scanner;
//
//public class TemplateA {
//
//    public static void main(String[] args) {
//    	Scanner scan = new Scanner(System.in);
//    	int size  = scan.nextInt();
//    	//크기를 담을 변수
//    	int tsize = size;
//    	//크기를 임시 저장할 변수
//    	int n = scan.nextInt();
//    	int max = size * size;
//    	//배열에 들어갈 총숫자가 들어갈 변수
//    	
//    	int [][] arr = new int[size][size];
//    	
//    	int j = 0;
//    	//열위치변수
//    	int i = -1;
//    	//행위치변수
//    	int count = 1;
//    	//행열에 더해줄 변수
//    	
//    	while(true) {
//    		for(int t = 1; t <= size; t++) {
//    			i += count;
//    			arr[i][j] = max;
//    			max--;
//    			//열고정 행변화 반복문
//    		}
//    		//처음에 행부터 하나씩 작아지면서 숫자를 너어줌
//    		size--;
//    		//열고정 행변화 반복문후 반복횟수 하나씩 적어짐
//    		if(size <= 0) {break;}
//    		//총사이즈가 0보다 작거나 같으면, 더이상 들어갈 자리가 없음
//    		for(int t = 1; t <=size; t++) {
//    			j += count;
//    			arr[i][j] = max;
//    			max--;
//    			//행고정 열변화 반복문
//    		}
//    		count *= -1;
//    	//한 루프가 다돌면 행열이 감소하거나 증가하는 순서가 바뀜
//    	//때문에 더해주는 값을 1 또는 -1 로 변경해주어야함	
//    	}
//    		
//    	int [] ans = new int [2];
//    		for(int x = 0; x < tsize; x++) {
//    			for(int y = 0; y < tsize; y++) {
//    				if(n == arr[x][y]) {
//    					ans[0] = x + 1;
//    					ans[1] = y + 1;
//        				//n의 값과 같은 위치를 저장하는 if 문
//    				}
//    				System.out.print(arr[x][y] + " ");
//    			}
//    		System.out.println();
//    	}
//    		System.out.println(ans[0] + " " + ans[1]);
//    }
//}
		
		
///////////////////////////////////////////////////////////////////////////////////////	716공부		
		
//		[1924번]		

//	        int month = scan.nextInt();
//	        int day = scan.nextInt();
//	        
//	        int sum = 0;
//	        
//	        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	        
//	        for(int i=1; i<=12; i++) { 
//	            if(i == month) {
//	                break;
//	            }
//	            sum += months[i];                  
//	        }
//	        
//	        sum += day;
//	        
//	        int left = sum % 7;
//	        switch(left) {
//	        
//	        case 0 : System.out.println("SUN"); break;
//	        case 1 : System.out.println("MON"); break;
//	        case 2 : System.out.println("TUE"); break;
//	        case 3 : System.out.println("WED"); break;
//	        case 4 : System.out.println("THU"); break;
//	        case 5 : System.out.println("FRI"); break;
//	        case 6 : System.out.println("SAT"); break;
//	        
//	        
//	        }
	        
///////////////////////////////////////////////////////////////////////////////////////	716공부		
		
//		[1924번]		
	        
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int temp = B;
//		int count = 2;
//		
//		while(true) {
//			if(temp % A == 0 ) {
//				System.out.println(temp);
//				break;
//			}else {				
//				temp = B * count;
//				count++;
//			}
//		}
	
	

///////////////////////////////////////////////////////////////////////////////////////	719공부		
		
//		[2875번]				

//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		int K = scan.nextInt();
//				
//		int count = 0;
//		int sum = N + M - K;
//		
//		
//		while(true) {
//			N -= 2;
//			M --;
//			if(N >= 2 && M >= 1 && count * 3 <= sum) {
//				count++;
//			}else {
//				break;
//			}
//		}
//		System.out.println(count);
//		
		
///////////////////////////////////////////////////////////////////////////////////////	720공부		
		
//	[5585]
		
//		int a = scan.nextInt();
//		int count = 0;
//		int temp = 1000 - a;
//		
//		while(true) {
//			if(temp >= 500 && temp < 1000) {
//				temp = temp -500;
//				count++;
//			}else if(temp >= 100 && temp < 500) {
//				temp = temp -100;
//				count++;
//			}else if(temp >= 50 && temp < 100) {
//				temp = temp -50;
//				count++;
//			}else if(temp >= 10 && temp < 50) {
//				temp = temp -10;
//				count++;
//			}else if(temp >= 1 && temp < 10) {
//				temp = temp -1;
//				count++;
//			}else if(temp == 0) {
//				break;
//			}else {
//				System.out.println(-1);
//			}
//			
//			}
//		System.out.println(count);
		
//		int money = 1000 - scan.nextInt(); 
//		int[] array = {500,100,50,10,5,1}; 
//		int idx = 0; 
//		int ans = 0; 
//		
//		while(money != 0) { 
//			int change = money / array[idx]; 
//			money -= change * array[idx++]; 
//			ans += change;
//			} 
//		
//		System.out.println(ans);


///////////////////////////////////////////////////////////////////////////////////////	720공부		
		
//		[11047]	
		
		//오름차순 풀이
//		System.out.println("n을 입력해주세요");
//		int n = scan.nextInt();
//		System.out.println("가격을 입력해주세요");
//		int price = scan.nextInt();
//		int [] value = new int [n];
//		int count = 0;
//		
//		System.out.println("돈의 가치를 입력해주세요");
//		for(int i = 0; i < n; i++) {
//			value[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(value);
//		
//		int changes = 0;
//		int temp = n-1;
//		while(price != 0) {
//			changes = price / value[temp];
//			price -= changes * value[temp--];
//			count += changes;
//		}
//		
//		System.out.println("지불해야 하는 돈의 수");
//		System.out.println(count);
		

//		내림차순 풀이
//		System.out.println("n을 입력해주세요");
//		int n = scan.nextInt();
//		System.out.println("가격을 입력해주세요");
//		int price = scan.nextInt();
//		Integer [] value = new Integer [n];
//		int count = 0;
//		
//		System.out.println("돈의 가치를 입력해주세요");
//		for(int i = 0; i < n; i++) {
//			value[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(value,Collections.reverseOrder());
//	
//		
//		int changes = 0;
//		int temp = 0;
//		while(price != 0) {
//			changes = price / value[temp];
//			price -= changes * value[temp++];
//			count += changes;
//		}
//		
//		System.out.println("지불해야 하는 돈의 수");
//		System.out.println(count);
//		
				

		
///////////////////////////////////////////////////////////////////////////////////////	722공부				
		
//		[10610] 그리디 		
//		String str;
//	    int[] numCountArr;
//	    long strLen;
//		
//        Scanner sc = new Scanner(System.in);
//        str= sc.nextLine();
//        
//        strLen = str.length();
//        numCountArr = new int[10];
//        long total = 0;
//        for(int i=0; i < strLen; i++) {
//            int tNum = Integer.parseInt(str.substring(i, i+1));
//            numCountArr[tNum] += 1;
//            total+=tNum;
//        }
//        
//        
//        // 0이 존재하지 않으면 30 배수 조차도 될 수 없다.
//        // 각 자리수의 총 합이 3의 배수가 아니면 종료해야한다.
//        if(!str.contains("0") || total % 3 != 0) {
//            System.out.println("-1");
//            return;
//        }
//        
//        StringBuilder sb = new StringBuilder();
//        for(int i = 9; i >= 0; i--) {
//            while(numCountArr[i] > 0) {
//                sb.append(i);
//                numCountArr[i]--;
//            }
//        }
//        System.out.println(sb.toString());
        
///////////////////////////////////////////////////////////////////////////////////////	723공부

		
//		[1783] (이해 전혀 안도미)		
		
//		 1. 나이트는 N * M 체스판의 가장 왼쪽 아래 칸에 위치
//		    2. 2상1우, 1상2우, 1하2우, 2하1우로만 움직일 수 있음
//		    3. 최대한 많은 칸을 방문하고 싶어한다.
//		    4. 만약 이동 횟수가 4회 초과라면, 위의 이동 방법을 한 번씩 이용해야 한다.
//		    5. 나이트가 방문할 수 있는 최대 칸의 갯수. 처음의 칸도 센다.
//		    나이트는 (N-1,0)에 위치하고 있다. 여기서부터 상하좌우로 4번까지는 자유롭게 이동.
//		    4번의 횟수가 채워지면, 위의 2번의 방향을 모두 가야함. 갈 수 없는 경우는 return.
//		*/
//		#define _CRT_SECURE_NO_WARNINGS
//		#include<cstdio>
//		 
//		int N, M;    // N행 M열
//		int total_cnt;
//		 
//		int main() {
//		 
//		    scanf("%d %d", &N, &M);
//		 
//		    if (N == 1);    
//		    else if (N == 2) {     
//		        total_cnt = (M - 1) / 2;
//		        total_cnt = total_cnt > 3 ? 3 : total_cnt;
//		    }
//		    else if (M < 7) {
//		        total_cnt = M - 1;
//		        total_cnt = total_cnt > 3 ? 3 : total_cnt;
//		    }
//		    else
//		        total_cnt = 4 + M - 7;
//		 
//		    printf("%d\n", total_cnt+1);
//		    return 0;
//		}
		
		
//		[1931] [다시 한 번 더 보기]
		
//		int n = scan.nextInt();
//		int [][] times = new int[n][2];
//		int count = 0;
//		
//		int min = -1;
//		
//		for(int i = 0; i < n; i++) {
//			times[i][0] = scan.nextInt();
//			times[i][1] = scan.nextInt();
//		}
//		
//		Arrays.sort(times, (a,b) -> a[1] == b[1]? a[0] - b[0] : a[1] - b[1] );
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(times[i][0]);
//			System.out.print(times[i][1]);
//			System.out.println();
//		}
		
//		
//		for(int i = 0; i < n; i++) {
//			if(times[i][0] >= min) {
//				min = times[i][1];
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		[11399]
		
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		
//		
//		for(int i = 0; i <n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		
//		int sum = arr[0];
//		for(int i = 1; i <n; i++) {
//			arr[i] = arr[i-1] + arr[i];
//			sum += arr[i];
//		}
//		System.out.println(sum);
		
//		[2873] [ 행이나 열이 홀수가 하나라도 있을때 풀이]
//		둘다 짝수일 경우에는 수식을 바꾸어야 한다. 구찬....
		
		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		
//		int [][] roll = new int [n][m];
//		
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				roll[i][j] = scan.nextInt();
//			}
//		}
//		
//		String [] cos = new String [n * m];
//		int count = 0;
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < m; j++) {
//				if(j < m-1 && i % 2 == 0) {
//				cos[count] = "R";
//				count++;
//				}else if(j == m-1) {
//					cos[count] = "D";
//					count++;
//				}else {
//					cos[count] = "L";
//					count++;
//				}
//			}
//		}		
//		for(int i = 0; i < n*m -1; i++) {
//			System.out.print(cos[i]);
//		}
//
//		}
		
	
		
//		[1744]
		
//		[모든수가 양수일때는 답이 안나옴]
//		int n = scan.nextInt();
//		
//		int [] arr = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		
//		int sum = 0;
//		int temp = arr.length -1;
//		for(int i = n; i > 0; i--) {
//			if((arr[temp] < 0 || arr[temp -1] < 0) && temp >= 1) {
//						sum += arr[temp];
//						temp--;
//					}else if(temp >= 1 && arr[temp-1] > 0 && arr[temp] > 0 ) {
//						sum += arr[temp] * arr[temp -1]; 
//						temp = temp - 2;
//						}else {
//						sum += arr[0];
//						break;
//			}
//		}
//		
//		System.out.println(sum);
	
		
//	    int n = scan.nextInt();
//	    int[] array = new int[n];
//	    long ans = 0;
//	 
//	    for (int i = 0; i < n; i++) {
//	        array[i] = scan.nextInt();
//	    }
//	 
//	    Arrays.sort(array);
//	    
//	    int left = 0;
//	    int right = n - 1;
//	    ans = 0;
//	    // -
//	    for (; left < right; left += 2) {
//	        if (array[left] < 1 && array[left + 1] < 1) {
//	            ans += array[left] * array[left + 1];
//	        } else {
//	            break;
//	        }
//	    }
//	    // +
//	    for (; right > 0; right -= 2) {
//	        if (array[right] > 1 && array[right - 1] > 1) {
//	            ans += array[right] * array[right - 1];
//	        } else {
//	            break;
//	        }
//	    }
//
//	    for (; right >= left; right--) {
//	        ans += array[right];
//	    }
//	    System.out.println(ans);
//	

		
		
///////////////////////////////////////////////////////////////////////////////////////	724공부		
		
		
//		[1138]
	

//		int n = scan.nextInt();
//		
//		int tall [] = new int[n+1];
//		List<Integer>ans = new ArrayList<>();
//		
//		
//		for(int i = 1; i < n; i++) {
//			tall[i] = scan.nextInt();
//		}
//		
//		for(int i = n; i >= 1; i--) {
//			ans.add(tall[i], i);
//			System.out.println(ans);
//		}
		
		

//		[2437]다음 배열의 값이 누적합 + 1 의 값보다 크면 누적합 +1 이 만들수 없느 최소의 값이 된다.
		
//		int n = scan.nextInt();		
//		int kg [] = new int[n];
//		
//		
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			kg[i] = scan.nextInt();		
//		}
//		Arrays.sort(kg);
//		
//		loop : for(int i = 0; i < n; i++) {
//			if(sum + 1 < kg[i]) {
//				break loop;
//			}
//			
//			sum += kg[i];
//			System.out.println(sum);
//		}
//		
//		if(sum > 1) {
//			System.out.println(sum + 1);
//		}else {
//			System.out.println(1);
//		}
		
	
//		[2437]		
		
		
		//배열 활용
//		int n = scan.nextInt();
//		int k = scan.nextInt();
//		int temp = scan.nextInt();
//		int ten = (int) Math.pow(10, n);
//		
//		Integer [] num = new Integer[n];
//		
//		for(int i = 0; i < n ; i++) {
//			if(i < n -1) {
//				num[i] = temp / ten;
//				temp = temp - (temp / ten) * ten;
//				ten /= 10;
//			}else {
//				num[i] = temp % 10;
//			}
//			
//		}
//		
//		Arrays.sort(num, Collections.reverseOrder());
//		
//	
//		for(int i = 0; i < k ; i++) {
//			System.out.print(num[i] );
//		}


		
///////////////////////////////////////////////////////////////////////////////////////	727공부		
				
		
		
//		[1507]			[다시 한 번 보기]	
//		int n = scan.nextInt();
//
//		int[][] dist = new int[n + 1][n + 1];
//		int[][] a = new int[n + 1][n + 1];
//		boolean[][] c = new boolean[n + 1][n + 1];
//		int ans = 0;
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				int d = scan.nextInt();
//				dist[i][j] = d;
//				a[i][j] = d; 
//			}
//		}             
//
//		for (int k = 1; k <= n; k++) {
//			for (int i = 1; i <= n; i++) {
//				for (int j = 1; j <= n; j++) {
//					if (i == k || j == k) {
//						continue;
//					}					
//					if (dist[i][j] > dist[i][k] + dist[k][j]) {
//						System.out.println(-1);
//						return;
//					}					
//					if (dist[i][j] == dist[i][k] + dist[k][j]) {
//						a[i][j] = 0;
//					}
//
//				}
//
//			}
//
//		}
//		
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (a[i][j] != 0 && !c[i][j]) {
//					ans += a[i][j];					
//					c[i][j] = true;
//					c[j][i] = true;
//				}
//
//			}
//			
//		}
//
//		System.out.println(ans);
//		
	
	
	
/////////////////////////////////////////////////////////////////////////////////////	802공부	
	
	
//		[11404]		[다시 한번 보기]
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = null;
//        
//        cityCount = Integer.parseInt(br.readLine());
//        
//        int busCount = Integer.parseInt(br.readLine());
//        
//        distance = new int[cityCount+1][cityCount+1];
//        
//        for(int i=1; i <= cityCount; i++) {
//            for(int j=1; j <= cityCount; j++) {
//                if(i == j) continue;
//                distance[i][j] = INF;
//            }
//        }
//        
//        while(busCount-- > 0) {
//            st = new StringTokenizer(br.readLine());
//            
//            int start = Integer.parseInt(st.nextToken());
//            int end = Integer.parseInt(st.nextToken());
//            int time = Integer.parseInt(st.nextToken());
//            
//            distance[start][end] = Math.min(distance[start][end], time);    
//        }
// 
//        floydWarshall();
//        print();
//    }
//    
//    public static void floydWarshall() {
//        // 기준이 되는 거쳐가는 노드 K
//        for(int k = 1; k <= cityCount; k++) {
//            // 출발하는 노드 i
//            for(int i=1; i <= cityCount; i++) {
//                // 도착하는 노드 j
//                for(int j=1; j <= cityCount; j++) {
//                    //i에서 k를 거쳤다가 k에서 j 까지 가는 거리와 i에서 j 까지 가는 거리를 비교해서 작은 값이 최소거리이다.
//                    distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
//                }
//            }
//        }
//    }
//    
//    public static void print() {
//        StringBuilder sb = new StringBuilder();
//        for(int i=1; i <= cityCount; i++) {
//            for(int j=1; j <= cityCount; j++) {
//                if(distance[i][j] >= INF) sb.append("0 ");
//                else sb.append(distance[i][j] + " ");
//            }
//            sb.append("\n");
//        }
//        
//        System.out.println(sb.toString());
//		
//		
//		
//		
//	}	
//    public static int cityCount;
//    public static int[][] distance;
//    public static final int INF = 1000000000;

		
		
/////////////////////////////////////////////////////////////////////////////////////	803공부			
		
//		[2262]

// 순서 바꾸기가 된다면 최솟값		
//		int n = scan.nextInt();
//		
//		Integer [] rank = new Integer [n];
//		int min = 0;
//		
//		for(int i = 0; i < n; i++) {
//			rank[i] = scan.nextInt(); 
//		}
//		
//		Arrays.sort(rank);
//		
//		
//		int num = n - 1;
//			loop : for(int i = 0 ; i < n; i++) {
//				if(num < 0) {
//					break loop;
//				}else if (num == 0) {
//					min += rank[num];
//					break loop;
//				}else {
//					min += (rank[num] - rank[num-1]);
//					num = num -2;
//				}
//			}
//		System.out.println(min);
//			
			
// 순서 고정 최솟값			
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		//int[] arr = new int[n];
//		List<Integer> list = new ArrayList<Integer>();
//		int min = 0;
//		
//		for(int i=0; i<n; i++) 
//			list.add(scan.nextInt());
//			
//		int max = n;	// 가장 랭킹이 낮은(숫자가 높은) 선수 
//		for(int i=0; i<n-1; i++) {
//			int idx = list.indexOf(max);	// 랭킹이 낮은 선수의 인덱스
//			
//			// 랭킹이 가장 낮은 선수가 가장 앞에 있을경우 => 그 뒤 선수와의 차이
//			if(idx == 0)
//				min += list.get(idx) - list.get(idx + 1);
//			// 랭킹이 가장 낮은 선수가 가장 끝에 있을경우 => 그 앞 선수와의 차이
//			else if(idx == list.size()-1) 
//				min += list.get(idx) - list.get(idx -1);
//			
//			// 랭킹이 가장 낮은 선수가 중앙 어딘가에 있을경우 => 앞, 뒤 선수중 차이가 작은 선수와 매칭
//			else
//				min += Math.min(list.get(idx) - list.get(idx-1), list.get(idx) - list.get(idx+1));
//			
//			list.remove(idx);	// 랭킹이 가장 높은 선수는 매칭이 끝났으므로 제거,
//			max --;
//			System.out.println(min);
//		}
//		
//		System.out.println(min);
//		scan.close();

		
		
/////////////////////////////////////////////////////////////////////////////////////	803공부			
		
//		[2885]		[완료]
		
//		
//		int k = scan.nextInt();	
//		int size = 1;
//		int count = 0;
//		int size2 = 0;	
//		
//		while(size < k) {
//			size = size * 2;
//			size2 = size;
//		}
//		
//		while(k > 0) {
//			if(k>=size) {
//				k-=size;
//			}else {
//				size /= 2;
//				count++;
//			}
//		}
//		
//		System.out.println(size2+" " + count);
	
	
	
/////////////////////////////////////////////////////////////////////////////////////	805공부	
	
//		[2431] [ 풀다맘 알풀림]
		
//		int n = scan.nextInt();
//		
//		int [] arr = new int [n];
//		for(int i = 0; i < n; i ++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for(int i = 0; i < n; i ++) {
//			loop : for(int j = n-1; j >= 0; j --) {
//				if(arr[i] - 1 == arr[j]) {
//					arr[i] = arr[j];
//					break loop;
//				}
//			}
//		}
//		
//		for(int i = 0; i < n; i ++) {
//			System.out.print(arr[i] + " ");
//		}
	
	
	
///////////////////////////////////////////////////////////////////////////////////	806공부	
	
//		[2217]		[완료]
		
//		int n = scan.nextInt();
//		int[] arr= new int [n];
//		int max = 0;
//		
//		for(int i = 0; i <n; i++) {
//			arr[i] = scan.nextInt();
//			
//		}	
//		
//		max = arr[0] * n;
//		int count = n - 1;
//		
//		for(int i = 1; i < n-1; i++) {
//			if(arr[i] * count > max) {
//				max = arr[i] * count;
//			}
//			count--;
//		}
//		
//		System.out.println(max);
		
///////////////////////////////////////////////////////////////////////////////////	809공부		
	
//		[1541] [ 다시 한 번 쭉 훓어보기]
		
//		Scanner sc=new Scanner(System.in);
//        String input = sc.nextLine();
//        String [] arr = input.split("\\-");
//        
//        int result = add(arr[0]);
//        for(int i = 1; i<arr.length; i++) {
//            result -= add(arr[i]);
//        }
//        System.out.println(result);
//        
//    }
//    
//    public static int add(String i) {
//        String []arr = i.split("\\+");
//        int result=0;
//        for(String k : arr) {
//            result+=Integer.parseInt(k);
//        }
//        
//        return result;
//	}
	
///////////////////////////////////////////////////////////////////////////////////	810공부		
		
//		[1120] [완료]
		
//		String A = scan.next();
//		String B = scan.next();
//		
//		int maxSame = 0;
//		
//		for(int i = 0; i < B.length() - A.length() + 1; i++) {
//			String tempB = B.substring(i, i + A.length());
//			System.out.println(tempB);
//			//B의 문자열을 한칸씩 밀어가면서 A의 문자열과 비교하기 위한변수
//			
//			int same = 0;
//			for(int j = 0 ; j < tempB.length(); j++) {
//				if(A.charAt(j) == tempB.charAt(j)) {
//					same++;
//					//A와 B를 비교하여 같으면 더해줌
//				}
//			}
//			if(same > maxSame) {
//				maxSame=same;
//			}
//			
//		}
//	
//		System.out.println(A.length() - maxSame);
//		//전체 A의 길이에서 B와 같은 만큼을 빼줌
	
/////////////////////////////////////////////////////////////////////////////////	812공부		
		
//		[1049] 	
		
		
//		  Scanner sc = new Scanner(System.in);
//	        
//	        int N = sc.nextInt();
//	        int M =sc.nextInt();
//	        int Min = Integer.MAX_VALUE;
//	 
//	        int[] unit = new int[M];
//	        int[] pack = new int[M];
//	        for(int i=0; i<M; i++){
//	            pack[i] = sc.nextInt();
//	            unit[i] = sc.nextInt();
//	        }
//	        Arrays.sort(unit);
//	        Arrays.sort(pack);
//	        
//	        //가장 싼 6개짜리 팩 구매 vs 가장 싼 낱개 구매 vs (가장싼 6개짜리 팩 + 낱개)
//	        Min = Math.min(((N/6)+1)*pack[0], N*unit[0]);    // 만약 n이 6의 배수일 경우 조건문처리해주어야 한다.
//	        Min = Math.min(Min, ((N/6))*pack[0] + (N%6)*unit[0]);
//	        
//	        System.out.println(Min);
//	
		
		
/////////////////////////////////////////////////////////////////////////////////	813공부				
		
		
//		[2529] 			[이해안됨]
	
			
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.next().toCharArray()[0];
//		}
//
//		go(0, "");
//		Collections.sort(ans);
//
//		System.out.println(ans.get(ans.size() - 1));
//		System.out.println(ans.get(0));
//
//		
//
//	}
//	static boolean[] check = new boolean[10]; // 0~9까지 check
//	static int n;
//	static char[] a = new char[10]; // 부등호는 최대 9개임
//	static ArrayList ans = new ArrayList<>();
//
//	static boolean ck(char a, char b, char c) {
//		if (c == '<') {
//			if (a > b) {
//				return false;
//			}
//		}
//		if (c == '>') {
//			if (a < b) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	static void go(int index, String num) {
//		if (index == n + 1) {
//			ans.add(num);
//			return;
//		}
//
//		for (int i = 0; i <= 9; i++) {
//			if (check[i])
//				continue;
//			if (index == 0 || ck(num.charAt(index - 1), (char) (i + '0'), a[index - 1])) {
//				check[i] = true;
//				go(index + 1, num + Integer.toString(i));
//				check[i] = false;
//			}
//		}
		
		
//		[1427]
		
//		String n =scan.next();
//		Integer [] arr= new Integer [n.length()];
//		
//		for(int i = 0 ; i < n.length(); i++) {
//			arr[i] = Integer.parseInt(n.substring(i, i+1));
//		}
//		
//		
//		Arrays.sort(arr,Collections.reverseOrder());
//		
//		for(int i = 0; i < n.length(); i++) {
//			System.out.print(arr[i]);
//		}
		
		
//		[10989]		
//		
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		
//		for(int i = 0; i <n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		Arrays.sort(arr);
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
		

//		[11650] 좌표 정렬하기 [완료]
		
//		import java.util.Arrays;
//		import java.util.Comparator;
//		import java.util.Scanner;
//
//		public class TemplateA {
//
//		    public static void main(String[] args) {
//		    	Scanner scan = new Scanner(System.in);
//		    	
//		    	int n = scan.nextInt();
//		    	
//		    	int [][] arr = new int [n][2];
//		    	
//		    	for(int i = 0; i < n; i++) {
//		    		for(int j = 0; j < 2; j++) {
//		    			arr[i][j] = scan.nextInt();
//		    		}
//		    	}
//		    	
//		    	Arrays.sort(arr, new Comparator<int []>() {
//		    		@Override
//		    		public int compare(int o1[], int o2[]) {
//		    			if(o1[0] == o2[0]) {
//		    				return o1[1] - o2[1];
//		    				//1열의 값이 같을 경우 2열의 값을 비교
//		    				//작은 값이 위로 가게 정렬 리턴
//		    			}else {
//		    				return o1[0] - o2[0];
//		    				//1열부터 값이 차이가 있는 경우 1열을 기준으로 정렬 리턴
//		    			}	
//		    		}
//		    	});
//		    	
//		    	for(int i = 0; i < n; i++) {
//		    		for(int j = 0; j < 2; j++) {
//		    			System.out.print(arr[i][j]+ " ");
//		    		}
//		    		System.out.println();
//		    	}
//		    	
//		    	
//		    }
//		}

		
/////////////////////////////////////////////////////////////////////////////////	814공부					
		
		
//		[1912]		[연속합]
		
//			BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
//	        int N = Integer.parseInt(br.readLine());
//	        String[] str = br.readLine().split(" ");
//	        int[] arr = new int[N];
//	        int[] dp = new int[N];
//	        int max;
//	        for (int i = 0; i < N; i++) {
//	            arr[i] = Integer.parseInt(str[i]);
//	         }
//	        dp[0] = arr[0];
//	        max = arr[0];
//	        for(int i=1; i<N; i++){
//	            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
//	            
//	            max = Math.max(max, dp[i]);
//	        }
//	        System.out.println(max);
		
///////////////////////////////////////////////////////////////////////////////	816공부			
		
//		[2163] 초콜릿자르기		
		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//
//		int min = 0;
//		
//		min = (n-1) + n * (m-1);
//		System.out.println(min);
		

//		[1475] 방 번호 [완료]
		
//			Scanner scan = new Scanner(System.in);
//			String n = scan.next();
//			 
//	        int Nsize = n.length();
//	        int[] needSet = new int[10];
//	        int temp = 0;
//	        int max = 0;
//	 
//	        //counting 배열을 사용하였다.
//	        for (int i = 0; i < Nsize; i++) {
//	            temp = n.charAt(i) - '0';
//	            needSet[temp]++;
//	        //입력된 숫자가 있는 곳에 ++연산 수행    
//	 
//	        }
//
//	        //6,9를 바꿔서 사용할 수 있다.
//	        int k = (needSet[6] + needSet[9]);
//	        //6,9의 합이 짝수이면 반으로 나누면 된다.
//	        if (k % 2 == 0) {
//	            needSet[6] = k / 2;
//	            needSet[9] = k / 2;
//	        }
//	        
//	        else {
//	            needSet[6] = k / 2 + 1;
//	            needSet[9] = k / 2 + 1;
//	        }
//	        //6,9의 합이 홀수이면 반으로 나눠도 1번 더 사용해야되기 때문에 1을 더해준다.
//	        
//	        for (int i : needSet) {
//	            max = Math.max(max, i);
//	        }
//	        System.out.println(max);
//	        //가장 많은 번호가 있는 배열의 위치를 찾는다.
//	        //세트당 번호는 하나이기 때문이다.
		
//		[1094] 막대기
		
//		int X = scan.nextInt();
//		int result=0;
//		int len = 64;
//		int cnt=0	;
//		int end = X;
//		while(true) {
//			if(X == 64) {
//				cnt++;
//				break;
//			}
//			
//			len = len/2;
//			
//			if(X >= len) {
//				result += len;
//				cnt++;
//				if(end==result)
//				{
//					break;
//				}
//				X = X - len;
//			}
//		}
//		System.out.println(cnt);
		
		
//		[3046] 막대기		
//		
//		int R1 = scan.nextInt();
//		int S = scan.nextInt();
//		
//		int R2 = 2*S -R1;
//		System.out.println(R2);
		
//		[1904] 01타일 [피보나치]
		
//		int n = scan.nextInt();
//		int a = 1;
//		int b = 1;
//		int sum = 0;
//		int count = 1;
//		
//		while(true) {
//			if(n == 1) {
//				System.out.println(b);
//				break;
//			}
//			count++;
//			sum = a + b;
//			a = b;
//			b = sum;
//		
//		if(n == count) {
//			System.out.println(b);
//			break;
//		}
//		}
		
///////////////////////////////////////////////////////////////////////////////	817공부
		
//		[1977]	완전제곱수
	
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		int n = 1;
//		int sum = 0;
//		int min = 10000;
//		
//		while(M >= Math.pow(n, 2)) {
//			if(N <= Math.pow(n, 2) && M >= Math.pow(n, 2)) {
//				sum +=  Math.pow(n, 2);
//				if(Math.pow(n, 2) < min) {
//					min = (int) Math.pow(n, 2);
//				}
//				n++;
//			}else {
//				n++;
//			}
//		}
//		System.out.println(sum + " " + min);
		
//		[1107]	리모컨		[이해 안됨]
		
//		int n = scan.nextInt(); // 이동 원하는 채널
//		int m = scan.nextInt(); // 고장난 채널 갯수
//		for (int i = 0; i < m; i++) {
//			int x = scan.nextInt();
//			broken[x] = true; // 트루면 고장!
//		}
//
//		int ans = Math.abs(n - 100);
//		/*
//		 * 초기 채널은 100이다. 모든 리모콘의 숫자버튼이 고장났을 경우 +-버튼으로만이동 가능하도록 초기값을 설정해준다.
//		 */
//
//		// 0부터 1000000까지 모든 채널을 돌면서 N으로 가장 적은 버튼을 눌러 이동할 수 있는 채널을 찾는다.
//		for (int i = 0; i < 1000000; i++) {
//			int c = i;
//			int len = possible(c);
//			// len 변수: c로 숫자버튼만을 이용해서 이동이 가능한지, 가능하다면 몇 번의 버튼을 누르는지 구하는 변수
//			if (len > 0) {
//				int press = Math.abs(c - n);
//				// press: 숫자버튼으로 n에 최대한 인접하게 이동한후 +또는 -를 몇 번 눌러야 하는지 구하는 변수
//				if (ans > len + press) {
//					ans = len + press;
//				}
//
//			}
//
//		}
//		System.out.println(ans);
//		
//		
//		
//		
//		
//		}
//	
//	public static class Exam1107_2 {
//
//		boolean[] broken = new boolean[10]; // 0~10
//
//		 int possible(int c) {
//			if (c == 0) { //0일때 예외처리
//				if (broken[0]) {
//					return 0;
//				} else {
//					return 1;
//				}
//			}
//			int len = 0;
//			while (c > 0) {
//				if (broken[c % 10]) {
//					return 0;
//				}
//				len += 1;
//				c /= 10;
//			}
//			return len;
//		}
		
		
//		[1057]		
		
//		int N = scan.nextInt();
//		int Kim = scan.nextInt();
//		int Yim	= scan.nextInt();
//		int count = 0;
//		
//		while(Kim != Yim) {
//			Kim = Kim/2 + Kim%2;
//			Yim = Yim/2 + Yim%2;
//			count ++;
//		}
//		System.out.println(count);
		

//		[2010] 플러그
		
//		int N = scan.nextInt();
//		int [] plug = new int [N];
//		int sum = 0;
//		
//		for(int i = 0; i < N; i++) {
//			plug[i] = scan.nextInt() - 1;
//			sum += plug[i];
//			}
//		if(sum == 0) {
//			sum = 1;
//		}
//			System.out.println(sum);
		
		
//		[1463] 1로 만들기
		
//		int n = scan.nextInt();
//		int count = 0;
//		
//		while(n != 1) {
//			if(n % 3 == 0) {
//				n = n / 3;
//				count++;
//			}else if((n - 1) % 3 == 0) {
//				n = n - 1;
//				count++;
//			}else if(n % 2 == 0 && n % 3 != 0) {
//				n = n / 2;
//				count++;
//			}else {
//				n = n - 1;
//				count++;
//			}
//		}
//		
//		System.out.println(count);
		
		
///////////////////////////////////////////////////////////////////////////////	818공부		

//		[9095] 1,2,3 더하기
		
//		int t = scan.nextInt();
//		int n;
//		
//		int [] output = new int[11];
//		output[1] = 1;
//		output[2] = 2;
//		output[3] = 4;
//	
//		for(int i = 0; i < t; i++) {
//			n = scan.nextInt();
//		
//			for(int j = 4; j < n; j++) {
//				output[j] = output[j - 1] + output [ j - 2] + output[j - 3];
//			}
//			System.out.println(output[n]);
//		}
		
//		[2914] 저작권
	//		
	//		double music = scan.nextInt();
	//		double Ave = scan.nextInt();
	//		
	//		double lin = music * (Ave -1) + 1;
	//		
	//		int rlin = (int) lin;
	//		
	//		System.out.println(rlin);
				
/////////////////////////////////////////////////////////////////////////////	820공부		
		
		
//		[2579] 계단오르기 [다시보기 난이도 중]
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		int f[] = new int[T+1];
//		int cache[] = new int[T+1];
//		for(int i = 1; i<=T; i++){
//		f[i] = Integer.parseInt(br.readLine());
//		}
//		cache[1] = f[1];
//		cache[2] = f[2]+f[1];
//		cache[3]= Math.max(f[1]+f[3], f[2]+f[3]);
//		for(int i=4; i<=T; i++){
//		cache[i] = Math.max(cache[i-3]+f[i]+f[i-1], cache[i-2]+f[i]);
//		}
//		System.out.println(cache[T]);

		
//		[2748] 피보나치 수 2
		
//		int n = scan.nextInt();
//		
//		int a = 0;
//		int b = 1;
//		int sum = 0;
//		
//		loop : for(int i = 1; i < n ; i++) {
//			if( n == 1) {
//				System.out.println(a);
//				break loop;
//			}
//			else if( n == 2 ) {
//				System.out.println(b);
//				break loop;
//			}
//			else {
//			sum = a + b;
//			a = b;
//			b = sum; 
//			}		
//			}
//		
//		System.out.println(sum);
		
		
/////////////////////////////////////////////////////////////////////////////	821공부		
		
//		[9461]		
		
//		int n = scan.nextInt();
//		
//		int [] pado = new int [101];
//		
//		pado[1] = 1;
//		pado[2] = 1;
//		pado[3] = 1;
//		pado[4] = 2;
//		pado[5] = 2;
//		
//		if(n >= 6) {
//		
//		for(int i = 6; i <=n; i++) {
//			pado[i] = pado[i - 1] + pado[i - 5];
//		}
//		
//		}else {
//			System.out.println(pado[n]);
//		}
//		
//		System.out.println(pado[n]);
		
		
//		[2455] 지능형 기차
		
//		int [][] Station = new int [5][3];
//		int max = 0;
//		int sum = 0;
//		
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 1; j <= 2; j++) {
//				Station[i][j] = scan.nextInt();
//				if(j == 1) {
//					sum -= Station[i][j];
//				}else {
//					sum += Station[i][j];
//				}
//			}
//			if(sum > max)
//				max = sum;
//		}
//		
//		System.out.println(max);
	
	
//		[13458] 시험감독 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt(); // 총 시험장의 수
//		int supervisorCount = 0;
//		int [] studentCount = new int [N]; // 강의실별 학생의 수
//		for(int i = 0; i < N; i++) {
//			studentCount[i] = scan.nextInt();
//		}
//		int B = scan.nextInt(); // 총 감독관은 강의실당 한명이며, 총감독관의 감독할 수 있는 학생의 수
//		int C = scan.nextInt(); // 부 감독관은 여러명일 수 있다. 부 감독관이 감독할 수 있는 학생의 수
//		
//		for(int i = 0; i < N; i++) {
//			studentCount[i] = studentCount[i] - B;
//			supervisorCount++;
//			if(studentCount[i] > 0) {
//				loop : while(true) {
//					studentCount[i] = studentCount[i] - C;
//					supervisorCount++;
//					if(studentCount[i] <= 0) {
//						break loop;
//					}else {
//						continue;
//					}
//				}
//			}
//		}
//
//	
//		System.out.println(supervisorCount);
		
		
/////////////////////////////////////////////////////////////////////////////	822공부				
		
//		[2475]		
		
//		int [] arr = new int [5];
//		int sum = 0;
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//			sum += Math.pow(arr[i], 2);
//		}
//		
//		System.out.println(sum % 10);

		
//		[1699]
		
//		이식은 11까지 만됨..
//		int n = scan.nextInt();
//		
//		int [] arr = new int [10000];
//		int [] temp = {0, 1, 2, 3, 4, 2};
//
//		arr[1] = 1; 
//		arr[2] = 2;
//		arr[3] = 3;
//		
//		if(n > 3) {
//			n = n - 3;
//			n = n % 5;
//		}else {
//			System.out.println(arr[n]);
//		}
//
//		System.out.println(temp[n]);
		
//		int n = scan.nextInt();
//		
//		int[] dp = new int[n+1];
//		dp[1] = 1;
//		for(int i = 2; i < n+1; i++) {
//			dp[i] = i;
//			for(int j = 1; j*j <= i; j++)
//				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
//		}
//		
//		System.out.println(dp[n]);
	
/////////////////////////////////////////////////////////////////////////////	824공부
		
		
//		[1212]
//		
//	        String[] eight = {"000","001","010","011","100","101","110","111"};
//	        String s = scan.nextLine();
//	        boolean start = true;
//	        if (s.length() == 1 && s.charAt(0) == '0') {
//	            System.out.print(0);
//	        }
//	        for (int i=0; i<s.length(); i++) {
//	            int n = s.charAt(i) - '0';
//	            if (start == true && n < 4) {
//	                if (n == 0) {
//	                    continue;
//	                } else if (n == 1) {
//	                    System.out.print("1");
//	                } else if (n == 2) {
//	                    System.out.print("10");
//	                } else if (n == 3) {
//	                    System.out.print("11");
//	                }
//	                start = false;
//	            } else {
//	                System.out.print(eight[n]);
//	                start = false;
//	            }
//	        }
//	        System.out.println();
		
//		[10156]
//		
//		int snackPrice = scan.nextInt();
//		int snackNumber = scan.nextInt();
//		int haveMoney = scan.nextInt();
//		
//		int needMoney = 0;
//	
//		if(snackPrice * snackNumber > haveMoney) {
//			needMoney = snackPrice * snackNumber - haveMoney;
//			System.out.println(needMoney);
//		}else {
//			System.out.println(0);
//		}
		
//		[6359] [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int TestCase = scan.nextInt();
//		
//		for(int T = 0; T < TestCase; T++) {
//		int n = scan.nextInt();
//		int [] arr = new int [n + 1];
//		int run = 2;
//		int door = 1;
//		int count = 0;
//		
//		for(int i = 1; i <=n; i++) {
//			while(run * door <= n) {
//				if(arr[run * door] == 0) {
//					arr[run * door] = 1;
//					//닫혔으면 연다.
//				}else {
//					arr[run * door] = 0;
//					//열렸으면 닫는다.
//				}
//				++door;	
//			}
//			++run;
//			door = 1;
//			//시작 문위치 초기화
//		}
//		
//		for(int i = 1 ; i <=n; i++) {
//			if(arr[i] == 0) {
//				count++;
//				}
//			}
//		System.out.println(count);
//		}
	
	
//		[10972]		[어려웡 다시보기]
		
//		int n = scan.nextInt();
//		
//		int [] arr = new int [n];
//		int [] temparr = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//
//	}
//	 private static void nextPermutation(int[] arr) {
//	        int n = arr.length;
//	        boolean b = true;
//	        Loop1: for (int i = n - 1; i > 0; i--) {
//	            if (arr[i - 1] < arr[i]) {
//	                for (int j = n - 1; j >= i; j--) {
//	                    if (arr[j] > arr[i - 1]) {
//	                        int temp = arr[j];
//	                        arr[j] = arr[i - 1];
//	                        arr[i - 1] = temp;
//	                        int k = n - 1;
//	                        while (i < k) {
//	                            int temp2 = arr[i];
//	                            arr[i] = arr[k];
//	                            arr[k] = temp2;
//	                            i++;
//	                            k--;
//	                        }
//	                        b = false;
//	                        break Loop1;
//	                    }
//	                }
//	            }
//	        }
//	        if (b) {
//	            System.out.println(-1);
//	        } else {
//	            showArray(arr);
//	        }
//	    }
//	 
//	    private static void showArray(int[] arr) {
//	        for (int i = 0; i < arr.length; i++)
//	            System.out.println(arr[i]);
		
		
//		[2480]
		
//		int [] arr= new int [3];
//		
//		for(int i = 0; i < 3; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int one = arr[0];
//		int two = arr[1];
//		int three = arr[2];
//		
//		int sum =0;
//		int temp = Math.max(one, two);
//		int max = Math.max(three, temp);
//		
//		if(one == two && one == three) {
//			sum = 10000 + (one * 1000);
//		}else if(one == two && one !=three) {
//			sum = 1000 + (one * 100);
//		}else if(one == three && one !=two) {
//			sum = 1000 + (one * 100);
//		}else if(three == two && one !=three) {
//			sum = 1000 + (three * 100);
//		}else {
//			sum = max * 100;
//		}
//		
//		System.out.println(sum);
		
		
/////////////////////////////////////////////////////////////////////////////	825공부
		
//		[1748] 수이어 쓰기
		
//		String n = scan.next();
//		int number = Integer.parseInt(n);
//		
//		String [] arr = new String[number+1];
//		int count = 0;
//		
//		for(int i = 1; i <= number; i++) {
//			arr[i] = Integer.toString(i); 
//			count += arr[i].length();
//		}
//		
//		System.out.println(count);
		
		
//		[2530]	인공지능 시계
		
//		int hour = scan.nextInt();
//		int minute = scan.nextInt();
//		int second = scan.nextInt();
//		
//		int needTime = scan.nextInt();
//		
//		second += needTime;
//		minute += second / 60; 
//		second %= 60; 
//		hour += minute / 60;
//		minute %= 60;
//		hour %= 24;
//		
//		System.out.printf("%d, %d, %d", hour , minute, second);
	
	
//		[2420]	사파리월드	
	
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int sum = Math.abs(n) +  Math.abs(m);
//		
//		System.out.println(sum);
		
//		[1292] 쉽게푸는 문제
		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int count = 0;
//		int sum = 1;
//		
//		int [] arr = new int [m+1];
//		
//		loop : for(int i = 1; i <= m; i++) {
//			for(int j = 1; j <= i; j++) {
//				arr[sum] = i;
//				sum++;
//				count ++;
//				if(count == m) {
//					break loop;
//				}
//			}
//		}
//		
//		sum = 0;
//		for(int i = n; i <= m; i++) {
//			sum += arr[i];
//		}
//
//		System.out.println(sum);
	
	
/////////////////////////////////////////////////////////////////////////	826공부	
	
//		[5063] TGN [완료]
//		
//		int Testcase = scan.nextInt();
//		int [] arr = new int [3];
//		
//		while(Testcase != 0) {
//			System.out.println("값을 넣으세요");
//			for(int i = 0; i < 3; i++) {
//			arr[i] = scan.nextInt();
//			}
//			
//			if(arr[0] == arr[1] - arr[2]) {
//				System.out.println("does not matter");
//			}else if(arr[0] < arr[1] - arr[2]) {
//				System.out.println("advertise");
//			}else {
//				System.out.println("do not advertise");
//			}
//			Testcase--;
//		}
//			System.out.println("종료되었습니다.");
		
		
//		[2845] 파티가 끝나고 난 뒤
		
//		int man = scan.nextInt();
//		int W = scan.nextInt();
//		
//		int [] arr = new int [5];
//		int [] temp = new int [5];
//		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = scan.nextInt();
//			temp[i] = arr[i] - (man * W);
//		}
//		
//		for(int i = 0; i < 5; i++) {ㄹ
//			System.out.print(" "+temp[i]);
//		}
		
		
//		[2501] 약수구하기	[완료]
		
//		int N = scan.nextInt(); 
//		int K = scan.nextInt();
//		
//		int [] arr = new int [N + 1];
//		
//		
//		for(int i = 1; i <= N; i++) {
//			if(N % i == 0) {
//				arr[i] = i;
//			}
//		}
//		
//		System.out.println(arr[K]);
		
		
//		[10833] 사과 [완료]
		
//		int Nclass = scan.nextInt();
//		int[][] arr= new int [Nclass][2];
//		int sum = 0;
//		
//		for(int i = 0; i < Nclass; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//			loop : while(true) {
//				if(arr[i][1] >= arr[i][0]) {
//					//사과 수와 학생수를 비교
//					arr[i][1] = arr[i][1] - arr[i][0];
//					//모든 학생들에게 공평한 갯수를 나누어주어야하기 때문에
//					//전체 사과갯수가 학생들보다 적어질때까지 빼준다.
//					//ex) 학생수 10명 남은 사과갯수 9개면 else문으로 넘어감
//				}else {
//					break loop;
//				}
//		     }
//			sum += arr[i][1];
//			//남은 사과수를 더해줌
//			}
//		System.out.println(sum);
		
/////////////////////////////////////////////////////////////////////////	827공부

//		[2965]	캥거루 세마리	
		
		
//		int [] arr = new int [3];
//		arr[0] = scan.nextInt();
//		arr[1] = scan.nextInt();
//		arr[2] = scan.nextInt();
//		
//		System.out.println(arr[1] - arr[0] > arr[2] - arr[1] ? arr[1] - arr[0] -1 : arr[2] - arr[1] -1);
	
		
		
//		
//		String nSixteen = Integer.toHexString(155);
//		//진수 변환을 위해서 속성값은 항상 String으로 받아야한다.
//		System.out.println(nSixteen);
//		
//		int nTen = Integer.valueOf(nSixteen, 16);
//		//10진수로 변환하고자 하는 값은 속성값을 int로 설정해야한다.
//		System.out.println(nTen);
//		
		
		
//		[2864] 5와 6의 차이 [완료]
		
//		String a = scan.next();
//		String b = scan.next();
//		
//		String minA = "";
//		String maxA = "";
//		
//		String minB = "";
//		String maxB = "";
//		
//		
//		for(int i = 0; i < a.length(); i++) {
//			if(a.charAt(i) == '6') {
//				minA = minA + "5";
//			}else {
//				minA = minA + a.charAt(i);
//				//6이 아닐 경우 그냥 대입
//			}
//			
//			if(a.charAt(i) == '5') {
//				maxA =  maxA + "6";
//			}else {
//				maxA = maxA + a.charAt(i);
//				//5가 아닐 경우 그냥대입
//			}
//			//문자열로 입력 받은 A의 char의 순서대로 비교
//			//각각 최소 최대 변수와 비교하여 항을 변경
//			
//		}
//		
//		
//		for(int i = 0; i < b.length(); i++) {
//			if(b.charAt(i) == '6') {
//				minB = minB + "5";
//			}else {
//				minB = minB + b.charAt(i);
//				//6이 아닐 경우 그냥 대입
//			}
//			
//			if(b.charAt(i) == '5') {
//				maxB =  maxB + "6";
//			}else {
//				maxB = maxB + b.charAt(i);
//				//5가 아닐 경우 그냥대입
//			}
//			//문자열로 입력 받은 B의 char의 순서대로 비교
//			//각각 최소 최대 변수와 비교하여 항을 변경
//			
//		}
//		
//		int max = Integer.parseInt(maxA) +  Integer.parseInt(maxB);
//		int min = Integer.parseInt(minA) +  Integer.parseInt(minB);
//		
//		
//		System.out.println(min + " " + max);
		
		
//		[5532] 방학숙제
		
//		double Vacation = scan.nextInt();
//		double Mpage = scan.nextInt();
//		double Lpage = scan.nextInt();
//		
//		int MaxMpage = scan.nextInt();
//		int MaxLpage = scan.nextInt();
//		
//		Mpage = Mpage / MaxMpage;
//		Lpage = Lpage / MaxLpage;
//		double Max = Mpage > Lpage ? Mpage : Lpage;
//		
//		Vacation = Vacation - Max;
//		
//		int nmg = (int) Vacation;
//		
//		System.out.println(nmg);

		
//		[2506] 점수계산 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		int count = 0;
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			if(arr[i] == 1) {
//				count++;
//				sum += count;
//				//연속된 수 체크하면서 연속될 경우
//				//count를 하나씩 더해주어
//				//sum에 더해준다.
//			}else {
//				count = 0;
//				//연속된값 체크시 후 연속되지 않을 경우
//				//0으로 초기화 하여 검색한다.
//			}
//			
//		}
//		
//		System.out.println(sum);

/////////////////////////////////////////////////////////////////////////	828공부		
		
		// 범위내에서의 가장큰 소수 찾기 
//		int p = 2;
//		int n = 97;
//		while(true) {
//			
//			double t = Math.sqrt(n);
//			int m = (int)t;
//			
//			for(int i = 2; i <=m; i++) {
//				int r = n % i;
//				System.out.println(r);
//				if(r==0) {
//					break;
//				}
//				if(i==m) {
//					p = n;
//					System.out.println(p);
//				}
//			}
//			n++;
//			if(n > 97) {
//				break;
//			}
//		}
//		
//		System.out.println(p);
		
//		[2745] 진법변환 [다시보기]
		
//		String N = scan.next();
//		int B = scan.nextInt();
//		
//		int ans = 0;
//	        for (int i = 0; i < N.length(); i++){
//	            
//	        	if ('0' <= N.charAt(i) && N.charAt(i) <= '9'){
//	                ans = ans*B + ((int)N.charAt(i) - (int)'0');
//	            }
//	            else{
//	                ans = ans*B + ((int)N.charAt(i) - (int)'A' + 10);
//	            }
//	        }
//	        
//	        System.out.println(ans);
		
//		[10162] 전자레인지
		
//		int n = scan.nextInt();
//		int fiveM = 0;
//		int oneM = 0;
//		int tenS = 0;
//		
//		while(true) {
//			if(n <= 0) {
//				break;
//			}
//			if(n >= 300 && n > 60) {
//				n = n - 300;
//				fiveM++;
//			}else if(n >= 60 && n < 300) {
//				n = n - 60;
//				oneM++;
//			}else if(n >= 10 && n < 60) {
//				n = n - 10;
//				tenS++;
//			}else {
//				break;
//			}
//		}
//		
//		System.out.println(fiveM+ " " + oneM+ " " + tenS);
//	
		
//		[3036] 링 [완료] [공약수 구하기 중요]
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//        int[] Ring = new int[N];
//        
//        for(int i = 0; i < N; i++) {
//            Ring[i] = scan.nextInt();
//        }
//
//        for(int i = 1; i < N; i++) {
//            solve(Ring[0], Ring[i]);
//            //각 원 간의 배열 공약수를 구하면서 함수 반복문진행
//        }
//			
//		}
//	// 함수 구문이기 때문에 public class main {} 메인 클래스 내부에 선언해 주어야 한다.
//	 public static void  solve(int A, int B) {
//	        int temp;
//	        int Fring = A;
//	        //앞에 있는 원
//	        int Nring = B;
//	        //뒤에 있는 원
//	        while(B > 0) {
//	            temp = B;
//	            B = A % B;
//	            A = temp;
//	            //B 가 0이 되어 공약수가 될때 까지 반복
//	        }
//	        System.out.println(Fring / A + "/" + Nring / A);
//	 }
	 
/////////////////////////////////////////////////////////////////////////	829공부		
//		int a = 1 - 2;
//		System.out.println(a);
//		//출력값  == -1
//		
//		int b = Math.abs(a);
//		System.out.println(b);
//		//출력값 == 1
		
		
//		[1644] 소수의 연속합 [완료]
//		
//		int n = scan.nextInt();
//		int count = 0;
//		int [] arr = new int [n];
//		arr[0] = 2;
//		int k = 1;
//		int sum = 0;
//		
//		for(int i = 3 ; i <= n ; i++) {
//			loop :for(int j = 2 ; j < i ; j++) {
//				if(i % j == 0) {
//					count++;
//					break loop;
//					//j로 나누어 0이 되면, 
//					//소수가 아님
//				}
//			}
//			if(count == 0) {
//				arr[k] = i;
//				k++;
//				//카운트가 0일 경우 해당 i의 값은 소수
//				//배열에 집어넣음
//			}
//			count = 0;
//			//다음 i값 비교를 위해
//			//count 초기화
//		}
//		
//		for(int i = 0; i < arr.length; i++ ) {
//			if(arr[i] == 0) {
//				break;
//			}
//			loop : for(int j = i; j < arr.length; j++ ) {
//				if(n > sum) {
//				sum += arr[j];
//				//n이 더크면 계속 더해
//				//근접한 수로 만들어줌
//			}else if(n == sum) {
//				count++;
//				break loop;
//				//n이 같아지면 그수는 소수의 연속합이 되고
//				//카운트에 하나 더해줌
//				}else {
//					break loop;
//					//sum이 더커지면 연속합이 아니기때문에
//					//루프 탈출 다음 i값을 비교함
//				}
//			}
//			sum = 0;
//			//다음 값 더해주기 위해  sum을 초기화
//		}
//
//	   System.out.println(count);     
	        
/////////////////////////////////////////////////////////////////////////	831공부
	       
//	     int Two = 2;
//	     System.out.println(Math.pow(Two, 2));
//	     //앞에는 제곱을 하고자하는 수
//	     //뒤에는 제곱하고자 하는 만큼의 수를 입력해 준다.
//	     //출력값 : 4.0
//	     
//	     System.out.println(Math.pow(Two, 3));
//	     //출력값 : 8.0
//	     
//	     
//	     int four = 4;
//	     System.out.println(Math.sqrt(4));
//	     //제곱근을 구하고자하는 수를 소괄호안에 써주면된다.
//	     //출력값 : 2.0
//	     
//	     int nine = 9;
//	     System.out.println(Math.sqrt(9));
//	     //출력값 : 3.0
//	     
		
		
//		[1963] [다시보기]
		
//		int T = scan.nextInt();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        T = Integer.parseInt(br.readLine());
//        
//        // 소수를 미리 구한다.
//        for (int i = 2; i < 10000; i++) {
//            for (int j = 2; j < i/2; j++) {
//                if(i % j == 0) 
//                    nonPrime[i] = true;
//            }
//        }
//        
//        while(T-- >0) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//            
//            // 초기화
//            visited = new boolean[10000];
//            ok = false;
//            min = 0;
//            q.clear();
//            
//            // BFS 탐색 시작
//            visited[a] = true;
//            q.add(a);
//            
//            loop : while(!q.isEmpty()) {
//                int size = q.size();
//                for (int s = 0; s < size; s++) {
//                    int cur = q.poll();
//                    
//                    if(cur == b) {
//                        ok = true;
//                        break loop;
//                    }
//                    
//                    // 현재 4자리 비밀번호를 각 자리수로 분리하여 배열에 저장.
//                    int[] digit = {cur/1000 ,(cur%1000) / 100, (cur%100) / 10, cur%10 };
//                    
//                    for (int i = 0; i < 4; i++) {
//                        for (int j = (i== 0 ? 1 : 0); j < 10; j++) {
//                            int origin = digit[i];    // 이전 값 저장
//                            digit[i] = j;
//                            int num = (digit[0]*1000) + (digit[1]*100) + (digit[2]*10) + (digit[3]);
//                            digit[i] = origin;    // num만 만들고, 다음 변경을 위해 초기 cur의 배열 상태로 되돌린다.
//                            if(visited[num] || nonPrime[num])
//                                continue;
//                            visited[num] = true;
//                            q.add(num);
//                        }
//                    }
//                }
//                min++;
//            }
//            System.out.println(ok ?min : "Impossible");
//        }
//        
//		}
//	 static int T;
//	    static boolean[] nonPrime = new boolean[10000];
//	    static boolean[] visited;
//	    static Queue<Integer> q = new LinkedList<>();
//	    static int a,b;
//	    static int min;
//	    static boolean ok;

//		[2587] [완료]
		
//		int [] arr= new int [5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		int min = 100000000;
//		int center = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];	
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(Math.abs(sum/arr.length - arr[i]) < min) {
//				min = Math.abs(sum/arr.length - arr[i]);
//				center = arr[i];
//			}
//		}	
//		System.out.println(sum/arr.length + " " + center);
		
//		[10973] 이전 순열 [남이 푼거 한번 더보기]
//		[내가 푼거 답안나옴]
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		int [] temparr = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//			temparr[i] = arr[i]; 
//		}
//		
//		Arrays.sort(temparr);
//		int count = 0;
//		for(int i = 0; i < n; i++) {
//			if(temparr[i] == arr[i]) {
//				count++;
//			}
//		}
//		//첫번째 배열인지 체크
//		
//		loop : for(int i = n - 1; i >=0; i--) {
//			if(count == n) {
//				System.out.println(-1);
//				break;		
//			}
//			
//			int temp = 0;
//			loop2 : for(int j = i - 1; j >=0; j--) {
//				if(arr[i] < arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					break loop;
//				}else {
//					break loop2;
//				}
//				
//			}
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i]);
//		}
//
		
//		 Scanner sc = new Scanner(System.in);
//	        int n = sc.nextInt();
//	        int[] arr = new int[n];
//	 
//	        for (int i = 0; i < n; i++) {
//	            arr[i] = sc.nextInt();
//	        }
//	 
//	        previousPermutation(arr);
//	 
//	        sc.close();
//		
//}
//	  private static void previousPermutation(int[] arr) {
//	        int n = arr.length;
//	        boolean b = true;
//	        Loop1: for (int i = n - 1; i > 0; i--) {
//	            if (arr[i - 1] > arr[i]) {
//	                for (int j = n - 1; j >= i; j--) {
//	                    if (arr[j] < arr[i - 1]) {
//	                        int temp = arr[i - 1];
//	                        arr[i - 1] = arr[j];
//	                        arr[j] = temp;
//	                        int k = n - 1;
//	                        
//	                        while (i < k) {
//	                            int temp2 = arr[i];
//	                            arr[i] = arr[k];
//	                            arr[k] = temp2;
//	                            i++;
//	                            k--;
//	                        }
//	                        b = false;
//	                        break Loop1;
//	                    }
//	                }
//	            }
//	        }
//	        if (b) {
//	            System.out.println(-1);
//	        } else {
//	            showArray(arr);
//	        }
//	    }
//	 
//	    private static void showArray(int[] arr) {
//	        for (int i = 0; i < arr.length; i++)
//	            System.out.print(arr[i] + " ");
		
		
// 1에서 100까지 수열의 합을 구해보자!
		
//		int sum, number;
//		
//		number = 0; 
//		sum = 0;
//		
//		do {
//			number++;
//			sum += number;
//		}while(number <= 99);
//		
//		System.out.println(sum);
		
		
//		[10164] 격자상의 경로 [다시보기]
//		
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		String line[] = in.readLine().split(" ");
//		
//		n=Integer.parseInt(line[0]); 
//		m=Integer.parseInt(line[1]); 
//		k=Integer.parseInt(line[2]);
//		
//		init();
//		out.write(getVal()+"");
//		out.close();
//		in.close();		
//
//		
//}
//	public static int n, m, k, map[][];
//	
//	private static void init(){
//		map = new int[n+1][m+1];
//		int i, j; map[0][1]=1;
//		for(i=1;i<=n;i++)
//			for(j=1;j<=m;j++)
//				map[i][j] = map[i-1][j]+map[i][j-1];
//	}
//	
//	private static int getVal(){
//		if(k==0) return map[n][m];
//		int ax, ay, bx, by;
//		ax = k/m+(k%m>0?1:0);
//		System.out.println(ax);
//        ay = k-(ax-1)*m;
//        System.out.println(ay);
//		bx = n-ax+1;
//		System.out.println(bx);
//        by = m-ay+1;
//        System.out.println(by);
//		return map[ax][ay] * map[bx][by];
		
		
/////////////////////////////////////////////////////////////////////////	901공부		

		
		//		[1016]	[다른 알고리즘 적용해서 풀어보기]
//						[아주 큰 수가 주어졌을 경우의 알고리즘]
//		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		
//		int [] arr = new int [m];
//		double [] temparr = new double [m / 2];
//		
//		int temp = n;
//		for(int i = 0; i <=m; i++) {
//			arr[i] = temp;
//			temp++;
//			if(temp == m) {
//				arr[i + 1] = temp;
//				break;
//			}
//			
//		}
//		
//		double number = 2;
//		for(int i = 0; i < temparr.length; i++) {
//			if(m <=  Math.pow(number, 2)) {
//				break;
//			}
//			temparr[i] = Math.pow(number, 2);
//			number++;
//
//		}
//		
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				break;
//			}
//			loop : for(int j = 0; j < temparr.length; j++) {
//				if(arr[i] % temparr[j] == 0) {
//					count++;
//					break loop;
//				}
//			}
//		}
//		
//		System.out.println((m - n + 1) - count);
		
//[다른사람 풀이]		
//		min = scan.nextLong();
//	    max = scan.nextLong();
//	        checkNoSquareNumberCount();
//	    }
//	 
//	    private static void checkNoSquareNumberCount() {
//	        int end = ((int) Math.sqrt(max));
//	        boolean []checkArray = new boolean[1000001]; 
//	        Arrays.fill(checkArray, false);
//	        for(long i = 2; i <= end; i++){
//	            long square = i*i;
//	            long start = ((min-1)/square+1) * square;
//	            for(long a = start; a <= max; a += square){
//	            	checkArray[(int) (a-min)] = true;
//	            }
//	        }
//	        int count = 0;
//	        for(int i = 0; i < (max - min + 1); i++){
//	        	count += (checkArray[i] == true)? 1:0;
//	        }
//	        System.out.print(max - min - count + 1);
//	        
//	}
//	    
//	    static long min;
//	    static long max;

//		https://m.blog.naver.com/PostView.nhn?blogId=qbxlvnf11&logNo=221177339719&proxyReferer=https:%2F%2Fwww.google.com%2F		
			
		
		//		[2407]	[어려움 다시보기]		
//		  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	        StringTokenizer st = new StringTokenizer(br.readLine());
//	        int n = Integer.parseInt(st.nextToken());
//	        int m = Integer.parseInt(st.nextToken());
//
//	        BigInteger a = BigInteger.ONE;
//	        BigInteger b = BigInteger.ONE;
//	        for(int i = 0; i < m; i++){
//	            a = a.multiply(new BigInteger(String.valueOf(n - i)));
//	            b = b.multiply(new BigInteger(String.valueOf(i + 1)));
//	        }
//	        BigInteger ans = a.divide(b);
//	        bw.write(ans + "\n");
//
//	        bw.flush();
//	        br.close();
//	        bw.close();
		
/////////////////////////////////////////////////////////////////////////	902공부		
		
		
		//		[15894]		수학은 체육과목입니다.	
//		
//		int n = scan.nextInt();
//		
//		 int sum = n * 3 + n;
//			System.out.println(sum);

		
		
		//		[1964]	오각형...오각형...(완료)
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int sum = 0;
//		
//		int count = 3;
//		for(int i = 1; i <= n-1; i++) {
//			sum += (i * 5) - count;
//			count += 2;
//			//안에 있는 오각형이 1일때는 -3
//			//한단계 증가마다 뺴는 값 2씩 증가함
//			}
//		
//		sum += (n * 5);
//		System.out.println(sum);
		
		//		[1834] 나머지와 몫이 같은 수 [완료]
		
//		int n = scan.nextInt();
//		int number = n;
//		int sum = 0;
//
//		loop : while(true) {
//			int mok = number / n;
//			int nmg = number % n;
//			
//			if(mok >= n) {
//				break loop;
//			}
//			//몫과 n의 값이 같아지면 더이상
//			//몫과 나머지가 같은 수는 없다.
//			
//			if(mok == nmg) {
//				sum += number;
//			}
//			number++;
//		}
//		
//		System.out.println(sum);
//		
		
/////////////////////////////////////////////////////////////////////////	903공부

		//		[1024] 수열의 합 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int l = scan.nextInt();
//		int min = 100;
//		// l보다는 크고 100보다는 작은 연속합의 최소횟수 체크
//		int sum = 0;
//		// n과 비교할 연속합이 저장됨
//		int count = 0;
//		// sum에 더해지는 횟수를 계산
//		int temp = 0;
//		// 배열에 저장될 임시값이 들어갈 변수
//		int [] arr = new int [n];
//		// 연속합에 사용되는 숫자가 저장될 변수
//		
//		for(int i = 1; i < n/2; i++) {
//			sum = 0;
//			count = 0;
//			temp = 0;
//			
//			loop :for(int j = i; j < n/2; j++) {
//				if(sum < n) {
//					sum += j;
//					count++;
//					// n과 같아지기 위해서 지속적으로 sum에 더해줌 
//					if(sum == n)  {
//						if(min >= count  && count >= l) {
//						Arrays.fill(arr,0);
//						//최솟값을 찾았음으로 배열의 있는 수를 0으로 초기화
//						min = count;
//						temp = i;
//						//연속합의 초기값 i로 지정
//						for(int k = 1; k <=count; k++) {
//							arr[k] = temp;
//							temp++;
//							//count 값 만큼 배열에 저장
//							}
//						}else {
//							break loop;
//						}
//					}
//				}
//			else {
//				break loop;
//				}
//			}
//		}
//		
//		Arrays.sort(arr);
//		//올림차수 정렬
//		
//		if(arr[n-1] == 0) {
//			System.out.println(-1);
//			//연속합이 되는지 여부 체크
//			//연속합이 될경우 마지막에 무조건 0보다 큰 값이들어감
//		}else {
//		for(int i = 0 ; i < n; i++) {
//			if(arr[i] != 0) {
//			System.out.print(arr[i]+ " ");
//			}
//		}
//	}	

		//		[5218] 알파벳 거리
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		for(int i=0; i<N; i++) {
//			String str1 = scan.next();
//			String str2 = scan.next();
//			int[] arr = new int[str1.length()];
//			
//			for(int j=0; j < str1.length(); j++) {
//				if(str2.charAt(j) >= str1.charAt(j)) {
//					arr[j] = str2.charAt(j) - str1.charAt(j);
//				}
//				else {
//					arr[j] = str2.charAt(j) - str1.charAt(j) + 26;
//				}
//			}
//			
//			System.out.print("Distances: ");
//			for(int j=0; j<arr.length; j++) {
//				System.out.print(arr[j] + " ");
//			}
//			System.out.println();
//		}
//		scan.close();
		
		//		[1072] [다시보기]
//		
//		 Scanner sc = new Scanner(System.in);
//	        X = sc.nextInt();
//	        Y = sc.nextInt();
//
//	        Z = Y * 100 / X;
//	        if (Z >= 99)
//	            System.out.println(-1);
//	        else
//	            binarySearch(1, X);
//	    }
//		static long X, Y, Z;
//
//	    private static void binarySearch(long start, long end) {
//	        long mid = 0, ratio = 0;
//	        while (start <= end) {
//	            mid = (start + end) / 2;
//	            ratio = (Y + mid) * 100 / (X + mid);
//
//	            if (ratio > Z) {
//	                end = mid - 1;
//	            } else {
//	                start = mid + 1;
//	            }
//	        }
//	        System.out.println(start);
		
/////////////////////////////////////////////////////////////////////////	904공부
		
//		펙토리얼 구현하기 p166
		
//		int temp = 1;
//		//각 i에 다른 팩토리얼이 저장되는 값
//		// ex) i = 2 → 2!
//		int sum = 0;
//		//각 팩토리얼이 더해지는 값
//		
//		for(int i = 1; i<= 10; i++) {
//			temp = temp * i;
//			sum = sum + temp;
//		}
//		
//		System.out.println(sum);
//		//10!만 구하고 싶다면 temp 값을 이용하면된다.
//		
//		
//		int temp = 1;
//		//각 i에 다른 팩토리얼이 저장되는 값
//		// ex) i = 2 → 2!
//		int sum = 0;
//		//각 팩토리얼이 더해지는 값
//		int i = 0;
//		//10까지 증가할 팩토리얼 값
//		
//		do {
//			i++;
//			temp = temp * i;
//			sum = sum + temp;
//		}while(i < 10);
//		
//		System.out.println(sum);
//		//10!만 구하고 싶다면 temp 값을 이용하면된다.
		
//		피보나치 수열 구현하기 p168
		
		
//		int a = 0;
//		//첫째 항
//		int b = 1;
//		//둘째 항
//		int c = 0;
//		// 셋째 항 = 출력값
//		
//		for(int i = 1; i < 10; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//
//		}
//		// 피보나치는 0, 1, 1, 2, ... 순으로 커지기 때문에
//		// F0의 값은 a와 같고  F1의 값은 b와 같다.
//		//때문에 반복문에 범위는 위와 같이 설정한다.
//			System.out.println(c);
		
		
		//		[2355] 시그마
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		int sum = 0;
//		
//		while(a <= b) {
//			sum += a;
//			a++;
//		}
//			
//		System.out.println(sum);
			
		//		[5032] 탄산음료 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int Emptybottle = scan.nextInt();
//		int Getbottle = scan.nextInt();
//		int Needbottle = scan.nextInt();
//			
//		int sum = Emptybottle + Getbottle;
//		int nmg = 0;
//		//그날 마신 빈병의 갯수가 저장되는 곳;	
//		int count = 0;
//		//마실 수 있는 병수가 저장될 변수
//		
//		while(true) {
//			
//			while(sum >= Needbottle) {
//			sum = sum - Needbottle;
//			nmg++;
//			count++;
//		}
//		
//			nmg = nmg + sum;
//			//남은 빈병과 오늘 마신 빈병을 더해줌;
//			if(nmg < Needbottle) {
//				break;
//			}
//			
//			sum = 0;			
//			while(nmg >= Needbottle) {
//				nmg = nmg - Needbottle;
//				sum++;
//				count++;
//				//나머지 빈병으로 더 마실수 있나 확인
//			}
//			
//			sum = sum + nmg;
//			if(nmg < Needbottle) {
//				break;
//			}
//			//다시 한번 마신병수 체크후 Needbottle보다 크면 
//			//첫번째  while 문으로 돌아간다.
//			
//		}
//			System.out.println(count);
			
/////////////////////////////////////////////////////////////////////////	905공부
//		
//		String a = "24";
//		
//		int n = Integer.valueOf(a, 8);
//		System.out.println(n);
		
		
//		최대공배수 최대공약수 구하기
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		//입력될 두 수
//		
//		int big, small;
//		//두 수 중 큰 수와 작은 수가 저장될 변수
//		
//		int mok, nmg;
//		//몫과 나머지가 저장될 변수
//		
//		int	minM, maxD ;
//		//최소공배수와 최대공약수가 저장될 변수
//		
//		
//		if(a >= b) {
//			big = a;
//			small = b;
//		}else {
//			big = b;
//			small = a;
//		}
//		
//		while(true) {
//			mok = big / small;
//			nmg = big - mok * small;
//				if(nmg == 0) {
//					maxD = small;
//					minM = a * b / maxD;
//					System.out.println(maxD + "  " + minM);
//					break;
//				}else {
//					big = small;
//					small = nmg;
//				}
//		
//		
//		}
		
		//		[2903] 중앙 이동 알고리즘 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr= new int [ n + 1];
//		arr[0] = 4;
//		int count = 0;
//		//제곱할때마다 커질 수
//		int num = 2;
//		
//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = (int) Math.sqrt(arr[i - 1]) + (int) Math.pow(num, count);
//			// 가로(세로)의 점 갯수를 구함(정사각형이기 때문에 하나만 구하면된다)
//			arr[i] = (int) Math.pow(arr[i], 2);
//			// 정사각형이기 때문에 가로와 새로를 곱합값이 점의 갯수가 된다.
//			count++;
//			//한 사이클 마다 가로(세로)의 길이가 2의 제곱만큼 커짐으로 count를 더해준다.
//			//ex) 첫번째 2의 1승 두번째 2의 2승 ... 2의 n승; 순으로 커짐
//		}
//		
//		System.out.println(arr[n]);
		
		
/////////////////////////////////////////////////////////////////////////	906공부
		
		
//		
//		int i = 0;
//		int [] a = new int[10];
//		int count = 0; 
//		//1씩 증가되는 수가 저장될 변수
//		int max = 0, min = 10000;
//		//최댓값과 최솟값이 들어갈 변수;		
//		
//		do {
//			count++;
//			a[i] = count;
//			if(max <= a[i]) {
//				max = a[i];
//			}
//			
//			if(min >= a[i]) {
//				min = a[i];
//			}
//			//배열에 삽입된 값이 최댓값인지 최솟값인지 
//			//계속 비교하며 값은 갱신함
//			
//			i++;
//			//배열의 위치를 하나씩 증가시켜준다.
//		}while(i < 10); 
//		
//		System.out.println(max + " " + min);
		
		
//		int i = 0;
//		int [] a = new int[10];
//		a[0] = 0;
//		a[9] = 100;
//		//0 번째 자리와 마지막 자리에 
//		//각 최소값과 최대값을 넣어줍니다.
//		int sum = 0;
//		//평균을 구하기 위한 배열의 합이 저장될 변수
//		
//		int five = 5; 
//		//숫자 5 변수 선언
//		int max = 0, min = 10000;
//		//최댓값과 최솟값이 들어갈 변수;		
//		
//		for(int j = 1; j < a.length - 1; j++) {
//			a[j] = five;
//		}
//		// 배열에 5를 넣어주기 위한 반복문
//		
//		do {
//			if(max <= a[i]) {
//				max = a[i];
//			}
//			
//			if(min >= a[i]) {
//				min = a[i];
//			}
//			//배열에 삽입된 값이 최댓값인지 최솟값인지 
//			//계속 비교하며 값은 갱신함
//			
//			sum += a[i];
//			i++;
//			//배열의 위치를 하나씩 증가시켜준다.
//		}while(i < 10); 
//		
//		System.out.println(max + " " + min);
//		System.out.println((sum - max - min) / 8);
//		//두 값을 빼주기 때문에 10 - 2 하여  8로 나누어 준다.

		//		[1297] Tv 크기
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] temp = br.readLine().split(" ");
//
//        // width > height
//        int diagonal = Integer.parseInt(temp[0]);
//        int height = Integer.parseInt(temp[1]);
//        int width = Integer.parseInt(temp[2]);
//
//        // 높이와 너비를 구하기
//        // 소수점이 나올 경우, 그 수보다 작으면서 가장 큰 정수 출력 (floor)
//        double res = Math.sqrt(Math.pow(diagonal, 2) / ( Math.pow(height, 2) + Math.pow(width, 2) ));
//        System.out.print((int)Math.floor(res*height) + " ");
//        System.out.println((int)Math.floor(res*width));
        
		
		//		[2981]	검문 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int [] arr= new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		int m = 2;
//		//나누어줄 변수
//		int temp = 0;
//		//나눈 나머지가 임시로 저장될 변수
//		int count = 0;
//		//같은 값으로 나누어지는 변수가 배열에 저장될 때 마다
//		//배열의 위치를 지정해주기 위해 1씩 더해질 변수
//		int [] marr = new int [arr[0]];
//		//같은 값으로 나누어지는 m의 값이 저장될 변수
//		boolean flag = false;
//		//같은 값으로 나누어지는지 체크할 변수
//		
//		while(arr[0] > m) {
//			temp = arr[0] % m;
//			//주어진 가장 작은 수에 m을 나눈 나머지를 저장
//			
//			loop : for(int i = 1; i < n; i++) {
//				if(arr[i] % m != temp) {
//					flag = false;
//					break loop;
//					//temp와 같지 않으므로 루프 탈출
//				}else {
//					flag = true;
//				}
//			}
//			//루프 마무리
//			
//			if(flag == true) {
//				marr[count] = m;
//				count ++;
//			}
//			//루프가 끝난 후 flag 체크 후  true이면 
//			//배열에 m의 값을 삽입 
//			
//			m ++;
//			temp = 0;
//			//m의 값은 하나씩 더해주고
//			//temp 값은 초기화 시켜줌
//		}
//		
//		for(int i = 0; i < marr.length; i++) {
//			if(marr[i] == 0) {
//				break;
//			}
//			System.out.print(marr[i] + " ");
//		}
        
		
/////////////////////////////////////////////////////////////////////////	908공부		
		
		//		[1267] 핸드폰 요금 [완료]
		
//		Scanner scan = new Scanner (System.in);
//		int n = scan.nextInt();
//		
//		int [] arr = new int [n];
//		int sumY = 0;
//		int sumM = 0;
//		
//		for(int i = 0; i < n ; i++) {
//			arr[i] = scan.nextInt();
//			sumY += arr[i];
//			sumM += arr[i];		
//		}
//		
//		int feeY = 0;
//		int feeM = 0;
//		
//		while(true) {
//			if(sumY < 0) {
//				break;
//			}
//			
//			sumY -= 30;
//			feeY += 10;
//		}
//		
//		while(true) {
//			if(sumM < 0) {
//				break;
//			}
//			
//			sumM -= 60;
//			feeM += 15;
//		}
//		
//		int min = Math.min(feeY, feeM);
//		
//		if(min == feeY) {
//			System.out.println("Y" + " " + feeY);
//		}else {
//			System.out.println("M" + " " + feeM);
//		}
		

		//		[4796] 캠핑 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = 1;
//		while(n < 5) {
//		int P = scan.nextInt();
//		int L = scan.nextInt();
//		int vacation = scan.nextInt();
//		
//		if(P == 0 && L == 0) {
//			break;
//		}
//		//방학 나누기 연속일수  몫이 나오면 그수에다가 가능일수 더하고 나머지를 더해준다.
//		int mok = vacation / L;
//		int nmg = vacation % L;
//		int sum = (mok * P) + nmg;
//		
//		System.out.println("Case " + n + " : " + sum);
//		n++;
//		
//			}

		//		[4796] 거북이		
		
//		   Scanner sc= new Scanner(System.in);
//	        int [] arr = new int[4];
//	        for(int i=0;i<4;i++) {
//	            arr[i]=sc.nextInt();
//	        }
//	        Arrays.sort(arr);
//	        System.out.println(arr[0]*arr[2]);

		
		//		자바 보수 구하기 1의 보수 2의 보수
		
//		int [] arr = {1, 1, 0, 0, 1};
//		int [] bo1 = new int [5];
//		//1의 보수가 저장될 배열
//		int [] bo2 = new int [5];
//		//2의 보수가 저장될 배열
//	
//		int i = 0;
//		
//		do {
//			bo1[i] = 1 - arr[i];
//			//1에서 기존 배열의 값을 빼준면 보수가 된다.
//			i++;
//		}while(i < 5);
//		//1 의 보수의 값은 모두 저장되었다.
//		
//		int carry = 1;
//		//자리 올림이 발생을 고려한 변수
//		//2의 보수는 1의 보수맨 뒷자리에서 1을 더해주어야 하기 때문에 필요
//		i = 4;
//		//끝자리부터 올리기 때문에 
//		//시작 위치는 배열의 마지막 위치로 지정
//		do{
//			bo2[i] = bo1[i] + carry;
//			bo2[i] = bo2[i] % 2;
//			carry = bo1[i] * carry;
//			//0이면 더이상 자리 올림을 할 필요가 없다.
//			i--;		
//		}while(i > 0);
//		
//		for(int j =0; j < 5; j++) {
//			System.out.print(bo1[j] + " ");
//		}
//		System.out.println();
//		
//		for(int j =0; j < 5; j++) {
//			System.out.print(bo2[j] + " ");
//		}
		
///////////////////////////////////////////////////////////////////////	909공부
		
//		n의 배수의 개수와 합 구하기
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int mok, nmg;
//		int sum = 0;
//		// 배수들을 더할 변수	
//		int count = 0;
//		// 개수를 더할 변수
//		
//		for(int i = 1; i <= 100; i++) {
//			
//			mok = (int) i / n;
//			nmg = i - mok * n;
//			
//			if(nmg == 0) {
//				sum += i;
//				count++;
//				//나머지가 0이면, 배수이기 때문에
//				//sum에 더해주고 count 하나씩 더해준다.
//			}
//			
//		}
//		
//		System.out.println(sum + " " + count);
		
		//		[11816] [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String X = scan.next();
//		String N ="";
//		int N8 = 0;
//		//8진수 값이 저장될 변수
//		int N16 = 0;
//		//16진수 값이 저장될 변수
//		
//		if(X.charAt(0) == '0') {
//			//1자리 0인지 체크
//			if(X.charAt(1) == 'x') {
//				//2자리 x 면 16진수 for 문 실행
//				for(int i = 2; i < X.length(); i++) {
//					N += X.charAt(i);
//					}
//					N16 = Integer.valueOf(N, 16);
//			}else {
//				//2자리 x가 아님 8진수로 간주하고 8진수로 변환
//				for(int i = 1; i < X.length(); i++) {
//					N += X.charAt(i);
//					}
//					N8 = Integer.valueOf(N, 8);
//				}
//			}else {
//		System.out.println(X);
//	}
//		
//		if(N8 != 0 || N16 != 0) {
//		System.out.println(N8 > N16 ? N8 : N16);
//		//둘 중하나라도 0이 아니면 8진수 아니면 16진수 이기때문에 그수를 출력
//		}

		
		//		[2921] 도미노
		
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		int sum = 0;
//		
//
//        for(int i = 0; i <= n; i++){
//            for(int j = i; j <= n; j++){
//                sum = sum + i + j;
//            }
//        }
//		
//		System.out.println(sum);

///////////////////////////////////////////////////////////////////////	910공부
		
		//선택정렬
		
//		Scanner scan = new Scanner(System.in);		
//		int temp = 0;
//		//배열의 임시값을 받아줄 변수
//		//큰 수가 잠시동안 들어갈 예정
//		int number = -1;
//		int [] data = new int [10];
//		
//		do {
//			number++;
//			data[number] = scan.nextInt();
//		}while(number < 9);
//		
//		//10자리 배열에 원하는 정수 입력;
//		
//		int i = -1;
//		//배열의 회전수를 지정할 변수 
//		//do 문을 사용하기 때문에 -1로 입력
//		do {
//			i++;
//			int j = i;
//		do {
//			j++;
//			if(data[i] > data[j]) {
//				temp = data[i];
//				data[i] = data[j];
//				data[j] = temp;
//				}
//			}while(j < 9);
//		}while(i < 8);
//		
//		for(int k = 0; k <= 9; k++) {
//			System.out.print(data[k]);
//		}
//		
//		
//		//사실 위의 식은 굉장히 더러워 보인다. 
//		//for 문을 사용하여 간단히 만들어보자
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int [] data = new int [10];
//		int temp = 0;
//		
//		for(int i = 0; i <data.length; i++) {
//			data[i] = scan.nextInt();
//		}
//		//10자리 배열에 원하는 정수 입력;
//		
//		for(int i = 0; i < data.length - 1; i++) {
//			for(int j = i + 1; j < data.length; j++) {
//				if(data[i] > data[j]) {
//					temp = data[i];
//					data[i] = data[j];
//					data[j] = temp;
//				}
//			}
//		}
//		//이중 for 문을 사용하여 i의 위치에 따라.
//		//j의 값을 지속적으로 증가시키며 비교해준다.
//		
//		for(int i = 0; i <data.length; i++) {
//			System.out.print(data[i]);
//		}
////		8 5 6 2 4 1 3 7 9 10
		
		
		
///////////////////////////////////////////////////////////////////////	911공부		
		
//		Scanner scan = new Scanner(System.in);
//		int [] arr = new int [5];
//		//4자리의 그레이 코드를 받을 변수다
//		//크기가 5인 이유는 맨앞에 숫자가
//		//0이나 1이냐 판단하여,
//		//0일 경우에는  그레이코드 → 이진수 변환
//		//1일 경우에는  이진수 → 그레이코드 변환
//		
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		int [] Rearr = new int [4];
//		//변경된 코드가 들어갈 배열
//		
//		Rearr[0] = arr[1];
//		
//		if(arr[0] == 0) {
//			for(int i = 0; i < Rearr.length - 1; i++) {
//				if(arr[i + 2] == Rearr[i]) {
//					Rearr[i + 1] = 0;
//				}else {
//					Rearr[i + 1] = 1;
//				}
//			}
//			//그레이코드에서 이진수 변환임으로 
//			//그레이코드 다음수와 이진수 i번째의 수를 비교
//		}else {
//			for(int i = 0; i < Rearr.length - 1; i++) {
//				if(arr[i + 1] == arr[i + 2]) {
//					Rearr[i + 1] = 0;
//				}else {
//					Rearr[i + 1] = 1;
//				}
//			}
//			//이진법에서 그레이코드 변환임으로 
//			//이진수 i의 수와 다음 이진수 i + 1번째의 수를 비교
//		}
//		
//		for(int i = 0; i < Rearr.length; i++) {
//			System.out.print(Rearr[i] + " ");
//		}
		
		
		//		[7572] 간지
		
//		int n = scan.nextInt();
//		int count = 0;
//		String [] arr1 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"}; 
//		String [] arr2 = {"0", "1","2","3","4","5","6","7","8","9"};
//		int plus1 = 0;
//		int plus2 = 0;
//		
//		int a = (n + 56) % 60;
//		
//		for(int i = 0; i < a; i++) {
//			if(plus1 == 11) {
//				plus1 = 0;
//			}else {
//				plus1++;
//			}
//			
//			if(plus2 == 9) {
//				plus2 = 0;
//			}else {
//				plus2++;
//			}
//		}
//		System.out.println(arr1[plus1] + arr2[plus2]);
		
		
		
		//		[2089] -2진수 
		
//		  Scanner scan = new Scanner(System.in);
//	        int n = scan.nextInt();
//	        List<Integer> list = new ArrayList<>();
//	        
//	        if(n==0) //n이 0 일때
//	            System.out.println(n);
//	    
//	        while(n!=0) {
//	            list.add(Math.abs(n%-2));
//	            n=(int)Math.ceil((double)n/-2);
//	        }
//	        
//	        for(int i=list.size()-1; i>=0; i--)
//	            System.out.print(list.get(i));

		//		[8320] 직사각형 만드는 방법
		
//		int n = scan.nextInt();
//		int count = 0;
//		
//		for(int i = 1; i <=n; i++) {
//			if(i % 2 == 0 && i != 2) {
//				count = count + 2;
//			}else {
//				count++;
//			}
//			
//		}
//		
//		System.out.println(count);

///////////////////////////////////////////////////////////////////////	912부
		
		//		[2783] 삼각김밥 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		double won = scan.nextInt();
//		double gram = scan.nextInt();
//		double temp = 0;
//		
//		double nmg = 1000 % gram;
//		double mok = 1000 / gram;
//		
//		double min =  won * mok;
//		if(nmg != 0) {
//			min += won;
//		}
//		
//		int n = scan.nextInt();
//		int [][] arr = new int [n][2];
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//			nmg = 1000 % arr[i][1];
//			mok = 1000 / arr[i][1];
//			//열의 두번째 자리는 gram과 같다.
//			temp =  arr[i][0] * mok;
//			if(nmg != 0) {
//				temp += arr[i][0];
//				//열의 첫번째 자리는 won과 같다.
//			}
//			if(min > temp) {
//				min = temp;
//			}
//			
//		}
//	
//		System.out.println(String.format("%.2f", min));
//		//0이어도 뒤에자리를 제거하지 않고 출력함
		
		
		
		//	[5361]	[전투 드로이드 가격]	[완료]
		
//		Scanner scan= new Scanner(System.in);
//		double [] price = {350.34, 230.90, 190.55, 125.30, 180.90};
//		double sum = 0;
//		
//		int testCast = scan.nextInt();
//		
//		int [] arr = new int [5];
//		
//		for(int i = 0; i < testCast; i++) {
//			for(int j = 0; j < 5; j++) {
//				arr[j] = scan.nextInt();
//				
//				sum += arr[j] * price[j];
//				//입력받은 값을 가격과 곱해준다.
//			}
//			
//			System.out.println("$"+String.format("%.2f", sum));
//			//0이어도 뒤에자리를 제거하지 않고 출력함 
//			//2자리 출력을 위해 .2f 설정
//		}
		
		
		//		[10539] 수빈이와 수열	[완료]	
		
		
//		Scanner scan= new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		int count = 2;
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//			
//		}
//		
//		int sum = 0;
//		for(int i = 1; i < n; i++) {
//			sum = arr[i] * count;
//			for(int j = 0; j < i; j++) {
//				sum -= arr[j];
//				
//			}
//			count++;
//			arr[i] = sum;
//		}
//		//반대로 풀기 공식
//		//현재 위치의 값 곱하기 현재 위치
//		//빼기 변경된 배열에 저장된 값
//		for(int i = 0; i < n; i++) {
//			System.out.print(arr[i]+ " ");
//		}
		
///////////////////////////////////////////////////////////////////////	913공부
		
		//		[10158] 개미 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int w = scan.nextInt();
//		int h = scan.nextInt();
//		
//		int inputW = scan.nextInt();
//		int inputH = scan.nextInt();
//		int time = scan.nextInt();
//		
//		int [][] arr = new int [w + 1][h + 1];
//		// 배열은 0부터 시작하기 때문에 하나씩 더해줌
//		for(int i = 0; i <= w; i++) {
//			for(int j = 0; j <= h; j++) {
//				arr[i][j] = j;
//			}
//		}
//		
//		int count = 0;
//		
//		int i = inputW;
//		int j = inputH;
//		boolean flagi = true;
//		boolean flagj = true;
//		
//		while(count != time) {
//			if(i >= w) {
//				flagi = false;
//			}else {
//				 if(i == 0)
//				flagi = true;
//			}
//			//행 max 및 min 여부 체크
//			//max 면 i-- min i++
// 			
//			
//			if(j >= h) {
//				flagj = false;
//			}else {
//				 if(j == 0)
//				flagj = true;
//			}
//			//열 max 및 min 여부 체크
//			//max 면 j-- min j++
//			
//			
//			if(i < w && flagi == true) {
//				i++;
//				}else {
//					i--;
//				}
//			
//			if(j < h && flagj == true) {
//				j++;
//			}else {
//				j--;			
//			}
//			count++;
//		}
//		
//		System.out.println(i + " " + j);
		
		
		//		[2502]	[아직 안품 다시보기]
		
//		int day = scan.nextInt();
//		int total = scan.nextInt();
//		
//
//		int a = 1;
//		int b = 2;
//		int firstA = a;
//		int firstB = b;
//		
//		int plus = 1;
//		int plus2 = 2;
//		int sum = 0;
//		int count = 0;
//		
//		while(sum != total && count != day) {
//			
//			if(sum > total || count > day) {
//				sum = 0;
//				count = 0;
//				plus++;
//			}
//			
//			sum = a + b;
//			a = b;
//			b = sum;
//			count++;
//				
//			if(b > (total / day) + 1) {
//					a = plus2; 
//					b = a + 1;
//					firstA = a;
//					firstB = b;
//					plus = 1;
//				}else {
//					a = 1;
//					b = a + plus;
//					firstA = a;
//					firstB = b;
//					plus++;
//				}
//
//			System.out.println(firstA + " " + firstB);
//
//			
//
//			
//		
//		}
//			System.out.println(firstA + " " + firstB);
//			

		
///////////////////////////////////////////////////////////////////////	914공부

		//		[17362] [완료]
		
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int count = 1;
//		int change = -1;
//		
//		for(int i = 1 ; i < n; i++) {
//			if(count <= 1 ) {
//				change *= -1;
//			}
//			
//			count += change;
//
//			
//			if(count >= 5) {
//				change *= -1;
//			}
//			//첫번째부터 5번쨰 손가락 까지는 하나씩 더해준다.
//			//손가락 번호가 5가 됬을때는 -1을 곱해 다시 
//			//1이 되기 까지 곱해준다.
//		}
//		
//		System.out.println(count);
		
	
		
///////////////////////////////////////////////////////////////////////	915공부
		
		//		[1350] 진짜 공간 [완료]
		
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int [] file = new int [n];
//		
//		
//		for(int i = 0; i < n; i++) {
//			file[i] = scan.nextInt();
//		}
//		
//		int cluster = scan.nextInt();
//		int sum = 0;
//		//클러스터를 더해줄 변수
//		
//		for(int i = 0; i < n; i++) {
//			loop : while(true) {
//				if(file[i] == 0) {
//					break loop;
//				}
//				//0이면 클러스터가 할당 되지 않음
//				//while문 탈출
//				
//				file[i] = file[i] - cluster;
//				sum += cluster;
//				//해당 값에 클러스터 값을 빼줌
//				//이후 sum 에 클러스터값 더해줌
//				if(file[i] <= 0) {
//					break loop;
//				}
//				//0 보다 작으면 더이상 클러스터 할당 불필요
//				//while문 탈출
//			}
//		}
//		
//		System.out.println(sum);
		
		
///////////////////////////////////////////////////////////////////////	916공부
		
		//		[3062] [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String reverseN = "";
//		int numberN =0;
//		
//		
//		int testCase = scan.nextInt();
//		
//		for(int T = 0; T < testCase; T++) {
//			String n = scan.next();
//			for(int i = n.length() - 1; i >= 0 ; i--) {
//			reverseN = reverseN + n.charAt(i);
//		}
//		//초기 입력 받은 값을 뒤집어 변수에 넣어줌
//		if(n.length() > 1) {
//			numberN = Integer.parseInt(n) + Integer.parseInt(reverseN);
//			}else {
//				numberN = Integer.parseInt(n);
//			}
//		//해당 두값을 더해서 numberN에 넣어줌 
//		//만약에 한자리면 더할 필요 없이 그냥 n값만 넣어줌
//		
//		
//		String textN = Integer.toString(numberN);
//		//다시 스트링 속성으로 변환
//		
//		if(textN.charAt(0) == textN.charAt(n.length()-1)) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
//		//처음 자리와 끝자리 비교하여 같으면 Yes
//		//아니면 No 출력
//				}

		
///////////////////////////////////////////////////////////////////////	917공부		
		
		//		[2858] 기숙사 바닥 [완료]
//		Scanner scan = new Scanner(System.in);
//		int Bn = scan.nextInt(); 
//		int Rn = scan.nextInt();
//		
//		
//		int sum = Bn + Rn;
//		//주어진 값에 합을 구함
//		
//		int H = 3;
//		int W = 3;
//		//초기값 설정
//		//빨간 타일이 하나만 있는 바닥 설정
//		//해당 값보다 작을시 빨간타일이 없음
//		
//		
//		if(sum < 9) {
//			System.out.println(-1);
//			//9보다 작으면 빨간타일 없음
//		}else {
//			while(sum != H * W || sum > H * W ) {
//				if(sum > H * W) {
//					if(H == W) {
//						H++;
//					}else {
//						W++;
//					}
//				}
//			}
//			//항상 열의 값이 크기 때문에 우선적으로 열 값을 증가시킴
//			//열값이 클경우에는 다음에는 행 값을 더해주면서 비교
//			//sum 값가 같아지거나 커지면 반복문 탈출
//			
//			if(sum == H * W) {
//				System.out.println(H + " " + W);
//			}else {
//				System.out.println(-1);
//			}
//			//값 체크 후 같으면 출력
//			//다르면 -1
//			
//			
//		}
		
		
		//		[1773] 폭죽쇼 [완료]
		
		
//		Scanner scan = new Scanner(System.in);
//		int Student = scan.nextInt();
//		int End = scan.nextInt();
//		
//		int [] timeline = new int [Student];
//		int sum = 0;
//		int mok = 0;
//		
//		for(int i = 0; i < Student; i++) {
//			timeline[i] = scan.nextInt();
//			mok = End / timeline[i];
//			sum += mok;
//		}
//		//공배수 고려하지 않고 우선적으로
//		//각 주기별 최대한 볼 수 있는 수를 구함
//		
//
//		boolean flag = true;
//		//공배수 체크 변수
//		for(int i = 1; i <= End; i++) {
//			loop : for(int j = 0; j < Student; j++) {
//				if(i % timeline[j] != 0 ) {
//					flag = false;
//					break loop;
//					//학생들의 모든 주기가 다 0이 아니기 때문에
//					//공배수 아님 flag false 변경 후 탈출
//				}else {
//					flag = true;
//					//0 일 경우 true;
//				}
//
//			}
//				
//				if(flag) {
//					sum--;
//				}
//				//모든 변수 체크 후 공배수일 경우
//				//loop 탈출시 flag = true 값이 됨
//				//때문에 기존에 구했던 sum에서 하나 빼줌
//		}
//		
//		
//		System.out.println(sum);

		
///////////////////////////////////////////////////////////////////////	918공부			
		
		//소인수 분해하기
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int number, d, SqrtE;
//		int [] arr = new int [100];
//		int mok = 0, nmg = 0;
//		
//		int count = -1;
//		//배열 위치 지정 함수
//		number = scan.nextInt();
//		
//		while(true) {
//			 
//			d = 2;
//			//제곱근 까지 하나씩 더해줄 수
//			//1은 곱해도 1이기 때문에
//			//제외 시키고 시작점은 2부터 시작
//			
//			SqrtE = (int) Math.sqrt(number);
//			//정수 까지만 체크하면 되기 때문에
//			//int 형은로 변환을 해줌
//
//			while(true) {
//				if(d > SqrtE) {
//					d = number;
//					break;
//					//더 이상 d로 나누어 지는 값이 없어
//					//d가 SqrtE 보다 커진 경우
//					//number 자체가 소인수 이기 때문에
//					//d 값에 number 대입
//				}
//				
//				mok = number / d;
//				nmg = number - mok * d;
//				
//				if(nmg == 0) {
//					break;
//					//나머지가 0이 되는 수도 
//					//소인수 이기 때문에 배열 탈출
//				}else {
//					d++;
//				}
//				
//			}
//			count++;
//			arr[count] = d;
//			
//			if(number == d) {
//				break;
//			}
//			//number 와 d 값이 같은 경우
//			//더 이상의 소인수는 없음
//			//때문에 반복문 중단
//				number = mok;
//			//넘버를 몫값으로 초기화 해주고
//			//다음 소인수 체크
//		}
//		
//		for(int i = 0; i <=count; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
		//		[1773]		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		
//		int count = 0;
//
//		while(n >= m) {
//			n = n - m;
//			count++;
//		}
//		
//		System.out.println(count+ " " + n);
		
		//		[2014] 소수의 곱 [다시보기]
		
//		  	int k = scan.nextInt();
//		    int n = scan.nextInt();
//		 
//		    // http://mygumi.tistory.com/183
//		    // 소수 리스트, 소수와 비교하여 곱한 값 넣는 큐, 최종 리스트
//		    // 큐의 맨 앞 요소를 빼서 각 소수를 곱하면서 큐에 다시 넣을 것이다.
//		 
//		    long[] prime = new long[k];
//		    PriorityQueue<Long> q = new PriorityQueue<>();
//		 
//		    for (int i = 0; i < k; i++) {
//		        prime[i] = scan.nextInt();
//		        q.add(prime[i]);
//		    }
//		 
//		    long head = 0;
//		 
//		    for (int i = 0; i < n; i++) {
//		        // n번째 뺀 값이 n번째 수가 된다.
//		        head = q.poll();
//		 
//		        // 큐를 활용하여 삽입마다 오름차순으로 정렬됨으로써 원하는 값들을 리스트에 저장 가능.
//		        for (int j = 0; j < k; j++) {
//		            long value = head * prime[j];
//		            q.add(value);
//		 
//		            if (head % prime[j] == 0) {
//		                break;
//		            }
//		        }
//		    }
//		    System.out.println(head);
		
///////////////////////////////////////////////////////////////////////	922공부
		
		//		[1592] 영식이와 친구들 [완료]
		
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int arr [] = new int [n + 1];
//		
//		int m = scan.nextInt();
//		int l = scan.nextInt();
//		
//		int count = 1;
//		//배열의 위치를 지정해줄 변수
//		
//		int cnt = 0;
//		arr[1] = 1;
//		//1번째 사람이 처음 공은 받기 때문에
//		//초기 값 1을 더해주고 시작
//		while(true) {
//			if(arr[count] % 2 == 0) {
//				count = count - l;
//				//짝수일 경우 현재 위치에서 L만큼 빼준다.
//				if(count <= 0) {
//					count = n + count;
//				}
//				//배열이 0 부터 시작하기 때문에
//				//0이거나 0보다 작으면,
//				//위치를 시작의 끝점으로 바꾸어준다.
//				arr[count]++;
//				cnt++;
//				if(arr[count] == m) {
//					break;
//				}
//			}else {
//				//홀수일 경우 현재 위치에서 L만큼 더해준다.
//				count = count + l;
//				if(count > n) {
//					count = count - n;
//					if(count == 0) {
//						count = 1;
//					}
//					//배열이 0 부터 시작하기 때문에
//					//커진 시작점에서 전체 배열의 크기를 빼주어
//					//위치를 재설정해준다.
//					//배열이 0부터 시작하기 때문에 0일경우
//					//1로 시작점을 설정해준다.
//					
//				}
//				arr[count]++;
//				cnt++;
//				if(arr[count] == m) {
//					break;
//			}
//		}
//		
//	}
//		
//		System.out.println(cnt);
	
/////////////////////////////////////////////////////////////////////////	924공부
		
		//삽입 정렬
		
//		Scanner scan = new Scanner(System.in);
//		
//		int key = 0;
//		//비교가 되는 키값 변수
//		int location = 0;
//		//배열의 위치를 지정해 줄 변수
//		
//		int number = 0;
//		//배열의 값을 넣기 위한 변수
//		int [] arr= new int [11];
//		
//		
//		
//		do {
//			number++;
//			arr[number] = scan.nextInt();
//		}while(number < 9);
//		
//		//배열의 정렬을 원하는 값 입력
//		int temp = 0;
//		//j값을 잠시 담아둘 변수
//		
//		for(int i = 2; i <= 9; i++) {
//			key = arr[i];
//			//키값은 배열의 두번째 부터 시작해서 비교
//			for(int j = i-1; j >= 0; j--) {
//				//범위는 키값보다 하나 작은 값부터
//				//처음 범위까지 비교하면됨
//				if(arr[j] > key) {
//					arr[j + 1] = arr[j];
//					//비교하는 값이 더 크기 때문에
//					//그다음 수에 큰 값을 넣어줌
//					temp = j;
//				}else {
//					temp = j;
//					break;
//				}
//			}
//			
//			arr[temp + 1] = key;
//			//더이상 키값보다 작은 값이 없으므로
//			//작은값 +1 자리가 key의 자리가 됨
//			temp = 0;
//		}
//		
//		for(int i = 1; i < arr.length-1; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		

		//		[1747]	소수 & 팰린드롬 [아직 안품]
		
//		Scanner scan = new Scanner(System.in);
//		
//		String n = scan.next();
//		int tempN = Integer.parseInt(n);
//		int temp = 0;
//		int [] arr = new int [7];
//		//최대 백만 까지 이기 때문에
//		
//		int start = 0;
//		
//		while(true) {
//			loop : for(int i = 0 ; i < 7 ; i++ ) {
//				if(tempN == 0) {
//					break loop;
//				}
//				arr[i] = tempN % 10;
//				tempN = tempN / 10;
//			}
//			
//			int count = 0;
//			while(arr[count] == 0) {
//				start++;
//				count++;
//			}
//			
//			for(int i = start; i < 7; i++) {
//				if()
//				temp += arr[i] * 10;
//			}
//			
//		}
		
//		https://octorbirth.tistory.com/71
		
/////////////////////////////////////////////////////////////////////////	926공부
		
		
		//		[2436]	공약수
		
//		Scanner scan = new Scanner(System.in);
//		int g= scan.nextInt();
//		int l = scan.nextInt();
//		int val = 1;
//		int f = l / g;
//		for (int i = 2; i*i <= f; i++) {
//			if (f%i == 0 && gcd(i, f / i) == 1)
//				val = i;
//		}
//		System.out.printf("%d %d", g*val, g*(f / val));
//		
////		우선 두 자연수의 곱이 동일할 경우, 합이 최소가 되려면 두 수의 차가 최소여야합니다. 
////		그렇기에 주어진 최대공약수/최대공배수를 만족하면서 두 수의 차가 최소인 쌍을 찾아야합니다.
////
////		최대공약수를 g, 최대공배수를 l, 두 수를 A와 B라고 할 때 자명하게
////
////		A=ga, B=gb, gcd(a,b)=1, ab = l/g가 됩니다. 
////		그렇기에 저희는 곱이 l/g가 되면서 차는 최소인 두 수 a, b를 구하는 것으로 문제를 바꿔 생각할 수 있습니다.
////
////		이는 주어진 l/g에 대해 1부터 sqrt(l/g)까지로 나눠보면서 판단할 수 있습니다
//		
//		
//	}
//	
//	public static int gcd(int a, int b) {
//		if (a == 0)
//			return b;
//		return gcd(b%a, a);

		
		//		[2436] 이진수 합 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//
//		int number = 1;
//		int sum = 0;
//		while(true) {
//			String strNumber = Integer.toBinaryString(number);
//			//1부터 자릿수 체크를 위해 
//				//n 보다 자릿수가 커지면 break;2진수로 변환
//			if(strNumber.length() > n) {
//				break;
//			}else {
//				sum += number;
//				number++;
//				//n 보다 작거나 같으면 수를 더해줌
//			}
//		}
//		
//		String strSum = Integer.toBinaryString(sum);
//		//더한 값 다시 2진수 변환
//		System.out.println(strSum);
		
		
//		//		[5533] 유니크 [완료]
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int [][] arr = new int [n][3];
//		//주어진 게임횟수가 들어갈 배열
//		int [] sumarr = new int [n];
//		//게임점수 합이 들어갈 배열
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 3; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		for(int j = 0; j < 3 ; j++) {
//			for(int i = 0; i < n; i++) {
//				for(int k = i + 1; k <n; k++) {
//					if(arr[i][j] == arr[k][j]) {
//						arr[i][j] = 0;
//						arr[k][j] = 0;
//						//한 게임 마다 같은 수가 있는지 체크
//					}
//				}
//			sumarr[i] += arr[i][j];}
//			//비교가 끝나면 해당 값을 더해줌
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println(sumarr[i]);
//		}
		
		
/////////////////////////////////////////////////////////////////////////	927공부		
		
		
//		//		[2863] 이게 분수? [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int [] arr1 = new int [2];
//		int [] arr2 = new int [2];
//		double [] sum = new double [5];
//		//문제의 포인트는 초기 상태는 1회전으로 두지 않는다.
//		
//		
//		for(int i =0; i < arr1.length; i++) {
//			arr1[i] = scan.nextInt();
//		}
//		
//		for(int i =0; i < arr2.length; i++) {
//			arr2[i] = scan.nextInt();
//		}
//		//다중 배열이 아닌 배열 2개를 사용했다.
//		
//
//		double max = sum[0];
//		int count = 0;
//		
//		for(int i = 1; i <= 4; i++) {
//			int temp1 = arr1[0];
//			int temp2 = arr1[1];
//			//임시 변수를 만들어  옮길 배열을 
//			//잠시 담아두었다.
//			arr1[0] = arr2[0];
//			arr1[1] = temp1;
//			arr2[0] = arr2[1];
//			arr2[1] = temp2;
//			sum[i] = (arr1[0] / arr2[0]) + (arr1[1]  / arr2[1]);
//			//분자가 클수롤 그 값은 큰 값이기 때문에 /(몫) 연산을 사용
//			if(max < sum[i]) {
//				max = sum[i];
//				count = i;
//				//기존값과 비교
//			}
//		}
//		
//		System.out.println(count);
		
		
//		//		[1252] 이진수 덧셈 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String N = scan.next();
//		String M = scan.next();
//		
//		int [] sum = new int [80];
//		
//		int max = N.length() >= M.length() ? N.length() : M.length();
//		//몇번째 까지 입력되었는지 체크할 변수
//		
//		int C = 0;
//		//자리올림 체크 변수
//		
//		int [] arrN = new int [max];
//		int [] arrM = new int [max];
//		
//		int count = 0;
//		//배열위치 지정함수
//		for(int i = N.length()- 1; i >= 0 ; i--) {
//			arrN[count] = N.charAt(i) - '0';	
//			count++;
//		}	
//		//이진법은 뒤에서 부터 계산하기 때문에 뒤부터 배열에 넣어줌
//		
//		count = 0;
//		for(int i = M.length()- 1; i >= 0 ; i--) {
//			arrM[count] = M.charAt(i) - '0';
//			count++;
//		}
//		
//		
//		for(int i = 0; i < max; i++) {
//			sum[i] = arrN[i] + arrM[i] + C;
//			if(sum[i] >= 2) {
//				sum[i] -=2;
//				C = 1;
//			}else {
//				C = 0;
//			}
//		}
//		
//		
//		if(C == 1) {
//			//첫쨰 자리에 자리올림이 있었는지
//			//마지막으로 체크
//			sum[max] = 1;
//			for(int i = max; i >=0; i--) {
//				System.out.print(sum[i]);
//			}	
//		}else {
//			for(int i = max-1; i >=0; i--) {
//				System.out.print(sum[i]);
//			}
//			
//		}
		
		
/////////////////////////////////////////////////////////////////////////	928공부				
		
		
		//버블정렬 구현하기
		
//		Scanner scan = new Scanner(System.in);
//		int [] arr = new int [10];
//		//정렬할 숫자가 들어갈 배열
//		
//		int n = -1;
//		//입력받을 숫자의 개수가 저장될 변수
//		int count = 0;
//		//자료의 교환 횟수가 저장될 변수
//		int sw = 0;
//		//자료가 교환 되었는지 검사할 변수
//		
//		do {
//			n++;
//			arr[n] = scan.nextInt();
//		}while(n < 9);
//		//숫자 입력 반복문
//		
//		int temp = 0;
//		//위치를 바꿀때 숫자를 잠시 담아둘 변수
//		
//		for(int i = 1; i <=9; i++) {
//			sw = 0;
//			loop : for(int j = 0; j <= (9-i); j++) {
//				if(arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					count++;
//					sw = 1;
//				}
//			}
//			//sw 가 1이되면 자료가 변경되었다는 의미
//			//변경될게 없을떄까지 loop 문 반복
//			if(sw == 0)
//				break;
//		}
//		
//		for(int i =0; i < 10; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
//		//		[3049] [다시보기]
		
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 
//        int n = Integer.parseInt(br.readLine());
//        int ans = (n *(n-1)*(n-2)*(n-3)) / (4*3*2);
//        
//        bw.write(String.valueOf(ans) + "\n");
//        bw.flush();
//        bw.close();
		

		
//		//		[2153] 소수단어 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String n = scan.next();
//		Solve(n);
//	}
//	
//	public static void Solve(String n) {
//		int [] arr = new int [n.length()];
//		int sum = 0;
//		
//		for(int i = 0; i < n.length(); i++) {
//			arr[i] = n.charAt(i);
//			//해당 문자에 아스키 코드 값을 넣어줌
//			sum += arr[i];	
//			//문자마다 더해주어 합을 구함
//		}
//		
//		if(sum != 1 && sum != 2) {
//		//sum 1이거나 2일 경우 반복문 진행 불필요
//			for(int i = 2; i <= sum/2; i++) {
//			if(sum % 2 == 0) {
//				System.out.println("It is not a prime word.");
//				break;
//				//2부터 하나씩 증가해주면 소수인지 체크 
//				//나머지가 0일 경우 소수가 아님
//			}
//			
//			if(i == sum/2 && sum % 2 != 0) {
//				System.out.println("It is a prime word.");
//			}
//		}
//	}else {
//		System.out.println("It is a prime word.");
//	}
//	
//	}
	
	
		
//		//		[1551] 수열의 변화
		
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int K = scan.nextInt();
//		
//		
//		String number = scan.next(); 
//		int [] arr= new int [N];
//		
//		String[] temp = new String[41];
//		temp = number.split(",");
//		for(int i = 0; i < N; i++) {
//			arr[i] = Integer.parseInt(temp[i]);
//		}
//		
//		for(int i=0; i< K; i++)
//            for(int j=0; j<N-i-1; j++)
//                arr[j] = arr[j+1] - arr[j];
//         
//        for(int i=0; i<N-K; i++){
//            System.out.print(arr[i]);
//            if(i!=N-K-1)System.out.print(",");
//        }


///////////////////////////////////////////////////////////////////////	929공부

//		[2985] [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int [] arrNumber = new int [3];
//		//입력숫자가 들어갈 배열
//		
//		// "+", "-", "*", "/"
//		
//		
//		for(int i =0; i < 3; i++ ) {
//			arrNumber[i] = scan.nextInt();
//		}
//			
//		int answer = arrNumber[2];
//		
//			if(arrNumber[0] + arrNumber[1] == answer) {
//				System.out.println(arrNumber[0]+" + " + arrNumber[1] + " = " + answer );
//			}else if(arrNumber[0] - arrNumber[1] == answer) {
//				System.out.println(arrNumber[0]+" - " + arrNumber[1] + " = " + answer );
//			}else if(arrNumber[0] * arrNumber[1] == answer) {
//				System.out.println(arrNumber[0]+" * " + arrNumber[1] + " = " + answer );
//			}else {
//				System.out.println(arrNumber[0]+" / " + arrNumber[1] + " = " + answer );
//			}
//
//		// "+", "-", "*", "/"
//		// 어렵게 생각할 거 없이 수식이 단 4개 뿐임으로
//		// 모든 경우 if문을 구현하여 작성했다.

			

//			[2985] 
			
//			Scanner scan = new Scanner(System.in);
//			int [] arr = new int [3];
//			
//			
//			for(int i = 0; i < 3; i++) {
//				arr[i] = scan.nextInt();
//			}
//			
//			int car = arr[1] - arr[0]; 
//			//수열간에 차이를 넣을 변수;
//			
//			System.out.println(arr[2] + car);
//			//등차수열간에 차이는 항상 일정하기때문에
//			//마지막 값에 차이를 더해준 값을 출력하면 된다.
		
		
//			[5073] 삼각형과 세 변 [완료]
			
//			Scanner scan = new Scanner(System.in);
//
//			while(true) {
//				
//				int [] arr = new int [3]; 
//				int sum = 0;
//				double max = 0;
//				//최대 변의 길이를 담아줄 변수		
//				double [] temp = new double[3];
//				//가장 긴변은 나머지 두변의 합보다 작은 값은 체크를 위한
//				//나머지 두변 들어갈 변수
//				//제외한 나머지 변이 들어갈 변수
//				int tempCount = 0;
//				//탬프 변수 위치 지정변수
//				
//				for(int i =0; i < 3; i++) {
//					arr[i] = scan.nextInt();
//					sum += arr[i];
//					if(max < arr[i]) {
//						max = arr[i];
//					}else {
//						temp[tempCount] = arr[i];
//						tempCount++;
//					}
//				}				
//				if(sum == 0) {
//					System.out.println("프로그램종료");
//					break;
//				}
//				
//
//				int countMax = 0;
//				//최대 같은 변의 갯수를 넣어줄 변수
//				for(int i = 0; i < 3 - 1; i++) {
//					int count = 0;
//					//같은변을 셀 변수
//					for(int j = i + 1; j < 3; j++) {
//						if(arr[i] == arr[j]) {
//							count++;
//							//같으면 카운트 증가
//						}
//						if(countMax < count) {
//							countMax = count;
//						}
//						
//					}
//				}			
//				if(countMax == 0 && temp[0] + temp[1] < max) {
//					System.out.println("Invalid");
//				//가장 긴변은 나머지 두변의 합보다 작아야함	
//				}else if(countMax == 0 && temp[0] + temp[1] > max) {
//					System.out.println("Scalene");
//				//가장 긴변은 나머지 두변의 합보다 작아야함	
//				}else if(countMax == 1) {
//					System.out.println("Isosceles");
//				}else {
//					if(countMax == 2)
//					System.out.println("Equilateral");
//				}
//				
//				
//			}

		
		
		
//		[6591] 이항 쇼다운	[조합]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//	    while (true) {
//		int n = Integer.parseInt(bf.readLine());
//		int k = Integer.parseInt(bf.readLine());
//		
//		int div = 1;
//        long ans = 1;
// 
//        if (n == 0 && k == 0) {
//            break;
//        }
// 
//        if (n - k < k) {
//            k = n - k;
//        }
// 
//        while (k-- > 0) {
//            ans *= n--;
//            ans /= div++;
//        }
//        sb.append(ans + "\n");
//
//		System.out.println(sb.toString());
//	    }

//		[1188] 음식 평론가 [완료]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		
//		int sausage = Integer.parseInt(bf.readLine());
//		int man = Integer.parseInt(bf.readLine());
//		
//		int cut = 0;
//		//자른횟수를 계산할 변수
//		int count = 2;
//		//곱할때 사용할  변수
//		int tempSausage = sausage;
//		while(true) {
//			if(tempSausage % man != 0) {
//				tempSausage = sausage;
//				//자를때마다 처음소세지의 배수로 커지기 때문에
//				//초기화 해주어야 한다.
//				tempSausage = tempSausage * count;
//				count++;
//				//곱해줄수 하나씩 더해줌
//				cut++;
//				//자르는 횟수 더해줌
//			}else {
//				break;
//			}
//		}
//		
//		cut = cut * sausage;
//		//자른 수에 처음 소세지 갯수를 곱해준다.
//		//위의 반복문은 소시지 하나기준이 때문에
//		//총 소세지 개수를 곱해주어야 답이된다.
//		
//		System.out.println(cut);
		
		
///////////////////////////////////////////////////////////////////////	930공부
		
//		[2485] [완료]
				
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int tree = Integer.parseInt(bf.readLine());
//		
//		int [] arr = new int [tree];
//		int [] temp = new int [tree];
//		
//		int max = 10000000;
//		//각 배열의 차이값중 최솟값이 되는것이
//		//등차에서 가질수있는데 max 값이다.
//		for(int i = 0; i < tree; i++) {
//			arr[i] = Integer.parseInt(bf.readLine());
//			temp[i] = arr[i];
//		}
//		
//		for(int i = 0; i < tree - 1; i++) {
//			if(arr[i + 1] - arr[i] < max) {
//				max = arr[i + 1] - arr[i];
//			}
//		}
//		
//		int count = 0;
//		//가로수 갯수 셀변수
//		int minCount= 10000000;
//		
//		int plus = 1;
//		if(max != 1) {
//			plus = max / 2;
//				}
//		//등차변수
//		int i = 0;
//		//배열 위치 지정변수
//		while(true) {
//			
//			if(max < plus) {
//				break;
//			}
//		
//			
//			do{	
//			if(temp[i] + plus == temp[i + 1]) {
//				i++;
//				//플러스값을 더할때 다음값과 같으면
//				//카운트 필요없이 위치만 이동
//				}else if(temp[i] + plus < temp[i +1]) {
//					count++;
//					temp[i] = temp[i] + plus;
//					//풀러스 한 값이 작으면,
//					//위치 바꿀필요 없이 현재 위치에서 플러스만
//					//더해주고 카운트 더해줌
//				}else {
//					count = 99999;
//					//등차를 이루지 않기 때문에 멈추고
//					//카운트에 큰값을 넣어주어
//					//mincount에 들어가지 않게함
//					break;
//				}
//			}while(i < tree-1);
//			//i의 값이 마지막 위치가 되면 종료함
//			
//			if(count < minCount) {
//				minCount = count;
//			}
//			
//			count = 0;
//			i = 0;
//			plus++;
//			//사용변수 초기화
//			//플러스는 다음 등차비교 위해 하나 더해줌
//		
//			for(int reset = 0; reset < tree; reset++) {
//				temp[reset] = arr[reset];
//			}
//			//temp 배열 초기화 시켜줌
//			
//		}
//		
//		System.out.println(minCount);
//	}
	
	
	
//		[10166] [다시]
		
//		Scanner sc = new Scanner(System.in);
//
//		int D1 = sc.nextInt();
//		int D2 = sc.nextInt();
//		long ans = 0;
//		for (int i = D1; i <= D2; i++) {
//
//			// 1 ~ i 까지 중복체크
//			// 기약 분수로 나타냇을때 중복이 안되면 더한다.
//			// 결국 완탐..
//			for (int j = 1; j <= i; j++) {
//				// 1 / 1 북쪽 좌석
//				int gcd = GCD(i, j);
//				if (View[i / gcd][j / gcd])
//					continue;
//				ans++;
//				View[i / gcd][j / gcd] = true;
//			}
//
//		}
//		System.out.println(ans);
//	
//	
//	
//	
//	}
//	static boolean View[][] = new boolean[2001][2001];
//
//	static int GCD(int a, int b) {
//		// a >= b
//
//		while (b != 0) {
//			int c = a % b;
//			a = b;
//			b = c;
//		}
//		return a;

///////////////////////////////////////////////////////////////////////	1001공부
	
//		[10837] 동전 게임 [완료]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
//		int K = Integer.parseInt(bf.readLine());
//		int TestCase = Integer.parseInt(bf.readLine());
//
//		for(int i = 0; i < TestCase; i++) {
//			String [] arr = bf.readLine().split(" ");
//			int youngM = Integer.parseInt(arr[0]);
//			//영희의 점수
//			int dongN = Integer.parseInt(arr[1]);
//			//동수의 점수
//			int gap = Math.abs(youngM - dongN);
//			//두수의 차
//			int nmg = K - (youngM > dongN ? youngM : dongN);
//			//나머지 던지는 횟수
//			
//			if(youngM == dongN) {
//				System.out.println(1);
//			}else if(youngM > dongN) {
//				if(gap - nmg <= 2) {
//					System.out.println(1);
//				}else {
//					System.out.println(0);
//				}
//				//영희가 먼저 던지기 때문에 두수의 차가
//				//나머지가 2보다 크면 점수를 메꿀수 없음
//				
//			}else {
//				if(gap - nmg <= 1) {
//					System.out.println(1);
//				}else {
//					System.out.println(0);
//				}
//			}
//			
//			//동수는 영희보다 늦게 던지기 때문에 두수의 차가
//			//나머지가 1보다 크면 점수를 메꿀수 없음
//		}
	
	
//		[17256] 달달함이 넘쳐 흘러 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int [] a = new int [3];
//		for(int i =0; i < 3; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		
//		int [] c = new int [3];
//		for(int i =0; i < 3; i++) {
//			c[i] = scan.nextInt();
//		}
//	
//		int bx = c[0] - a[2];
//		int bz = c[1]  / a[1];
//		int by = c[2] - a[0];
//		//방정식 형태로 풀어서 출력하면된다.
//		
//		System.out.print(bx+ " " + bz+ " " + by);
		
		
//		[2484] 주사위 네개 [완료]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
//		int man = Integer.parseInt(bf.readLine());
//		int winner = 0;
//		//최대 상금 담을 변수	
//		
//		for(int i = 0; i < man; i++) {
//		String [] arr = bf.readLine().split(" ");
//				
//		int max = 0;
//		//같은 숫자중 최댓값 저장할 변수
//		int diceNumber = 0;
//		int OtherdiceNumber = 0;
//		int maxDiceNumber = 0;
//		
//		for(int j = 0; j< arr.length -1; j++) {
//			int count = 1;
//			//같은 숫자 최댓값 찾을 변수	
//			for(int k = j + 1; k <  arr.length; k++) {
//				if(arr[j].equals(arr[k])) {
//					count++;
//				}
//			}
//	
//			if(max < count) {
//				max = count;
//				diceNumber = Integer.parseInt(arr[j]); 
//				//주사위 면을 저장할 변수	
//			}else {
//				if(max == 2 && count == 2) {
//					OtherdiceNumber = Integer.parseInt(arr[j]); 
//					//3번 조건 체크 하기 위한 식
//				}			
//				if(maxDiceNumber < diceNumber) {
//					maxDiceNumber = diceNumber;
//					//모두 다를 경우 대비한 식
//					//나온 주사위 눈준 가장 큰수 저장
//				}
//			}
//		
//		}
//
//			int sum = 0;
//			//합계가 저장될 변수
//			if(max == 4) {
//				sum = 50000 + (diceNumber*5000);
//			}else if(max == 3) {
//				sum = 10000 + (diceNumber*1000);
//			}else if(max == 2 && OtherdiceNumber != 0) {
//				sum = 2000 + (diceNumber * 500) + (OtherdiceNumber * 500);
//			}else if(max == 2) {
//				sum = 1000 + (diceNumber * 100);
//			}else {
//				sum = maxDiceNumber * 100;
//			}
//			//주사위 최대변수에 대한 식
//			
//			if(winner < sum) {
//				winner = sum;
//			}
//		}
//		
//		System.out.println(winner);
		
/////////////////////////////////////////////////////////////////////	1002공부		

		
//		[13900] [완료]		
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(bf.readLine());
//		String [] arr = bf.readLine().split(" ");
//		
//		//주어진 입력값 예시
//		//(1*2)+(1*3)+(1*4)+(2*3)+(2*4)+(3*4)
//		//앞의 항이 하나씩 커질수로 뒤에항의 곱해지는 값은 하나씩 적어짐
//		//(1*(2+3+4))+(2(3*4))+(3*4)
//		//위처럼 식을 바꿀 수 있음
//		//위의 내용을 식을 코드로 바꾸면 아래와 같음
//		
//		int sum = 0;
//		for(int i = 0; i < n - 1; i++) {
//			int tempSum = 0;
//			//앞에 곱해줄 수 i 0, 1, 2 순으로 바뀜 
//			for(int j = i + 1; j < n; j++) {
//				tempSum += Integer.parseInt(arr[j]);
//				//더해서 곱해줄 뒤엣수 j i보다 하나 큰값부터 마지막 값가지 더해줌
//			}
//			sum += Integer.parseInt(arr[i]) * tempSum;
//		}
//		
//		System.out.println(sum);
		
//		[10179] 쿠폰 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		double []arr = new double [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextDouble();
//			double sum = arr[i] * 80 / 100;
//			//20 할인이니까 80 곱한후 100으로 나누어줌
//			System.out.println("$"+ String.format("%.2f", sum));
//			//String format메소드 활용하여 "%.2f"소숫점 둘째자리까지 출력함
//		}
		
//		[15667] [완료] 
		
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int fireNumber = 1;
//		while(fireNumber != 10) {
//			int sum = 1;
//			//처음 불꽃은 무조건 1번임
//			sum += fireNumber +(fireNumber * fireNumber);
//			//처음 갈래에 그다음 (갈래 *갈래) 해주면 총 불꽃수를 알수 있음
//			if(sum == n) {
//				break;
//			}else {
//				fireNumber++;
//			}
//			
//		}
//		
//		System.out.println(fireNumber);
		
		
/////////////////////////////////////////////////////////////////////	1003공부		

		
//			[1356] 유진수 [완료]		

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String n = bf.readLine();
//		int [] arr = new int [n.length()];
//		
//		
//		for(int i = 0; i < n.length(); i++) {
//			arr[i] = n.charAt(i) - '0';
//		}
//		
//		int count = 1;
//		//곱해주는 범위를 지정해주는 변수
//		//초기 값 1
//		//ex) 1234 일 때 1까지
//		loop1 : while(true) {		
//			if(count > arr.length -1) {
//				System.out.println("NO");
//				break loop1;
//			}
//			//카운트가 배열의 위치보다 커지면 반복문 종료
//			
//			int frontM = 1;
//			int backM = 1;
//			//앞자리 뒷자리 곱을 저장해줄 변수
//			for(int i = 0; i < count; i++) {
//				frontM *= arr[i];
//			}
//			//앞자리곱계산
//			for(int i = count; i < arr.length; i++) {
//				backM *= arr[i];
//			}
//			//뒷자리곱계산
//			if(frontM == backM) {
//				System.out.println("YES");
//				break loop1;
//			}else {
//				count++;
//			}
//			//같은지 여부 체크후 아니면 곱위치를 증가시켜줌
//			
//		}
		
//		[17388] 와글와글 숭고한
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));			
//		int [] arr = new int [3];
//		int sum = 0;
//		int min = 999999;
//		
//		for(int i = 0; i < 3; i++) {
//			arr[i] =  Integer.parseInt(bf.readLine()); 
//			sum += arr[i];
//			if(arr[i] < min) {
//				min = arr[i];
//			}			
//		}
//		
//		if(sum >= 100) {
//			System.out.println("OK");
//		}else {
//			if(arr[0] == min) {
//				System.out.println("Soongsil");
//			}else if(arr[1] == min) {
//				System.out.println("Korea");
//			}else{
//				System.out.println("Hanyang");
//			}
//		}

		
/////////////////////////////////////////////////////////////////////////	1004공부		
		
//		[2033] 반올림 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String n = scan.next();
//		
//		int [] arr = new int [n.length() + 2];
//
//		
//		int temp = 0;
//		//n의 초기 문자위치 지정할 변수
//		for(int i = 2; i < arr.length; i++) {
//			arr[i] = n.charAt(temp) - '0';
//			temp++;
//		}
//		//초기배열 {0,0,1,5}
//		//올림을 생각해 앞에 자리 여유를 줌
//		
//		for(int i = arr.length - 1; i > 2; i--) {
//			if(arr[i] >= 5) {
//				arr[i] = 0;
//				arr[i -1] += 1;
//			}else {
//				arr[i] = 0;
//			}
//		}
//		//맨끝자리부터 앞에 한자리를 제외한 숫자 까지 반올림
//		
//		
//		if(arr[2] > 9) {
//		int mok = arr[2] / 10;
//		int nmg = arr[2] % 10;
//		arr[1] += mok;
//		
//		if(nmg >= 5) {
//			arr[1] += 1;
//		}else {
//			arr[2] = 0;
//		}
//		}
//		//첫자리 올림이 있엇나 비교함
//		//올림이 있으면 목만큼 올려주고
//		//나머지가 5가 아닐 경우 0을 대입함
//		
//		
//		if(arr[1] == 0) {
//			for(int i = 2; i <arr.length; i++) {
//				System.out.print(arr[i]);
//			}
//		}else {
//				for(int i = 1; i <arr.length; i++) {
//					System.out.print(arr[i]);
//				}
//			}
	

//		[15873] 공백 없는 ~~~[완료]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String n = bf.readLine();
//		
//		int [] arr = new int[n.length()];
//		
//		for(int i =0; i <arr.length; i++) {
//			arr[i] = n.charAt(i) - '0';
//		}
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				arr[0] *= 10;
//			}else {
//				arr[0] += arr[i];
//			}
//		}
//		//0일 경우 연속된 수임으로 * 10 
//		//아닐경우 더해줌
//		System.out.println(arr[0]);
		

		
//		[15780] 멀티탭충분하니? [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int Student = scan.nextInt();
//		int MutiN = scan.nextInt();
//		//멀티탭수
//		
//		int [] arr= new int [MutiN];
//		
//		int sum = 0;
//		//사용 가능 멀티탭 구멍 갯수 샐 변수
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//			if(arr[i] % 2 == 0) {
//				sum += arr[i] / 2;		
//			}else {
//				sum += (arr[i] / 2)  + 1;
//			}
//		}
//		//한칸씩 뛰어주어야 하기 때문에
//		//짝수의 구멍이면 (n / 2) 개가 사용가능하며,
//		//홀수의 구멍이면 (n / 2) + 1 개가 사용가능하다.
//		
//		
//		if(sum >= Student) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		
/////////////////////////////////////////////////////////////////////////	1005공부	
		
//		[3035] 스캐너 [몰겟음]
		
		  
		   
//		   int R = scan.nextInt();
//		   int C = scan.nextInt();
//		   int ZR = scan.nextInt();
//		   int ZC = scan.nextInt();
//		   
//		   String [][] arr = new String [51][51];
//		   
//		    for (int i = 0; i < R; ++i) {
//		    	for (int j = 0; j < C; ++j) {
//		    		arr[i][j] = scan.next();
//		    	}
//		    }
//		 
//		    for (int i = 0; i < R; ++i) 
//		        for (int l = 0; l < ZR; ++l) 
//		            for (int j = 0; j < C; ++j) 
//		                for (int k = 0; k < ZC; ++k)
//		                    System.out.printf("%c", arr[i][j]);
		            
		
		
//		[2755] 이번학기 평점은 몇점 [완료]
		
//		int n = scan.nextInt();
//		String [][] arr = new String [n][3];
//	
//		double sum = 0;
//		//학점 * 성적의 합이들어갈 변수
//		double haksum = 0;
//		//학점의 합이들어갈 변수
//		for(int i = 0; i < n; i++) {
//			double temp = 0;
//			//한 과목의 성적이 임시로 들어갈 변수
//			for(int j = 0; j < 3; j++) {
//			arr[i][j] = scan.next();
//			}	
//			String score = arr[i][2];				
//			if (score.charAt(0) == 'A') temp = 4; 
//			if (score.charAt(0) == 'B') temp = 3; 
//			if (score.charAt(0) == 'C') temp = 2; 
//			if (score.charAt(0) == 'D') temp = 1;
//		    if (score.charAt(1) == '+') temp += 0.3; 
//		    if (score.charAt(1) == '-') temp -= 0.3;
//			//각 스트링 값당 점수를 부여하는 과정
//		    
//			sum += Integer.parseInt(arr[i][1]) * temp;	
//			//총합  = 학점 * 성적
//			haksum += Integer.parseInt(arr[i][1]);
//			//학점합  += 학점 
//		}
//
//		System.out.println(String.format("%.2f", sum/haksum));
//		//스트링 포멧 활용하여 2자리까지 출력
		
	
/////////////////////////////////////////////////////////////////////////	1006공부			
		
		// dfs 탐색 코드
		
//		Scanner scan = new Scanner(System.in);
//        nV = scan.nextInt();
//        nE = scan.nextInt();
//        ad = new int[nV+1][nV+1]; // 변수 초기화
//        visit = new boolean[nV+1]; // 변수 초기화
//        
//        for(int i = 0; i < nE; i++){
//            int t1 = scan.nextInt();
//            int t2 = scan.nextInt();
//            
//            ad[t1][t2] = ad[t2][t1] = 1;
//        }
//        
//        dfs(1); // 1번부터 탐색 시작
//
//	}
		//ex) 입력 값 nV = 6;
		// nE =8;
		//1 5
		//1 6
		//2 3
		//2 4
		//2 6 
		//3 4
		//3 5
		//5 6
	
//		//함수 지정 부분
//		static int nE;// 간선의 개수
//	    static int nV;//정점의 개수
//	    static int[][] ad;   
//	    static boolean[] visit; 
//
//	    public static void dfs(int i){
//	        visit[i] = true;   // 함수 호출 시, visit 했음을 표시
//	        System.out.print(i+ " ");
//	        
//	        for(int j = 1; j < nV+1; j++){
//	            if(ad[i][j] == 1 && visit[j] == false){  // j를 방문하지 않았으면 j를 방문한다.
//	                dfs(j);
//	            }
//	        }
		
		
		
//		//ArrayList 이론 정리
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
//		list.remove(1);  //index 1 제거
//		//배열값 하나 삭제시 모두 앞으로 땡겨저 다시 0번부터 시작할수 잇게한다.
//		list.clear();  //모든 값 제거
//		list.add(45);//숫자 삽입
//		System.out.println(list.size());		
//		System.out.println(list);
//		System.out.println(list.get(1));
//		
//		System.out.println("_______________________________________");
//		
//		for(Integer i : list) { //for문을 통한 전체출력
//		    System.out.print(i);
//		}
//
//		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
//		System.out.println(list.indexOf(1)); //1이 있는 index반환 없으면 -1
		
		
//		Queue<Integer> q = new <Integer>LinkedList();
//		
//		q.offer(1);
//		q.offer(2);
//		q.offer(3);
//		
//		System.out.println(q.poll());
//		System.out.println(q.peek());
		
/////////////////////////////////////////////////////////////////////////	1008공부			
		
//		[1260] dfs bfs
		
//		Scanner scan = new Scanner(System.in);
//		nV = scan.nextInt();
//		nE = scan.nextInt();
//		int start = scan.nextInt();
//		ad= new int [nV + 1][nV + 1];
//		visit = new boolean [nV + 1];
//		adB= new int [nV + 1][nV + 1];
//		visitB = new boolean [nV + 1];
//		
//		for(int i = 0; i < nE; i++) {
//			int t1 = scan.nextInt();
//			int t2 = scan.nextInt();
//			
//			ad[t1][t2] = ad[t2][t1] = 1;
//			adB[t1][t2] = adB[t2][t1] = 1;
//		}
//		
//		dfs(start);
//		System.out.println();
//		bfs(start);
//		
//		}
//	
//	
//	static int nE;
//	static int nV;
//	static int ad [][];
//	static int adB [][];
//	static boolean visit[];
//	static boolean visitB[];
//	
//	public static void dfs(int i) {
//		visit[i] = true;
//		System.out.print(i+ " ");
//		
//		for(int j = 1; j < nV + 1; j++) {
//			if(ad[i][j] == 1 && visit[j] == false) {
//				dfs(j);
//			}
//		}
//	}
//	
//	
//	public static void bfs(int i) {
//		Queue <Integer> q = new <Integer> LinkedList();
//		q.offer(i);
//		visitB[i] = true;
//		
//		while(!q.isEmpty()) {
//			int temp = q.poll();
//			System.out.print(temp + " ");
//			
//			for(int j = 1; j < nV + 1; j++) {
//				if(adB[temp][j] == 1 && visitB[j] == false) {
//					q.offer(j);
//					visitB[j] = true;
//				}
//			}
//		
//		}
	
	
	
//		[2178]미로탐색	 [다시보기]
			
		
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        StringTokenizer st = new StringTokenizer(br.readLine());
//
//	        N = Integer.parseInt(st.nextToken());
//	        M = Integer.parseInt(st.nextToken());
//
//	        map = new int[N][M];
//	        visited = new boolean[N][M];
//
//	        for (int i = 0; i < N; i++) {
//	            st = new StringTokenizer(br.readLine());
//	            String line = st.nextToken();
//	            for (int j = 0; j < M; j++) {
//	                map[i][j] = line.charAt(j) - '0';
//	            }
//	        }
//
//	        bfs(0,0);
//
//	        System.out.println(map[N-1][M-1]);
//	}
//
//    static int[] dr = {1,-1,0,0};
//    static int[] dc = {0,0,-1,1};
//    static boolean[][] visited;
//    static int[][] map;
//    static int N,M;
//	
//    public static void bfs(int i, int j){
//        Queue<int[]> q = new LinkedList<>();
//        q.offer(new int[] {i,j});
//        while(!q.isEmpty()){
//            int location[] = q.poll();
//            visited[i][j] = true;
//
//            for(int dir = 0; dir<4; dir++){
//                int r = location[0] + dr[dir];
//                int c = location[1] + dc[dir];
//                
//                //좌표가 -1이 되거나 N or M이 되어 map의 범위를 벗어나면 안되므로
//                if(r >= 0 && c >= 0 && r < N && c < M){
//                    if(map[r][c] != 0 && !visited[r][c]){
//                        q.offer(new int[] {r,c});
//                        visited[r][c] = true;
//                        map[r][c] = map[location[0]][location[1]] + 1;
////                        출력값 체크 를 위한 부분
//       
//                        System.out.println();
//                        System.out.println(location[0] +" "+location[1]);
//                        System.out.print("배열의 위치는 " + r + " " + c );
//                        System.out.println();
//                        System.out.println("이동횟수는 " + map[r][c]);
//                    }
//                }
//            }
//        }
    
	
///////////////////////////////////////////////////////////////////////	1009공부	

		// [6502] 동혁 피자 [완료]
		
//			Scanner scan = new Scanner(System.in);
//			int count = 0;
//			while(true){
//			int sum = 0;
//			//식탁크기 초기화
//			double r = scan.nextDouble();
//			if(r== 0) {break;}
//			double w = scan.nextInt();
//			w = Math.pow(w, 2);
//			double l = scan.nextInt();
//			l = Math.pow(l, 2);
//			r = r * 2;
//			//식탁의 넓이를 측적함 
//			count++;
//			//사각형의 대각선의 길이가 지름보다 작거나 같으면 올릴 수 있다.
//			if(r >= Math.sqrt(w + l)) {
//				System.out.println("Pizza " + count + " fits on the table");
//			}else {
//				System.out.println("Pizza " + count + " does not fits on the table");
//			}
//
//		}
			
			
			
			// [7510]	고급수학 [완료]
			
//			Scanner scan = new Scanner(System.in);			
//			int Tcase = scan.nextInt();			
//			int [] arr = new int[3];
//			int Tn = 0;
//			//출력횟수 넣어줄 변수
//			
//			for(int i = 0; i < Tcase; i++) {
//				int [] temp = new int[3];
//				//가장 큰 변을 제외한 나머지가 들어갈 배열
//				int count = 0;
//				//temp 배열 위치 지정 변수
//				int max = 0;
//				//최대 변 길이 들어갈 변수
//				for(int j = 0; j < arr.length; j++) {
//					arr[j] = scan.nextInt();
//					if(max < arr[j]) {
//						max = arr[j];
//					}
//
//				}
//			
//			for(int l = 0; l < arr.length; l++) {
//				if(arr[l] != max) {
//					temp[count] = arr[l];
//					count++;	
//				}
//			}
//				//max가 이닌 나머지 변을 temp에 넣어줌
//				
//			int sum = 0;
//			for(int k = 0; k < temp.length; k++) {
//				sum += Math.pow(temp[k], 2);
//			}
//			//짧은 두변 제곱합 구해줌
//			
//			Tn++;
//			if(Math.pow(max, 2) == sum) {
//				System.out.println("Scenario #"+ Tn + ":");
//				System.out.println("yes");
//			}else {
//				System.out.println("Scenario #"+ Tn + ":");
//				System.out.println("No");
//			}
//			//가장 긴변 제곱과 같은지 체크 해줌

		// [16431]베시아 데이지		[완료]
		
//		int []bessie = new int [2];
//		int []daisy = new int [2];
//		int [] arr = new int [2];
//		
//		for(int i = 0; i < 2; i++) {
//			bessie[i] = scan.nextInt();
//		}
//		
//		for(int i = 0; i < 2; i++) {
//			daisy[i] = scan.nextInt();
//		}
//		
//		for(int i = 0; i < 2; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		bessie[0] = Math.abs(bessie[0] - arr[0]);
//		bessie[1] = Math.abs(bessie[1] - arr[1]);
//		int bCount = bessie[0] >= bessie[1] ? bessie[0] : bessie[1];
//		//한턴에 모든 방향으로 이동 가능하기때문에 행이나 열중 차이가 큰게 그 턴에 최대 이동값이된다.
//		//때문에 행이나 열중 차이가 큰 값이 최소 이동거리가 된다.
//		daisy[0] = Math.abs(daisy[0] - arr[0]);
//		daisy[1] = Math.abs(daisy[1] - arr[1]);
//		int dCount = daisy[0] + daisy[1];
//		//한턴에 행이나 열중 하나 만 움직일 수 있으므로,
//		//주어진 목적지의 행열의 각 차이가 최소 이동거리가 된다.
//		
//		if(bCount < dCount) {
//			System.out.println("bessie");
//		}else if(bCount > dCount) {
//			System.out.println("daisy");
//		}else {
//			System.out.println("tie");
//		}
			
		
		
///////////////////////////////////////////////////////////////////////	1010공부			
		
//		// [2667] 단지번호 붙이기 [다시보기]
//		
//			
//		 n = scan.nextInt();
//		
//		map = new int [n][n];
//		visited = new int[n][n];
//		
//		for(int i = 0; i <n; i++) {
//			String str = scan.next();
//			for(int j = 0; j < n; j++) {
//				map[i][j] = str.charAt(j) - '0';
//			}
//		}
////	  		스트링 값으로 배열의 각 열의 값을 입력받음
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(map[i][j]== 1 && visited[i][j] == 0) {
//					cnt = 1;
//					solve(i, j);
//					al.add(cnt);
//				}
//			}
//		}
//		
//		Collections.sort(al);
//		
//		System.out.println(al.size());
//		
//		for(int i = 0; i <al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//	}
//	  
//		static int n, cnt;
//		static int [][]map;
//		static int [][]visited;
//		static int dx[] = {-1, 1, 0 ,0};
//		static int dy[] = {0, 0, -1, 1};
//		
//		static ArrayList al = new ArrayList();
//		
//		static int solve (int x, int y) {
//			
//			visited[x][y] = 1;
//			
//			for(int i = 0; i < 4; i++) {
//				int tx = x + dx[i]; 
//				int ty = y + dy[i];
//				
//				if(tx >=0 && ty >=0 && tx < n && ty < n) {
//					if(map[tx][ty] == 1 && visited[tx][ty] ==0) {
//						solve(tx, ty);
//						cnt++;
//					}
//				}
//				
//			}
//			return cnt;
		
//		// [1059] 수 2 [완료]
		
//		Scanner scan= new Scanner(System.in);
//		
//		int L = scan.nextInt();
//		int [] arr = new int [L];		
//		
//		for(int i = 0; i < L; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int N = scan.nextInt();
//		int start = 0;
//		int end = 0;
//		//시작 배열과 끝 배열의 위치를 받은 변수
//		
//		Arrays.sort(arr);
//		
//		for(int i = 0; i < L; i++) {
//			if(arr[i] < N) {
//				start = arr[i] + 1;
//				end = arr[i + 1] - 1;
//			}
//		}
//		//포함하지 않는 범위여야 하기 때문에
//		//시작은 +1 끝은 -1을 해줌
//		
//		int count = 0;
//		//unlucky 갯수를 세줄 변수
//		int tempEnd = end;
//		//끝값을 임시로 받아줄 변수
//		//end 값을 하나씩 빼가면서 비교해 줄 거길 때문에
//		//초기화용 변수 이다.
//		while(start != end) {
//		for(int i = start; i <= tempEnd; i++) {
//			if(start <= N && end >= N &&(start != end)) {
//				count++;
//			}
//			end--;
//		}
//		//스타트와 엔드 구간안에 있거나 같으면 count를 하나씩 더해줌
//		//이후 end 값을 하나씩 빼주면서 범위에 있는지 체크
//		
//		end = tempEnd;
//		//엔드값 초기화
//		
//		if(start + 1 != end) {
//			start = start + 1;
//		}else {
//			break;
//		}
//		//이번에는 스타트값을 하나더 해줌
//		//스타트값이 엔드값과 같을 경우에는 더이상 범위안에
//		//숫자가 없는 경우이기 때문에 종료
//		}
//		System.out.println(count);
//		
		
		
///////////////////////////////////////////////////////////////////////	1011공부		

//		// [1059] 수 이어쓰기 2 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int k = scan.nextInt();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for(int i = 1; i <=n; i++) {
//			String str = Integer.toString(i);
//			//n 까지의 값을 스티링으로 받아줌
//			for(int j = 0; j < str.length(); j++) {
//				int temp = str.charAt(j) - '0';
//				//두 자리 이상의 스트링을 하나씩 분리한 후
//				arr.add(temp);
//				//해당 arraylist에 담아줌
//			}
//		}
//		
//		System.out.println(arr.get(k -1));
//		//순서가 0부터 시작이기 때문에 k-1한 위치가 찾고자 한 위치임
		
		
		
//		// [3029] 경고 [완료]
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String start = br.readLine();
//		String end = br.readLine();
//		
//		int [] arrS = new int [6];
//		int [] arrE = new int [6];
//		int countS = 0;
//		int countE = 0;
//		
//		for(int i = 0; i < 6; i++) {
//			if(start.charAt(i) != 58) {
//				arrS[countS] = start.charAt(i) - '0';
//				countS++;
//
//			}
//			
//			if(end.charAt(i) != 58) {
//				arrE[countE] = end.charAt(i) - '0';
//				countE++;
//			}
//		}
//		
//		int hourS = arrS[0] * 10 + arrS[1];
//		int minuteS = arrS[2] * 10 + arrS[3];
//		int secondS = arrS[4] * 10 + arrS[5];
//		
//		int hourE = arrE[0] * 10 + arrE[1];
//		int minuteE = arrE[2] * 10 + arrE[3];
//		int secondE = arrE[4] * 10 + arrE[5];
//		
//		
//		int second = 0;
//		if(secondS <= secondE) {
//			second = secondE - secondS;
//		}else {
//			second = (60 - secondS) + secondE;
//			minuteS += 1;
//		//시작하는 초단위가 끝나는 초단위 보다 작은경우 분 올림 발생
//		}
//		//초단위 체크
//		
//		int minute = 0;
//		if(minuteS <= minuteE) {
//			minute = minuteE - minuteS;
//		}else {
//			minute = (60 - minuteS) + minuteE;
//			hourS += 1;
//		//시작하는 분단위가 끝나는 초단위 보다 작은경우 분 올림 발생	
//		}
//		//분단위 체크
//		
//		
//		if(hourS >= 25) {
//			hourS = 24;
//			hourE--;
//		}
//		//24시간이 넘어가는 경우 24시간으로 초기화 시켜주고
//		//끝나는 시간을 -- 해줌
//		
//		
//		int hour = 0;
//		if(hourS <= hourE) {
//			hour = hourE - hourS;
//		}else {
//			hour = (24 - hourS) + hourE;
//		}
//		//시간단위 체크
//		
//		String hourW;
//		if(hour < 10) {
//			hourW = '0' + Integer.toString(hour);
//		}else {
//			hourW = Integer.toString(hour);
//		}
//		String minuteW;
//		if(minute < 10) {
//			minuteW = '0' + Integer.toString(minute);
//		}else {
//			minuteW = Integer.toString(minute);
//		}
//		String secondW;
//		if(second < 10) {
//			secondW = '0' + Integer.toString(second);
//		}else {
//			secondW = Integer.toString(second);
//		}
//		//각 단위마다 10 이하인지 체크
//		
//		
//		System.out.println(hourW +":" +minuteW+ ":" +secondW);
		
		
///////////////////////////////////////////////////////////////////////	1012공부
		
		
//		// [17087] 숨바꼭질6
		
//	       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	        // reader writer 생성
//	 
//	        String[] info = br.readLine().split(" ");
//	        // info[0]에 N / info[1]에 S
//	        String[] temp = br.readLine().split(" ");
//	 
//	        int[] distance = new int[temp.length];
//	 
//	        for (int i = 0; i < temp.length; i++) {
//	            if (Integer.parseInt(temp[i]) > Integer.parseInt(info[1])) {
//	                distance[i] = Integer.parseInt(temp[i]) - Integer.parseInt(info[1]);
//	            } else {
//	                distance[i] = Integer.parseInt(info[1]) - Integer.parseInt(temp[i]);
//	            }
//	        }
//	 
//	        int brothersCnt = Integer.parseInt(info[0]);
//	 
//	        int answer = distance[0];
//	 
//	        if (brothersCnt != 1) {
//	            // 동생이 한명이 아니면 최대 공약수를 구한다
//	            for (int i = 1; i < distance.length; i++) {
//	                answer = gcd(answer, distance[i]);
//	            }
//	        }
//	 
//	        bw.write(String.valueOf(answer));
//	        bw.flush();
//		
//	}	
//    static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return gcd(b, a % b);
//        }
		
		
//		// [2606] 바이러스 [bfs문제]
		
		
//		Scanner sc = new Scanner(System.in);	
//		
//		int n= sc.nextInt(); // 컴퓨터의 수
//		int m = sc.nextInt(); // 네트워크 상에 연결되어 있는 컴퓨터 쌍의 수 즉, 간선의 수
//		
//		map=new int[n+1][n+1];
//		visited = new int[n+1];
//		for(int i=0;i<m;i++) { // 그래프 구성
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			map[a][b]=1;
//			map[b][a]=1;
//			
//		}
//		
//		bfs(1);
//		
//    }
//	
//	static int map[][]; // 그래프 배열
//	static int visited[]; // 방문 배열
//	static void bfs(int start) { // BFS 메소드
//		Queue<Integer> queue = new LinkedList<>();
//		visited[start] =1;	
//		queue.offer(start);
//		
//		int cnt = 0; // 감염 된 컴퓨터의 수
//		
//		while(!queue.isEmpty()) {
//			int x = queue.poll();
//			
//			for(int i=1; i< map.length; i++) { // 차례대로 1번과 연결 된 컴퓨터들을 찾아 cnt변수 증가 
//				if(map[x][i]==1 && visited[i]!=1) {
//					queue.offer(i);
//					visited[i] = 1;
//					cnt++;
//				}
//				//연결된 게 없을 경우 for문 탈출
//			}
//		}
//		System.out.println(cnt); //모든 탐색을 마치고 cnt 출력
		
//		// [1731] 추론 [완료]
		
//		Scanner scan= new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int[n];
//		
//		for(int i = 0; i < n; i++ ) {
//			arr[i] = scan.nextInt();
//		}
//
//		if(Math.abs(arr[0] - arr[1]) == Math.abs(arr[1] - arr[2])){
//			//등차일 경우 첫번째 값과 두번째 값이 차이의 절대값과
//			//두번째값과 세번째 값의 차이는 같아야 함
//			int next = Math.abs(arr[0] - arr[1]);
//			//등차일 경우 해당 등차 값을 변수에 넣음
//			System.out.println(arr[n-1] + next);
//		}else {
//			int next  = arr[1] / arr[0];
//			//등차가 아닐 경우 무조건 등비이기 때문에
//			//한 단계 큰 위치에 있는 수에서 전위치의 수를 나누어 주면,
//			//해당 수열의 등비를 알 수 있음
//			System.out.println(arr[n-1 * next]);
//		}
		
///////////////////////////////////////////////////////////////////////	1013공부

		
//		// [3474] 교수가 된 현우		
        
//		Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int num5 = 0;
//        for(int i=0;i<n;i++){
//            long num = input.nextLong();
//            for(int j=5;j<=num;j*=5){
//            	//처음은 5가 들어있는 모든 수의 갯수를 셈
//            	//다음은 25가 들어있는 모든 수의 갯수를 셈
//            	//..... 위과정 num보다 작을때까지 반복
//            	
//            	num5 += num/j;
//            }
//            System.out.println(num5);
//            num5 = 0;
//        }
		
	
//		// [10422] 괄효	[dp 점화식 문제]
		
//		int n = scan.nextInt();
//		
//		int [] arr= new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//			if(arr[i] % 2 != 0) {
//				System.out.println(0);
//			}else {
//				int count = 0;
//				int even = 2;
//				if(arr[i] == 2) {
//					System.out.println((int)Math.pow(2, count));
//				}else {
//					while(arr[i] != even) {
//						even = even + 2;
//						count++;
//					}
//					System.out.println((int)Math.pow(2, count));
//				}
//			}
//		}
//		위의 풀이는 아님
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//
//		long[] dp = new long[5001];
//		dp[0] = 1;
//		dp[2] = 1;
//		for(int i = 2; i <= 2500; i++) {
//			for(int j = 0; j <= i-1; j++) {
//				dp[i*2] += dp[j*2]*dp[(i-1-j)*2];
//				dp[i*2] %= 1000000007L;
//			}
//		}
//
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < N; i++) {
//			int n = Integer.parseInt(br.readLine());
//			sb.append(dp[n] + "\n");
//		}
//		System.out.println(sb);				
//
		
//		// [11724] 연결 요소의 개수 [dfs]
		
//		Scanner sc = new Scanner(System.in); 
//		
//		V = sc.nextInt();
//		E = sc.nextInt();
//		
//		int a,b;
//		for(int i = 0; i < E; i++) {
//			a = sc.nextInt();
//			b = sc.nextInt();
//			
//			// 간선 연결
//			graph[a][b] = graph[b][a] = 1;
//		}
//		
//		int result = 0 ;
//		
//		// dfs 탐색
//		for(int i = 1; i <= V; i++) {
//			if(visited[i] == false) { // 방문한 적 없는 노드라면 dfs.
//				dfs(i);
//				result++;
//			}
//		}
//		
//		System.out.println(result);
//		
//		sc.close();
//		return;
//	}
//		static int[][] graph = new int[1001][1001];
//		static int V;
//		static int E;
//		static boolean[] visited = new boolean[1001];
//		
//		public static void dfs(int index) {
//		if(visited[index] == true)
//			return;
//		else {
//			visited[index] = true;
//			for(int i = 1; i <= V; i++) {
//				if(graph[index][i] == 1) {
//					dfs(i);
//				}
//			}
//		}
			
		
		
///////////////////////////////////////////////////////////////////////	1014공부	
		
		
// 				[14502] 연구소 (dfs 백트래킹)
		
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        StringTokenizer st = new StringTokenizer(br.readLine());
//
//	        n = Integer.parseInt(st.nextToken());
//	        m = Integer.parseInt(st.nextToken());
//	        map = new int[n][m];
//	        copyed = new int[n][m];
//
//	        for (int i = 0; i < n; i++) {
//	            st = new StringTokenizer(br.readLine());
//	            for (int j = 0; j < m; j++) {
//	                map[i][j] = Integer.parseInt(st.nextToken());
//	                if (map[i][j] == 2)
//	                    virusList.add(new Dot(i, j));
//	            }
//	        }
//
//	        setWall(0, 0);
//	        System.out.println(max);
//		
//		
//	}
//    static class Dot {
//        int x, y;
//
//        public Dot(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    static int n;
//    static int m;
//    static int[][] map;
//    static int[][] copyed;
//    static List<Dot> virusList = new ArrayList<Dot>();
//    static int[] dx = {1, -1, 0, 0};
//    static int[] dy = {0, 0, 1, -1};
//    static int max = 0;
//    
//    static void setWall(int start, int depth) {
//        if (depth == 3) {
//            // 맵 복사
//            copyMap();
//
//            // 바이러스 퍼트리기
//            for (Dot dot : virusList) {
//                spreadVirus(dot.x, dot.y);
//            }
//
//            // 안전영역 크기 구하기
//            max = Math.max(max, getSafeArea());
//            return;
//        }
//
//        for (int i = start; i < n * m; i++) {
//            int x = i / m;
//            int y = i % m;
//
//            if (map[x][y] == 0) {
//                map[x][y] = 1;
//                setWall(i + 1, depth + 1);
//                map[x][y] = 0;
//            }
//        }
//    }
//
//    // 기존 맵을 유지하기 위해 바이러스 퍼트릴 맵 복사하기
//    static void copyMap() {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                copyed[i][j] = map[i][j];
//            }
//        }
//    }
//
//    // DFS 로 바이러스 퍼트리기
//    static void spreadVirus(int x, int y) {
//        for (int i = 0; i < 4; i++) {
//            int nx = x + dx[i];
//            int ny = y + dy[i];
//
//            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
//                if (copyed[nx][ny] == 0) {
//                    copyed[nx][ny] = 2;
//                    spreadVirus(nx, ny);
//                }
//            }
//        }
//    }
//
//    static int getSafeArea() {
//        int safe = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (copyed[i][j] == 0)
//                    safe++;
//            }
//        }
//        return safe;
//    }
	
//			[7576] 토마토  [다시보기 아직 안품]
		
//		n = scan.nextInt();
//		m = scan.nextInt();
//		
//		map = new int [n+1][m+1];
//		visited = new int [n+1][m+1];
//		
//		for(int i = 1; i <= n; i++) {
//			String str = scan.next();
//			for(int j = 1; j <= m; j++) {
//				map[i][j] = str.charAt(j - 1) - '0';
//			}
//		}
//			
//		
//		
//	
//	}
//	
//	static int n, m;
//	static int map [][];
//	static int visited [][];
//	static int [] dr = {-1,1,0,0};
//	static int [] dc = {0,0,-1,1};
//	static int count = 0;
//	static int start;
	

//			[2942] 퍼거슨과 사과 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int redApple = scan.nextInt();
//		int greenApple = scan.nextInt();
//		int player = 1;
//		//선수의 수 초기 값 1명 부터 시작
//		
//		while(player <= redApple || player <= greenApple) {
//			//선수가 둘의 사과중 적은 사과의 갯수보다 작거나 같을때까지만 반복
//			if(redApple % player == 0 && greenApple % player == 0) {
//				System.out.println(player + " " + redApple / player + " " +  greenApple / player);
//			//공평하게 나누기 위해서 사과를 선수수로 나누었을때 0의 값이 나와야함
//			}
//			player++;
//			//선수를 한명씩 추가해서 비교해봄
//		}
		
		
//		[1027] 고층건물 [다시보기]
		
//		int n, ans = 0, each_ans;
//	    double delta;
//	    boolean [] checker = new boolean[51];
//	    double [] height = new double[51];
//	    
//	     n = scan.nextInt();
//	    
//	    for (int i = 1; i <= n; i++)
//	      height[i] = scan.nextDouble();
//	    
//	    for (int i = 1; i <= n; i++)
//	    {
//	        for (int j = 1; j <= n; j++)
//	            checker[j] = true;
//	        
//	        for (int j = i-2; j >= 1; j--)
//	        {
//	            delta = ((double)(height[i] - height[j])) / ((double)(i - j));
//	            
//	            for (int k = j+1; k < i; k++)
//	            {
//	                if ( height[j] + (k-j)*delta <= height[k] )
//	                {
//	                    checker[j] = false;
//	                    break;
//	                }
//	            }
//	        }
//	        
//	        for (int j = i+2; j <= n; j++)
//	        {
//	            delta = ((double)(height[i] - height[j])) / ((double)(j - i));
//	            
//	            for (int k = j-1; k > i; k--)
//	            {
//	                if ( height[j] + (j-k)*delta <= height[k] )
//	                {
//	                    checker[j] = false;
//	                    break;
//	                }
//	            }
//	        }
//	        
//	        each_ans = 0;
//	        for (int j = 1; j <= n; j++)
//	        {
//	            if (checker[j])
//	                each_ans++;
//	        }
//	        
//	        ans = Math.max(ans, each_ans-1);
//	    }
//	    
//	    System.out.println(ans);
//	   
		
		
///////////////////////////////////////////////////////////////////////	1015공부			
	

//		[14726] 신용카드 판별 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int Tcase = scan.nextInt();
//		int [] CardNum = new int [16];
//		
//		int sum = 0;
//		
//		for(int i = 0; i < Tcase; i++) {
//			String str = scan.next();
//			for(int j = 0; j < 16; j++) {
//				CardNum[j] = str.charAt(j) - '0';
//			}
//			//우선 문자열로 받고 하나씩 잘라가며 배열에 넣어줌
//			
//			for(int k = 0; k < 16; k++) {
//				if(CardNum[k] % 2 == 0) {
//					CardNum[k] *= 2;
//					//짝수 체크후 짝수면 두배를 곱해줌
//					if(CardNum[k] >= 10) {
//					int temp = CardNum[k] % 10;
//					CardNum[k] /= 10;
//					CardNum[k] += temp;
//					//10이상일 경우 10으로 나눈 나머지를 temp변수에  임시보관 후
//					//현재 배열을 10으로 나눈 몫과 더해서 새로운 값을 넣어줌
//				}
//			}
//				sum += CardNum[k];
//				//해당값 총합에 넣어줌
//			}
//			System.out.println();
//			if(sum % 10 == 0) {
//				System.out.println("T");
//			}else {
//				System.out.println("F");
//			}
//			//10으로 나누어 나머지가 있나 체크
//			
//		}

		
//		[2991] 사나운개 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		//1번 개 짓는 시간, 쉬는 시간
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		//2번 개 짓는 시간, 쉬는 시간
//		
//		for(int i = 0; i < 3; i++) {
//			int man = scan.nextInt();
//			int nmg = man;
//			int count = 0;
//			while(true) {
//				nmg -= a;
//				if(nmg <= 0) {
//					count++;
//					break;
//				}
//				nmg -=b;
//				if(nmg <= 0) {
//					count = 0;
//					break;
//				}
//				//첫번째 개가 자는 여부 체크
//				
//			}
//			
//			
//			nmg = man;
//			//도착시간 초기화
//			//다음 개의 시간이랑 비교하기 위함
//			while(true) {
//				nmg -= c;
//				if(nmg <= 0) {
//					count++;
//					break;
//				}
//				nmg -=d;
//				if(nmg <= 0) {
//					count = 0;
//					break;
//				}
//				//두번째 개가 자는 여부 체크
//			}
//			
//			System.out.println(count);
//		}
	
///////////////////////////////////////////////////////////////////////	1016공부			
		

//		[12756] 고급 여관 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int Aattack = scan.nextInt();
//		int Ahp = scan.nextInt();
//
//		int Battack = scan.nextInt();
//		int Bhp = scan.nextInt();
//
//		while(true) {
//			Ahp -= Battack;
//			Bhp -= Aattack;
//			
//			if(Bhp <= 0 && Ahp >= 1) {
//				System.out.println("PLAYER A");
//				break;
//			}else if(Ahp <= 0 && Bhp >= 1) {
//				System.out.println("PLAYER B");
//				break;
//			}else if(Ahp >= 1 && Bhp >= 1) {
//				continue;
//			}else {
//				System.out.println("DRAW");
//				break;
//			}
//	
//		}

		
//		[11070] 피타고라스 기댓값	[완료]
		
//		Scanner scan = new Scanner(System.in);
//		int Tcase = scan.nextInt();
//		//케이스 변수
//		for(int i = 0; i < Tcase; i++) {
//			int team = scan.nextInt();
//			//팀변수
//			int [][] score = new int [2][team + 1];
//			//1행 득점 2행 실점이 담길 배열
//			int game = scan.nextInt();
//			//게임수 변수
//			int [][] arr = new int [game][4];
//			//게임수당 스코어 담길 배열
//			for(int j = 0; j < game; j++) {
//				for(int k = 0; k < 4; k++) {
//					arr[j][k] = scan.nextInt();
//				}
//				score[0][arr[j][0]] += arr[j][2];  
//				//a 팀 승점을 담아둠
//				score[1][arr[j][0]] -= arr[j][3];
//				//a 팀 실점을 담아둠				
//				score[0][arr[j][1]] += arr[j][3]; 
//				//b 팀 승점을 담아둠
//				score[1][arr[j][1]] -= arr[j][2];
//				//b 팀 실점을 담아둠
//			}
//			
//			double [] fscore = new double [team];
//			//최종 기댓값이 담길 배열
//			double max = 0;
//			double min = 9999;
//			for(int f = 0; f < team; f++) {
//				fscore[i] = Math.pow(score[0][f+1], 2)/(Math.pow(score[0][f+1], 2) + (Math.pow(score[1][f+1], 2)));
//				//공식 적용함 값 각 팀마다 넣어줌
//				fscore[i] *= 1000;
//				//최종값 1000곱해서 출력해야 함으로 1000곱해줌
//			
//				if(fscore[i] >= max) {
//					max = fscore[i];
//				}
//				
//				if(fscore[i] <= min) {
//					min = fscore[i];
//				}
//				//기댓값이 가장 큰 값과 작은값을 저장해줌
//			}
//
//				System.out.println((int)max);
//				System.out.println((int)min);
//			}

/////////////////////////////////////////////////////////////////////	1017공부
		
//		[2018] 수들의 합 5 [블로그]
		
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int n  = Integer.parseInt(bf.readLine());		
//		int count = 1;
//		//자기자신도 연속된 수에 포함되기 때문에 무조건 하나는 존재함
//		
//		for(int i = 1; i < (n / 2) + 1; i++) {
//			int sum = i;
//			//연속된 수의 시작값은 i 부터 시작함
//			for(int j = i + 1; i < (n / 2) + 2; j++) {
//				if(sum == n) {
//					count++;
//					break;
//				}
//				//sum에 j를 계속 더해주면서 n과 같아지고 하나 count에 더해줌
//				if(sum > n) {
//					break;
//				}
//				//sum이 n보다 커지면 더이상 비교할 필요가 없기 때문에
//				//break를 걸어줌
//				sum += j;
//			}
//		}
//		
//		System.out.println(count);
//		
//		
//		}
		
//			[2622] 삼감형만들기
	
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int n  = Integer.parseInt(bf.readLine());	
//		int [] arr = new int [3];
//		
//		int count = 0;
//		int sum = 0;
//		for(int i = 1; i <= n / 2; i++) {
//			arr[0] = i;
//			for(int j = 1; j <= n / 2; j++) {
//				arr[1] = j;
//				for(int k = 1; k <= n / 2; k++) {
//					arr[2] = k;
//					sum += i + j + k;
//					System.out.println(sum);
//					if(sum != n) {
//						sum = 0;
//					}else {
//						sum = 0;
//						for(int l = 0; l < 3; l++) {
//							sum += arr[l];
//						}		
//						int max = 0;
//						for(int u = 0; u < 3; u++) {
//							if(arr[u] > max) {
//								max = arr[u];
//							}
//						}
//						if(sum - max > max) {
//							count++;
//						}
//					}
//				}
//			}
//		}
//		
//		System.out.println(count);
		// 내가 푼거는 코드값도 더럽고 중복된 삼각형을 체크하지 못함
//////////////////////////////////////////////////////////////////////////////////////		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int N = Integer.parseInt(br.readLine());
//        int cnt = 0;
//        for (int i = 1; 0 < N - i; i++) {
//            for (int j = i; j <= N - i - j; j++) {
//                int longlong = N - i - j;
//                if (i + j > longlong) cnt++;
//            }
//        }
//        bw.write(String.valueOf(cnt));
//        bw.flush();
	//원리를 제대로 파악하지 못해서 그런거 같음
		
		
/////////////////////////////////////////////////////////////////////	1019공부		

//		[1312] 소수	[블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		
//		int n = scan.nextInt();
//		
//		String str = Double.toString(a/b);
//		//순서 체크를 위한 스트링형으로 변환
//		
//		int answer = str.charAt(n + 1) - '0';
//		//위치는 0 부터 시작 수수점은 제외하고 순서를 세야하기 때문에
//		//0과.은 문자는 제외하기 위해 n+1의 위치에 숫자를 출력 
//		
//		System.out.println(answer);
//		
//		[14568]		2017 연세대학교 프로그래밍 경시대회 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int a = 1; 
//		//영훈
//		int b = 3;
//		//남규: 영훈보다 상타수 + 2
//		int c = 2;
//		//택희: 사탕수 무조건 짝수
//		
//		int count = 0;
//		while(true) {
//			int sum = 0;
//			sum += a + b + c;
//			if(n == sum) {
//				count ++;
//			}
//			c = c + 2;	
//			//짝수니까 2씩 더해주면서 비교
//			int nmg = n - c;
//			//n 에서 c 를 빼준값이 a + b 가 됨
//			
//			if(nmg % 2 == 0) {
//				a = nmg / 2 - 2;
//				b = nmg / 2 + 2;
//				
//			}else {
//				a = nmg / 2 - 1;
//				b = nmg / 2 + 1;
//			}
//			//짝 홀 수 여부 따져 항상 b가
//			//a 보다 +2 클 수 있도록 체크
//			
//			
//			if(a + b < 3 || c >= n - 3) {
//				break;
//			}
//			//  a + b 가 3보다 작으면 조건 2가 충족이 안되고
//			// c 가 n - 3 보다 커져도 충족이 안되기 때문에
//			//break; 선언
//		}
//		
//		System.out.println(count);
		
		
//		[8394] 악수 [블로그]
		
//		//피보나치 수열 문제이다.
//		
//		Scanner scan = new Scanner(System.in);		
//		int n = scan.nextInt();
//		
//		int a = 1;
//		int b = 1;
//		int sum = 2;
//		
//		if(n <=  1) {
//			System.out.println(1);
//			//주어진 사람이 1보다 작거나 같으면.
//			//가능한 악수수는 1이다.
//		}else {
//			for(int i = 3; i <= n; i++) {
//				a = b;
//				b = sum;
//				sum = a + b;
//				//2이상일 경우 피보나치로 구현해주면된다.
//			}
//			
//			sum %= 10;
//			//수가 매우 커지면 끝자리만 출력한다고 했으니
//			//합에 10으로 나눈 나머지를 넣어주면 된다.
//			System.out.println(Math.abs(sum));
//		}

/////////////////////////////////////////////////////////////////////	1020공부		

//		[18247] 겨울왕국 티겟 예매 [블로그]
		
//		Scanner scan = new Scanner(System.in);		
//		int L = 12;
//		
//		int Tcase = scan.nextInt();
//		
//		for(int i = 0; i < Tcase; i++) {
//			int N = scan.nextInt();
//			//행
//			int M = scan.nextInt();
//			//열
//			if(N < 12 || M < 4) {
//				System.out.println(-1);
//				break;
//				//N이 12보다 작고 M이 4보다 작으면 
//				//성립할 수 없다.
//			}else {
//				int answer = (L * M) - (M - 4);
//				//L 까지의 전체 자석에서  (M-4) 를 뺴주면 L4의 위치가 된다.
//				System.out.println(answer);
//			}
//		
//		}
		
//		[1500]	최대 곱
		
//		//곱하는 수의 차이가 작을 수롤 그 곱은 커진다.
//        Scanner sc =new Scanner(System.in);
//        int s = sc.nextInt();// 정수 S
//        int k = sc.nextInt();// 합이 S인 K개의 정수
//        int q = s / k;// s 를 k 로 나눈 몫
//        int r = s % k;// s 를 k로 나눈 나머지
//        long max =1;
//        for (int i =1; i <= k; i++) {
//            if(i <= r) {//나머지 갯수만큼 +1
//                max *= (q +1);
//            }else {//
//                max *= q;
//            }
//        }
//        System.out.println(max);
//        sc.close();

//		[17103] 골드바흐 파티션     
		 
	//(https://bellossimo.tistory.com/43?category=908154)
	// 백준 1929 번 풀어보기	
//			Scanner scanner = new Scanner(System.in);
//	        StringBuilder sb = new StringBuilder();
//
//	        boolean[] isNotPrime;
//
//	        // 에라토스테네스의 체 세팅.
//	        isNotPrime = makeIsPrimeTable();
//
//	        int testCastCount = scanner.nextInt();
//
//	        for (int i=0; i<testCastCount; i++) {
//	            int number = scanner.nextInt();
//	            int result = 0;
//
//	            for (int j=2; j<=number/2; j++) {
//	                if(! isNotPrime[j] && ! isNotPrime[number-j]) {
//	                    result++;
//	                }
//	            }
//	            System.out.println(result);
//	        }
//
//	}
//	
//	 public static boolean[] makeIsPrimeTable() {
//	        boolean[] isNotPrime = new boolean[1000001];
//
//	        for (int i=2; i <= 1000000; i++) {
//	            if(! isNotPrime[i]) {
//	                for (int j=i*2; j<=1000000; j+=i) {
//	                    isNotPrime[j] = true;
//	                }
//	            }
//	        }
//
//
//	        return isNotPrime;
		
		
		
//		[1946] 신입사원 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int Tcase = scan.nextInt();
//		
//		for(int T = 0; T < Tcase; T++) {
//			int man = scan.nextInt();
//			int [][] arr = new int [man][2];
//			//사람수 행 점수 2열로 구성
//			
//			for(int i = 0; i < man; i++) {
//				for(int j = 0; j < 2; j++) {
//					arr[i][j] = scan.nextInt();
//				}
//			}
//			//배열 값 입력
//			int count = man;
//			//초기값은 전체 인원
//			for(int i = 0; i < man; i++) {
//				for(int j = 0; j < man; j++) {
//					if(arr[i][0] > arr[j][0]) {
//						if(arr[i][1] > arr[j][1]) {
//							count -= 1;
//							break;
//							//종목당 같은 순위는 존재할 수 없다는 것을 유념하자.
//							//같을때는 체크해주지 않아도 된다.
//							//모든 선수들의 점수를 비교하여, 어떤 하나의 지원자라도
//							//자신보다 2종목 모두 순위가 높은 지원자가 있다면,
//							//해당 지원자는 합격하지 못한다.
//							}
//						}
//					}
//				}
//			
//			System.out.println(count);
//		}
//			
			
			
/////////////////////////////////////////////////////////////////////	1021공부		

//			[1339] 단어 수학 [hash set / hash map 보고 다시오기]
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		N = Integer.parseInt(br.readLine());
//		max = Integer.MIN_VALUE;
//		set = new HashSet<>();
//		map = new HashMap<>();
//		input = new char[N][];
//		
//		for(int i = 0 ; i < N ; ++i) {
//			char[] line = br.readLine().toCharArray();
//			// 원래 알파벳을 기억한다. 
//			input[i] = line;
//			// 주어진 알파벳을 set에 넣는다.(중복제거) 
//			for(char c : line) set.add(c);
//		}
//		
//		alphabet = new ArrayList<>(set);
//		
//		selected = new boolean[10];
//		permutation(0);
//		
//		System.out.println(max);
//
//	 }
//	
//	static char[][] input;
//	static HashSet<Character> set;
//	static HashMap<Character, Integer> map;
//	static ArrayList<Character> alphabet;
//	static boolean[] selected;
//	static int N, max;
//	
//	private static void permutation(int depth) {
//		if(depth == alphabet.size()) {
//			int temp = calc();
//			max = temp > max ? temp : max;
//			return;
//		}
//		
//		for(int i = 0 ; i < 10 ; ++i) {
//			if(!selected[i]) {
//				selected[i] = true;
//				// 해쉬맵으로 문자 - 숫자를 매핑한다.
//				map.put(alphabet.get(depth), i);
//				permutation(depth + 1);
//				selected[i] = false;
//			}
//		}
//		
//	}
//
//	// 매핑된 문자 - 숫자를 바탕으로 합계 산출하기 
//	private static int calc() {
//		int result = 0;
//		
//		for(int i = 0 ; i < N ; ++i) {
//			int temp = 0;
//			// String을 직접 핸들링하는 것은 부담이 크다(연산, 파싱) 
//			for(char c : input[i]) {
//				temp *= 10;
//				temp += map.get(c);
//			}
//			result += temp;
//		}
//		
//		return result;
		
		
//		[1080] 행렬 [블로그]
		
//		public class TemplateA {
//			
//			static int n,m;
//			static int arrN[][],arrM[][];
//			
//			public static boolean flip(int startA, int startB) { 
//				// arrN 과 arrM이 같지 않을때 뒤집을 함수
//				
//				if(startA > n || startB+3 > m) { 
//					return false; 
//					} 
//				//범위를 넘어간다면, 같아질 수 없음으로  false를 리턴함
//				//true 문을 먼저 적으면 overhead 발생할 수 있어 함수식 작성시
//				//false조건이 먼저 있어야함
//				
//				for(int i = startA; i <= startA + 2; i++) { 			
//					for(int j = startB; j <= startB + 2; j++) {
//						arrN[i][j]= 1-(arrN[i][j]);					
//					}
//				}
//				return true;
//				//함수에 들어간 i 와  j에 2씩 더해준 값이 3 * 3 의 크기임으로 그 범위까지
//				//바꾸어주고 그후 true를 리턴헤줌 
//			}
//			
//			
//			public static void main(String[] args) throws IOException {
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				StringTokenizer st = new StringTokenizer(br.readLine());
//				
//				n = Integer.parseInt(st.nextToken());
//				m = Integer.parseInt(st.nextToken());
//				
//				arrN = new int[n][m];
//				arrM = new int[n][m];
//				
//				for(int i = 0; i < n; i++) {
//					String row = br.readLine();
//					for(int j = 0; j < m; j++) {				
//						arrN[i][j] =row.charAt(j)-'0';
//						
//					}
//				}
//				for(int i = 0; i < n; i++) {
//					String row = br.readLine();
//					for(int j = 0; j < m; j++) {				
//						arrM[i][j] =row.charAt(j)-'0';
//						
//					}
//				}
//				// arrN 과 arrM 에 주어진 값을 넣어주는 과정
//				
//				int count = 0;
//				loop : for(int i = 0; i < n; i++) {
//					for(int j = 0; j < m; j++) {
//						
//						if(arrN[i][j] != arrM[i][j]) {
//							if(flip(i,j)) {
//								count++;
//								//같지 않을 경우 지속적으로 범위내에서 3 * 3 뒤집기를 해줌
//							}else {
//								count = -1;
//								break loop;
//								//flip 함수가 false를 출력할 경우임
//								//count는 -1로 변경한 후 반복문 탈출 						
//							}
//						}
//						
//					}
//				}
//				
//				System.out.println(count);
//				br.close();
//				
//			
//			
//		}
//		    }
//		    
//


//		[16112] 5차 전직 [블로그]
		
		//이문제에 중요한 부분은 처음 아케인스톤이 활성화되면
		//그 아케인스톤의 경험치는 0이된다.
		//주의할 점은 첫번째 아케인스톤이 활성화 되면,
		//그 아케인스톤 경험치 역시 0으로 계산된다.
		//사실 문제가 길어서 그렇지 어렵지는 않음
		
//		Scanner scan = new Scanner(System.in);
//		int quest = scan.nextInt();	
//		int activeS = scan.nextInt();
//		
//		int [] arr = new int [quest];
//		
//		for(int i = 0; i < quest; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		//오름차순으로 정렬해주어 최대 아케인스톤이 활성화 전까지
//		//감소되는 경험치를 최소화한다. 
//		
//		int count = 0;
//		//count는 최대 활성 아케인스톤 값까지 증가할 변수
//		int exp  = 0;
//		//최대 경험치가 들어갈 변수
//		for(int i = 0; i < quest; i++) {
//			if(count < activeS) {
//				count ++;
//				//최대 아케인 스톤값이 될때까지 하나씩 더해줌
//				exp -= arr[i];				
//				//최대 아케인 스톤 값이 되기 전까지는 하나의 경험치가 사라지게
//				//됨으로 그 아케인 스톤의 경험치를 총경험치에서 빼줌
//				
//			}
//			exp += (arr[i] * count);
//			//이후 활성화된 아케인 스톤의 수와 경험치를 곱해줌
//		}
//	
//		System.out.println(exp);
		
		
/////////////////////////////////////////////////////////////////////	1021공부		

//			[15973] 두 박스 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int [] a = new int [4];
//		int [] b = new int [4];
//		
//		for(int i = 0; i < 4; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		
//		int arMax = 0;
//		//a행의 최대 범위 값이 들어갈 변수
//		int arMin = 1000;
//		//a행의 최대 범위 값이 들어갈 변수
//		if(a[0] > a[2]) {
//			arMax = a[0];
//			arMin = a[2];
//		}else {
//			arMax = a[2];
//			arMin = a[0];
//		}
//		
//		int acMax = 0;
//		//a열의 최대 범위 값이 들어갈 변수
//		int acMin = 1000;
//		//a열의 최대 범위 값이 들어갈 변수
//		if(a[1] > a[3]) {
//			acMax = a[1];
//			acMin = a[3];
//		}else {
//			acMax = a[3];
//			acMin = a[1];
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			b[i] = scan.nextInt();
//		}
//		
//		
//		int brMax = 0;
//		//b행의 최대 범위 값이 들어갈 변수
//		int brMin = 1000;
//		//b행의 최소 범위 값이 들어갈 변수
//		if(b[0] > b[2]) {
//			brMax = b[0];
//			brMin = b[2];
//		}else {
//			brMax = b[2];
//			brMin = b[0];
//		}
//		
//		int bcMax = 0;
//		//b열의 최대 범위 값이 들어갈 변수
//		int bcMin = 1000;
//		//b열의 최소 범위 값이 들어갈 변수
//		if(b[1] > b[3]) {
//			bcMax = b[1];
//			bcMin = b[3];
//		}else {
//			bcMax = b[3];
//			bcMin = b[1];
//		}	
//
//		if(a[0] == b[0] && a[1] == b[1] 
//				|| a[2] == b[2] && a[3] == b[3] 
//				|| a[0] == b[2] && a[1] == b[3] 
//				|| a[2] == b[0] && a[3] == b[1]) {
//			System.out.println("POINT");
//			//행과열이 모두 값은 점이 하나 존재하는지 체크 함
//		}else if((arMax >= brMax && arMin <= brMin) || (acMax >= bcMax && acMin <= bcMin)) {
//			System.out.println("FACE");
//			//b의 행과 열이 a의 행에 영역에서 모두 포함되거나, 열의 영역에서 모두 포함되는지 체크
//		}else if((arMax > brMax && arMin > brMin && (acMin == bcMin || acMin == bcMax || acMax == bcMin || acMax == bcMax )) 
//				|| (acMax > bcMax && acMin > bcMin && (arMin == brMin || arMin == brMax || arMax == brMin || arMax == brMax ))
//				|| (arMax < brMax && arMin < brMin && (acMin == bcMin || acMin == bcMax || acMax == bcMin || acMax == bcMax )) 
//				|| (acMax < bcMax && acMin < bcMin && (arMin == brMin || arMin == brMax || arMax == brMin || arMax == brMax ))) {
//			System.out.println("LINE");
//			//b가 a에 한 선만 겹치면서 적어도 a의 행이나 열의 끝접접에 위치하는지 체크 
//		}else {
//			System.out.println("NULL");
//		}
//		

		
//		[13136] Do Not Touch Anything [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int r = scan.nextInt();
//		int c = scan.nextInt();
//		int n = scan.nextInt();
//		
//		int mok = r / n;
//		//행의 몫이 담길 변수
//		int nmg = r % n;
//		//행의 나머지가 담길 변수
//		
//		int count = 0;
//		if(nmg == 0) {
//			count = mok;
//		}else {
//			count = mok + 1;
//		}
//		//나머지가 1일 경우 모든 범위를 할당하기 위해
//		//추가적인 카메라수 1을 더해줌
//		
//		
//		 mok = c / n;
//		//열의 몫이 담길 변수
//		 nmg = c % n;
//		//열의 나머지가 담길 변수
//		
//		 
//		 if(nmg == 0) {
//			count = mok * count;
//		}else {
//			count = (mok + 1) * count;
//		}
//		//마찬가지로 나머지가 1일 경우 모든 범위 할당위해
//		//목의 1을 더해주고 총 갯수를 구하기위해 행의 필요 카메라수를 더해줌
//		 
//		
//		System.out.println(count);
		

/////////////////////////////////////////////////////////////////////	1023공부		
		
//		[13164] 행복 유치원 [ 몰겟음 ]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		int k = scan.nextInt();
//		
//		int [] arr = new int [300000];
//		
//		int sum = 0;
//		
//		for(int i = 1; i < n; i++) {
//			arr[i + 1] = scan.nextInt();
//			arr[i - 1] = arr[i] - arr[i - 1];
//			Arrays.sort(arr);
//			
//		}
//		for (int i = 0; i < n - k; i++) 
//			sum += arr[i];
//			
//			
//		
//		System.out.println(sum);
		
		
//		[14464] 소가 길을 건너간 이유 [ 좀더 자세한 풀이로 바꾸기]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int chi = scan.nextInt();
//		int cow = scan.nextInt();
//		
//		int [] arr = new int [chi];
//		
//		for(int i = 0; i < chi; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr);
//		
//		int count = 0;
//		for(int i = 0; i < cow; i++) {
//			int start = scan.nextInt();
//			int end = scan.nextInt();
//			for(int j = 0; j < chi; j++) {
//				if(arr[j] >= start && arr[j] <= end) {
//					count++;
//					arr[j] = -1;
//					break;
//				}
//			}
//		}
//		
//		System.out.println(count);
		
		
		
/////////////////////////////////////////////////////////////////////	1024공부	
		
		
/////  [9661] 돌 게임7 [블로그]
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int set = n ;
//		// n을 담아둘 변수
//		int plus = 0;
//		// 4의 증가하는 승수를 담아둘 변수
//		int count = 0;
//		// 상근과 창영이의 턴을 체크할 변수
//			while(true) {
//				set -= Math.pow(4, plus);
//				// 각 턴마다 4의 plus승을 빼줌
//				plus++;
//				count++;
//				//턴이 지났으니 모두 하나씩증가
//				if(set < 0) {
//					// set이 0보다 작아진 경우는 그 턴에 4의 plus 재곱의 값이
//					// 컸다는 이야기 그턴에 사람이 패배
//					if(count % 2 == 0) {
//						System.out.println("SK");
//						break;
//					}else {
//						System.out.println("CY");
//						break;
//					}
//				}
//			}
		
		
		/////  [2725] 보이는 점의 개수 [다시보기]
			
//		
//			Scanner scan = new Scanner(System.in);
//			ans[0] = 0;
//			ans[1] = 2;
//			
//			  for (int i = 2; i <= 1000; ++i)
//			    {
//			        int n = 0;
//			        for (int j = 1; j <= i; ++j)
//			        {
//			            if (gcd(i, j) == 1)
//			                ++n;
//			            // 1이 될 경우 겹치지 않음
//			        }
//			        ans[i] = ans[i - 1] + n;
//			    }
//			    int T = scan.nextInt();
//			    while (T > 0)
//			    {
//			        int N = scan.nextInt();
//			        System.out.println(ans[N] * 2 - 1);
//			        T--;
//			    }
//		
//	}
//	
//	static int [] ans = new int [1001];
//	static int gcd(int a, int b) {
//		 while (a % b != 0)
//		    {
//		        int temp = b;
//		        b = a % b;
//		        a = temp;
//		    }
//		    return b;
	
			
		    
		    /////  [16283] Farm [블로그]
		
//		int Sfood = scan.nextInt();
//		//양이 먹는 양
//		int Gfood = scan.nextInt();
//		//염소가 먹는 양	
//		int n = scan.nextInt();
//		//전체 수
//		int food = scan.nextInt();
//		//전체 사료수
//		
//		loop : for(int i = 1; i <= n - 1; i++) {
//			for(int j = 1; j <= n - 1; j++) {
//				if(i + j == n) {
//					//우선 양와 염소의 수가 주어지 총수와 같은지 체크
//					if((i * Sfood) + (j * Gfood) == food) {
//						//같으면 사료수롤 곱해 총사료수와 같은지 체크
//						System.out.println(i + " " + j);
//						break loop;
//					}
//				}
//				
//				if(i == n - 1 && j >= 2) {
//					System.out.println(-1);
//					break;
//					//양의수가 최대치가 되었고 염소의 수가 2 이상이 되면,
//					//범위 초가로 -1 출력
//				}
//			}		
//		}
		
///////////////////////////////////////////////////////////////////////////////////////1026공부		
		
//		[15729번] 방탈출 [블로그]
		
//		Scanner scan = new Scanner (System.in);		
//		int n = scan.nextInt();
//		int [] start = new int [n];
//		//초기 다꺼진 배열
//		int [] arr = new int [n];
//		
//		for(int i = 0; i <n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		//주어진 배열 입력
//		
//		int count = 0;
//		//충 누른 스위치 횟수를 저장할 변수
//		int point = 0;
//		//초기 배열과 주어진 배열의 다른 위치를 체크할 변수
//		while(true) {
//			boolean flag = false;
//			for(int i = 0; i < n; i++) {
//				if(arr[i] == start[i]){
//					flag = true;
//					//배열이 같을 경우 flag는 계속 true
//				}else {
//					flag = false;
//					point = i;
//					break;
//					//배열이 다를경우 flag는 false과 되고 다른 지점
//					//point에 저장
//				}
//			}	
//			if(flag) {
//				System.out.println(count);
//				break;
//			}	
//			//flag 가 true이면 두 배열은 같기 때문에
//			//총 버튼 누른 횟수 출력
//			
//			count++;
//			//버튼을 누름
//			for(int i = point; i < point + 3; i++) {
//				if(i > n - 1) {
//					break;
//				}
//				//단 버튼을 누를시 전체 배열의 크기는 초과하면 안되기 때문에
//				//이와 같은 경우에는 break를 걸어줌
//				start[i] = 1 - start[i];
//				//0은 1로 1은 0으로 만들어주는 식
//			}
//		}
		
//		[17262번] 팬덤이 넘쳐흘러 [블로그]
		
//		Scanner scan = new Scanner (System.in);	
//		
//		int fan = scan.nextInt();
//		int [][] arr = new int [fan][2];
//		
//		
//		for(int i =0; i < fan; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		int start = arr[0][0];
//		//초기 시작값은 처음 학생의 머무는 시간으로 준다.
//		int end = arr[0][1];
//		//초기 끝값은 처음 학생의 머무는 시간으로 준다.
//		//(사실 어떤학생을 주던 크게 상관은 없는데, 순서 때문에 구현하기 까다로워짐)
//		
//		int count = 0;
//		//머무는 시간을 셀 변수
//		for(int i = 1; i < fan; i++) {
//			//첫학생은 이미 초기값 셋팅으로 들어가 있음으로
//			// 2번째 학생부터 비교하면됨
//			for(int j = 0; j < 1; j++) {
//				if(arr[i][j + 1] < start) {
//					count += start - arr[i][j + 1];
//					start = arr[i][j];
//					//학생의 머무는 시간의 끝값이 다른 학생의 스타트 값보다
//					//작으면, 겹치는 시간이 없음
//					//머무는 시간에 둘의 차를 더해주고
//					//시작값은 더 먼저 도착하는 학생의 값으로 변경한다.
//				}else {
//					if(arr[i][j] > end) {
//						count += arr[i][j] - end;
//						end = arr[i][j + 1];
//					}
//					// end 값에 저장된 학생의 값보다 다른 학생의 시작하는 값이 크면,
//					//마찬가지로 겹치는 시간이 없음 때문에 끝값은 그 다른 학생이 떠나는 시간으로 초기화하고
//					// 카운트에 해당하는 값들의 차이를 넣어줌
//				}
//			}
//		}
//		
//		System.out.println(count);

		
///////////////////////////////////////////////////////////////////////////////////////1027공부		
		
//		[1124번] 언더프라임 [다시보기]
		
//		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		int ct = 0;
//		    cin >> A >> B;
//
//		    initialize();
//
//		    for (int i = A; i <= B; ++i)
//		    {
//		        if (sosu(nums[i]))
//		            ct++;
//		    }
//
//		    cout << ct << endl;
//		
//	}
//	
//	static int [] nums = new int [100001];
//	
//	 static boolean sosu (int x) {
//		if(x == 1) {
//			return false;
//		}
//		    for (int i = 2; i <= Math.sqrt(x); ++i) { 
//		        if (x % i == 0) { 
//		        	return false;
//		        	}
//		    	}
//		return true;
//	}
//	
//	static void initialize()
//	{
//	    nums[1] = 1;
//	    for (int i = 2; i <= 100000; ++i) {
//	        if (sosu(i))
//	            nums[i] = 1;
//	        else if (i % 2 == 0)
//	            nums[i] = nums[i / 2] + 1;
//	        else {
//	            for (int j = 3; j <= i; j += 2) {
//	                if (i % j == 0) {
//	                    nums[i] = nums[i / j] + 1;
//	                    break;
//	                }
//	            }
//	        }
//	    }
		

		
//		[4375번] 1	[다시보기]	
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		BigInteger t = new BigInteger(br.readLine());
//
//		// StringBuffer result = new StringBuffer();
//
//		// StringTokenizer str = null;
//
//		BigInteger temp = BigInteger.ONE;
//
//		while (true) {
//
//			if (temp.mod(t).compareTo(BigInteger.ZERO) == 0) {
//
//				System.out.println(temp.toString().length());
//
//				break;
//
//			} else {
//
//				temp = temp.multiply(BigInteger.TEN);
//
//				temp = temp.add(BigInteger.ONE);
//
//			}
//
//		}
//
//		// result.deleteCharAt(result.length() - 1);
//
//		// System.out.println(result);

///////////////////////////////////////////////////////////////////////////////////////1028공부	
		
//  		[14720] 우유 축제 [블로그]
	
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		
//		int sum = 0;
//		// 우유의 종류를 체크할 변수
//		int count = 0;
//		// 총 마시는 우유 개수를 체크할 변수
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//			if(sum > 2) {
//				sum = 0;
//			}
//			// 만약에 우유가 2보다 커지면 다시 0으로 초기화
//			if(arr[i] == sum) {
//				count ++;
//			}else {
//				break;
//			}
//			//같으면 총 개수를 하나씩 더해주고
//			//하나라도 순서가 틀리면 더 이상 비교는 불필요 하기 때문에
//			//반복문을 종료
//			sum++;
//		}
//		System.out.println(count);

		
//		[1449] 수리공 항승 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		// 조건 1. 물이 세는 부분은 무조건 정수다.
//		// 조건 2. 테이프는 중간에 자를 수 없다.
//		// 조건 3. 물이 세는 곳 양쪽 모두 0.5 만큼의 추가적인 간격이 필요하다.
//		// 조건 4. 테이프를 겹쳐서 붙이는 것이 가능하다.
//		// 즉 앞에수와 뒤에 정수 간의 차이가 1이면 겹치는 것이 가능하다.
//		
//		int n = scan.nextInt();
//		//총 물이 세는 곳
//		int tapeL = scan.nextInt();
//		// 테이프 길이
//		int count = 1;
//		
//		double [] arr = new double [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		// ex) n값 4 tapeL값 3 배열값 1 2 3 4
//		
//			double Limit = (arr[0] - 0.5 + tapeL);
//			//초기 값 0.5 ~ 3.5 까지 커버가능
//			//해당 범위 넘어 가는 부분에는 이제 다시 테이프롤 추가해주면됨
//			for(int i = 1; i < arr.length; i++) {
//				if (Limit < (arr[i] + 0.5)){
//					Limit = (arr[i] - 0.5 + tapeL);
//					count ++;
//				}
//			}
//
//			System.out.println(count);


///////////////////////////////////////////////////////////////////////////////////////1029공부	
		
////		[1402]	아무래도 이문제는 A 번 난이도인 것 같다. [블로그]
//		Scanner scan = new Scanner(System.in);
//		
//		int tCase = scan.nextInt();
//		
//		for(int i = 0; i < tCase; i++) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int [] arr = new int [a];
//			
//			int temp = 2;
//			//소인수 분해를 위해 사용될 변수
//			int t = 0;
//			//배열위치지정변수
//			while(a != 1) {
//				if(a % temp == 0) {
//					//a 의 소인수 여부 체크
//					arr[t] = temp;
//					//소인수 배열 할당
//					a = a / temp;
//					//a 값 소인수로 나누어서 초기화
//					t++;
//					//배열위치 하나씩 증가
//				}else {
//					temp++;
//					//소인수 아니면 하나씩 증가
//				}
//			}
//			
//			int sum = 0;
//			for(int j = 0; j < arr.length; j++) {	
//				if(arr[j] == 0){break;}
//				sum +=arr[j];
//			}
//			//소인수값 sum에 모두 더해줌
//			
//			System.out.println(sum);
//			if(sum == b) {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
//			//sum과 b가 같은지 체크
//
//		}
		
//		[5692] 팩토리얼 진법 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//
//		while(true) {
//			int t = scan.nextInt();
//			if(t == 0) {break;}
//			//t 가 0 이면 프로그램을 종료한다.
//			f = 1;	
//			int temp = t % 10;
//			//맨 뒷자리 값을 추출할 변수
//			t = t / 10;
//			//뒷자리를 뺀 나머지 자리를 저장
//			int sum = temp * f;
//			//팩토리얼 1은 무조건 1이기 때문에
//			//sum 초기값은 temp * f 로 지정해준다.
//			while(true) {
//				f++;
//				temp = t % 10;
//				t = t / 10;
//				sum += temp * (fac(f));	
//				//자릿수가 하나씩 많아질때마다 팩토리얼 도 하나씩 증가
//				//해당 자릿수에 팩토리얼 값을 곱해줌
//				if(t == 0) {break;}	
//				//t가 0이면 더이상 비교할 필요 없음
//			}
//			
//			System.out.println(sum);
//		}
//	
//	}
//	
//	static int f;
//	static int x = 1;
//	static int y = 1;
//	
//	static int fac(int z) {
//		do {
//			x++;
//			y *= x;
//		}while(x < f);
//		//팩토리얼 method
//		return y;
	
	
//		[16968] 차량 번호판 1 [다시 보기]
		
//		Scanner sc = new Scanner(System.in);
//		
//		char[] template = sc.next().toCharArray();
//		int result = 1;
//		
//		for(int i = 0 ; i < template.length ; ++i) {
//			if(i == 0) {
//				if(template[i] == 'c') result *= 26;
//				else result *= 10;
//			} else {
//				if(template[i] == 'c') {
//					if(template[i - 1] == 'c') {
//						result *= 25;
//					} else {
//						result *= 26;
//					}
//				} else {
//					if(template[i - 1] == 'd') {
//						result *= 9;
//					} else {
//						result *= 10;
//					}
//				}
//			}
//		}
//		System.out.println(result);
		
///////////////////////////////////////////////////////////////////////////////////////1030공부	
		
////		[2847]	게임을 만든 동준이 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		int sum = 0;
//		//총 내려야 하는 점수가 들어갈 변수
//		for(int i = n - 1; i >= 1; i--) {
//				if(arr[i] < arr[i - 1] ) {
//					//전 레벨의 점수가 현재 레벨의 점수보다 높은 경우
//					sum += (arr[i - 1] + 1) - arr[i];
//					arr[i - 1] -= (arr[i - 1] + 1) - arr[i]; 
//					//차이 값에 1만큼 더 작아야 전레벨의 점수가 현재 레벨보다 낮아진다.
//				}else if(arr[i] == arr[i - 1] ) {
//					//전 레벨의 점수가 현재 레벨의 점수와 같은 경우
//					sum += 1;
//					arr[i - 1] -= 1;
//					//같으면 1만 빼주면 전레벨의 점수가 현재레벨보다 낮아진다.
//				}else {
//					continue;
//				}
//		}
//		
//		System.out.println(sum);
//		
//		}
//	}

////		[1439] 뒤집기 [블로그]
			
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		int [] arr = new int [s.length()];
//		for(int i = 0; i < s.length(); i++) {
//			arr[i] = s.charAt(i) - '0';
//		}
//		//초기 문자열로 데이터 받아줌
//		
//		int count = 0;
//		//총 뒤집는 횟수 저장될 변수
//		while(true) {
//		int flag = 0;
//		//연속된 다른수의 횟수를 저장할 변수
//		int temp = arr[0];	
//			for(int i = 1; i < s.length(); i++) {
//					if(temp != arr[i]) {
//						flag ++;
//						temp = arr[i];
//						//연속되지 않을 경우 flag 변수 하나 더해줌
//						//다시 연속된 수 체크를 위해 temp에 배열 위치 저장
//					}
//			}
//			if(flag >= 3) {
//				count++;
//				for(int i = 0; i < s.length(); i++) {
//					arr[i] = 1 - arr[i];
//				}
//				//3번 이상 연속된 수가 있을 경우 한 번뒤집고로 안됨
//				//때문에 배열을 전체 다 뒤집은 다음에 다시 while 문으로 비교
//			}else if(flag == 2 || flag == 1) {
//				count++;
//				break;
//				//뒤집기가 2번 일 경우 특정 부분만 뒤집으면 되고
//				//1일 경우 temp 위치의 배열부터 끝까지 뒤집으면 되니까
//				//한 번만 뒤집으면 됨
//			}else {
//				break;
//				//이미 같은 수열임 뒤집을 필요없음
//			}
//				
//		}
//		
//		System.out.println(count);
		
///////////////////////////////////////////////////////////////////////////////////////1030공부	
		
////		[13305]주유소[블로그][뿌듯]
	
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] distance = new int [n-1]; 
//		int [] price = new int [n];
//		
//		for(int i = 0; i < distance.length; i++) {
//			distance[i] = scan.nextInt();
//		}
//		
//		int min = 99999999;
//		int temp = 0;
//		for(int i = 0; i < price.length; i++) {
//			price[i] = scan.nextInt();
//			if(min > price[i]) {
//				min = price[i];
//				temp = i;
//			}
//		}
//	
////		sum += price[i] * distance[count];
//		int sum = 0;
//		//총 기름값이 들어갈 변수
//		if(temp == 0) {
//			for(int i = 0; i <distance.length; i++) {
//				sum += distance[i] * min;
//			}
//			//temp 0 이면 첫도시의 기름 값이 제일 쌈 
//		}else {
//		int i = temp = 0;
//		//첫도시 기름값이 제일 싼값이 아님
//		//도시간 기름 값 비교를 위한 변수 0으로 초기화
//			loop : while(true) {
//				i = temp;
//				//도시의 위치를 temp 값으로 변경
//				//이는 아래식에서 temp 까지 차가 이동했기 때문
//				//초기값은 어차피 처음 위치임
//				for(int j = i + 1; j < price.length - 1; j++) {
//					if(price[i] > price[j]) {
//						temp = j;
//						break;
//						//i 이후에 도시들을 비교하며 i 보다 기름 값이 싼 도시에서 정지
//					}else {
//						temp = distance.length;
//						//i가 가장 쌀 경우 거기서 끝가지 가도 되기 때문에
//						//temp값에 최대거리를 넣어줌
//					}
//				}
//				for(int k = i; k < temp; k++) {
//					sum += price[i] * distance[k];
//				}
//				//현재 도시의 기름값과 i 로 갈수 있는 거리만큼 곱해줌
//				
//				if(temp == distance.length) {break loop;}
//				//temp가 총거리랑 같으면 모든 기름값을 더해주었고 도착한 후이기 때문에 반복문 종료
//			}
//		}
//		
//			System.out.println(sum);

///////////////////////////////////////////////////////////////////////////////////////1102공부	
		
////	[15726] 이칙연산 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		int max1 = a * b / c;
//		int max2 = a / b * c;
//	
//		if(max1 >= max2) {
//			System.out.println(max1);
//		}else {
//			System.out.println(max2);
//		}

////	[11812] k 진트리 [다시보기]
		
//	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    String str = br.readLine();
//	    StringTokenizer st = new StringTokenizer(str);
//	     
//	    long N = Long.parseLong(st.nextToken());
//	    int K = Integer.parseInt(st.nextToken());
//	    int Q = Integer.parseInt(st.nextToken());
//	     
//	    for (int i = 0; i < Q; i++) {
//	        str = br.readLine();
//	        st = new StringTokenizer(str);
//	        long x = Long.parseLong(st.nextToken());
//	        long y = Long.parseLong(st.nextToken());
//	         
//	        long count = 0;
//	        if (K == 1) {
//	            count = x < y ? y - x : x - y;
//	        }
//	        else {
//	            while (x != y) {
//	                // 부모 노드
//	                if (x < y) {
//	                    y = (y - 2) / K + 1;
//	                }
//	                else {
//	                    x = (x - 2) / K + 1;
//	                }
//	                 
//	                count++;
//	            }
//	        }           
//	         
//	        System.out.println(count);
//	    }
		
////	[3955] 사탕 분배 [답이 나오는데 아마 시간을 많이 잡아먹음]
	    
//	    int tCase = scan.nextInt();
//	    
//	    for(int i = 0; i < tCase; i++) {
//	    	int count = 0;
//	    	int people = scan.nextInt();
//	    	int candy = scan.nextInt();
//	    	if(people % candy == 0 && candy != 1) {
//	    		System.out.println("IMPOSSIBLE");
//	    		continue;
//	    	}else {
//	    		while(true) {
//	    			count++;
//	    			if((candy * count) % people == 1 ) {
//	    				break;
//	    			}
//	    		}
//	    	}
//	    	
//	    	System.out.println(count);
//	    }
		
		
///////////////////////////////////////////////////////////////////////////////////////1103공부	
		
////		[2810]	컵홀더 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		String seat = scan.next();
//		String arr [] = new String [n];
//		
//		for(int i =0; i < n; i++) {
//			arr[i] = String.valueOf(seat.charAt(i) - 'L');
//			//s 는 숫자 7이되고 L은 숫자 0이된다.
//		}
//		
//		int count = n;
//		//모든 사람이 컵홀더를 쓸수 있다는 전제
//		int check = 0;
//		//커플석 체크 변수
//		for(int i =0; i < n; i++) {
//			if(arr[i].equals("0")) {
//				check++;
//			}
//			
//			if(check == 2) {
//				check = 0;
//				count --;
//			}
//			//체크가 2이면 커플석이고 한사람은 컵홀더를 못씀
//		}
//		
//		if(count != n) {
//			count += 1;
//		}
//		//왼쪽 컵홀더를 쓴다는 기준으로 생각함
//		//때문에 오른쪽 컵홀더가 하나 남게 되는데,
//		//때문에 하나를 더해줌(커플석이 하나라도 있을경우)
//		System.out.println(count);
		
		
////	[2812]	크게 만들기 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		//자릿수
//		int k = scan.nextInt();
//		//지울 자릿수
//		String str = scan.next();		
//		//입력값
//		int [] arr = new int [n];	
//		int min = 9;
//		for(int i = 0; i <n; i++) {
//			arr[i] = str.charAt(i) - '0';
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		//입력값 배열에 넣어줌
//		
//		loop : while(k > 0) {
//			for(int i = n - 1; i >= 0; i--) {
//				if(arr[i] == min) {
//					arr[i] = -1;
//					k--;
//					if(k == 0) {break loop;}
//				}
//				//앞자리가 큰수가 남아야하기 때문에 배열 뒷자리 부터 비교
//				//동일수라도 앞에는 큰수가 남아야함
//				min = 9;
//				for(int j = 0; j < n; j++) {
//					if(min > arr[j] && arr[j] != -1) {
//						min = arr[j];
//					}
//				}
//				//다음에 지울 수를 찾음 (-1이 아니고 그다음 작은수)
//			}
//			
//		}
//		
//		for(int i =0; i <n; i++) {
//			if(arr[i] != -1) {
//				System.out.print(arr[i]);
//			}
//		}

		
///////////////////////////////////////////////////////////////////////////////////////1030공부	
		
////		[9576]	책 나눠주기 [다시보기]
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		int T = Integer.parseInt(br.readLine());
//
//		StringBuilder sb = new StringBuilder();
//		while (T-- > 0) {
//			st = new StringTokenizer(br.readLine());
//			int N = Integer.parseInt(st.nextToken());
//			int M = Integer.parseInt(st.nextToken());
//
//			Point[] points = new Point[M + 1];
//			for (int i = 1; i <= M; i++) {
//				st = new StringTokenizer(br.readLine());
//
//				int a = Integer.parseInt(st.nextToken());
//				int b = Integer.parseInt(st.nextToken());
//
//				points[i] = new Point(a, b);
//			}
//
//			// b를 기준으로 오름차순 정렬하되, b가 같을 경우
//			// a를 기준으로 오름차순 정렬한다.
//			Arrays.sort(points, 1, M + 1, (p1, p2) -> (p1.y == p2.y) ? p1.x - p2.x : p1.y - p2.y);
//
//			int ans = 0;
//			boolean[] check = new boolean[N + 1];
//			for (int i = 1; i <= M; i++) {
//				int a = points[i].x;
//				int b = points[i].y;
//
//				// 해당하는 범위 내에서
//				// 가능한 가장 작은 번호의 책부터 뽑는다.
//				for (int j = a; j <= b; j++) {
//					if (!check[j]) {
//						check[j] = true;
//						ans++;
//						break;
//					}
//				}
//			}
//			sb.append(ans + "\n");
//		}
//
//		bw.write(sb.toString());
//		bw.flush();
//		bw.close();
//		br.close();
		
////	[15903] 카드 합체 놀이 [블로그]
		
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int [] arr = new int [n];
//		int min1 = 9999;
//		//가장 작은 값 저장할 변수
//		int min2 = 9999;
//		//그 다음 작은 값 저장할 변수
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int temp1 = 0;
//		//min1 의 배열위치 저장 변수
//		int temp2 = 0;
//		//min2 의 배열위치 저장 변수
//		int sum = 0;
//		//합을 저장할 변수
//		for(int i = 0; i < m; i++) {
//			for(int j = 0; j < n; j++) {
//				if(min1 > arr[j]) {
//					min1 = arr[j];
//					temp1 = j;
//				}
//				//가장 작은 값과 그 위치 저장
//			for(int k = 0; k < n; k++) {
//				if(min2 > arr[k] && arr[k] >= min1 && k != temp1) {
//					min2 = arr[k];
//					temp2 = k;
//					}	
//				}
//			}
//			//가장 작은 값과 그 배열위치를 제외한 그 다음 값을 찾는 반복문
//			sum = arr[temp1] + arr[temp2];
//			arr[temp1] = sum;
//			arr[temp2] = sum;
//			//각 위치에 둘의 합을 저장함
//		}	
//	
//		sum = 0;
//		for(int i = 0; i < n; i++) {
//			sum += arr[i];
//		}
//		//모든 배열 숫자 합을 구함
//		System.out.println(sum);
		
///////////////////////////////////////////////////////////////////////////////////////1030공부	
		
////		[11497]	통나무 건너뛰기	
			
//		Scanner scan = new Scanner(System.in);
//		int tCase = scan.nextInt();
//		
//		for(int i = 0; i < tCase; i++) {
//			int n = scan.nextInt();
//			int [] arr = new int [n];
//			for(int j = 0; j < n; j++) {
//				arr[j] = scan.nextInt();
//			}
//			
//			Arrays.sort(arr);
//			//정렬
//			if(n == 2) {
//				System.out.println(arr[n-1] - arr[n-2]);
//				//배열의 수가 2개일 경우 두수의 차가 최대 난이도
//			}else if(n == 1) {
//				System.out.println(0);
//				//배열의 수가 1일 경우 무조건 0
//			}else {
//				System.out.println(arr[n-1] - arr[n-3]);
//				//3개 이상일 경우 마지막 가장 큰 수와 두번째 큰 수의 차가 최대 난이도가 됨
//			}
//
//		}
//		
		
////	[11000] 강의실 배정 [완료][다시보기]
		
//			Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			int [][] arr = new int [n][2];
//			
//			for(int i = 0; i < n ; i++) {
//				for(int j = 0; j < 2; j++) {
//					arr[i][j] = scan.nextInt();
//				}
//			}
//			//2차월 배열 정렬 0번쨰 열 다음 1번째 열 기준(다중 배열 정렬)
//			Arrays.sort(arr, new Comparator<int[]>() {
//			    public int compare(int[] o1, int[] o2) {
//			    	 if(o1[0] == o2[0]) {
//		                   return o1[1] - o2[1];
//			    	 }else {
//			    		 return o1[0] - o2[0]; 
//			    	 }
//		           }
//		        });
//			
//			int count = 1;
//			//총 강의 가능 횟수
//			int temp = 0;
//			//강위 시작시간 저장 변수
//			for(int i = 1; i < n; i++) {
//				if(arr[temp][1] <= arr[i][0]) {
//					count++;
//					//처음 강의의 끝나는 시간보다 
//					//다음 강의의 시작 시간 같거나 크면
//					//강의 진행 가능
//					temp = i;
//					//시작시간 i번째 강의로 초기화 
//				}
//			}
			
///////////////////////////////////////////////////////////////////////	1106공부				

//		[7570] 줄 세우기
		// 어는 배열의 위치이든지 한 번에 앞이나 뒤로 한번 만 옮길 수 있기 때문에,
		// 최솟값을 가장 앞으로 보내는 방식을 사용하였다.
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int count = 0;
//		for(int i = 0; i < n - 1; i++) {
//			int min = arr[i];
//			//배열에서의 최솟값을 저장할 변수
//			int temp = 0;
//			//최솟값 배열의 위치를 저장할 변수
//			for(int j = i + 1; j < n; j++) {
//				if(arr[i] > arr[j]) {
//					min = arr[j];
//					temp = j;
//					//가장 작은 값 배열을 돌면서 체크
//				}
//			}
//			if(min != arr[i]) {
//				arr[temp] = arr[i];
//				arr[i] = min;
//				count++;
//				//최솟값의 배열의 i위치의 값이 아니면,
//				//첫번째 자리와 최솟값의 위치를 서로 교환
//			}
//			
//		}
//		
//		System.out.println(count);
//		
//		
//		
////		[8980] 택배 [실패]
		
		
//		Scanner scan = new Scanner(System.in);
//		int vil = scan.nextInt();
//		int truck = scan.nextInt();
//		int info = scan.nextInt();
//		
//		int [][] arr = new int [info][3];
//		for(int i = 0; i < info; i++) {
//			for(int j = 0; j < 3; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		Arrays.sort(arr, new Comparator<int[]>(){
//			public int compare(int [] o1, int [] o2) {
//				if(o1[0] == o2[1]) {
//					return o1[1] - o2[1];
//				}else {
//					return o1[0] - o2[0];
//				}
//			}
//		});
//		
//		
//		for(int i = 0; i < info; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		int sum = 0;
//		int ttruck = 0;
//		int tvil = arr[0][0];
//		for(int i = 0; i < info; i++) {
//			if(arr[i][0] == tvil) {
//				ttruck += arr[i][2];
//				if(ttruck > truck) {	
//				ttruck -= arr[i][2];
//				ttruck = truck;
//				}
//			}else {
//				for(int j = 0; j < i; j++) {
//					if(arr[j][1] == arr[i][0]) {
//						ttruck -= arr[j][2];
//						if(ttruck < 0) {
//							ttruck += arr[j][2];
//							sum += ttruck;
//						}else {
//							sum += arr[j][2];
//						}
//					}
//				}
//				ttruck += arr[i][2];
//				if(ttruck > truck) {	
//				ttruck -= arr[i][2];
//				ttruck = truck;
//				}
//				if(arr[i][0] != tvil) {tvil = arr[i][0];}	
//			}
//	}
//		System.out.println(sum);
////////////다른 풀이 아래/////////////////////////////////////		
//		import java.io.BufferedReader;
//		import java.io.BufferedWriter;
//		import java.io.InputStreamReader;
//		import java.io.OutputStreamWriter;
//		import java.util.Arrays;
//		import java.util.StringTokenizer;
//		 
//		class Delivery implements Comparable<Delivery> {
//		    int start; // 보내는 마을
//		    int end; // 받는 마을
//		    int boxNum; // 박스의 개수
//		 
//		    Delivery(int start, int end, int boxNum) {
//		        this.start = start;
//		        this.end = end;
//		        this.boxNum = boxNum;
//		    }
//		 
//		    @Override
//		    public int compareTo(Delivery arg0) {
//		        if (end == arg0.end) {
//		            return start - arg0.start;
//		        }
//		        return end - arg0.end;
//		    }
//		}
//		 
//		public class Main {
//		 
//		    public static void main(String[] args) throws Exception {
//		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		        StringTokenizer st = new StringTokenizer(br.readLine());
//		 
//		        int N = Integer.parseInt(st.nextToken()); // 마을의 수
//		        int C = Integer.parseInt(st.nextToken()); // 트럭의 용량
//		 
//		        int M = Integer.parseInt(br.readLine()); // 보낼 박스 정보의 개수
//		        Delivery[] deliveries = new Delivery[M + 1];
//		        for (int i = 1; i <= M; i++) {
//		            st = new StringTokenizer(br.readLine());
//		            int start = Integer.parseInt(st.nextToken());
//		            int end = Integer.parseInt(st.nextToken());
//		            int boxNum = Integer.parseInt(st.nextToken());
//		 
//		            deliveries[i] = new Delivery(start, end, boxNum);
//		        }
//		        // 택배를 받는 마을을 기준으로 오름차순 정렬을 하되, 받는 마을이 같을 경우
//		        // 보내는 마을을 기준으로 오름차순 정렬을 한다.
//		        Arrays.sort(deliveries, 1, M + 1);
//		 
//		        // 각 마을당 보낼 수 있는 최대 용량을 설정한다.
//		        int[] weight = new int[N + 1];
//		        for (int i = 1; i < N; i++) {
//		            weight[i] = C;
//		        }
//		 
//		        int ans = 0;
//		        for (int i = 1; i <= M; i++) {
//		            Delivery d = deliveries[i];
//		 
//		            int maxBoxNum = Integer.MAX_VALUE;
//		 
//		            // 보내는 마을과 받는 마을 사이의 경로 마을 중에서 보낼 수 있는 최대 한도를 구한다.
//		            for (int j = d.start; j < d.end; j++) {
//		                maxBoxNum = Math.min(maxBoxNum, weight[j]);
//		            }
//		 
//		            // 위에서 구한 보낼 수 있는 최대 한도가 현재 보내려는 택배의 개수보다 크다면,
//		            // 보내는 마을과 받는 마을 사이의 경로 마을 모두 용량에서 현재 보내려는 택배의 개수를 뺀다.
//		            if (maxBoxNum >= d.boxNum) {
//		                for (int j = d.start; j < d.end; j++) {
//		                    weight[j] -= d.boxNum;
//		                }
//		                ans += d.boxNum;
//		            } else {
//		                // 보낼 수 있는 최대 한도보다 현재 보내려는 택배의 개수가 클 경우,
//		                // 현재 보내려는 택배의 개수가 아닌 위에서 구한 최대 한도를 기준으로 한다.
//		                for (int j = d.start; j < d.end; j++) {
//		                    weight[j] -= maxBoxNum;
//		                }
//		                ans += maxBoxNum;
//		            }
//		        }
//		 
//		        bw.write(ans + "\n");
//		        bw.flush();
//		        bw.close();
//		        br.close();
//		    }
//		 
//		}

		
///////////////////////////////////////////////////////////////////////	1109공부				

//		 [1343] 폴리오미노 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		String a = "AAAA";
//		String b = "BB";
//		String input = scan.next();
//		String [] arr = new String [500];
//		//변환된 값(a, b)이 들어갈 배열
//		int [] temp = new int [500];
//		//인트 값으로 변환된 input 값이 들어갈 배열
//		
//		for(int i = 0; i < input.length(); i++) {
//			temp[i] = input.charAt(i) - 'W';
//			//X 의 자리에 모두 정수 1이 들어가게 변환
//		}
//		
//		int count = 0;
//		//연속된 X 를 셀 변수
//		int num = 0;
//		//배열 위치 지정변수
//		boolean flag = true;
//		//덮을 수 없을 경우 체크 변수
//		for(int i = 0; i < input.length(); i++) {
//			if(temp[i] == 1) {
//				count++;
//				if(count % 4 == 0) {
//					arr[num] = a;
//					num++;
//					count = 0;
//					//4로 나누어지면 a 로 변환
//				}else if(count % 4 != 0 && count % 2 == 0 && temp[i + 1] != 1) {
//					arr[num] = b;
//					num++;
//					count = 0;
//					//4로 나누어지지 않으면서 2로는 나누어지면 배열의 다음 값이 1이 아닌 값
//					//즉 연속된 X값이 배열 다음자리에 없으면 이로 나누고 b로 덮어버림
//				}	
//			}else {
//				if(count % 2 != 0) {
//					flag = false;
//					break;
//					//연속 값이 2로 안나누어지면 덮을 수 없음
//					//더이상 비교불필요 반복문 종료
//					}else {
//					arr[num] = ".";
//					num++;
//					//아니면 배열의 값을 점으로 채우고
//					//배열위치 하나씩 더해줌
//				}
//				
//			}
//		}
//		
//		if(flag == false || count == 1) {
//			System.out.println(-1);
//			//flag 그 여부와 주어진 값이 한자리면 -1 출력
//		}else {
//			for(int i = 0; i < num; i++) {
//				System.out.print(arr[i]);
//			}
//		}
//		
//		
//	
		
		
///////////////////////////////////////////////////////////////////////	1110공부				

//		[2828] 사과 담기 게임 [완료]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int screen = scan.nextInt();
//		int basketSize = scan.nextInt();
//		int apple = scan.nextInt();
//		int [] arr = new int [apple];
//		
//		int count = 0;
//		//움직인 수를 저장할 변수
//		for(int i = 0; i < apple; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int location = basketSize;
//		//바구니의 현재 위치를 저장할 변수
//		for(int i = 0; i < apple; i++) {
//			while(true) {
//				if(arr[i] >= (location  - (basketSize - 1)) && arr[i] <= location) {
//					break;
//					//바구니의 현재위치와 바구니의 크기내에 있을 경우 움직일 필요없음
//				}else {
//					if(arr[i] > location) {
//						count += 1;
//						location += 1;
//						//사과의 위치가 현재위치보다 크면 한칸 움직이고 움직인 거리도 하나 더해줌
//					}else {
//						count += 1;
//						location -= 1;
//						//사과의 위치가 현재위치보다 작으면 한칸 움직이고 움직인 거리도 하나 더해줌
//					}
//				}
//			}	
//		}
//		
//		System.out.println(count);
		
		
//		[14659] 한조서열정리하고옴ㅋㅋ [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		int max = 0;
//		//최고의 활잡이가 처지하는 적의수를 저장할 변수
//		for(int i = 0; i < n - 1; i++) {
//			int count = 0;
//			//각 활잡이가 잡는 적의수를 저장할 변수
//			for(int j = i + 1; j < n; j++) {
//				if(arr[i] > arr[j]) {
//					count++;
//					//자신보다 봉우리가 낮으면 하나씩 증가
//				}else {
//					if(arr[i] < arr[j]) {break;}
//					//자신보다 봉우리가 크면 반복 종료
//				}
//			}
//			if(max < count) {
//				max = count;
//				//활잡이별 처지 적수 비교
//			}
//		}
//		
//		System.out.println(max);
		
		
///////////////////////////////////////////////////////////////////////	1111공부				

//		[13904] 과제 [다시보기]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int [][] arr = new int [n + 1][2];
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		Arrays.sort(arr, new Comparator<int[]>() {
//		    @Override
//			public int compare(int[] o1, int[] o2) {
//		    	 if(o1[0] == o2[0]) {
//	                 return o1[1] - o2[1];
//		    	 }else {
//		    		 return o1[0] - o2[0]; 
//		    	 }
//	           }
//	        });
//		
//		int i = 0;
//		int sum = 0;
//		int max = 0;
//		while(i != n) {
//			if(arr[i][0] == arr[i + 1][0]) {
//				max = arr[i][1] >= arr[i+1][1] ? arr[i][1] : arr[i + 1][1];
//			}else {
//				if(max == 0) {
//					max = arr[i][1];
//					sum += max;
//					max = 0;
//				}else {
//					sum += max;
//					max = 0;
//				}
//			}
//			System.out.println(sum);
//			i++;
//		}
//		
//		System.out.println(sum);
		
////////////남이푼거//////////////////////		
//		Scanner scan = new Scanner(System.in);
//		
//		int N = scan.nextInt();	
//		int[][] work = new int[N][2];
//		int maxScores = 0;	//과제 점수 최댓값
//		int days = 0;		// 과제 진행한 날
//		for(int i=0; i<N; i++) {
//			work[i][0] = scan.nextInt();	// 과제 마감기한
//			work[i][1] = scan.nextInt();	// 과제 점수
//		}
//		
//		// 과제 점수 높은순으로 정렬
//		Arrays.sort(work, new Comparator<int[]>() {
//			@Override	
//			public int compare(int[] o1, int[] o2) {
//				return Integer.compare(o2[1], o1[1]);
//			}
//		});
//		
//		int[] scores = new int[1001];	// 정수 N의 범위 - 1~1000
//		for(int i=0; i<N; i++) {		// 과제 점수가 높은 순
//			for(int j=work[i][0]; j>0; j--) {	// 과제의 마감일로부터 최대한 늦게 과제 하기
//				if(scores[j] == 0) {
//					scores[j] = work[i][1];
//					break;
//				}
//			}
//		}
//		
//        	/*
//		for(int i=0; i<N; i++) {
//			System.out.print(work[i][0] + " " + work[i][1]);
//			System.out.println();
//		} 
//       		 */
//		
//		for(int i=0; i<scores.length; i++) 
//			maxScores += scores[i];
//			
//
//		System.out.println(maxScores);
//		scan.close();

///////////////////////////////////////////////////////////////////////	1112공부

		
//// 		[11501] 주식 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int tCase = scan.nextInt();
//		
//		for(int t = 0; t < tCase; t++) {
//			day = scan.nextInt();
//			arr = new int [day];
//			for(int d = 0; d < day; d++) {
//				arr[d] = scan.nextInt();
//			}
//			roll();
//		}
//	
//	}	
//	static int [] arr;
//	//day별 주식 가격 저장 배열
//	static int day;
//	//총 일수 변수
//	static int cnt;
//	//배열중 최대 주식가격의 위치를 저장할 변수
//	static int sum;
//	//총이익이 들어갈 변수
//	static int max;
//	//최대 주식가격이 들어갈 변수
//	static int temp;
//	//재귀시 배열의 시작위치를 지정할 변수
//	
//	public static void roll() {
//		for(int i = cnt; i < day; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//				cnt = i;
//				}
//			}
//		// 배열에서의 최대 주식가격과 그 위치를 기억함
//		if(cnt == 0) {
//			System.out.println(0);
//			//최대 주식가격의 위치가 첫번째이면 0을 출력
//		}else {
//			for(int i = temp; i <= cnt; i++) {
//				sum += (max-arr[i]);
//				System.out.println(sum+"*");
//			}
//			//최대 주식 가격의 위치와 같아질때 까지 
//			//기존의 싼 가격의 주식을 판매함
//			temp = cnt + 1;
//			//재귀가 될수 있기 때문에 판 다음시점부터 비교
//			max = 0;
//			//max 값 초기화
//			if(cnt == day - 1 ) {
//				System.out.println(sum);
//				//최대값이 위치가 배열의 마지막자리와 일치하면 출력
//			}else {
//				cnt++;
//				roll();
//				//아닐경우 배열의 시작위치를 최대값 다음위치로 지정
//				//이유는 temp 랑 값음
//			}
//		}
		
		
///////////////////////////////////////////////////////////////////////	1113공부

		
////		[11508] 2+1 세일
		
//		int n = scan.nextInt();
//		Integer [] arr = new Integer [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		Arrays.sort(arr,Collections.reverseOrder());
//		//내림차순으로 정렬
//		
//		int sum = 0;
//		//합을 저장할 변수
//		int count = 0;
//		//3의 배수를 체크할 변수
//		if( n % 3 == 0) {
//			for(int i = 0; i < n; i++) {
//				if(count != 2) {
//					sum += arr[i];
//					count++;
//				}else {
//					count = 0;
//				}
//			}
//			//3으로 나누어질 경우 3번째 자리를 내림차순 순으로
//			//3번째 자리를 제외한 배열값들은 더해줌
//		}else {
//			sum += arr[0];
//			for(int i = 1; i < n; i++) {
//				if(count != 2) {
//					sum += arr[i];
//					count++;
//				}else {
//					count = 0;
//				}
//			}
//			//3으로 나누어지지않을 경우 가장 큰 값은 제외시킴
//			//나머지는 같음
//		}
//		
//		System.out.println(sum);
		
///////////////////////////////////////////////////////////////////////	1114공부

		
////		[11053] 가장 긴 증가하는 부분 수열 [블로그]		
		
			
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int max = 0;
//		for(int i = 0; i < n; i++) {
//			int count = 0;
//			for(int j = i + 1; j < n; j++) {
//				if(arr[i] < arr[j]) {
//					count++;
//				}
//			}
//			if(max < count) {
//				max = count;
//			}
//		}
//		
//		System.out.println(max);
		
///////////////////////////////////////////////////////////////////////	1115공부
		
////	[1092] 배 [다시보기]
		
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        int N = Integer.parseInt(br.readLine());
//	        int[] max = new int[N];
//	        String[] str = br.readLine().split(" ");
//	        int M = Integer.parseInt(br.readLine());
//	        int[] box = new int[M];
//	        String[] str1 = br.readLine().split(" ");
//	        int[] avail = new int[N];
//
//	        for(int i=0; i<N; i++) {
//	            max[i] = Integer.parseInt(str[i]);
//	        }
//
//	        for(int i=0; i<M; i++) {
//	            box[i] = Integer.parseInt(str1[i]);
//	        }
//
//	        Arrays.sort(max);
//	        Arrays.sort(box);
//
//	        if(max[N-1]<box[M-1])
//	            System.out.println(-1);
//
//	        else {
//	            int index = 0;
//	            int cnt = 0;
//
//	            for(int i=0; i<M;) {
//	                if(box[i]<=max[index]) {
//	                    avail[index]++;
//	                    i++;
//	                    System.out.print(avail[index]);
//	                    System.out.println(index);
//	                }
//	                else
//	                    index++;
//	            }
//
//	            while(true) {
//	                boolean flag = false;
//	                for(int i=0; i<N; i++) {
//	                    if(avail[i]!=0) {
//	                        avail[i]--;
//	                        flag = true;
//	                    }
//	                    else {
//	                        for(int j=i-1; j>=0; j--) {
//	                            if(avail[j]!=0) {
//	                                avail[j]--;
//	                                flag = true;
//	                                break;
//	                            }
//	                        }
//	                    }
//	                }
//	                if(!flag) break;
//	                cnt++;
//	            }
//	            System.out.println(cnt);
//	        }
///////////////////////////////////////////////////////////////////////	1116공부

			
//// 	[17609] 회물 [다시보기]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		for(int t = 0; t < n; t++) {
//			String a = scan.next();
//			int start = 0;
//			int end = a.length();
//			int count = -1;
//			int [] arr = new int[a.length()];
//			int [] temp = new int[a.length() + 1];
//			for(int l =0; l < end; l++) {
//				arr[l] = a.charAt(l) - 'a';
//				temp[l] = a.charAt(l) - 'a';
//			}
//			
//			for(int i = 0; i < a.length(); i++) {
//				if(count != -1) {
//					arr[count] = temp[count];
//				}
//				if(start == end || (arr[start] == arr[end] && (start + 1) == end)) {
//					System.out.println(0);
//				}else {
//					if(start == count) {
//						start++;
//					}else if(end == count) {
//						end--;
//					}	
//					if(arr[start] == arr[end]) {
//						start++;
//						end--;
//					}else {
//						count++;
//						arr[count] = -1;
//						
						
//						def pseudo(a, left, right):
//						    while left < right:
//						        if a[left] == a[right]:
//						            left += 1
//						            right -= 1
//						        else:
//						            return False
//						    return True
//
//						# 회문 판단 함수
//						def palindrome(a, left, right):
//						    while left < right:
//						        if a[left] == a[right]:
//						            left += 1
//						            right -= 1
//						        else:
//						            res1 = pseudo(a, left+1, right)
//						            res2 = pseudo(a, left, right-1)
//						            if res1 == True or res2 == True:
//						                return 1
//						            else:
//						                return 2
//						    return 0
//
//						T = int(input())
//						for i in range(T):
//						    a = list(input())
//						    res = palindrome(a, 0, len(a)-1)
//						    print(res)
//					}
//				}
//				
//			}
//			
//		}
///////////////////////////////////////////////////////////////////////	1015공부			
		

//		[1781] 컵라면	[블로그]	
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [][] arr = new int [n][2];
//		int max = 0;
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//				if(max < arr[i][0]) {
//					max = arr[i][0];
//				}
//			}
//		}
//		
//		Arrays.sort(arr, new Comparator<int []>(){
//			public int compare(int [] o1, int [] o2) {
//				if(o1[1] == o2[1]) {
//					return o2[0] - o1[0];
//				}else {
//					return o2[1]- o1[1];
//				}
//			}
//		});
//		//우선적으로 컵라면 기준으로 내림차순 컵라면 갯수가 같을경우
//		//날짜기준으로 내림차순
//		
//		int deadline = 1;
//		//데드라인 함수
//		int sum = 0;		
//		loop :while(true){
//				for(int j = 0; j < n; j++) {
//					if(j == n - 1 && deadline != arr[j][0]) {
//						deadline++;
//					}
//					//j 가 끝날때까지 데드라인과 같은 배열내부의 데드라인이 없을경우
//					//데드라인을 하나 더해줌
//					if(deadline == arr[j][0]) {
//						sum += arr[j][1];
//						arr[j][0] = n + 1; 
//						deadline++;
//						break;
//					}
//					//데드라인과 배열의 데드라인이 같으면,
//					//썸에 더해주고 해당 데드라인 재사용 못하게  n+1 하고
//					//데드라인 또한 하나씩 증가해줌
//				}
//				if(deadline > max) {
//					break loop;
//				}
//				//데드라인이 배열의 최대 데드라인보다 커지면
//				//while 루프를 종료해줌
//			}
//			
			
//			System.out.println(sum);
///////////////////////////////////////////////////////////////////////	1015공부			
			

//		[2138]		전구와 스위치 [다시보기]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		String a = scan.next();
//		int [] arrA = new int [a.length()];
//		for(int i = 0; i < a.length(); i++) {
//			arrA[i] = a.charAt(i) - '0';
//		}
//		
//		
//		String b = scan.next();
//		int [] arrB = new int [b.length()];
//		int [] temp = new int [b.length()];
//		for(int i = 0; i < b.length(); i++) {
//			arrB[i] = b.charAt(i) - '0';
//			temp[i] = b.charAt(i) - '0';
//		}
//		
//		int start = 0;
//		int end = b.length();
//		int count = 0;
//		boolean flag = true;
//		if(a.length() != b.length()) {
//			System.out.println(-1);
//		}else {
//			while(true) {
//				for(int i = b.length() - 1; i >= 0; i--) {
//					if(arrA[i] != arrB[i]) {
//						if(i == 0) {
//							arrB[i] = 1 - arrB[i];
//							arrB[i + 1] = 1 - arrB[i + 1];
//							count++;
//							flag = false;
//						}else if(i == b.length() - 1){
//							arrB[i] = 1 - arrB[i];
//							arrB[i - 1] = 1 - arrB[i - 1];
//							count++;
//							flag = false;
//						}else {
//							arrB[i + 1] = 1 - arrB[i + 1];
//							arrB[i] = 1 - arrB[i];
//							arrB[i - 1] = 1 - arrB[i - 1];
//							count++;
//							flag = false;
//						}
//						break;
//					}
//				}
//				
//				for(int i = 0; i < b.length(); i++) {
//					System.out.print(arrB[i]);
//				}
//				System.out.println();
//				System.out.println(count);
//				if(flag) {
//					System.out.println(count);
//					break;
//				}
//				
//				
//				for(int i = 0; i < b.length(); i++) {
//					if(temp[i] == arrB[i]) {
//						flag = true;
//					}else {
//						flag = false;
//						break;
//					}
//				}
//				
//				if(flag && count != 0) {
//					System.out.println(-1);
//					break;
//				}else if(count == 0){
//					System.out.println(count);
//				}else {
//					flag = true;
//				}
//				
//				}
//			}
		
		
		
////	//	//	//	//	//	//	//	//	//	//	//	//	//	//	//	//	//	//			
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		n = Integer.parseInt(br.readLine());
//		String s=br.readLine();
//		src=new char[2][n];
//		src[0]=s.toCharArray();
//		src[1]=s.toCharArray();
//		dst=br.readLine().toCharArray();
//		answer=Integer.MAX_VALUE;
//		//0번째 스위치를 누르지 않고 시작
//		go(1,0,0);
//		//0번째 스위치를 누르고 시작
//		push(0,1);
//		go(1,1,1);
//		System.out.println(answer==Integer.MAX_VALUE?-1:answer);
//	}
//	
//	static char src[][],dst[];
//	static int n,answer;
//	static void push(int idx,int type) {
//		for(int i=idx-1;i<=idx+1;i++) {
//			if(i>=0&&i<n) src[type][i]=src[type][i]=='1'?'0':'1';
//		}
//	}
//	static void go(int idx,int cnt,int type) {
//		if(idx==n) {
//			if(src[type][idx-1]==dst[idx-1]) answer=answer>cnt?cnt:answer;
//			return;
//		}
//		if(src[type][idx-1]!=dst[idx-1]) {
//			push(idx,type);
//			go(idx+1,cnt+1,type);
//		}else go(idx+1,cnt,type);
		
///////////////////////////////////////////////////////////////////////	1119공부			
		

//		[1758]	알바생 강호 [블로그]
		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		Integer [] arr = new Integer [n];
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		Arrays.sort(arr,Collections.reverseOrder());
//		//내림차순 정렬
//		int sum = 0;
//		//총 팁을 저장할 변수
//		int count = 1;
//		//순서를 저장할 변수
//		for(int i = 0; i < n; i++) {
//			if(count > arr[i]) {
//				break;
//				//count 가 팁보다 커지면 종료
//			}else {
//				sum += arr[i] - (count - 1);
//				count++;
//				//팁이 0보다 작지않으면 계속해서 더해줌
//			}
//		}
//	
//		System.out.println(sum);
		
		
///////////////////////////////////////////////////////////////////////	1122공부			
		

//		[2109] 순회강연	[다른풀이 살펴보기 다시보기]	

//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [][] arr = new int [n][2];
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < 2; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		Arrays.sort(arr, new Comparator<int[]>(){
//			public int compare(int[]o1, int[]o2) {
//				if(o1[1]==o2[1]) {
//					return o1[0]-o2[0];
//				}else {
//					return o1[1]-o2[1];
//				}
//			}
//		});
//		//마감일 기준으로 정렬
//		
//		int day = arr[0][1];
//		//첫째날 저장
//		int lastday = arr[n-1][1];		
//		//마지막날 저장
//		int sum = 0;
//		//합을 더할 변수
//		boolean flag = true;
//		//마지막날 체크 변수
//		while(day <= arr[n-1][1]) {
//			int max = 0;
//			for(int i = 0; i < n; i++) {
//				if(arr[i][1] == day) {
//					if(arr[i][0] > max) {
//						max = arr[i][0];
//					}
//					//같은 날중 최대 페이값 저장
//				}else if(arr[i][1] > day) {
//						day = arr[i][1];
//						flag = false;
//						break;		
//				}
//				//배열값이 day 값보다 크면 비교 불필요
//				//day값 다음 강연날로 변경
//			}
//			sum += max;
//			if(flag && lastday == day) {break;}
//			//
//			flag = true;
//		}
//		
//		System.out.println(sum);
//////////////////////////////////////////////////
//		import java.io.BufferedReader;
//		import java.io.IOException;
//		import java.io.InputStreamReader;
//		import java.util.PriorityQueue;
//		import java.util.StringTokenizer;
//
//		public class TemplateA {
//			static int n;
//			static boolean[] checked;
//		    public static void main(String[] args) throws IOException{
//		    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//				StringTokenizer st = new StringTokenizer(br.readLine());
//				n = Integer.parseInt(st.nextToken());
//				PriorityQueue<Lecture> pq = new PriorityQueue<>();
//				int maxDay = 0;
//				for(int i = 0; i < n; i++) {
//					st = new StringTokenizer(br.readLine());
//					int pay = Integer.parseInt(st.nextToken());
//					int day = Integer.parseInt(st.nextToken());
//					maxDay = Math.max(day, maxDay);
//					pq.add(new Lecture(pay, day));
//				}
//				checked = new boolean[maxDay+1];
//				int sum = 0;
//				while(!pq.isEmpty()) {
//					Lecture lecture = pq.poll();
//					for(int i = lecture.day; i >= 1; i--) {
//						if(!checked[i]) {
//							checked[i] = true;
//							sum += lecture.pay;
//							break;
//						}
//					}
//				}
//				System.out.println(sum);
//			}
//		}
//
//		class Lecture implements Comparable<Lecture> {
//			int pay;
//			int day;
//			public Lecture(int pay, int day) {
//				this.pay = pay;
//				this.day = day;
//			}
//
//			@Override
//			public int compareTo(Lecture target) {
//				if(target.pay > this.pay) { // pay가 높은게 우선순위가 높다
//					return 1;
//				} else if(target.pay == this.pay) {
//					if(target.day < this.day) { // 같은 pay면 day가 낮은게 우선순위가 높다.
//						return 1;
//					}
//				}
//				return -1;
//			}
//		}
///////////////////////////////////////////	
		
///////////////////////////////////////////////////////////////////////	1127공부			
		

//		[10165] 버스 노선	[블로그]
		
//		Scanner scan = new Scanner(System.in);
//		
//		int station = scan.nextInt();
//		int busCnt = scan.nextInt();
//		
//		int [][] arr = new int [busCnt][2];
//		int [] ans = new int [busCnt];
//		//없어지질 않을 버스 노선을 저장할 배열
//		
//		for(int i = 0; i < busCnt; i++) {
//			for(int j = 0; j < 2; j++) {
//			arr[i][j] = scan.nextInt();	
//			}
//			
//			if(arr[i][0] > arr[i][1]) {
//				int temp = arr[i][0];
//				arr[i][0] = arr[i][1];
//				arr[i][1] = temp;
//				//각 버스노선이 시작지점이 작은값으로 가게 정렬해줌
//			}
//	
//		}
//
//		int start = 0;
//		//배열의 위치한 처음 0번째 버스 저장
//		while(true) {
//			if(start > busCnt - 1) {break;}
//			//start 가 총 버스의 수보다 커지면 스탑 배열이 0번째부터 시작하기 때문에 -1해줌
//			for(int i = 0; i < busCnt; i++) {
//				if(start != i) {
//					if(arr[start][0] >= arr[i][0] && arr[start][1] <= arr[i][1]) {
//					ans[start] = -1;
//					break;
//					}
//					//초기 i와 start 가 같으면 같은 버스임으로 비교 불필요
//					//이후 각 버스 노선마다 겹치는지 여부 체크
//					//시작 지점이 과 끝나는 지점의 겹치거나 포함되는 여부 체크!!!
//					//겹칠경우 해당 ans 배열에 그 버스노선은 사라질거기 때문에 -1 선언
//				}
//			}
//			start++;
//			//다음 버스 비교 위해 하나씩 더해줌
//		}
//		
//		for(int i = 0; i < ans.length; i++) {
//			if(ans[i] != -1) {
//				System.out.print(i + 1 + " ");
//			}
//		}
//		//배열은 0 부터 시작이기 때문에 -1이 아닌 버스들 출력함 

		
///////////////////////////////////////////////////////////////////////	1224공부			
		

//		[1285] 동전 뒤집기 [다시보기]
		
//		Scanner scan = new Scanner(System.in);
//		n = scan.nextInt();	
//		arr = new String [n][n];
//		
//		
//			
//		for(int i = 0; i<n; i++) {
//			String temp = scan.next();
//			for(int j = 0; j<n; j++) {
//				arr[i][j] = String.valueOf(temp.charAt(j));
//			}
//		}
//		
//		String [][] ans = reverse();
//		
//		count = 0;
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n; j++) {
//				if(ans[i][j].equals("H"));
//				count++;
//			}
//		}
//	
////		for(int i = 0; i<n; i++) {
////			for(int j = 0; j<n; j++) {
////				System.out.print(ans[i][j]);
////			}
////			System.out.println();
////		}
////		
//		System.out.println(count);
//		
//	}
//	
//	static String [][] arr;
//	static int count = 0;
//	static int n;
//	
//	public static String [][] reverse(){
//		
//		
//		
//		
//		for(int i = 0; i<n; i++) {
//			count = 0;
//			for(int j = 0; j<n; j++) {
//				if(arr[i][j].equals("H")) {
//					count++;
//				}
//				if(count >= (n / 2) + 1 ) {
//					for(int k = 0; k<n; k++) {
//						if(arr[i][k].equals("H")) {
//							arr[i][k] = "T";
//						}else {
//							arr[i][k] = "H";
//						}
//					}
//					break;
//				}
//			}
//		}
//		
//		for(int i = 0; i<n; i++) {
//			count = 0;
//			for(int j = 0; j<n; j++) {
//				if(arr[j][i].equals("H")) {
//					count++;
//				}
//				if(count >= (n / 2) + 1 ) {
//					for(int k = 0; k<n; k++) {
//						if(arr[k][i].equals("H")) {
//							arr[k][i] = "T";
//						}else {
//							arr[k][i] = "H";
//						}
//					}
//					break;
//				}
//			}
//		}
//		return arr;
//	}
	
	
//	using namespace std; 
//	int main(void) { 
//		int T; cin >> T; 
//					for(int t_case=0; t_case<T; t_case++) { 
//						int N, min = 100001, cnt; cin >> N; int distance[N]; 
//						for(int i=0; i<N; i++) { 
//							cin >> distance[i]; 
//						if(distance[i] < 0) 
//							distance[i] = -distance[i]; 
//						if(distance[i] < min) min = distance[i]; 
//						} 
//	cnt = 0; 
//	for(int i=0; i<N; i++) { 
//		if(distance[i] == min) 
//			cnt++; 
//		} cout << "#" << t_case+1 << " " << min << " " << cnt << "\n"; 
//		} 
//					return 0; 
//		}
//
//	출처: https://dev-repository.tistory.com/62 [Dev Repository]
///////////////////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////	1225공부
		
		
// 			[2872] 우리 집에는 도서관이 있어 [블로그]
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int [] arr = new int [n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		
//		//항상 최솟값을 제일 앞에 위치시킨다는 생각으로
//		//문제에 접근한다.
//		int count = 0;
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n; j++) {
//				int tmp = 0;
//				//배열의 값을 임시로 받아줄 변수
//					if(arr[0] > arr[j]) {
//						tmp = arr[0];
//						arr[0] = arr[j];
//						arr[j] = tmp;
//						count++;
//						break;
//						//루프를 돌면서 첫번째 자리보다 제이의 값이 크면
//						//해당 값과 첫번째 위치를 서로 변경해줌
//				}
//			}
//		}
//		
//		System.out.println(count);
		
		
//			[16435] 	스네이크버드 [블로그]
		
		
		Scanner scan = new Scanner(System.in);
		int fruitCnt = scan.nextInt();
		int snakeLen = scan.nextInt();
		
		int [] arr = new int [fruitCnt];
		
		for(int i = 0; i < fruitCnt; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		//내림차순 배열 정렬
		int start = 0;
		while(true) {
			if(arr[start] <= snakeLen ) {
				snakeLen++;
				//과일의 위치가 뱀의 길이와 같거나 작으면 
				//과일 먹고 뱀의 길이 증가
				if(start < fruitCnt - 1) {
					start++;
					//남은 과일이 있으면, 다음 과일 비교 위해
					//베열위치 더해줌
				}else {
					break;
					//다음 과일 없으면 반복문탈출
				}
			}else {
				break;
				//뱀이 다음과일 위치보다 짧으면 반복문 탈출
			}
		}
		
		System.out.println(snakeLen);
	}
	

}		
