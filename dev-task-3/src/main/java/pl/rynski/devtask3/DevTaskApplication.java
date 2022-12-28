package pl.rynski.devtask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int connectionsInGraph = Integer.valueOf(in.readLine());
		
		Map<Integer, Integer> graph = new TreeMap<Integer, Integer>();
		for(int i = 0; i < connectionsInGraph; i++) {
			String[] points = in.readLine().split(" ");
			graph.put(Integer.valueOf(points[0]), Integer.valueOf(points[1]));
		}
		
		int numberOfGraphs = 0;
		for (Integer key : graph.keySet()) {
	        if(!graph.containsValue(key) || !graph.containsKey(key)) numberOfGraphs++;
	    }
		
		System.out.println(numberOfGraphs);
	}
}
