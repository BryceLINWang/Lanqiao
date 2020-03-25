package javab2013;

public class 振兴中华啊 {
    public static void main(String[] args) {
        int ans=f(0,0);
        System.out.println(ans);
    }
    public static int f(int i,int j){
        if (i==3||j==4)return 1;
        return f(i+1,j)+f(i,j+1);//将两种走法的路线数相加
    }
}
