package exercice;
import java.util.ArrayList;
import java.util.Objects;

import java.util.*;

public class DiviseAndReplace {
	 private static List<String> Deviders = Arrays.asList("3","5","7");
	 //To get the  divison's result
	 static String checkDivision(int number) {
		 String result="";
	        if(number%3==0) {
	        	result+="Toto";
	        }if(number%5==0) {
	        	result+="Tutu";
	        }if(number %7==0) {
	        	result+="Titi";
	        }
	      return result;
	 }
	public static String compute(String a) {
		int number = Integer.parseInt(a);
		String result = checkDivision(number);
		String resultForChecking=result;
		boolean checkDigitInNumber=false;
        //Check if the number contains one of the digits : 3, 5 or 7
		for (String item:Deviders) {
			if (a.contains(item)){
				checkDigitInNumber=true;
			}
		}
		//Go through the number
        for (int i=0; i<a.length();i++){
        	//If the number is divisible by one of the digits 3, 5 or 7 or if it just contains at least one of them
        	if (!resultForChecking.isEmpty() || checkDigitInNumber==true){
	        	if (Objects.equals(a.charAt(i),'3')) {
	        		result+="Toto";
	        	}else if(Objects.equals(a.charAt(i),'5')) {
	        		result+="Tutu";
	        	}else if(Objects.equals(a.charAt(i),'7')) {
	        		result+="Titi";
	        	}else if(Objects.equals(a.charAt(i),'0')){
	        		result+="*";
	        	}
	        //If there is none of the digits 3,5,7 we return the same number replacing 0 by *
        	}else{
        		if(Objects.equals(a.charAt(i),'0')){
	        		result+="*";
        		}else{
        			result+=a.charAt(i);
        		}
        	}
        }
        return result;
	}
}
