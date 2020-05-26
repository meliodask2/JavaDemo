package Sort_Algorithm.My_Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Sort_Algorithm.MinPQ;

public class SimbolTableStudent {

	public static Scanner scanner = new Scanner(System.in);
	private static SymbolTable<String, Student> st = new SymbolTable<>();

	public static void main(String[] args) {

		File file = new File("student2.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// Step 2: Make a file reader
			fr = new FileReader(file);

			// Step 3: Make a buffer to read data
			br = new BufferedReader(fr);

			// Step 4: Read data from buffer to variable
			String data = null;
//			System.out.println(data);
//			String[] abc = data.split("-");
//			st.put(abc[0],new Student(abc[0], abc[1], abc[2], Double.parseDouble(abc[3]),Double.parseDouble(abc[4]), Double.parseDouble(abc[5])));
			while ((data = br.readLine()) != null) {
				String[] abc = data.split("-");
				Student student = new Student(abc[0], abc[1], abc[2], Double.parseDouble(abc[3]),
						Double.parseDouble(abc[4]), Double.parseDouble(abc[5]));
				st.put(abc[0], student);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Step 6: Close all connections
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (String e : st.keys()) {
			System.out.println(st.get(e));
		}
//		System.out.println(s);

	}
}
