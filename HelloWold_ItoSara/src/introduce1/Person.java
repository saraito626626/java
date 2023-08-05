package introduce1;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	// 人数の合計を保持
	static int number = 0;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// 人数加算
		number++;
	}
	

	// インスタンスメソッドBMIを定義
	public double bmi() {
		double bmiValue = this.weight / (this.height * this.height);
		// BMIの値を切り捨て
		double formattedBMI = Math.floor(bmiValue);
		// 戻り値
		return formattedBMI;

	}
}
