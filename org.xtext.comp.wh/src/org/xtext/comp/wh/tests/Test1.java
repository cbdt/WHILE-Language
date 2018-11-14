package org.xtext.comp.wh.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class Test1 {

	void assertFileEquals(String name) throws IOException {
		File ugly = new File("UglyWhFile/" + name);
		File pretty = new File("PrettyWhFile/" + name);
		
		FileReader input = new FileReader(ugly);
		
		StringBuilder uglyBuilder = new StringBuilder();
		StringBuilder prettyBuilder = new StringBuilder();
		
		int c;
		while((c = input.read()) != -1) {
			uglyBuilder.append((char) c);
		}
		input.close();
		input = new FileReader(pretty);
		while((c = input.read()) != -1) {
			prettyBuilder.append((char) c);
		}
		input.close();
		
		System.out.println("Ugly :\n" + uglyBuilder.toString());
		System.out.println("Pretty :\n" + prettyBuilder.toString());
		
		assertTrue(uglyBuilder.toString().equals(prettyBuilder.toString()));
	}
	
	@Test
	void test() {
		try {
			assertFileEquals("sumFunction.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}

}
