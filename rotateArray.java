public class rotateArray {
   public static void main(String[] args) {
    int arr[] = {1, 2, 3};
    int n =arr.length;
    int d =4;
    int count =0 ; 
/*     int temp[] = new int [ n];

    for(int i=d;i<n;i++){
        temp[count++]=arr[i];
    }
    for(int j = 0 ;j<d;j++){
      temp[count++]=arr[j];
    } */

for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];

                
            }
            arr[arr.length-1]=temp;
        }

         for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
         } 


   }

  } 

