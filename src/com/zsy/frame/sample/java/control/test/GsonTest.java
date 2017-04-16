package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTest {

	public static void main(String[] args) throws JSONException {
//		JSONObject params = new JSONObject();
//		params.put("code1", "code1");
//		
//		
//		ArrayList<String> templist = new ArrayList<String>();
//		templist.add("http://baidu.com");
//		params.put("urls", templist);
//		System.out.println(params.toString());
		
//		Student student = new Student();
//		student.id = 1;
//		student.name="samy";
		  Gson gson = new Gson();
//		 Gson gson = new GsonBuilder().serializeNulls().create();
//          String content = gson.toJson(student);
//          System.out.println(content);
//		String  tempJson = "{'name':samy,'age':20}";
		String  tempJson = "{"
				+ "'isFrom':true,"
				+ "'huiyuan':18123710721"
				+ "}";
		System.out.println(tempJson);
		
//		String tempPhone = gson.fromJson(tempJson);
	}

	

}
