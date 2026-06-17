import java.util.Scanner;
class Solution{

static int second_maximum_element_array(int [] arr){

int max=Integer.MIN_VALUE;
int sec_max=Integer.MIN_VALUE;


for(int i=0; i<arr.length; i++){

if(arr[i]>max){
sec_max=max;
max=arr[i];

}
else if(arr[i]<max && arr[i]>sec_max){

sec_max=arr[i];
}
}

if(sec_max == Integer.MIN_VALUE){
return -1;
}
return sec_max;

}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int [n];
	

for(int i=0; i<arr.length; i++){

	arr[i]=sc.nextInt();

}
 System.out.println(second_maximum_element_array(arr));
}
}

