class Solution{
static void power_of_two(int n){
 if (n <= 0) {
            System.out.println("Not a power of two");
            return;
        }
int temp=n;

while(temp>1){

if(temp%2!=0){

System.out.println("Not a power of two");
return;
}

temp=temp/2;
}
System.out.println("power of two");
}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
power_of_two(n);
}
}

