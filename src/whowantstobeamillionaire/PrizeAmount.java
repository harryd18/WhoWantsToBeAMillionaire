/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */

import java.util.HashMap;
import java.util.Map;

public class PrizeAmount {
    
    private Map<Integer, Integer> prizeMap;

    public PrizeAmount() {
        prizeMap = new HashMap<>();
        prizeMap.put(1, 100);
        prizeMap.put(2, 200);
        prizeMap.put(3, 300 );
        prizeMap.put(4, 500 );
        prizeMap.put(5, 1000 );
        prizeMap.put(6, 2000 );
        prizeMap.put(7, 4000 );
        prizeMap.put(8, 8000 );
        prizeMap.put(9, 16000 );
        prizeMap.put(10, 32000 );
        prizeMap.put(11, 64000 );
        prizeMap.put(12,125000 );
        prizeMap.put(13, 250000 );
        prizeMap.put(14, 500000 );
        prizeMap.put(15, 1000000 );
        
        
    }

    public int getPrizeForLevel(int level) {
        return prizeMap.getOrDefault(level, 0);
    }
    
    
}
