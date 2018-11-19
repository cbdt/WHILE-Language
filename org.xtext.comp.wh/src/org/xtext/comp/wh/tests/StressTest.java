package org.xtext.comp.wh.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class StressTest {

	private static long getAverageTime(long[] measures) {
		Arrays.sort(measures);
		int q1 = (int) 0.25 * measures.length;
		int q3 = (int) 0.75 * measures.length;

		long measureSum = 0;
		int n = 0;
		for (int i = 0; i < measures.length; ++i) {
			if (i >= q1 && i <= q3) {
				measureSum += measures[i];
				++n;
			}
		}

		return measureSum / n;
	}

	public static long[] stressTest(int iteration) {
		long[] times = new long[iteration];
		final String fileType = ".wh";

		for (int i = 0; i < iteration; ++i) {
			String name = "stressTestFile" + i + fileType;

			long[] measures = new long[10];
			long end = -1;
			long begin = -1;
			for (int k = 0; k < measures.length; ++k) {
				// Calculate time
				begin = System.currentTimeMillis();
				org.xtext.comp.wh.generator.Main
						.main(new String[] { "UglyWhFile/" + name, "-o", "PrettyGenWhFile/" + name });
				end = System.currentTimeMillis();
				measures[k] = end - begin;
			}
			times[i] = getAverageTime(measures);

			File newStressTestFile = new File("UglyWhFile/" + "stressTestFile" + (i + 1) + fileType);
			if (!newStressTestFile.exists()) {
				File stressTestFile = new File("UglyWhFile/" + name);
				String fileContent = "";
				try {
					fileContent = TestUtils.readFile(stressTestFile);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// File newStressTestFile = new File("UglyWhFile/" + "stressTestFile" + (i+1) + fileType);
				try {
					FileWriter output = new FileWriter(newStressTestFile);
					// write 2 times file content
					output.write(fileContent);
					output.write("\n");
					output.write(fileContent);
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // for end

		return times;
	}

	public static void main(String[] args) {
		long[] times = stressTest(12);
		for (long t : times) {
			System.out.println(t);
		}
	}

}
