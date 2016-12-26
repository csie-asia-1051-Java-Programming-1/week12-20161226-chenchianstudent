package ex;
import java.util.Scanner;
/*
 * Topic: 給定一字串，請將此字串中，每個字元的 ASCII 編碼數值進行加總，輸出其編碼數 值總和。
 * 舉例來說，若輸入之字串為 “abcdefghij” 共 10 個字元，
 * 其 ASCII 編碼依序為 “97 98 99 100 101 102 103 104 105 106” ，則編碼總和輸出為 1015 。
 * Date: 2016/12/26
 * Author: 105021007 陳麒安
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n個字串");
int n=scn.nextInt();
int i=0;
int sum=0;
while(i<=n){
String str=scn.nextLine();
char v1[]=str.toCharArray( );
int data[]=new int[v1.length];
for(int j=0;j<v1.length;j++){
data[j]=(int)v1[j];
sum=sum+data[j];
}
if(i!=0){
System.out.print(sum);}
sum=0;
i++;	
}
	
	
	
	
	
	}

}
