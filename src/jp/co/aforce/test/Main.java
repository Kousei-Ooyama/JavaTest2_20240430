package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
		PracticeTest8 test = new PracticeTest8();
		//練習問題１
		test.printHello();
		System.out.println("");
		
		//練習問題２
		test.printRandomMessage();
		System.out.println("");
		
		//練習問題３
		test.printMessage("あいうえお");
		System.out.println("");
		
		//練習問題４
		test.printMessage("コンストラクター", 3);
		System.out.println("");
		
		//練習問題５
		test.printRectangleArea(30.0, 50.0);
		System.out.println("");
		
		//練習問題６
		System.out.println(test.getWeatherForecast());
		System.out.println("");
		
		//練習問題７
		System.out.println(test.isEvenNumber(20));
		System.out.println("");
		
		//練習問題８
		System.out.println(test.getMessage("こうせい", false));
		System.out.println("");
		
		//練習問題９
		String[] b = {"aaaaaaab", "aa", "aaaaaaac", "aaaa"};
		System.out.println(test.getLongestString(b));
		System.out.println("");
		
		//練習問題１０
		Person person = new Person("こうせい", 5);
		System.out.println(test.isAdult(person));
	}
}
