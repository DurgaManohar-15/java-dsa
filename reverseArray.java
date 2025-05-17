/* public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
    }
} */

/* using temp array */


public class reverseArray {
    public static void main(String[] args) {
         int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
         int temp[]=new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            temp[count++]=arr[i];
        }
        for(int i= 0;i<temp.length;i++){
       System.out.print(temp[i]+" ");

        }
 
    }
}
