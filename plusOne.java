public class plusOne {
    public static void main(String[] args) {
        int  arr[] = { 9, 9, 9,2,3,8,7,6,6,2,9};

        int digit = 0 ;
         for(int i = 0 ;i< arr.length;i++){
            digit=digit*10+ arr[i];

         }
         digit= digit+1;
         System.out.println(digit);
    }
}
