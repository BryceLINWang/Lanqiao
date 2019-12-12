package Test;

public class 生命游戏test {
    public static void main(String args[]){

        int a[]={3, 4 ,5 ,3 ,-7, 7, -3 ,13 ,-19, 6, 2 ,4 ,1, 1, -14, 2 ,3 ,6, 1, 0, 0 ,-5 ,11, -17, 7 ,-3 ,0,3 ,-2, -7};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        int k=0;
        k=(1000000000/30)*sum+36;

        int b[]=new int[1000000000%30];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
            k+=b[i];
        }
        System.out.println(k);
    }
}
