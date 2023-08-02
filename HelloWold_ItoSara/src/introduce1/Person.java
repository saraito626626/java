package introduce1;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
