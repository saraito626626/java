package prefectureprocess;

import java.util.Arrays;

// 各県の順番を慣れべ替えるクラス
public class PrefectureSort {

	private Prefecture[] prefectures;
	
	
	// 昇順メソッド
	public PrefectureSort(Prefecture[] prefectures) {
		this.prefectures = prefectures;
	}
	public void sortAscending(int[] number) {
		Arrays.sort(number);
		for(int index : number) {
			if(index >= 0 && index < prefectures.length) {
				prefectureInfo(prefectures[index]);
			}
		}
	}
	
	// 降順メソッド
	public void sortDescending(int[] number) {
		Arrays.sort(number);
		for(int i = number.length - 1; i >= 0; i--) {
			int index = number[i];
			if(index >= 0 && index < prefectures.length) {
				prefectureInfo(prefectures[index]);
			}
		}
	}
	
	// 各県の情報を出力するメソッド
	public void prefectureInfo(Prefecture prefecture) {
		System.out.println("都道府県名;" + prefecture.getName());
		System.out.println("県庁所在地:" + prefecture.getCity());
		System.out.println("面積:" + prefecture.getArea() + "km2");
		System.out.println();
	}

	
}
