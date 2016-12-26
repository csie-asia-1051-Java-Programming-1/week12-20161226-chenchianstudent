package ex;
import java.util.Scanner;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
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
System.out.print("data["+i+"]["+j+"]="+data[i][j]+" ");
}
System.out.println();
}











	}

}
