package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num=sc.nextInt();
		
		int sum=0;

		
		if(num%2==0) {//짝수인 수만 반복을 합시다
			for(int i=0;i<=num;i++) {//무한 반복 방지를 위해 넣은 값보다 작거나 같게 제한 두기
				if(i%2==0) {
					sum=sum+i;//한 칸씩 건너뛰며 누적 합산
				}
			}
		}else {
			for(int i=0;i<=num;i++) {
				if(i%2!=0) {//else에서 빠져나온 수 중 홀수 한정으로 못박음
					sum=sum+i;
					
				}
			}
		}
				
		System.out.println("결과값: "+sum);
		
		sc.close();

	}

}
