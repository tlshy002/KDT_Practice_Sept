package sept27_lesson1;

//한국사람과 미국 사람이 있다
//한국사람이 가위바위보 중 하나를 낸다 가바보는 난수
//미국사람이 가위바위보 중 하나를 낸다
//영국사람이 승무패를 출력

// 가위(0)바위(1)보(2) 0~2
class Korean {
	Korean(){}
	int handNum; 
	String hand;
	void giveGavabo() {
		handNum = (int)(Math.random()*3);
		if(handNum==0) {
			hand = "\"가위\"";
		} else if(handNum == 1) {
			hand = "\"바위\"";
		} else 
			hand = "\"보\"";
		System.out.println("한국인이 낸 "+hand);		
	}
}
class American {
	American(){}
	int handNum;
	String hand;
	void giveGavabo() {
		handNum = (int)(Math.random()*3);
		if(handNum==0) {
			hand = "\"가위\"";
		} else if(handNum == 1) {
			hand = "\"바위\"";
		} else 
			hand = "\"보\"";
		System.out.println("미국인이 낸 "+hand);		
	}	
}
class TheBritish {
	
	void winner(Korean k, American a) {
		if(k.handNum == a.handNum) {
			System.out.println("무승부");
		} else if( k.handNum==0 && a.handNum==2 
				|| k.handNum==1 && a.handNum==0
				|| k.handNum==2 && a.handNum==1 ) {
			System.out.println("한국인이 이겼습니다.");
		} else
			System.out.println("미국인이 이겼습니다.");
		
	}	
}


public class Study7_Gavabo {
	public static void main(String[] args) {
		Korean k = new Korean();
		American a = new American();
		TheBritish b = new TheBritish();
		
		k.giveGavabo();
		a.giveGavabo();
		
		b.winner(k, a);
		
		
	}

}
