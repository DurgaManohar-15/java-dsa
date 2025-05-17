public class reverseSubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        int count = 0 ;
        int k =5;

        int temp[]=new int [n];

        for(int i =0 ; i<=n;i+=k){
            int end = Math.min(i+k,n);
            for(int j = end-1; j>=i;j--){
                temp[count++]=arr[j];
            }
        }

        for(int i = 0 ; i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
