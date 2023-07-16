package capusule;

import java.util.Scanner;

/*
 * コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 *ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
 */

public class Curriculum26_28 {
	
	public static void main(String[] args) {
		
		// スキャナーのインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		
		// 入力
		System.out.println("コンソールに入力してください");
		String input = scanner.nextLine();
		
		// 動物ごとに ","で区切るように指定
		String[] animalData = input.split(",");
		
		// 動物の名前、体長、速度ごとに":"で区切る
		for (String data : animalData) {
			String[] animalInfo = data.split(":");
			
			
			// 動物の名前を取得
			String name = animalInfo[0];
			// 動物の体長を取得し、double型に変換
			double height = Double.parseDouble(animalInfo[1]);
			// 動物の速度を取得し、int型に変換
			int speed = Integer.parseInt(animalInfo[2]);

			// 動物名・体長・速度を出力
			System.out.println("動物名 :" + name);
			System.out.println("体長 :" + height + "m");
			System.out.println("速度 :" + speed + "km/h");

			animalName(name);
			System.out.println();
		}

		scanner.close();
	}
	
	// 動物の学名を一致させる
	public static void animalName(String name) {
		switch (name) {
			case "ライオン":
				System.out.println("学名：パンテラ　レオ");
				break;
				
			case "ゾウ":
				System.out.println("学名 : ロキソドンタ・サイクロティス");
				break;
				
			case "パンダ":
				System.out.println("学名 : アイルロポダ・メラノレウカ");
				break;
				
			case "チンパンジー":
				System.out.println("学名 : パン・トゥログロディテス");
				break;
				
			case "シマウマ":
				System.out.println("学名 : チャップマンシマウマ");
				break;
				
			case "インコ":
				System.out.println("学名 : 不明");
				break;
			
			// その他の場合	
			default:
				System.out.println("学名 : 不明");
				break;
		}
	}
}
