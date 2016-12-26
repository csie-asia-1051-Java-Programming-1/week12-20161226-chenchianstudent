package ex;

/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 105021007 陳麒安
 */

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入n個數字");
		int n=scn.nextInt();
		int data[]=new int[n];
		int data2[]=new int[n];
		int data1[]=new int[n];
		for(int i=0;i<data.length;i++){
		System.out.print("請輸入數字");
		data[i]=scn.nextInt();
		data1[i]=data[i];
		}
		for(int i=0;i<data2.length;i++){
		while(data1[i]>0){
		data2[i]=data2[i]+data1[i]%10;
		data1[i]=data1[i]/10;
		}		
		}


		//氣泡排序法
		for(int i=0;i<data2.length-1;i++){
		for(int j=0;j<data2.length-1-i;j++){
		if(data2[j+1]<data2[j]){
		int y=data2[j+1];
		data2[j+1]=data2[j];
		data2[j]=y;
		int z=data[j+1];
		data[j+1]=data[j];
		data[j]=z;
		}else{
		if(data2[j+1]==data2[j]){
		if(data[j+1]<data[j]){	
		int y=data[j+1];
		data[j+1]=data[j];
		data[j]=y;
		}
		}
		}	
		}	
		}

		//-----------------------------------------
		for(int i=0;i<data.length;i++){
		System.out.print(data[i]+" ");	
		}








			}

		}

