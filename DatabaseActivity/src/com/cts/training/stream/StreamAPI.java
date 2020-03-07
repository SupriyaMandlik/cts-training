package com.cts.training.stream;
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.List;
	import java.util.Scanner;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;
	public class StreamAPI {
		public static void main(String[] args) {
			Scanner src = new Scanner(System.in);
//			ArrayList<Integer> arrli = new ArrayList<>();
//			ArrayList<Integer> arr = new ArrayList<>();
//			ArrayList<Integer> arr2 = new ArrayList<>();
//			
//			arrli.add(20);
//			arrli.add(40);
//			arrli.add(35);
//			arrli.add(80);
//			arrli.add(62);
//			
//			System.out.println("ArrayList is: ");
//			System.out.println(arrli);
//			for(int i=0; i<arrli.size(); i++)
//				if(arrli.get(i)%2==0 && arrli.get(i)%5==0)
//					arr.add(arrli.get(i));
//			System.out.println("Elements divisible by 2 & 5: ");
//			System.out.println(arr);
//			
//			System.out.println("Double of the elements: ");
//			for(int i=0; i<arrli.size(); i++)
//				arr2.add(arrli.get(i)*2);
//			System.out.println(arr2);
			ArrayList<String> names = new ArrayList<String>();
			addNames(names);
			// 1. Print names with length more than 6
			List<String> namesWithSizeLessThan6 = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
			System.out.println("********** Names With Length Greater Than 6 **********");
			namesWithSizeLessThan6.forEach(System.out::println);
			
			//2. Names in Upper case
			List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
			System.out.println("********** Names in Upper case **********");
			namesInUpper.forEach(System.out::println);
			
		    long count=names.stream().count();
		    System.out.println("list count is:" +count);
		    
		    Stream<Integer> data = Stream.of(1,11,111,1111,11111);
		    System.out.println("Data Count: "+data.count());
		    
		    Stream<String> languages = Stream.of("C","C++","Java","Python","Angular");
		    List<String> languages1=languages.filter(s -> s.length() > 4).collect(Collectors.toList());
		    languages1.forEach(System.out::println); 
		    
		    Stream<String> languages3 = Stream.of("C","C++","Java","Python","Angular");
		    List<String> languages2=languages3.map(s ->s.concat(" Programming")).collect(Collectors.toList());
		    languages2.forEach(System.out::println);
		    
		    List<String> customSorting =names.parallelStream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		    System.out.println("*****descending order sorting******");
		    customSorting.forEach(System.out::println);
		    
		   
	    } 
		
		

		private static void addNames(ArrayList<String> names) {
			names.add("Neeraj");
			names.add("Harshita");
			names.add("Rajshree");
			names.add("Pulkit");
			names.add("Abhishek");
			names.add("Mayuresh");
		}
	}

