import java.util.Scanner;
class Solution{
static void vehicle(int v,int w){


if (w < 2 * v || w > 4 * v || w % 2 != 0) {
            System.out.println("INVALID INPUT");
            return;
 }
int fw=(w-2*v)/2 ;
int tw=v-fw;
System.out.println(fw);
System.out.println(tw);

}


public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int v=sc.nextInt();
int w=sc.nextInt();
vehicle(v,w);
}
}
