package sept25;



//매장에 노트북이 있다. (매장이 노트북을 가지고있다)
//매장이 노트북을 포함하고 있다는 것을 어떻게 표현하는가?
class ElectronicShop {
	ElectronicShop(){}	
	Notebook com = new Notebook(); 
}


class Notebook {
	Notebook(){}
	int price = 60000;
	
}


//변수 하나에는 값을 하나밖에 못담는데
//인스턴스를 이용하면 변수 하나에 여러개를 담을 수 있음
public class Study3 {
	public static void main(String[] args) {
		ElectronicShop shop = new ElectronicShop();
		System.out.println(shop.com.price);
	}
}
