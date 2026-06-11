class Solution{

static void toggle_bits(int n){

int bits = (int)(Math.log(n)/Math.log(2))+ 1;
int mask = (1 << bits) - 1;
int result = n ^ mask ;
System.out.println(result);

}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

toggle_bits(n);
}
}
