package org.xtext.comp.wh.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.xtext.comp.wh.generator.Main;

class Test1 {

	void assertFilePrettyTwiceEquals(String name) throws IOException {
		
		// first pretty
		Main.main(new String[]{"UglyWhFile/" + name, "-o", "PrettyGenWhFile/" + name});
		String firstPretty = TestUtils.readFile(new File("PrettyGenWhFile/" + name));
		
		// second pretty
		Main.main(new String[]{"PrettyGenWhFile/" + name, "-o", "PrettyWhFile/" + name});
		String secondPretty = TestUtils.readFile(new File("PrettyWhFile/" + name));
		
		System.out.println("First :\n" + firstPretty);
		System.out.println("Second :\n" + secondPretty);
		
		assertTrue(firstPretty.equals(secondPretty));
	}
	
	void assertFileEquals(String name) throws IOException {
		
		// Generate pretty file
		Main.main(new String[]{"UglyWhFile/" + name, "-o", "PrettyGenWhFile/" + name});
		String generatedText = TestUtils.readFile(new File("PrettyGenWhFile/" + name));
		
		// read correct pretty file
		String prettyText = TestUtils.readFile(new File("PrettyWhFile/" + name));
		
		System.out.println("generated :\n" + generatedText);
		System.out.println("Pretty :\n" + prettyText);
		
		assertTrue(generatedText.equals(prettyText));
	}
	
	@Test
	void test() {
		try {
			assertFilePrettyTwiceEquals("sumFunction.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test1() {
		try {
			assertFilePrettyTwiceEquals("test1.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test2() {
		try {
			assertFilePrettyTwiceEquals("test2.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test3() {
		try {
			assertFilePrettyTwiceEquals("test3.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void test4() {
		try {
			assertFilePrettyTwiceEquals("test4.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals0() {
		try {
			assertFileEquals("0_NopTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals1() {
		try {
			assertFileEquals("1_Affectation1Test.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals2() {
		try {
			assertFileEquals("2_ConsTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals3() {
		try {
			assertFileEquals("3_ListTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals4() {
		try {
			assertFileEquals("4_HdTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals5() {
		try {
			assertFileEquals("5_TlTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals6() {
		try {
			assertFileEquals("6_IfTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals7() {
		try {
			assertFileEquals("7_WhileTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals8() {
		try {
			assertFileEquals("8_ForTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	void testEquals9() {
		try {
			assertFileEquals("9_FunMultTest.wh");
		} catch (FileNotFoundException e) {
			fail("file not found");
			System.err.println(e.getMessage());
		} catch (IOException e) {
			fail("fail to read file");
			System.err.println(e.getMessage());
		}
	}
}
