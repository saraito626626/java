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
		
		int numOfStudents = scanner.nextInt();
		
		// 改行
		System.out.println();
		
		// double型の配列に生徒の人数を代入
		double[] averageScores = new double[numOfStudents];
		
		// double型の配列に4つ要素を代入
		double[] totalScores = new double[4];
		

		String subject;
		
		// 各生徒の成績を入力し、合計点と平均点を計算
		for (int i = 0; i < numOfStudents; i++) {
			double[] scores = new double[4];

			for (int j = 0; j < 4; j++) {
				
				
				switch (j) {
				
				case 0:
					subject = "英語";
					break;
					
				case 1:
					subject = "数学";
					break;
					
				case 2:
					subject = "理科";
					break;
					
				case 3:
					subject = "社会";
					break;
					
				default:
					subject = "";
					break;
				}

				System.out.printf("%d人目の『%s』の点数を入力してください: ", i + 1, subject);
				scores[j] = scanner.nextDouble();
				
				// 合計点を更新
				totalScores[j] += scores[j]; 
			}
			
			// double型のsumの初期化
			double sum = 0.0;
			
			// 拡張for文でsumにscoreを和算
			for (double score : scores) {
				sum += score;
			}
			
			// 平均点を計算
			double averageScore = sum / scores.length; 
			
			 // 平均点を格納
			averageScores[i] = averageScore;
			
			// 改行
			System.out.println();

		}
		
		// 各教科の平均点を計算
		double[] averageSubjects = new double[4];
		
		for (int i = 0; i < 4; i++) {
			averageSubjects[i] = totalScores[i] / numOfStudents;
		}
		

		// 全体の平均点を計算
		double sum = 0.0;
		
		
		for (double averageScore : averageScores) {
			sum += averageScore;
		}
		
		
		double overallAverage = sum / averageScores.length;

		
		// 各生徒の平均点を出力
		for (int i = 0; i < numOfStudents; i++) {
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, averageScores[i]);
		}
		
		
		// 改行
		System.out.println();
		

		// 各教科の平均点と全体の平均点を出力
		String[] subjects = {"英語", "数学", "理科", "社会"};
		
		
        for (int i = 0; i < 4; i++) {
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[i], averageSubjects[i]);
        }
		
		
		System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
		
		// スキャナーの処理を閉じる
		scanner.close();
	}
	
}
