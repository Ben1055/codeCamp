package com.ben.inter;

import  java.util.*;

public class Main
{
    
	static String minWindow(String str1, String str2) {
		// Adding Comments
        int n = str1.length(); // Str.lenghth
        int m = str2.length();
        
        int tIdx = 0 ;
        int minWindow = (int)Math.pow(10,9);
        
        int startIdx = -1;
        
        int left = 0;
        int right = 0;
        
        while(right < n){
            if(str1.charAt(right) == str2.charAt(tIdx)){
            	System.out.println("right "+right);
                if(tIdx == m-1){
                    while(left<=right && str1.charAt(left) != str2.charAt(0)){
                        left++;
                    }
                    if(right-left+1 < minWindow){
                        minWindow = right-left + 1;
                        startIdx = left;
                    }
                 
                    right = left;
                    left ++;
                    
                    tIdx = 0;
                }
                else
                	tIdx++;
            }
            right ++;
        }
        return str1.substring(startIdx, startIdx+minWindow);
    }
	public static void main(String[] args) {
		System.out.println(minWindow("geeksforgeeks","eksrg"));
	}
}
