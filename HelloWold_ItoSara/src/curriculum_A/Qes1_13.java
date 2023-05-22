package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// ローカル変数を宣言

		// バイト型,短整数型, 整数型,長整数型を宣言
		byte by;
		short sh;
		int i;
		long l;

		// 短精度浮動少数伝型,倍精度浮動小数点型,文字型,文字列型を宣言
		float fl;
		double db;
		char ch;
		String st;

		// ブーリアン型を宣言
		boolean bo;

		//-------------------------------------------------------------------------------------------		

		// 初期値を代入
		by = 0;
		sh = 0;
		i = 0;
		l = 0L;

		fl = 0.0f;
		db = 0.0d;
		ch = '\u0000';
		st = null;
		bo = false;

		//-------------------------------------------------------------------------------------------
		
		// それぞれの変数に値を代入
		by = 10;
		sh = 100;
		i = 1000;
		l = 10000L;

		fl = 9.5f;
		db = 10.5d;
		ch = 'a';
		st = "ハロー";
		bo = true;
		
		//-------------------------------------------------------------------------------------------
		
		// 11110になるように出力
		System.out.println(by + sh + i + l);

		// 20になるように出力
		System.out.println(fl + db);

		// a ハロー trueになるように出力
		System.out.println(ch + " " + st + " " + bo);

		// 11130になるように出力
		System.out.println(by + sh + i + l + fl + db);

		// 1000000000になるように出力
		System.out.println(by * sh * i * l);

		// 0.105になるように出力
		System.out.println(db / sh);

		// ‐90になるように出力
		System.out.println(by - sh);
		
		//-------------------------------------------------------------------------------------------
		
		// 改行
		System.out.println("");

		// ハローJAVA43になるように出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		//-------------------------------------------------------------------------------------------		
		
		// 改行
		System.out.println("");

		// 山田太郎をローカル変数に代入	
		String name = "山田太郎";

		// 18をローカル変数に代入
		int age = 18;

		// 170.5をローカル変数に代入
		double height = 170.5;

		// 62.2をローカル変数に代入
		double weight = 62.2;

		// 寿司をローカル変数に代入
		String favorite = "寿司";

		//「初めまして山田太郎です」と出力
		System.out.println("初めまして" + name + "です");
		
		// 年齢は18歳です」と出力
		System.out.println("年齢は" + age + "歳です");
		
		//「身長は170.5cmです」と出力
		System.out.println("身長は" + height + "cmです");
		
		//「体重は62.2kgです」と出力
		System.out.println("体重は" + weight + "㎏です");
		
		//「好きな食べ物は寿司です」と出力
		System.out.println("好きな食べ物は" + favorite + "です");
		
		//-------------------------------------------------------------------------------------------
		
		// 改行
		System.out.println("");	
		
		// BMIを求める,身長をメートルに直す
		double bmi = weight /( height * height) *10000;
		
		//	BMIを四捨五入して、小数点代１位まで出力
		System.out.println("BMIは"+(double)(Math.round(bmi*10))/10+"です");
		
		//-------------------------------------------------------------------------------------------
		
        // 改行
		System.out.println("");
		
				// 鈴木一郎をローカル変数に再代入	
				name = "鈴木一郎";

				// 24をローカル変数に再代入
			    age = 24;

				// 168.5をローカル変数に再代入
				height = 168.5;

				// 64.2をローカル変数に再代入
				weight = 64.2;

				// オムライスをローカル変数に再代入
				favorite = "オムライス";
				
				

				//「初めまして鈴木一郎です」と出力
				System.out.println("初めまして" + name + "です");
				
				// 年齢は24歳です」と出力
				System.out.println("年齢は" + age + "歳です");
				
				//「身長は168.5cmです」と出力
				System.out.println("身長は" + height + "cmです");
				
				//「体重は64.2kgです」と出力
				System.out.println("体重は" + weight + "㎏です");
				
				//「好きな食べ物はオムライスです」と出力
				System.out.println("好きな食べ物は" + favorite + "です");
				
                // 「BMIは22.6」と出力
				bmi = weight /( height * height) *10000;
				System.out.println("BMIは"+(double)(Math.round(bmi*10))/10+"です");
				
		//-------------------------------------------------------------------------------------------
			    // 改行
				System.out.println("");
				// 変数ageを和算で自己代入
				age += age;
				// 変数heightを和算で自己代入
				height += height;
				// 変数ewightを和算で自己代入
				weight += weight;
								
				//「初めまして鈴木一郎です」と出力
				System.out.println("初めまして" + name + "です");
				
				// 年齢は48歳です」と出力
				System.out.println("年齢は" + age + "歳です");
				
				//「身長は337.0cmです」と出力
				System.out.println("身長は" + height + "cmです");
				
				//「体重は128.4kgです」と出力
				System.out.println("体重は" + weight + "㎏です");
				
				//「好きな食べ物はオムライスです」と出力
				System.out.println("好きな食べ物は" + favorite + "です");
				
                // 「BMIは11.31」と出力	
				bmi = weight /( height * height) *10000;
				System.out.println("BMIは"+(double)(Math.round(bmi*100))/100+"です");
				
		//-------------------------------------------------------------------------------------------
				// 改行
				System.out.println("");
				
				// 25以上ならtrueが出力されるようにする
				age = 24;
				System.out.println(age >= 25);
						
		//-------------------------------------------------------------------------------------------
				// 改行
				System.out.println("");
				
				// 年齢・身長・体重を文字列型に型変換
				String sAge = String.valueOf(age);
				height = 168.5;
				String sHeight = String.valueOf(height);
				weight = 64.2;
				String sWeight = String.valueOf(weight);
				
				// 繋げて出力
				System.out.println(sAge + sHeight + sWeight);
				
		//-------------------------------------------------------------------------------------------
				// 改行
				System.out.println("");
				
				// 年齢・身長を整数型に変換
				int inAg = Integer.valueOf(sAge);
				int inHeight = (int)Double.parseDouble(sHeight);
				
				// 整数型にしたものを出力
				System.out.println(inAg);
				System.out.println(inHeight);
				
				//-------------------------------------------------------------------------------------------
				// 改行
				System.out.println("");
				
				// 年齢・身長で年齢25がもしくは身長が160であればtrueを出力
				System.out.println(inAg == 25 || inHeight >= 160);
	}
}


