
public class stockSelling {
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};
        int n =arr.length;
        int res =0;
        for(int i =0 ;i<n-1;i++){
            for(int j = i+1 ; j<n;j++){
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        System.out.println(res);
    }
}
