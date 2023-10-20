public class reversearray {
    public static void main(String args[]){
        int a[]={1,2,4,5,3};
        System.out.println("the actual array values are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("the Reverse of the array is:");
        for(int i = (a.length-1); i >= 0; i--){
            System.out.println(a[i]);
        }
    }
}
