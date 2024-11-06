package sept26;

//호랑이가 있습니다. 이 호랑이의 나이는 3살입니다.
class Tiger {
	Tiger(){}//생성자(constructor)는 메서드-> 생성자를 일반 메서드처럼 써보자!
	int age = 3;
}
//사자가 있습니다. 이 사자의 나이는 4살입니다.
class Lion {
	Lion(int a, int b){}
	Lion(int a){ nai = a; }
	Lion(){}
	int nai;
}
//메서드의 오버로딩(overloading) : 메서드의 이름을 동일하게 작성하는 문법 
//--> 생성자의 오버로딩
public class Study1 {
	public static void main(String[] args) {
		Lion l1 = new Lion();
		Lion l2 = new Lion(10);
		Lion l3 = new Lion(10,20);
		Lion lion = new Lion(4);		System.out.println(lion.nai);
		Lion lion5 = new Lion(5);		System.out.println(lion5.nai);
		Tiger tiger = new Tiger();		System.out.println(tiger.age);
	}
}



