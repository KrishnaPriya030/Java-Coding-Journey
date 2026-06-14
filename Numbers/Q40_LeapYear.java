import java.util.Scanner;
class Solution{

static void leap_year(int year){

if((year % 400 == 0) || (year%4==0 && year%100!=0)){
System.out.println("Leap year");
}
else{
System.out.println("not leap year");
}
}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
leap_year(year);
}
}
