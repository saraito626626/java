package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// 課題5と出力
		System.out.println("課題5");
		
		// 改行
		System.out.println();
		
		// かける数が9になるまでインクリメント
		for (int i = 1; i <= 9; i++) {
			
			// かけられる数が20になるまでインクリメント
			for (int s = 1; s <= 20; s++) {
				
				//答えを代入
				int ans = i * s;
				
				// かけられる数が19になるまで||をつけて出力
				if (s <= 19) {
					System.out.printf("%03d * %03d = %03d ||", s, i, ans);
				} 
				
				// かけられる数が20の場合||をつけずに出力
				else {
					System.out.printf("%03d * %03d = %03d ", s, i, ans);
				}
				
			}
			// かけられる数が20になる度、改行
			System.out.println();
		}

	}

}
