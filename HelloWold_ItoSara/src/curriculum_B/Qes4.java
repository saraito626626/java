package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 課題4と出力
		System.out.println("課題4");
		// 改行
		System.out.println();
		// iが9になるまでインクリメント
		for (int i = 1; i <= 9; i++) {
			// sが9になるまでインクリメント
			for (int s = 1; s <= 9; s++) {
				// iと sをかけた数をansに代入
				int ans = i * s;
				// sが8になるまで||をつけて出力
				if(s <= 8) {
				System.out.printf("%02d * %02d = %02d ||", i, s, ans);
				}
				// sが9の場合||がない状態で出力
				else {
					System.out.printf("%02d * %02d = %02d ", i, s, ans);
				}
			}
			// sが9になる度、改行
			System.out.println();
		}

	}

}
