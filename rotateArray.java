public class rotateArray {
   public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6};
    int n =arr.length;
    int d =2;
    for(int i =0 ; i<n;i++){
        int d1 = d%n;
        for(int j = n-d1 ; j< n ;j++){
                int temp = arr[i];
                arr[i] = arr[d1];
                arr[d1]=temp;

                
             System.out.print(arr[i]+" ");
             
        }
      
        
    }
  
  }
   } 

