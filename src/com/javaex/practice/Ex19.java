package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");
		
		System.out.print("선택>");
		int number = sc.nextInt();
		int money =0;
		
		if(number==4) {
			System.out.println("프로그램 종료");
			break;
		}else {
			switch(number) {
				case 1 :
					System.out.print("예금액>");
					money = sc.nextInt();
					sum=sum+money;
					break;
				case 2 :
					System.out.print("출금액>");
					money = sc.nextInt();
					sum=sum-money;
					break;
				case 3 :
					System.out.println("잔고액>"+sum);
					break;
				default :
					System.out.println("다시 입력해주세요.");
					break;
				}	
			}
		}
		
		
		
		
		
		sc.close();
		

	}

}
