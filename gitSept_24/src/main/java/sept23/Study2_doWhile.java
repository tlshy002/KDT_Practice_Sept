package sept23;

public class Study2_doWhile {

	public static void main(String[] args) {
		treeWhile2();
//		tree2While2(5);
	}
	
//	나무그리기1
//	*
//	**
//	***
//	****
//	*****	
	public static void treeWhile1(int height) {
		int nopi = 0;
		while(nopi < height) {
			int star = 0;
			while(star < nopi+1) {
				System.out.print("*");
				star++;
			}	
			System.out.println();
			nopi++;
		}
	}
	
	public static void treeWhile2() {
		int nopi = 5;
		do {
			int star = 1;
			do {
				System.out.print("*");
				star++;
			} while(star <= nopi); { 
				nopi--;
				System.out.println();
			}	
		} while(nopi > 0);
	}
	
	
//	나무그리기2 
//	*****	높이5  -> 높이1부터 시작하는것도 가능
//	****	높이4
//	***		높이3
//	**		높이2
//	*		높이1
	public static void tree1While1(int height) {
		int nopi = height;
		while(nopi>0) {
			int star = 0;
			while(star < nopi) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			nopi--;
		}
	}
	
	public static void tree2While2(int height) {
		int nopi = height;
		do {
			int star = 0;
			do {
				System.out.print("*");
				star++;
			} while(star < nopi); { //반복 0->1->2->3->4
				nopi--;
				System.out.println();
			}
		} while(nopi > 0); //높이반복 5->4->3->2->1 
	}
	
	
	
	
	
	
	// 중첩 반복문
	public static void gugudanWhile() {
		int dan = 2;
		while(dan <= 9) {
			System.out.println("*** 제 "+ dan +"단 ***");
			int num = 1;
			while(num <= 9) {
				System.out.println(dan+" * "+num+" = "+ dan*num);
				num++;
			}
			System.out.println();
			dan++;
		}
	}

	public static void gugudanDoWhile() {
		int dan = 2;
		do {
			System.out.println("*** 제 "+ dan +"단 ***");
			int num = 1;
			do {
				System.out.println(dan+" * "+num+" = "+ dan*num);
				num++;
			} while(num<= 9); {
				dan++;
			}			
		} while(dan <= 9); {
		}
	}
	
	
	
} //class====================================================== 