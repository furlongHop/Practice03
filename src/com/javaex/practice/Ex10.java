package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int a=sc.nextInt();
		System.out.print("숫자: ");
		int b=sc.nextInt();
		System.out.print("숫자: ");
		int c=sc.nextInt();
		System.out.print("숫자: ");
		int d=sc.nextInt();
		System.out.print("숫자: ");
		int e=sc.nextInt();
		
		int max;
		
		if(a>=b && a>=c && a>=d && a>=e) {
			max=a;
		}else if(b>=a && b>=c && b>=d && b>=e) {
			max=b;
		}else if(c>=a && c>=b && c>=d && c>=e) {
			max=c;
		}else if(d>=a && d>=b && d>=c && d>=e) {
			max=d;
		}else {
			max=e;
		}
		System.out.println("최대값은 "+max+"입니다.");
		
		sc.close();
		
	}

}
