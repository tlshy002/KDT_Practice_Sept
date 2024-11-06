package sept19;

public class Study1 {

	public static void main(String[] args) {
		makeWhile();
	}
	public static void makeFor() {
		for(int count=1; count <= 5; count=count+1) {
			System.out.println("Good Morning~");
		}
	}
	public static void makeWhile() {
		int count=1;
		while(count<6) {
			System.out.println("Good Morning~");
			count++;
		}
		
		count = 0;
		while(count < 10) {
			count++;
			System.out.println(count);
		}
	}
}
