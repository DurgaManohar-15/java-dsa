/* public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int a[]={10,3,0,28,0,2,0,20};
        int temp[]=new int[a.length];
        for(int i= 0 ; i<a.length;i++){
           temp[i]=0;
        }
        int count =0;
        for(int i = 0 ; i<a.length;i++){
            if(a[i]!=0){
                temp[count]=a[i];
                count++;
            }
        }
        for (int i = 0; i<a.length;i++){
            System.out.print(temp[i]+" ");
        }
        }
           
    } */
    
/* it is without using an temp array */
public class moveAllZerosToEnd{
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        int count= 0 ;
         for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=0)
            arr[count++] = arr[i];
         }

         for(int i = count; i<arr.length;i++){
                arr[i]=0;
         }
          for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i]+ " ");
         }    
    }
}




