public class ascendingorder {
    public static void main(String args[]){
        int a []={1,5,3,7,22,8,99,4};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    System.out.println(a[j]);
                }
            }
        }

    }}
