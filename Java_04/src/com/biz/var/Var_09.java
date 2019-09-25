package com.biz.var;

public class Var_09 {

	public static void main(String[] args) {
		int nCount = 0;
		char cA ='A';
		
		nCount=nCount+1;
		cA= (char)(cA+1);
		
		nCount=nCount+1;
		cA= (char)(cA+1);
		
		nCount=nCount+1;
		cA= (char)(cA+1);
		
		nCount=nCount+1;
		cA= (char)(cA+1);
		
		System.out.printf("A이후 %d번째"
				+ " 문자는 %c이고"
				+ " ASCII 코드는 %d이다.", nCount,cA,(int)cA);
	
	}
	

}
