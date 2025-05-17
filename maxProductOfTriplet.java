public class maxProductOfTriplet {
    
    public static void main(String[] args) {
        int [] a = {1, -4, 3, -6, 7, 0};
        int big = a[0];
         for(int i= 0 ;i<a.length;i++){
            if(a[i]>big){
                big=a[i];
            }
         }
         int sb = a[0];
         for(int i = 0; i<a.length;i++){
            if(a[i]>sb && a[i]!=big){
                sb = a[i];
            }
         }
         int tb = a[0];
         for(int i = 0; i<a.length;i++){
            if(a[i]>tb && a[i]!=big && a[i]!=sb){
                tb = a[i];
            }
         }
         System.out.println("Graetest product : "+ big*tb*sb);
    }
}

