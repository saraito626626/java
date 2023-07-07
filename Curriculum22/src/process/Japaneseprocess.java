package process;

import java.text.SimpleDateFormat;
import java.util.Date;

// 処理用
/*
 * ・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
 */
public class Japaneseprocess {
	// フィールド
	private String sushi;
	private String category;

	public Japaneseprocess() {
		// 寿司と料理の初期値
		this.sushi = "この寿司はうまい";
		this.category = "寿司は和食です";
	}

	public void greet() {
		System.out.println("こんにちは！ここは日本です！");
	}

	public void taste() {
		System.out.println(this.sushi);
	}

	public void kind() {
		System.out.println(this.category);
	}

	// 日時
	public void nowDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String format = dateFormat.format(date);
		System.out.println("今の現在日時は" + format + "です");
	}
}
