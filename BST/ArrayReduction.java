public class ArrayReduction {
    public static void sort(int[]arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
  }
    public static void arrayred(int[]arr,int n){
        //printing the number of elements left over aftre reduced in each step
        sort(arr,n);
        //int count=1;
        int reduction=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]-reduction>0){
                System.out.println(n-i);
                reduction=arr[i];
              //  count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,7,8,9,12};
        arrayred(arr,arr.length);
    }
}
