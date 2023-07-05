package curriculum_New_question;

//Randomクラスのインポート
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
		public static void print(String st, int num) {
			System.out.println(st + num);
		}


	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		
		public static void times(int num1, int num2) {
			int times = num1 * num2;
			System.out.println(times);
		}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		
		public static void receive(int[] array) {
			for (int num : array) {
				System.out.println(num);
			}
		}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
		public static void over(double num1, double num2) {
			double times = num1 + num2;
			System.out.println(times);
		}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
		
		public static int[] ran(int count) {
			int[] up = new int[count];
			Random rand = new Random();
			
			for(int i = 0; i < count; i++) {
				
				// 1～100までのランダムな数字
				int randomNumber = rand.nextInt(100)+1;
				// 引数の回数分格納
				up[i] = randomNumber;
				// 格納した値を出力
				System.out.println(up[i]);
			} 
			return up;
			
		}
		
		  

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
		
		public static double average(int [] array) {
			 int sum = 0;
			 for (int num : array) {
				 sum += num;
			 }
			double average = (double) sum / array.length;
			return average;
		 }
		

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static boolean checkNumber(double value) {
			
			if (value >= 50) {
		        System.out.println("true");
		        return true;
		    }
			
			else {
		        System.out.println("false");
		        return false;
		    }
		}
		
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		
		// Q1
		print("Hello JavaSE ", 11);
		
		// Q2
		times(2, 4);
		
		// Q3
		int[] numbers = {1,2,3};
		receive(numbers);
		
		// Q4
		over(1.2, 4.5);
		
		// Q5
        int count = 5;
        int[] up = ran(count);

        // Q6
        average(up);

        // Q7
        checkNumber(average(up));
		
		
		
	}
}
