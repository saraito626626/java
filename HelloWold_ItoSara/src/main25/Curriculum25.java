package main25;

import java.util.Scanner;

import process25.SubPlayer;

public class Curriculum25 {

	public static void main(String[] args) {
		
		// 名前の入力
		Scanner scanner = new Scanner(System.in);
		 String name = scanner.nextLine();
		 
		// インスタンスの生成
		SubPlayer player = new SubPlayer(name);
		
		// プレイヤーの名前、各ステータスを出力
		System.out.println(" こんにちは 「" + player.getName() + "」 さん");
		System.out.println(" ステータス");
		System.out.println(" HP：" + player.getHp() +
				"\n MP：" + player.getMp() +
				"\n 攻撃力：" + player.getAttack() +
				"\n 素早さ：" + player.getSpeed() +
				"\n 防御力：" + player.getDefense() +
				"\n\n さあ冒険に出かけよう！");

	}

}
