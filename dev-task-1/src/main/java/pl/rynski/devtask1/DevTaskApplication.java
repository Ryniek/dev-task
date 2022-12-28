package pl.rynski.devtask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DevTaskApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		InputIngeters inputIntegers = new InputIngeters(numbers);
		System.out.println(inputIntegers);
	}
	
	public static class InputIngeters {
		private int[] sortedDistinctNumbers;
		private int count;
		private int distinct;
		private int min;
		private int max;
		
		public InputIngeters(int[] numbers) {
			super();
			this.sortedDistinctNumbers = IntStream.of(numbers).sorted().distinct().toArray();
			this.count = numbers.length;
			this.distinct = sortedDistinctNumbers.length;
			this.min = sortedDistinctNumbers[0];
			this.max = sortedDistinctNumbers[distinct - 1];
		}

		@Override
		public String toString() {
			return Arrays.toString(sortedDistinctNumbers).replaceAll("\\,", "").replaceAll("\\[", "").replaceAll("\\]","") + System.lineSeparator() +
				"count: " + count + System.lineSeparator() +
				"distinct: " + distinct + System.lineSeparator() +
				"min: " + min + System.lineSeparator() +
				"max: " + max;
		}
	}
}
