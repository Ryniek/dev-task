import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int connectionsInGraph = Integer.valueOf(in.readLine());
		
		List<Set<Integer>> graphs = new ArrayList<>();
		
		for(int i = 0; i < connectionsInGraph; i++) {
			String[] input = in.readLine().split(" ");
			Set<Integer> points = new HashSet<>(Arrays.asList(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
			List<Integer> indexesOfGraphsToConnect = new ArrayList<>();
			for(int m = 0; m < graphs.size(); m++) {
				if(graphs.get(m).stream().anyMatch(points::contains)) {
					indexesOfGraphsToConnect.add(m);
				}
			}
			if(indexesOfGraphsToConnect.size() == 0) {
				graphs.add(points);
			} 
			else {
				Set<Integer> newGraph = new HashSet<>(points);
				for(int j = indexesOfGraphsToConnect.size() - 1; j >= 0; j--) {
					newGraph.addAll(graphs.remove(j));
				}
				graphs.add(newGraph);
			}
		}
		
		System.out.println(graphs.size());
	}
}
