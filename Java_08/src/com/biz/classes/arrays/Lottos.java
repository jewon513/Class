package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lottos = new int [6];
		
		int nLottoIndex=0;
		int index;
		int lotNum;
		while(true) {
			lotNum=rnd.nextInt(45)+1;
			for(index = 0; index <lottos.length; index++ ) {
				if(lottos[index] == lotNum) break;
			}
			if(index>=lottos.length) {
				lottos[nLottoIndex]=lotNum;
				nLottoIndex+=1;
			}
			if(nLottoIndex >= lottos.length) break;
		}
		System.out.println("행운의 lotto 번호");
		for (int i = 0 ; i < lottos.length ; i++) {
			System.out.print(lottos[i]+", ");
		}
	}

}
