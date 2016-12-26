package ex;
import java.util.Scanner;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021007 陳麒安
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int data[][]=new int[3][3];
for(int i=0;i<data.length;i++){
for(int j=0;j<data[0].length;j++){
data[i][j]=scn.nextInt();

}	
}
for(int i=0;i<data.length;i++){
for(int j=0;j<data[0].length;j++){
System.out.print("data["+i+"]["+j+"]="+data[i][j]);
}
System.out.println();
}
int a=data[0][0]+data[0][1]+data[0][2];
int b=data[1][0]+data[1][1]+data[1][2];
int c=data[2][0]+data[2][1]+data[2][2];
int d=data[0][0]+data[1][0]+data[2][0];
int e=data[0][1]+data[1][1]+data[2][1];
int f=data[0][2]+data[1][2]+data[2][2];
int g=data[0][0]+data[1][1]+data[2][2];
int h=data[2][0]+data[1][1]+data[0][2];
if(a==3||a==0){
System.out.print("True");	
}else{
if(b==3||b==0){
System.out.print("True");	
}else{
if(c==3||c==0){
System.out.print("True");	
}else{
if(d==3||d==0){
System.out.print("True");	
}else{
if(e==3||e==0){
System.out.print("True");	
}else{
if(f==3||f==0){
System.out.print("True");	
}else{
if(h==3||h==0){
System.out.print("True");	
}else{
if(g==3||g==0){
System.out.print("True");	
}else{
System.out.print("False");	
}	
}	
}	
}	
}	
}	
}	
}
	
	
	
	
	}	
}

