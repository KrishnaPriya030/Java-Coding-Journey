#APPROACH 1


import java.util.Scanner;
class Solution{

static void reverse_array(int [] arr){

for(int i=arr.length-1; i>=0; i--){

System.out.print(arr[i]+" ");
}
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int [n];
	

for(int i=0; i<arr.length; i++){

	arr[i]=sc.nextInt();

}
 reverse_array(arr);
}


#Approach 2

import java.util.Scanner;
class Solution{

static int [] reverse_array(int [] arr){

int left=0;
int right=arr.length-1;
while(left<right){

int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;

left++;
right--;
}
return arr;

}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int [n];
for(int i=0; i<arr.length; i++){

arr[i]=sc.nextInt();

}
int [] result=reverse_array(arr);

for(int i=0; i<result.length; i++){

System.out.print(result[i]);

}

}
}
