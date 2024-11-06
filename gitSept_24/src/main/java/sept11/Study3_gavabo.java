package sept11;

public class Study3_gavabo {

	public static void main(String[] args) {
		gavabo1(1,3);
	}
	
	public static void gavabo2(int chu, int min) {
		if(chu == min) {
			System.out.println("무승부");
		} else if( (chu==1)&&(min==3) ) {
			
		} else {
			
		}
	}
	
	
	//가바보 승패 판단 메서드1 -> 비교연산자만 이용
	//가바보 승패 판단 메서드1 -> 논리연산자 이용
	public static void gavabo1(int chu, int min) {
		if(chu == min) {
			System.out.println("무승부");
		} else {
			if(chu == 1) { //철수 가위
				if(min == 2) { //민수 바위
					System.out.println("가위낸 철수 vs 바위낸 민수 => 민수 승");
				} else { //민수 보
					System.out.println("가위낸 철수 vs 보낸 민수 => 철수 승");
				}
			} else if(chu == 2) { //철수 바위
				if(min == 1) { //민수 가위
					System.out.println("바위낸 철수 vs 가위낸 민수 => 철수 승");
				} else { //민수 보(3)
					System.out.println("바위낸 철수 vs 보낸 민수 => 민수 승");
				}
			} else { //철수 보
				if(min == 1) { //민수 가위
					System.out.println("보낸 철수 vs 가위낸 민수 => 민수 승");
				} else { //민수 바위(2)
					System.out.println("보낸 철수 vs 바위낸 민수 => 철수 승");
				} //if 끝
			} //if 끝
		} //if 끝
	} //gavabo1 메서드 끝
	
	
	
} // Study3 클래스 끝
