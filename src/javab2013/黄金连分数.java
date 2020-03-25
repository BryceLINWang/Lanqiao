package javab2013;

import java.math.BigDecimal;
import java.math.BigInteger;

public class 黄金连分数 {
    /**
     * 将比例求黄金分割转化为求斐波那契相邻两项比值
     * n/n+1项
     * 1/2  2/3  3/5  5/8  8/13
     * 1 2 3 5 8
     * 2 3 5 8 13
     * 求100位用BigInteger
     * @param args
     */
    public static void main(String[] args) {
      BigInteger a=BigInteger.ONE;
      BigInteger b=BigInteger.ONE;
      for(int i=3;i<500;i++){
          BigInteger tmp=b;
          b=a.add(b);
          a=tmp;
      }
      //取高精度
        BigDecimal res=new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(res.toPlainString().substring(0,103));
        //0.61803398874989484820458683436563811772030917980576286213544862270526046281890244970720720418939113748
        //四舍五入
        //0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911375
    }
}
