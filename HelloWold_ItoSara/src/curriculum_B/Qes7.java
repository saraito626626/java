package curriculum_B;

// Scannerクラスをインポート
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		/*
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください											
		・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください											
		・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください											
		・このプログラムの実行は必ず1回以上行われるようにしてください											
		・出力例を参考にプログラミングを作成してください											
		 */
		
		// Scannerクラスをインスタンス
		Scanner scanner = new Scanner(System.in);

		// 生徒の人数を入力
		System.out.print("生徒の人数を入力してください（2以上）: ");
		System.out.println();
		int numOfStudents = scanner.nextInt();
		

		// 各教科の配列を作成
		String[] subjects = { "英語", "数学", "理科", "社会" };
		
		
		/* 
		 * 2次元配列を利用して、インスタンス化
		 * 各生徒の平均点を格納
		 * 各教科の平均点を格納
		 */
		double[][] scores = new double[subjects.length][numOfStudents];
		double[] averageScores = new double[numOfStudents];
		double[] averageSubjects = new double[subjects.length];
		

		// 各生徒の成績を入力し、合計点と平均点を計算
		for (int i = 0; i < numOfStudents; i++) {

			for (int j = 0; j < subjects.length; j++) {
				System.out.printf("%d人目の%sの点数を入力してください: ", i + 1, subjects[j]);
				scores[j][i] = scanner.nextDouble();
				
				// 各生徒、各教科の点数を加算（平均点を計算するため）
				averageScores[i] += scores[j][i];
				averageSubjects[j] += scores[j][i];
			}
			
			System.out.println();
			
			// 各生徒の平均点を計算
			averageScores[i] /= subjects.length;
		}

		
		// 各生徒の平均点を出力
		for (int i = 0; i < numOfStudents; i++) {
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, averageScores[i]);
		}

		
		System.out.println();

		
		// 各教科の平均点を計算
		for (int i = 0; i < subjects.length; i++) {
			averageSubjects[i] /= numOfStudents;
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], averageSubjects[i]);
		}

		
		// 全体の平均点を計算
		double overallAverage = 0.0;
		for (double average : averageScores) {
			overallAverage += average;
		}
		
		overallAverage /= numOfStudents;
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);

		// スキャナーの処理を閉じる
		scanner.close();
	}
}
