class Solution{

static void arithematic_progression(double a,double d,double n){
double formula=a+((n-1)*d);
System.out.println(formula);

}

public static void main(String [] args){

Scanner sc=new Scanner(System.in);
double a = sc.nextDouble();
double d=sc.nextDouble();
double n=sc.nextDouble();

arithematic_progression(a,d,n);
}
}
