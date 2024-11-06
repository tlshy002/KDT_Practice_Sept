package sept30;

// 포커게임: 각 카드는 4가지 모양중에 각 하나를 가짐 (하트♥,클로버♣,스페이드♠,다이아◆)
// 각 카드는 1~13중 하나의 수를 가짐
// 카드를 클래스로 

class Card {
	Card(){}
	Card(String shape, int number) {
		this.shape=shape; this.number=number;
	}
	String shape; int number;
}


class Dealer {
	Dealer(){}
	
	Card[] cards = new Card[5]; // Card 인스턴스 5개를 저장하는 배열생성
	void fiveCards() {
		for(int i=0; i<5; i++) {
			cards[i] = makeCard();
		}
		for(int i=0; i<5; i++) {
			System.out.println(cards[i].shape +","+ cards[i].number);
		}
	}
	
	Card makeCard() {
		String[] shapes = {"♥","♣","♠","◆"}; //배열 [0]~[3]중의 하나
		Card card = new Card(shapes[rnd(0,3)], rnd(1,13)); // 숫자 1~13
		return card;
	}
	int rnd(int start, int end) {
		int num = (int)(Math.random()*(end-start+1)+start);
		return num;
	}
}



public class Study4 {
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.shape = "♥"; card1.number = 1;
		System.out.println(card1.shape +","+ card1.number);
		
		Dealer d = new Dealer();
		d.makeCard();
		d.fiveCards();
	}
}
