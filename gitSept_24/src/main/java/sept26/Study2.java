package sept26;

//GS25 편의점이 있습니다.
class GS25{
	GS25(){
		shinRamen = new ShinRamen();
		jinRamen = new JinRamen();
		samkakKimbab = new SamkakKimbab();
		bananaMilk = new BananaMilk();
		worker = new Worker();
	}
	ShinRamen shinRamen; JinRamen jinRamen; SamkakKimbab samkakKimbab;
	BananaMilk bananaMilk; Worker worker;
}
//이 편의점에 신라면, 진라면, 삼각김밥, 바나나우유가 있습니다.
//->GS25 편의점이 신라면, 진라면, 삼각김밥, 바나나우유를 가지고 있다.(포함관계)
class ShinRamen {
	ShinRamen(){price = (int)((Math.random() * 1401)+100); System.out.println(price);}
	int price;
}
class JinRamen {
	int price;
	JinRamen(){ price = (int)((Math.random() * 1401)+100);System.out.println(price); }
}
class SamkakKimbab {
	int price;
	SamkakKimbab(){ price = (int)((Math.random() * 1401)+100);System.out.println(price); }
}
class BananaMilk {
	int price;
	BananaMilk(){ price = (int)((Math.random() * 1401)+100);System.out.println(price); }
}
class Worker {
	Worker(){}
	int sum;
	void makeSum(ShinRamen sr, JinRamen jr, SamkakKimbab sk, BananaMilk bm) {
		sum = sr.price + jr.price + sk.price + bm.price;
	}//물건의 합을 계산하는 메서드
	void showSum() {
		System.out.println("물건 가격의 합:"+sum);
	}//물건의 합을 출력하는 메서드
}
//위의 상품의 가격은 난수로 정합니다.(난수의 범위 100~1500)
//이 편의점에 알바생이 있습니다.--> 편의점이 알바생을 가지고 있다.(포함관계)
//이 알바생이 편의점에 있는 모든 상품의 물건의 합을 계산하고 출력합니다.
public class Study2 {
	public static void main(String[] args) {
		GS25 gs25 = new GS25();
		gs25.worker.makeSum(gs25.shinRamen, gs25.jinRamen, gs25.samkakKimbab, 
				gs25.bananaMilk);
		gs25.worker.showSum();
		
	}
}













