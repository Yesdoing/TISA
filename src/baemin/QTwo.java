package baemin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class QTwo {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<>();
			
			
			for(int i=0; i<n; i++) {
				int a = s.nextInt();
				int b = s.nextInt();
				
				if(hm.containsKey(a)) {
					if (hm.get(a) < b) hm.put(a, b); 
				} else hm.put(a, b); 
			}
			
			TreeMap<Integer, Integer> tm = new TreeMap<>(hm);
			
			Integer[] keys = tm.keySet().toArray(new Integer[0]);
			Integer[] values = tm.values().toArray(new Integer[0]);
			
			
			System.out.println("(-, " + keys[0] + ")");
			for(int j=0; j<keys.length-1; j++) {
				if(keys[j+1] < values[j]) System.out.println("[" + keys[j+1] + ", " + values[j] + "]");
				else System.out.println("("+ values[j] + ", "+ keys[j+1]+")");
			}
			
			System.out.println("("+values[values.length-1]+ ", +)");
			
		}
	}
}
