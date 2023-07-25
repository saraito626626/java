// 実行用パッケージ
package prefecturemain;

import java.util.Scanner;

import prefectureprocess.Prefecture;
import prefectureprocess.PrefectureSort;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * 都道府県の情報を初期化し、各都道府県の情報を追加
		 */
		Prefecture[] prefectures = {
                new Prefecture("北海道", "札幌市", 83424),
                new Prefecture("青森県", "青森市", 9646),
                new Prefecture("岩手県", "盛岡市", 15275),
                new Prefecture("宮城県", "仙台市", 7282),
                new Prefecture("秋田県", "秋田市", 11638),
                new Prefecture("山形県", "山形市", 9323),
                new Prefecture("福島県", "福島市", 13784),
                new Prefecture("茨城県", "水戸市", 6097),
                new Prefecture("栃木県", "宇都宮市", 6408),
                new Prefecture("群馬県", "前橋市", 6362),
                new Prefecture("埼玉県", "さいたま市", 3798)
        };
		// 入力情報の取得
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        // 入力された文字列をカンマで分割し、都道府県のインデックスに変換
        String[] inputArray = input.split(",");
        int[] number = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
        	number[i] = Integer.parseInt(inputArray[i].trim());
        }
        scanner.close();
        
     // 都道府県情報をソートして出力
        PrefectureSort sort = new PrefectureSort(prefectures);
        
        // もし8,5,9が出力されたら、降順で
        if (input.equalsIgnoreCase("8,5,9")) {
            System.out.println("降順");
            sort.sortDescending(number);
        } 
        // それ以外なら昇順で
        else {
            System.out.println("昇順");
            sort.sortAscending(number);
        }
    }
    
}
