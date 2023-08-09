package introduce1;

public class Person {
	// インスタンスフィールドを定義
	String name1;
	String name2;
	int age;
	double height;
	double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name1, String name2, int age, double height, double weight) {
		this.name1 = name1;
		this.name2 = name2;
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

	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

	public String fullName() {
		return name1 + " " + name2;
	}

}
