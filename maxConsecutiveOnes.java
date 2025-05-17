public class maxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1};
        int maxCount = 0;
        int currentCount = 0;

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==0){
                currentCount=0;
            }else{
                currentCount++;
            }
        }
        maxCount=Math.max(maxCount,currentCount);
        
        System.out.println(maxCount);
    }
}
