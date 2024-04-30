package jp.co.aforce.test;

public class PracticeTest8 {
	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}
	
	//練習問題２
	public void printRandomMessage() {
		int n =(int)(Math.random()*3);
		if(n == 2) {
			System.out.println("おはよう");
		}else if(n == 1) {
			System.out.println("こんにちは");
		}else {
			System.out.println("こんばんわ");
		}
	}
	
	//練習問題３
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	//練習問題４
	public void printMessage(String message, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(message);
		}
	}
	
	//練習問題５
	public void printRectangleArea(double height, double width) {
		System.out.println("高さ "+height+"cm、横 "+width+"cmの長方形の面積："+(height*width));
	}
	
	//練習問題６
	public String getWeatherForecast() {
		String[] when = {"今日","明日","明後日"};
		String[] weather = {"晴れ","曇り","雨","雪"};
		
		int when_num = (int)(Math.random()*3);
		int weather_num = (int)(Math.random()*4);
		
		return when[when_num]+"の天気は"+weather[weather_num]+"でしょう";
	}
	
	//練習問題７
	public boolean isEvenNumber(int value) {
		if(value%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//練習問題８
	public String getMessage(String name, boolean isKid) {
		String str = "こんにちは。";
		if(isKid) {
			str += name+"ちゃん";
		}else {
			str += name+"さん";
		}
		return str;
	}
	
	//練習問題９
	public String getLongestString(String[] array) {
		String longestStr = "";
		for(String item: array) {
			if(item.length() > longestStr.length()) {
				longestStr = item;
			}else if(item.length() == longestStr.length()) {
				longestStr = item;
			}
		}
		return longestStr;
	}
	
	//練習問題１０
	public boolean isAdult(Person person) {
		int age = person.getAge();
		if(age>=20) {
			return true;
		}else {
			return false;
		}
	}
}









