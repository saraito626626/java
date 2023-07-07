package process25;

import java.util.Random;

// スーパークラス
public class Player {

	/*
	 * フィールド
	 * 名前・HP・MP・攻撃力・素早さ・防御力
	 */
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	public Player(String name) {
		this.name = name;
		// 乱数を設定
		this.hp = scoreRandom();
		this.mp = scoreRandom();
		this.attack = scoreRandom();
		this.speed = scoreRandom();
		this.defense = scoreRandom();

	}

	// 名前を設定
	public String getName() {
		return name;
	}

	// HPの設定と取得
	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPの設定と取得
	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	// 攻撃力の設定と取得
	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	// 速度の設定と取得
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 防御力の設定と取得
	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	private int scoreRandom() {
		Random random = new Random();
		// 1～1000までの乱数を返す
		// 1000以下になるようにという指定はないが、課題を見る限り1000以上である必要かないと判断し、制限した
		return random.nextInt(1000) + 1;
	}

}
