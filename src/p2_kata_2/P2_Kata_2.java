/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_kata_2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class P2_Kata_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {3,2,3,4,5,3,1,4,5,2,2,1,4,5,3};
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey((Integer)data[i])? histogram.get(data[i]) + 1 : 1);
        }
        for (Integer key : histogram.keySet()) {
            System.out.println("Key: " + key + ", Value: " + histogram.get(key));
        }
    }
    
}
