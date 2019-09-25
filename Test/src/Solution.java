
public class Solution {

	boolean solution(String s) {
        boolean answer = true;

        String[] list = s.split("");
        int pCount=0;
        int yCount=0;
        
        for(int i = 0 ; i < list.length; i++){
            if(list[i].equalsIgnoreCase("p")){
                pCount+=1;
            }else if(list[i].equalsIgnoreCase("k")){
                yCount+=1;
            }
        }
        if(pCount!=yCount){
            answer = false;
        }

        return answer;
    }
	
}
