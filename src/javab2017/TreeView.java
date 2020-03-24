package javab2017;

import java.util.*;

class MyTree{
    private Map<String,List<String>>map_ch=new HashMap<String, List<String>>();
    private Map<String,String>map_pa=new HashMap<String, String>();
    public void add(String parent,String child){
        map_pa.put(child,parent);

    }

}
public class TreeView {
    public static void main(String[] args) {

    }
}
