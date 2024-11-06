package sept27_lesson1;


// 승부차기 게임을 클래스로 설계
// 슈터가 공을 참(상,하,좌,우,중)->난수
// 골키퍼가 이동함(상,하,좌,우,중)->난수
// 심판이 골 유무를 출력함

class Shooter {
	Shooter(){}
	int direction;
	void shoot() {
		direction = (int)(Math.random()*5+1); //1~5까지 난수
		System.out.println("슛방향 "+direction);
	}	
}

class GoalKeeper {
	GoalKeeper(){}
	int direction;
	void move() {
		direction = (int)(Math.random()*5+1); 
		System.out.println("이동방향 "+direction);
	}
}

class Referee {
	Referee(){}
	void winner(Shooter s, GoalKeeper r) {
		if(s.direction == r.direction) {
			System.out.println("골인~~!");
		} else //방향이 다름으로
			System.out.println("노골");
	}
}







public class Study6_Goal {
	public static void main(String[] args) {
		//한번에 다 완성하고 돌리지 말고
		// 기능 하나가 제대로 잘 동작하는지 부분적으로 확인하는 것을
		// 단위테스트 라고 함. 이런식으로 단위테스트를 해줘야함
		Shooter s = new Shooter(); s.shoot();
		GoalKeeper g = new GoalKeeper(); g.move();
		
		Referee r = new Referee();
		r.winner(s, g);
		
		

	}
}
