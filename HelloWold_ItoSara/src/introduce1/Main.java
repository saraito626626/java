package introduce1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 出力
		System.out.println(person1.name);
		System.out.println("BMIは" + person1.bmi() + "です");
		System.out.println("年は" + person1.age + "です");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("合計" + number + "人です");
	}
}
