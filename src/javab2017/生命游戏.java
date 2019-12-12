package javab2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Point{
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

}
public class 生命游戏 {
    //初始状态行列数
   static int row=11;
   static int rank=38;
   static List<Integer>saveNum=new ArrayList<Integer>();//存放每一代细胞数
    static List<Point>savecell=new ArrayList<Point>();//存放活细胞
    static List<Point>nsavecell;//下一代活细胞
    //周围八个点的坐标相对位置
    static int dirX[]={-1,-1,-1,0,0,1,1,1};
    static int dirY[]={-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char temp[][]=new char[row][rank];
        for(int i=0;i<row;i++){
            String str=sc.nextLine();
            temp[i]=str.toCharArray();
        }
        //加入活细胞
        for(int i=0;i<row;i++){
            for(int j=0;j<rank;j++){
                if(temp[i][j]=='X'){
                    savecell.add(new Point(i,j));
                }
            }
        }
        saveNum.add(new Integer(savecell.size()));//初始状态细胞数
        for (int loop=1;loop<=100;loop++){
           nsavecell=new ArrayList<Point>();
           for (int i=0;i<savecell.size();i++){
               Point current=(Point)savecell.get(i);
               int surcells=0;//周围细胞数
               //遍历周围8个细胞
               for (int j=0;j<8;j++){
                   int dx=current.x+dirX[j];
                   int dy=current.y+dirY[j];
                   if(savecell.contains(new Point(dx,dy))){
                       surcells++;
                   }else {
                    if (!nsavecell.contains(new Point(dx,dy))){
                     int surpoint=0;
                     for(int k=0;k<8;k++){
                         int dxx=dx+dirX[k];
                         int dyy=dy+dirY[k];
                         if (savecell.contains(new Point(dxx,dyy))){
                             surpoint++;
                         }
                     }
                     if(surpoint==3){
                         nsavecell.add(new Point(dx,dy));
                     }
                    }
                   }
               }
               if(surcells==2||surcells==3){//周围细胞2或3延续
                   nsavecell.add(current);
               }
           }
           //一代更新完成，下一代
            saveNum.add(new Integer(nsavecell.size()));
           savecell=nsavecell;
        }
        for (int i=0;i<saveNum.size();i++){//输出细胞数
            System.out.println(saveNum.get(i)+" ");
        }
        System.out.println();
        for (int i=1;i<saveNum.size();i++){//输出细胞数增量
            System.out.println(saveNum.get(i)-saveNum.get(i-1)+" ");
        }
    }
}
