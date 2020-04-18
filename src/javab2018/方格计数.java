package javab2018;

public class 方格计数 {
    public static void main(String[] args) {
        int n=1000;
        int y=n;
        int ans =0;
        for(int x=1;x<=n;x++){
            while (x*x+y*y>n*n&&y>0)y--;
            ans+=y;
        }
        System.out.println(ans*4);
//        int a= (int) (1000/Math.sqrt(2));
//        System.out.println(a);
//        System.out.println(a*a*4);
    }
}
