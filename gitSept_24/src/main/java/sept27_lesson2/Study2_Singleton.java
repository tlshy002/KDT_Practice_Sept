package sept27_lesson2;



class Note {	
}

class Printer {
	static Printer p = new Printer();	
	private Printer(){}; //생성자가 private 으로 은닉되어서 다른 클래스에서 호출할 수 없음.
	static Printer getInstance() { 
		return p;
	}	
}

// 생성자를 은닉해서 클래스를 설계하는 방법 => 싱글톤
// 왜 싱글톤방식을 해야함? => 모두 동일한 인스턴스로 사용하기 위해서 
public class Study2_Singleton {
	public static void main(String[] args) {

		Note note1 = new Note();
		Note note2= new Note(); 
		// note1 != note2 => 인스턴스의 특징은 생성할때마다 다름.		
		
		//Printer pr = new Printer(); //생성자가 은닉돼서 생성불가능
		Printer pr1 = Printer.getInstance();
		
		
		
	}	
}
