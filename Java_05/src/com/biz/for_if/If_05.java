package com.biz.for_if;

public class If_05 {

	public static void main(String[] args) {
		int num=3;
		
		if(num%3==0) {
			System.out.println(num+"는 3의 배수입니다.");
		}else {
			System.out.println(num+"는 3의 배수가 아닙니다.");
		}
		
		if(num%2==0) {
			System.out.println(num+"는 짝수입니다.");
		}else {
			System.out.println(num+"는 짝수가 아닙니다.");
		}
		
		if(num%2==1) {
			System.out.println(num+"는 홀수입니다.");
		}else {
			System.out.println(num+"은 홀수가 아닙니다.");
		}
		
		
	}
}
