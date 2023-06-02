package curriculum_B;

//パッケージをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		// スキャナーオブジェクトの生成
		Scanner yourObj = new Scanner(System.in);

		// userNameの読み込み	
		String userName = null;
		// 入力した値を取得
		while (true) {
			userName = yourObj.nextLine();

			// userNameの文字数が10文字以上の時
			if (userName.length() > 10) {
				// 名前を10文字以内にしてくださいと出力
				System.out.println("名前を10文字以内にしてください");
			  // 入力されてない、または0だった場合は 
			} else if (userName == null || userName.length() == 0) {
				// 名前を入力してくださいと出力
				System.out.println("名前を入力してください");
			  // 半角英数字を判別
			} else if (!userName.matches("^[A-Za-z0-9]+$")) {
				// 半角英数字のみで名前を入力してくださいと出力	
				System.out.println("半角英数字のみで名前を入力して下さい");
			} else {
				// ユーザー名（自分が入力したユーザー名を）を登録しましたと出力
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				break;
			}
		}

		
		// 勝ち、あいこ、負けの数を初期化
		int winCount = 0;
		int drawCount = 0;
		int lossCount = 0;

		// whileを使って勝つまでループさせる
		while (winCount == 0) {

			// 自分の出す手をランダム化,かける3して、強制変換することで0～2までの整数を生成
			int userRound = (int) (Math.random() * 3);

			// 相手の出す手をランダム化,かける3して、強制変換することで0～2までの整数を生成
			int comRound = (int) (Math.random() * 3);

			// string型の自分の手と相手の手を初期化
			String userRoundst = "";
			String comRoundst = "";
			
			// もし、userRoundが0ならuserRoundstにグーを代入
			if (userRound == 0) {
				userRoundst = "グー";
				// userRoundが1ならuserRoundstにチョキを代入	
			} else if (userRound == 1) {
				userRoundst = "チョキ";
				// userRoundが2ならuserRoundstにパーを代入
			} else if (userRound == 2) {
				userRoundst = "パー";
			}
			
			// もし、comRoundが0ならcomRoundstにグーを代入
			if (comRound == 0) {
				comRoundst = "グー";
			  // comRoundが1ならcomRoundstにチョキを代入
			} else if (comRound == 1) {
				comRoundst = "チョキ";
			  // comRoundが1ならcomRoundstにパーを代入
			} else if (comRound == 2) {
				comRoundst = "パー";
			}
			// 自分の出した手を出力
			System.out.println(userName + "の手は「" + userRoundst + "」");
			// 相手の出した手を出力
			System.out.println("相手の手は「" + comRoundst + "」");

			// 改行
			System.out.println("");
			// 勝った場合の処理
			if ((userRound == 0 && comRound == 1) || (userRound == 1 && comRound == 2)
					|| (userRound == 2 && comRound == 0)) {
				// winCountをインクリメントして、繰り返し処理を停止
				winCount++;
				// 負けた場合の文を出力
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
			} 
			// 負けた場合の処理
			else if ((userRound == 0 && comRound == 2) || (userRound == 1 && comRound == 0)
					|| (userRound == 2 && comRound == 1)) {
				System.out.println("俺の勝ち！");
				// lossCountをインクリメント
				lossCount++;
				// グーを出して負けた場合の処理
				if (userRound == 0) {
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
				} 
				// チョキを出して負けた場合の処理
				else if (userRound == 1) {
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
				} 
				// パーを出して負けた場合の処理
				else {
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
				}

			} 
			// あいこの場合の処理
			else {
				System.out.println("DRAW あいこ もう一回しましょう！");
				// drawCountをインクリメント
				drawCount++;
			}

		}
		// じゃんけんの試行回数を出力
		System.out.println("勝つまでにかかった合計回数は" + (winCount + drawCount + lossCount) + "です");

	}
}
