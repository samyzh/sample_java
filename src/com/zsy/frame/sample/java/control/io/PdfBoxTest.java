package com.zsy.frame.sample.java.control.io;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 * PDF转换成Word
 * @author Samy
 *
 */
public class PdfBoxTest {
public String getText(String file)throws Exception{
	PDDocument document=null;
	String result="";
	try {
		document=PDDocument.load(new File(file));
		PDFTextStripper stripper=new PDFTextStripper();
		result = stripper.getText(document);
	} catch (Exception e) {
	}finally {
		if(document!=null){
			document.close();
		}
	}
	return result;
	
}
public static void main(String[] args)throws Exception {
	PdfBoxTest test=new PdfBoxTest();
	System.out.println(test.getText("D:/samy/books/android/Android Studio入门指南 .pdf"));
}
}
