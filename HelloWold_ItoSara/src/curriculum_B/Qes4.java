package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		
		// 課題4と出力
		System.out.println("課題4 \n");
		
		
		
		// かけられる数が9になるまでインクリメント
		for (int i = 1; i <= 9; i++) {
			
			// かける数が9になるまでインクリメント
			for (int s = 1; s <= 9; s++) {
				
				// 答えを代入
				int ans = i * s;
				
				// かける数が8になるまで||をつけて出力
				if(s <= 8) {
				System.out.printf("%02d * %02d = %02d || ", i, s, ans);
				}
				
				// かける数が9の場合||がない状態で出力
				else {
					System.out.printf("%02d * %02d = %02d ", i, s, ans);
				}
			}
			
			// かける数が9になる度、改行
			System.out.println("\n");
		}

	}

}
