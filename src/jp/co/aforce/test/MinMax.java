package jp.co.aforce.test;

public class MinMax {
	int getMaxValue(int a_value, int b_value, int c_value) {
		//まず、aとbの値を比較し、大きいほうをmax_valueに
		int max_value;
		if(a_value > b_value) {
			max_value = a_value;
		}else if(a_value < b_value){
			max_value = b_value;
		}else {
			max_value = a_value;
		}
		
		//つぎにmax_valueとcの値を比較し、大きいほうをmax_valueに入れ直す。
		if(max_value > c_value) {
			//そのまま
		}else if(max_value < c_value){
			max_value = c_value;
		}else {
			//そのまま
		}
		
		return max_value;
	}
	
	int getMinValue(int a_value, int b_value, int c_value) {
		
		int min_value;
		if(a_value < b_value) {
			min_value = a_value;
		}else if(a_value > b_value){
			min_value = b_value;
		}else {
			min_value = a_value;
		}
		
		if(min_value < c_value) {
			//そのまま
		}else if(min_value > c_value){
			min_value = c_value;
		}else {
			//そのまま
		}
		
		return min_value;
	}
}
