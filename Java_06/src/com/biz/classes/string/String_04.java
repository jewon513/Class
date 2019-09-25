package com.biz.classes.string;

public class String_04 {

	public static void main(String[] args) {

		String strNation="Republic of Korea";
		String strSearch="r";
		int intLength=strNation.length();
		
		String strAt;
		
		for (int i=0 ; i<intLength ; i++) {
			strAt=strNation.substring(i,i+1);
			if (strAt.equalsIgnoreCase(strSearch)) {
				System.out.println(strSearch + "은(는)" + i+ "번째에 위치해 있습니다.");
			}
		}
	}

}
