/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variant7;

import java.util.HashSet;

/**
 *
 * @author oam
 */
public class VCaller7 {
    private HashSet<String> data;

    public VCaller7() {
    }
    
    /**
     * Метод добавляет строки из входящего множества к существующему
     * @param add множество строк
     * @return true, если существующая коллекция изменилась
     */
    public boolean union(HashSet<String> add){
        boolean flag=true;
        if (add.isEmpty()==true) {flag = false;
        return flag;}
        
        
        //for(String s: data){
            for(String q:add){
                //if(s.equals(add))flag=false;
                data.add(q);
            }
        //}
        return flag;
        //получилась такая реализация, дальше затрудняюсь из-за ошибки(см VCaller7Test)
    }
    
    /**
     * Метод находит отличающиеся строки
     * @param in входное множество строк
     * @return множество строк, входящих только в одну из коллекций
     */
    public HashSet<String> diff(HashSet<String> in){
        HashSet<String> res=null;
        for(String s: in){
            if(data.contains(s))res.clear();
        }
        return res;
    }
}
