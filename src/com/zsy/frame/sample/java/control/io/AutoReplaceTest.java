package com.zsy.frame.sample.java.control.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


/**
 * 自动替换XML中的文件内容；
 * @author Samy
 *
 */
public class AutoReplaceTest{

	public static void main(String[] args) {
		// String filePath = "F:\\autotest\\album_strings.xml";
		// String filePath = "F:\\autotest\\imsdk_string.xml";
		// String filePath = "F:\\autotest\\strings.xml";
		// String filePath = "F:\\autotest\\chatemoji";
		// String descPath = "C:\\a.txt";
		String filePath = "D:/strings_en20150915.xml";
		readTxtFile1(filePath);
		// readTxtFile2(filePath);
		// readTxtFile3(filePath);
	}

	public static void readTxtFile3(String filePath) {
		try {
			String encoding = "utf-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);

				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					String[] result = lineTxt.split(",");

					// System.out.println(result[0]);
					System.out.println(result[1]);

				}
				read.close();
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readTxtFile1(String filePath) {
		try {
			String encoding = "utf-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					int start1 = lineTxt.indexOf("=\"");
					int end1 = lineTxt.indexOf("\">");
					if (start1 != -1 && end1 != -1) {
						String result1 = lineTxt.substring(start1 + 2, end1);
						System.out.print(result1 + "||");
					}

					int start2 = lineTxt.indexOf("\">");
					int end2 = lineTxt.indexOf("</");
					if (start2 != -1 && end2 != -1) {
						String result2 = lineTxt.substring(start2 + 2, end2);
						System.out.println(result2);
					}
				}
				read.close();
			} else {
				System.out.println("not find file");
			}
		} catch (Exception e) {
			System.out.println("read file connent error");
			e.printStackTrace();
		}

	}

	public static void readTxtFile2(String filePath) {
		try {
			String encoding = "utf-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);

				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					int start2 = lineTxt.indexOf("\">");
					int end2 = lineTxt.indexOf("</");
					if (start2 != -1 && end2 != -1) {
						String result2 = lineTxt.substring(start2 + 2, end2);
						System.out.println(result2);
					}

				}
				read.close();
			} else {
					System.out.println("not find file");
			}
		} catch (Exception e) {
			System.out.println("read file connent error");
			e.printStackTrace();
		}

	}

}
