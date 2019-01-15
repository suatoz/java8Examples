package readfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileStream {
	static String fileName = "d:/lines.txt";
	public static void main(String[] args) {
		readFileGen();
		System.err.println("<---------------------------------------------------------------->");
		readFileGenExtra();
		System.err.println("<---------------------------------------------------------------->");
		linesMethod();
		
		String den = "deneme";
		den.chars().mapToObj(x -> (char)x).forEach(System.out::println);
	}
	
	private static void readFileGen() {
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void readFileGenExtra() {
		List<String> list = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			list = stream.filter(line->!line.startsWith("line3")).map(String::toUpperCase).collect(Collectors.toList());
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);
	}
	
	private static void linesMethod() {
		List<String> list = new ArrayList<>();
		try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
			list = br.lines().collect(Collectors.toList());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);
	}
}
