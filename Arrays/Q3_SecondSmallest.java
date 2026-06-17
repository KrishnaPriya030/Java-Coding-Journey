import java.util.Scanner;
class Solution{

static int second_minimum_element_array(int [] arr){

int min=Integer.MAX_VALUE;
int sec_min=Integer.MAX_VALUE;


for(int i=0; i<arr.length; i++){

if(arr[i]<min){
sec_min=min;
min=arr[i];

}
 else if (arr[i] > min && arr[i] < sec_min) {
                sec_min = arr[i];
            }
}
if(sec_min == Integer.MAX_VALUE){
return -1;
}
return sec_min;

}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int [n];
	

for(int i=0; i<arr.length; i++){

	arr[i]=sc.nextInt();

}
 System.out.println(second_minimum_element_array(arr));
}
}

