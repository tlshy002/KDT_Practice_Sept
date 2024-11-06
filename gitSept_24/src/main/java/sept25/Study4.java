package sept25;


//삼호빌딩이 있다
//삼호빌딩 안에 파바가 있다
//파바 안에 케잌이 있다
//케잌 가격은 25000이다. 무게는 800g이다
//케잌의 가격과 무게를 콘솔에 출력

class SamhoBuilding {
	ParisBaguette pb = new ParisBaguette();
	SamhoBuilding(){}
}

class ParisBaguette {
	Cake cake = new Cake();
	ParisBaguette(){}		
}

class Cake {
	int price = 25000;
	int weight = 800;
	Cake(){}
}


public class Study4 {
	public static void main(String[] args) {
		SamhoBuilding samho = new SamhoBuilding();
		
		System.out.println("케잌의 가격은 "+ samho.pb.cake.price);
		System.out.println("케잌의 무게는 "+ samho.pb.cake.weight);
	}
}
