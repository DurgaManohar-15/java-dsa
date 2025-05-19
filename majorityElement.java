public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {7};

        int count = 1;
        int hl = arr.length / 2;

        // Sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Count occurrences of elements
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > hl) {
                    System.out.println(arr[i]);  // Majority element found
                    return;
                }
            } else {
                count = 1;
            }
        }

        // No majority element
        System.out.println("-1");
    }
}
