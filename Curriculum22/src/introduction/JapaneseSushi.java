package introduction;

// 処理用パッケージの呼び出し
import process.Japaneseprocess;

// 実行用
/*
 * 下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
		
 */
public class JapaneseSushi {
	public static void main(String[] args) {
	
		Japaneseprocess process = new Japaneseprocess();
		
		// 各メソットの呼び出し
		process.greet();
		process.taste();
		process.kind();
		process.nowDate();
	}

}
