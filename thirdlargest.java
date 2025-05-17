public class thirdlargest {
    public static void main(String[] args) {
        int [] a = {10,34,5,2,5,6,32,75,24};
        int big = a[0];
         for(int i= 0 ;i<a.length;i++){
            if(a[i]>big){
                big=a[i];
            }
         }
         int sb = -1;
         for(int i = 0; i<a.length;i++){
            if(a[i]>sb && a[i]!=big){
                sb = a[i];
            }
         }
         int tb = -1;
         for(int i = 0; i<a.length;i++){
            if(a[i]>tb && a[i]!=big && a[i]!=sb){
                tb = a[i];
            }
         }
         System.out.println("Third Largestelement : "+ tb);
    }
}
