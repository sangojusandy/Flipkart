package login;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Merge {

	public static void main(String[] args) {
		int first = 0;
		String s="India won the matchewfew5";
        for(int i = s.length()-1 ; i>0;i--){


            if(s.charAt(i)!=' '){
              first++;
            }
            else {
            	break;
            }
       

		 }
        System.out.print(first);
		 
		
	}}


