package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
		//false가 선언되어 있으므로 if의 조건식에 부합하는 순간 반복이 끝난다.
		//따라서 5까지 출력된다.
	}

}
