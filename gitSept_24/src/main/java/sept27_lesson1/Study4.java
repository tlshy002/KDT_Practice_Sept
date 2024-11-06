package sept27_lesson1;

class Test2 {
	//인스턴스 변수와 지역변수,매개변수는 범위가 다르니 이름이 같아도 되지만,
	//이름이 같으면 자바컴파일러는 구분을 못해서 지역변수에(더 가까운쪽에)우선권을 줌
	//이때 인스턴스변수를 지칭하기위해 this.(제어자)를 사용하면 됨
	//즉, this.를 가지는 변수는 인스턴스변수를 의미함
	
	int sum = 100;
	int test() {
		int sum = 200;
		int total1 = 500 + this.sum; // 500 + 100
		int total2 = 500 + sum; 	 // 500 + 200	
		return total2;
	}
}


//머린의 마나는 100
class Marine{
	int mana; //인스턴스 변수
	Marine(int mana) { // 생성자
		this.mana = mana; //매개변수
	};	
	void attack(Zillet zillet) {
		zillet.mana = zillet.mana - 10;
	}
	void attack(Hidra hidra) {
		hidra.mana = hidra.mana - 10;
	}
	void attack(Marine marine) {
		marine.mana = marine.mana - 10;
	}
}

//질럿의 마나는 100
class Zillet {
	int mana;
	Zillet(int mana) { this.mana = mana; }
	
	void attack(Hidra hidra) {
		hidra.mana = hidra.mana - 10;
	}
	void attack(Marine marine) {
		marine.mana = marine.mana - 10;
	}
	void attack(Zillet zillet) {
		zillet.mana = zillet.mana - 10;
	}
}

class Hidra {
	int mana;
	Hidra(int mana) { this.mana = mana; }
	
	void attack(Marine marine) {
		if(marine.mana <= 0) {
			System.out.println("상대 머린은 이미 소멸됨");
		} else marine.mana = marine.mana - 10;
	}
	void attack(Zillet zillet) {
		if (zillet.mana <= 0) {
			System.out.println("상대 질럿은 이미 소멸됨");
		} else zillet.mana = zillet.mana - 10;
	}
	void attack(Hidra hidra) {
		if(hidra.mana <= 0) {
			System.out.println("상대 히드라는 이미 소멸됨");
		} else hidra.mana = hidra.mana - 10;
	}
}



public class Study4 {
	public static void main(String[] args) {
		Marine m1 = new Marine(100); System.out.println(m1.mana);
		Zillet z1 = new Zillet(100);
		Hidra h1 = new Hidra(100);
		
		Zillet z2 = new Zillet(100);
		Hidra h2 = new Hidra(100);
		
		
		m1.attack(h2); //첫번째 머린이 두번째 히드라 공격
		z1.attack(m1);
		
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		h1.attack(z2);
		
		System.out.println(z2.mana);
		h1.attack(z2);

		System.out.println(h2.mana);
		System.out.println(m1.mana);
		System.out.println(z2.mana);
		
	}
}
