public class alternativePositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        int n = arr.length;

        // Separate positive and negative numbers
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, ne = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0)
                pos[p++] = arr[i];
            else
                neg[ne++] = arr[i];
        }

       
        int i = 0, j = 0, k = 0;
        while (i < p && j < ne) {
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }

        
        while (i < p)
            arr[k++] = pos[i++];

       
        while (j < ne)
            arr[k++] = neg[j++];

        
        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
