package pl.rynski.devtask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int connectionsInGraph = Integer.valueOf(in.readLine());
		
		List<Pair> graph = new ArrayList<Pair>();
		for(int i = 0; i < connectionsInGraph; i++) {
			String[] points = in.readLine().split(" ");
			graph.add(new Pair(Integer.valueOf(points[0]), Integer.valueOf(points[1])));
		}
		
		int numberOfGraphs = 1;
		for(int i = 1; i < graph.size(); i++) {
			for(int m = 0; m < i; m++) {
				if(Pair.arePointsConnected(graph.get(m), graph.get(i))) {
					break;
				}
				if(m == i - 1) numberOfGraphs++;
			}
		}
		
		System.out.println(numberOfGraphs);
	}
	
	public static class Pair {
		private Integer key;
		private Integer value;
		
		public Pair(Integer key, Integer value) {
			this.key = key;
			this.value = value;
		}
		
		public Integer getKey() {
			return key;
		}
		
		public Integer getValue() {
			return value;
		}
		
		public static boolean arePointsConnected(Pair firstPair, Pair secondPair) {
			return (firstPair.getKey() == secondPair.getKey() || 
					firstPair.getKey() == secondPair.getValue() || 
					firstPair.getValue() == secondPair.getKey() || 
					firstPair.getValue() == secondPair.getValue());
		}
	}
}
