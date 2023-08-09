package capusule;

public class Curriculum23 {
	/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */

	public static void main(String[] args) {
		Animal lion = new Animal();
		
		// 名前・体長・速度をセット
		lion.setName("ライオン");
		lion.setHeight(2.1);
		lion.setSpeed(80);
		
		// 出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getHeight() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
	}

}
 class Animal {
	 // 名前・体長・速度のフィールド
	 private String name;
	 private double height;
	 private int speed;
	 
	 /*
	  * 名前のカプセル化
	  * setterメソッドで名前を設定
	  * getterメソッドで名前の取得
	  */
	 public String getName() {
		 return this.name;

	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	
	 /*
	  * 体長のカプセル化
	  * setterメソッドで体長を設定
	  * getterメソッドで体長の取得
	  */
	 public double getHeight() {
		 return this.height;
	 }
	 public void setHeight(double height) {
		 this.height = height;
	 }
	 
	 /*
	  * 速度のカプセル化
	  * setterメソッドで速度を設定
	  * getterメソッドで速度の取得
	  */
	 public int getSpeed() {
		 return this.speed;
	 }
	 public void setSpeed(int speed) {
		 this.speed = speed;
	 }
}