package org.xtext.comp.wh.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.esir2.sprint2.Main;

class Test2 {

	void assertFileEquals(String genPath, String correctPath) throws IOException {
		
		String generatedText = TestUtils.readFile(new File(genPath));
		
		String correctText = TestUtils.readFile(new File(correctPath));
		
		assertTrue(generatedText.equals(correctText));
	}
	
	@Test
	void test1() throws IOException {
		String fileName = "test1";
		Main.main(new String[]{"WHILE_TEST/" + fileName + ".wh"});
		assertFileEquals("GEN/CODE3A/" + fileName + ".txt", "CORRECT/CODE3A/" + fileName + ".txt");
	}

}
