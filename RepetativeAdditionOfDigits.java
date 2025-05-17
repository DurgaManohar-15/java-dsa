/* public class RepetativeAdditionOfDigits {
    public static void main(String[] args) {
        int num =1234;
         int sum =0;
         int final_sum=0;
        while(num!=0){
            num =num%10;
            sum=sum+num;
         /* final_sum=Math.min(final_sum,sum); 
    }
    System.out.print(sum);
}
} */

public class RepetativeAdditionOfDigits {
    public static void main(String[] args) {
        int num = 1234;
        int sum =0 ;
         while(num>0||sum>9){
            if(num==0){
                num=sum;
                sum=0;
            }else{
                num=num%10;
                sum+=num;
                num=num/10;
            }
         }
         System.out.println(sum);
    }
}