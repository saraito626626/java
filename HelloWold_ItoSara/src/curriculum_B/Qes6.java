package curriculum_B;

// Randomクラスのインポート
import java.util.Random;
// Scannerクラスのインポート
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {


		// Scannerクラスのインスタンスを生成し、System.inを引数に渡して初期化
		Scanner sc = new Scanner(System.in);
		
		// ランダム関数のインスタンス
		Random rad = new Random();
		
		// 商品名を出力できるように
		int prd = rad.nextInt(11);

		// 入力された文字列を「、」で区切るよう指定し、配列に格納
		String[] inApp = sc.nextLine().split("、");

		
		
		// 拡張for分得を利用して入力された値を条件分岐
		for (String in : inApp) {

			switch (in) {
			// 下記が出力された場合は
			case "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器":

				// 商品名と在庫数を出力
				System.out.println(in + "の残り台数は" + prd + "台です" + "\n");
				break;
				
				
			// 下記が出力された場合は
			case "テレビ", "ディスプレイ":

				// テレビの台数からディスプレイの台数を引いて出力
				System.out.println(in + "の残り台数は" + (inApp.equals("テレビ") ? prd : 11 - prd) + "台です" + "\n");
				break;
				

			// それ以外の場合	
			default:

				// 指定の商品ではありませんと出力
				System.out.println("『" + in + "』は指定の商品ではありません" + "\n");
				break;
			}
		}

		// スキャナーの処理を閉じる
		sc.close();

	}
}
