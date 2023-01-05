import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int connectionsInGraph = Integer.valueOf(in.readLine());
		
		Map<Integer, Set<Integer>> graphs = new HashMap<>(); 
		
		for(int i = 0; i < connectionsInGraph; i++) {
			String[] input = in.readLine().split(" ");
			boolean connected = false;
			Set<Integer> points = new HashSet<>(Arrays.asList(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
			for(Map.Entry<Integer, Set<Integer>> entry : graphs.entrySet()) {
				if(entry.getValue().stream().anyMatch(points::contains)) {
					entry.getValue().addAll(points);
					connected = true;
					break;
				}
			}
			if(connected == false) graphs.put(i, points);
		}
		
		System.out.println(graphs.size());
	}
}
