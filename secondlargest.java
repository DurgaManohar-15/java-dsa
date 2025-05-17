/* public class secondlargest {
    public static void main(String[] args) {
        
    
    int array[] = {18,40,26,37,20,46};

    int len=array.length;


    for(int i =1;i<len;i++){
        if(array[i]!=array[0]){
            System.out.println("-1");
            break;
        }
    }

    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]<array[j]){
                int temp = array[i];
                array[i] = array [j];
                array[j] = temp;
            }
        }
    }
    System.out.println("second largest number :"+ array[1]);
 /*    for(int i =0;i<array.length;i++){
        System.out.println(array[i]); 
    }
}

 */
public class secondlargest {
    public static void main(String[] args) {
        
        int array[] = {18, 18, 16, 18, 18,19}; // Change this to test

        // Check if all elements are the same (general way)
        int firstElement = array[0];
        int i;
        for (i = 1; i < array.length; i++) {
            if (array[i] != firstElement) {
                break;
            }
        }

        if (i == array.length) {
            System.out.println("-1"); // All elements are same
            return;
        }

        // Sort array in descending order
        for (int m = 0; m < array.length; m++) {
            for (int n = m + 1; n < array.length; n++) {
                if (array[m] < array[n]) {
                    int temp = array[m];
                    array[m] = array[n];
                    array[n] = temp;
                }
            }
        }

        // Find second largest (skip duplicates of largest)
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] != max) {
                System.out.println("Second largest number: " + array[j]);
                return;
            }
        }

        // If second largest is not found
        System.out.println("-1");
    }
}


