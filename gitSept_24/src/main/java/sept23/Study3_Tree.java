package sept23;
public class Study3_Tree {
	
	
	
	// 어려붱....
	public static void main(String[] args) {
//		treeFor(10);
		treeWhile();
	}
	
	
	// 정답
	public static void treeFor(int height) { //홀수경우 구할때 % == 1 하면 양수만 해당됨
		for(int nopi=height; nopi>=1; nopi--) {
			if(nopi%2 != 0) { //홀수인 경우
				for(int star=1; star<=nopi; star++) {
					System.out.print("*");
					System.out.print(" ");
				}
				
			} else {
				for(int star=1; star<=nopi; star++) {
					System.out.print(" ");
					System.out.print("*");
				}
			}
		System.out.println();	
		}
	}
	
	
	public static void treeWhile() {
		int nopi=5;
		while(nopi>=1) {
			if(nopi%2 != 0) {
				int star = 1;
				while(star <= nopi) {
					System.out.print("*");
					System.out.print("");
					star++;
				}
			} else {
				int star = 1;
				while(star <= nopi) {
					System.out.print("");
					System.out.print("*");
					star++;
				}
			}
		}
		nopi--;
		System.out.println();
	}
	
	
//	public static void treeDoWhile() {
//		int nopi=5;
//		do {
//			
//			do {
//				
//			} while();{
//				
//			}
//			
//		} while(true);
//		
//	}
	
	
	
	
	
	
	
	public static void treeFor1() {
		for(int i=5; i>0; i--) {
			for(int j=5; j>0; j--) {
				int num = j % 2;
				if(num == 1) { //홀수이면
					System.out.print("*");
					System.out.print(" ");
				} else {
					System.out.print(" ");
					System.out.print("*");					
				}
				System.out.println();
			}
		}
	}
	public static void treeFor2() {
		for(int i=5; i>0; i--) {
			for(int j=5; j>0; j--) {
				if(j == 5) {
					System.out.print("*");
					System.out.print(" ");					
				} else if (j == 4) {
					System.out.print(" ");					
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
	}

}
