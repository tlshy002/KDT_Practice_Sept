package sept26;

//롯데백화점이 있습니다.
class LotteStore {
	LotteStore(){ cm = new ClothingMart(); sm = new ShoesMart(); }
	ClothingMart cm; ShoesMart sm;
}
//이 백화점에 신발매장과 의류매장이 있습니다.
class ClothingMart {
	ClothingMart(){ lj = new LevisJean(); gj = new GuessJean(); }
	LevisJean lj; GuessJean gj;
}
class ShoesMart {
	ShoesMart(){ as = new AsicsShoes(); ns = new NikeShoes(); }
	AsicsShoes as; NikeShoes ns;
}
//신발매장에 아식스 운동화와 나이키 운동화가 있습니다.
class AsicsShoes {
	AsicsShoes(){ 
		price = (int)((Math.random() * 47001)+3000);
		System.out.println("아식스 운동화 가격:"+price);
	}
	int price; 
}
class NikeShoes {
	NikeShoes(){ price = (int)((Math.random() * 47001)+3000);  }
	int price; 
}
//의류매장에 리바이스 청바지와 게스 청바지가 있습니다.
class LevisJean {
	LevisJean(){ 
		price = (int)((Math.random() * 47001)+3000);
		System.out.println("리바이스 청바지 가격:"+price);
	}
	int price; 
}
class GuessJean {
	int price;
	GuessJean(){ price = (int)((Math.random() * 47001)+3000); }
}
//모든 상품은 가격이 있습니다. 가격은 난수 입니다. 난수의 범위 3000 ~ 50000
//손님이 있습니다. 이 손님은 100,000원을 가지고 있습니다.
class Guest {
	Guest(int pocketMoney){ 
		this.pocketMoney = pocketMoney; //this.---> this 제어자(modifier)
		//this제어자의 역할 : 인스턴스 변수와 지역변수,매개변수 이름이 동일한 경우 인스턴스 변수를 지칭
	}
	int pocketMoney;
	void buy(AsicsShoes asics) {
		pocketMoney = pocketMoney - asics.price;
	}//아식스 운동화를 구매하는 메서드
	void buy(LevisJean levis) {
		pocketMoney = pocketMoney - levis.price;
	}//라이바이스 청바지를 구매하는 메서드
	void showBalance() {
		System.out.println("구매 후 잔액:"+pocketMoney);
	}
}
//이 손님이 롯데백화점의 신발매장에서 아식스 운동화를 구매(행위,동작)했습니다.
//이 손님이 롯데백화점의 의류매장에서 라바이스 청바지를 구매했습니다.
//이 손님이 가지고 있는 잔액을 출력합니다.
public class Study3 {
	public static void main(String[] args) {
		LotteStore lotte = new LotteStore();
		Guest guest = new Guest(100000);
		System.out.println("구매 전의 총액:"+guest.pocketMoney);//구매 전의 총액
		guest.buy(lotte.sm.as);//아식스 운동화를 구매
		guest.buy(lotte.cm.lj);//리바이스 청바지를 구매
		System.out.println("구매 후의 총액:"+guest.pocketMoney);//구매 전의 총액
	}
}








