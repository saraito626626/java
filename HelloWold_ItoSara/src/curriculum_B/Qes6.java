package curriculum_B;
// Randomクラスのインポート
import java.util.Random;
// Scannerクラスのインポート
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// Randomクラスのインスタンスを生成　
		Random ran = new Random();
		// Scannerクラスのインスタンスを生成し、System.inを引数に渡して初期化
		Scanner sc = new Scanner(System.in);
		// String型の配列appを定義し、商品を格納
		String[] app = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
		
		// int型の配列coを定義し、商品の残り台数を格納
		int[] co = new int[app.length];
		
		// co配列に0～11のランダムな値を代入
		for(int i = 0; i < co.length; i++) {
			co[i] = ran.nextInt(12);
		}
		// scannerクラスのnextLine()メソッドでユーザーからの入力を受け付け、その値を変数inに代入
		String in  = sc.nextLine();
		
		// 入力された文字列を「、」で区切るよう指定し、inApp配列に格納
		String[] inApp = in.split("、");
		
		/*
		 *  inApp配列の要素を変数productに代入(商品名が配列appに入っているかを調べる）
		 *  商品名が含まれる場合、変数iを変数indexに代入 
		 */
		
		for(String product:inApp) {
			int index = -1;
			for(int i = 0; i< app.length; i++) {
				if(product.equals(app[i])) {
					index = i;
				}
				
			}
			// 改行
			System.out.println("");
		
		// indexの値によって条件分岐
		switch (index) {
		// indexが0～6の場合
		case 0,1,2,3,4,5,6:
			// 商品名と在庫数を出力
			System.out.println(product +"の残り台数は"+co[index] +"台です");
			break;
		// それ以外の場合	
	    default:
	    	// 指定の商品ではありませんと出力
	    	System.out.println("『"+product+"』は指定の商品ではありません");
	    	break;
		}
		}

	}
}

