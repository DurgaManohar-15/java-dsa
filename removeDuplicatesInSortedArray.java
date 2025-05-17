import java.util.HashSet;

public class removeDuplicatesInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        HashSet<Integer> hs = new HashSet<>();
        int index = 0;
        for(int i =0 ; i<arr.length-1;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
                arr[index++]=arr[i];
            }
        }
        for(int i = 0 ; i<index;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
