import java.util.Scanner;
class Solution{
static void profit_loss(double sp,double cp){
if(sp>cp){
double profit = sp-cp;
double profitPercent = (profit/cp)*100;
System.out.println("Profit: "+profit);
System.out.printf("Profit percentage: %.2f%n", profitPercent);
}
else if(cp>sp){
double loss = cp-sp;
double lossPercent = (loss/cp)*100;
System.out.println("Loss: "+loss);
System.out.printf("Loss Percentage: %.2f%n", lossPercent);
}
else{
System.out.println("No profit or loss");
}
}
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double sp=sc.nextDouble();
double cp=sc.nextDouble();
profit_loss(sp,cp);
}
}
