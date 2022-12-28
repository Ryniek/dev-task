package pl.rynski.devtask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numbers = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		List<Integer> lowerNumbers = numbers.stream().filter((number) -> number <= 6).sorted().toList();
		List<Integer> higherNumbers = numbers.stream().filter((number) -> number >= 7).sorted(Collections.reverseOrder()).toList();
		
		for(Integer lowerNumber: lowerNumbers) {
			Optional<Integer> higherNumber = higherNumbers.stream().filter(num -> (13 - num == lowerNumber)).findFirst();
			if(higherNumber.isPresent()) {
				System.out.println(lowerNumber + " " + higherNumber.get());
				continue;
			}
		}
	}

}
