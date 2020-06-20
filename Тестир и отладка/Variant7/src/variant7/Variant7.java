/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variant7;

import java.util.HashSet;

/**
 *
 * @author oam
 */
public class Variant7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<String> add = new HashSet<String>();
        VCaller7 q=new VCaller7();
        q.union(add);
        add.add("new strings");
        add.add("again new strings");
        System.out.println(q.union(add));
        //прописал реализацию первого метода
        // TODO code application logic here
    }
    
}
