package sept30;

//배열을 이용해서 간단한 소설만들기
//누가?언제?어디서?어떻게?무엇을?
class MakingStory {
	MakingStory(){}
	String[] who = { "내가", "내 친구가", "내 동생이", "선생님이", "아버지께서", "어머니께서" }; //0~5
	String[] when = { "어제", "오늘 아침에", "일주일 전에", "방금 전에" }; //0~3
	String[] where = { "학교에서", "집에서", "지하철에서", "버스에서", "길거리에서", "식당에서" }; //0~5
	String[] what = { "춤을 췄다.", "노래를 불렀다.", "큰 소리를 쳤다.", "울었다.", "웃었다." }; //0~4
	
	String myStory() {
		String result = who[rnd(0,5)] + " " + when[rnd(0,3)] + " " + where[rnd(0,5)] + " " + what[rnd(0,4)];
		return result;
	}
	
	int rnd(int start, int end) {
		int count = end-start+1;
		int index = (int)(Math.random()*count+start);
		return index;
	}
	
	// 10개 이야기 만들고 출력하는 메서드
	void tenStoriesVoid() {
		String[] stories = new String[10]; //String 10개를 저장할 배열생성
		for(int index=0; index<10; index++) {
			stories[index] = myStory();
		}
		for(int index=0; index<10; index++) {
			System.out.println( index+1 +" : "+stories[index] );
			
		}
	}
	//10개 이야기 만들고 리턴하는 메서드 (배열을 리턴해야함)
	String[] tenStoriesArr() {
		String[] stories = new String[10];
		for(int index=0; index<10; index++) {
			stories[index] = myStory();
		}		
		return stories;
	}
}

public class Study3 {
	public static void main(String[] args) {
		MakingStory mkstory = new MakingStory();
		System.out.println(mkstory.myStory());
		
		// void 메서드
		mkstory.tenStoriesVoid();
		
		
		// 리턴메서드는 출력을 포함하지 않기에 메인에서 for 문으로 출력해야함.
		String[] stories = mkstory.tenStoriesArr();
		for(int i=0; i<10; i++) {
			System.out.println(stories[i]);
		}
	}

}
