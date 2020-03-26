package javab2013;

import java.util.Scanner;

public class 幸运数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=2*i+1;
        }
        int l=1;//幸运数的下标 a[l]是幸运数
        while(true) {
            int p = l + 1;//数字向前挪动的坑位
            for (int i = l + 1; i < n; i++) {
                if (i + 1 % a[l] == 0) {
                    //略过 无操作
                } else {
                    a[p] = a[i];
                    p++;
                }
                if(a[i]>n)break;
            }
            l++;
            if (a[l]>=n)break;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]>=n)break;
            if (a[i]>m)ans++;
        }
        System.out.println(ans);
    }
}
