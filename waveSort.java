public class waveSort {
    public static void main(String[] args) {
        int arr[] = {10, 5, 6, 3, 2, 20, 100, 80};
        int n = arr.length;
      
        for (int i = 0 ; i<n ; i+=2){
            if(i>0 && arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
                if(i<n-1 && arr[i]<arr[i+1]){
              
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]= temp;
                }
            }
            for(int j = 0 ; j<n ;j++){
            System.out.print(arr[j]+" ");
        }
            }
        
        }
    

