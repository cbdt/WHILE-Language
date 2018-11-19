package org.xtext.comp.wh.tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

final class TestUtils {
	
	public static String readFile(File f) throws IOException {
		FileReader input = new FileReader(f);
		
		StringBuilder builder = new StringBuilder();
		
		int c;
		while((c = input.read()) != -1) {
			builder.append((char) c);
		}
		input.close();
		
		return builder.toString();
	}
	
}
