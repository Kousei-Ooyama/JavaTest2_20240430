package jp.co.aforce.test;

//下記はPracticeTest8が正常に動くかテスト用クラスである
public class Main_PracticeTest8 {
	public static void main(String[] args) {
		PracticeTest8 a = new PracticeTest8();
		/*
		a.printHello();
		a.printRandomMessage();
		a.printMessage("あいうえお");
		a.printMessage("コンストラクター", 3);
		a.printRectangleArea(30.0, 50.0);
		*/
		System.out.println(a.getWeatherForecast());
		System.out.println(a.isEvenNumber(20));
		System.out.println(a.getMessage("こうせい", false));
		String[] b = {"aaaaaaab", "aa", "aaaaaaac", "aaaa"};
		System.out.println(a.getLongestString(b));
	}
}
