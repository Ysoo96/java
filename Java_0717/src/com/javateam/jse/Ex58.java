package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex58 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("콩나물", "파프리카", "오이", "토마토", "파", "양파"));

		list.stream()
			// .filter(x -> x.contains("파")) // 1)
			.collect(Collectors.groupingBy(x -> x.contains("파")))
			.get(false)
			.stream() // 2)
			.sorted(Comparator.naturalOrder())
			.limit(1)
			.forEach(x -> System.out.print(x + " "));

	}

}
