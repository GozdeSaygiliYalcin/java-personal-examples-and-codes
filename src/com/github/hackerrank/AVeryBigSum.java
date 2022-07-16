package com.github.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

	 static Scanner scanner =new Scanner(System.in);
	 static int n;
	 static List<Long> list=new ArrayList<>();
	    
	 static BigInteger bigSum(List<Long> list){
	        
	        BigInteger sum=new BigInteger("0");
	        for(long i: list){
	            sum=sum.add( BigInteger.valueOf(i) );
	        }
	        return sum;
	}
	 
    public static void main(String[] args) {

    	  n=scanner.nextInt();
          
          for(int i=0;i<n;i++){
          list.add(i,scanner.nextLong());   
          }
          System.out.println(bigSum(list) );
      }
}