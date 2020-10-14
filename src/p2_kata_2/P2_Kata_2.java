/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_kata_2;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class P2_Kata_2 {

    public static void main(String[] args) {
        int[] data = {3,2,3,4,5,3,1,4,5,2,2,1,4,5,3};
        p2_kata2_v3.Histogram histogram = new p2_kata2_v3.Histogram(data);
        Iterator <Map.Entry<Integer,Integer>> entries = histogram.getHistogram().entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }   
    }
    
}
