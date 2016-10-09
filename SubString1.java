package com.acadgild.java.session7;
public class SubString1 {

	public static void main(String[] args) {
		
		String str = "Welcome to Acadgild";
		System.out.println(getSubString(str,1,7));

	}
	
	public static String getSubString(String text, int start, int end){
		
		String retStr = "";
		
		if((start>=0) && (start<end) && (end<=text.length())){
			
			for(int i=start;i<end;i++){
				
				retStr = retStr+text.charAt(i);
				
			}
			
			return retStr;
			
		}
		else{
			
			return "Enter valid String";
		}
		
	}

}
