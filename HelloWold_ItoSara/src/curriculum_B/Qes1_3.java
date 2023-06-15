package curriculum_B;

import java.util.Objects;
import java.util.Random;
// パッケージをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {

		// スキャナーオブジェクトの生成
		Scanner sc = new Scanner(System.in);

		// 入力した値の読み込み	
		String userName = null;
		// falseに初期化
		boolean it = false;
		
		// 入力した値を取得
		while (!it) {
			userName = sc.nextLine();

			// 入力した値の文字数が10文字以上の時
			if (userName.length() > 10) {

				// 名前を10文字以内にしてくださいと出力
				System.out.println("名前を10文字以内にしてください");

			// 入力されてない、または0だった場合は 
			} else if (Objects.isNull(userName) || userName.isEmpty()) {

				// 名前を入力してくださいと出力
				System.out.println("名前を入力してください");

				// 半角英数字を判別
			} else if (!userName.matches("^[A-Za-z0-9]+$")) {

				// 半角英数字のみで名前を入力してくださいと出力	
				System.out.println("半角英数字のみで名前を入力して下さい");

			} else {

				// ユーザー名（自分が入力したユーザー名を）を登録しましたと出力
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				
				// 改行
				System.out.println();
				
				// 処理を終了
				it = true;
			}
	
		}

		// 勝ち、あいこ、負けの数を初期化
		int totalCount = 0;
		
		
		// ランダム関数のインスタンス化
		Random rad = new Random();
		
		// 勝つまでループさせる
		while (totalCount >= 0) {
			
			// 回数をカウント
			 totalCount++;
			 
			// 自分の手
			 int userRound = rad.nextInt(3);
			
			 // 相手の手
			 int comRound = rad.nextInt(3);
			 
			

			// 自分の出した手を出力
			System.out.println(userName + "の手は「" + rad + "」");

			// 相手の出した手を出力
			System.out.println("相手の手は「" + rad + "」" + "\n");

			

			// 勝った場合の処理
			if ((userRound == 0 && comRound == 1) ||
				(userRound == 1 && comRound == 2) || 
				(userRound == 2 && comRound == 0)) {
				
				
				// 負けた場合の文を出力
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				
				// 勝った場合ループを中断してから処理から抜ける
				break;
			}

			// 負けた場合の処理
			else if ((userRound == 0 && comRound == 2) || (userRound == 1 && comRound == 0)
					|| (userRound == 2 && comRound == 1)) {
				System.out.println("俺の勝ち！");

				
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

				
			}

		}
		

		// じゃんけんの試行回数を出力
		System.out.println("勝つまでにかかった合計回数は" +  totalCount + "です");
		
		// スキャナーの処理を閉じる
		sc.close();
	}
}
