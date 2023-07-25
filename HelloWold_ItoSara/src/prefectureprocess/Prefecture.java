// 処理用パッケージ
package prefectureprocess;

// 各県の都道府県名・県庁所在地・面積を格納
public class Prefecture {
	private String name;
	private String city;
	private double area;
	
	// 各情報の初期化
	public Prefecture(String name, String city, double area) {
		this.name = name;
		this.city = city;
		this.area = area;
	}

	/*
	 * 都道府県・県庁所在地・面積を取得するメソッド
	 */
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public double getArea() {
		return area;
	}
}
