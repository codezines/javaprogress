public class practice {
    public static void main(String args[]){
        //sum of elements in array
        int i;
        int [] a={1,5,3,6,2};
        int sum=0;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println("the sum is"+ sum);
    }
}
