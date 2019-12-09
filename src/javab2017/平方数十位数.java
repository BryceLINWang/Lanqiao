package javab2017;

public class 平方数十位数 {
    public static void main(String[] args) {
        for(long i=100000;i>32000;i--){
            long num=i*i;
            boolean flag=true;
            String str=String.valueOf(num);
            for (int j=0;j<9;j++){
                for(int n=j+1;n<10;n++){
                    if (str.charAt(j)==str.charAt(n)){
                        flag=false;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println(num);
                break;
            }
        }
    }
}
