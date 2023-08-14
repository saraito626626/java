package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		String animalName = dog.name;
		System.out.println(animalName);

		// Q2：Q4のDogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(2);
		int animalNumber = dog2.getNum();
		System.out.println(animalNumber);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		String nowData = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"));
		System.out.println(nowData);
	}
}
