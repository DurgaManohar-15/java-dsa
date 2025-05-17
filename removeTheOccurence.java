public class removeTheOccurence {
    public static void main(String[] args) {
        int arr[]={0, 1, 3, 0, 2, 2, 4, 2};
        int  ele = 2 ;
        int count = 0;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]!=ele){
                count++;
                for(int j = 0;j>arr.length;j++){
                    arr[count]=arr[j];
                    
                }
                
            }
        }
        System.out.println(count);

        
      
    }
}
