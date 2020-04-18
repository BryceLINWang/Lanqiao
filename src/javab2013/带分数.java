package javab2013;

import java.util.Scanner;

public class 带分数 {
    static int ans;
    static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int []arr={1,2,3,4,5,6,7,8,9};
        f(arr,0);
        System.out.println(ans);
    }
    //确认某一个排列的第K位
    private static void f(int []arr,int k){
        if(k==9){
            check(arr);
            return;
        }
        //选定第k位，
        for(int i=k;i<arr.length;i++){
            //将第i位和第k位交换
            int t=arr[i];
            arr[i]=arr[k];
            arr[k]=t;
            // 移交下一层确认k+1位
            f(arr,k+1);
            //回溯，换回来
            t=arr[i];
            arr[i]=arr[k];
            arr[k]=t;
        }
        // 移交下一层确认k+1位
        f(arr,k+1);
    }

    private static void check(int []arr) {
        for (int i = 1; i <=7 ; i++) {
            int num1=toInt(arr,0,i);
            if(num1>=N)continue;
            for (int j=1;j<9-i-1;j++){
                int num2=toInt(arr,i,j);
               int num3=toInt(arr,i+j,9-i-j);
               if (num2%num3==0&&num1+num2/num3==N){
                   ans++;
               }
            }
        }
    }

    private static int  toInt(int[] arr, int pos, int len) {
        int t=1;
        int ans=0;
        for(int i=pos+len-1;i>=pos;i--){
          ans+=arr[i]*t;
          t*=10;
        }
        return ans;
    }
}
