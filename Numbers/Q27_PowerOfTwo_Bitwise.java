class Solution{

static void poweroftwo_bits(int n){
if(n<=0){

System.out.println("Not a Power of 2");
return;

}

if((n & (n-1))==0){

System.out.println("Power of 2");
}
else{

System.out.println("Not a Power of 2");

}
}
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int n = sc.nextInt();

poweroftwo_bits(n);
}
}
