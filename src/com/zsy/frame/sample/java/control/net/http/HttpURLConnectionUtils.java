package com.zsy.frame.sample.java.control.net.http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class HttpURLConnectionUtils {

	private void HttpURLConnectionGet(URL url) {
		// 使用HttpURLConnection打开连接
		HttpURLConnection urlConn;  
		
		try {
			urlConn = (HttpURLConnection) url.openConnection();
			// 得到读取的内容(流)
			InputStreamReader in = new InputStreamReader(urlConn.getInputStream());
			// 为输出创建BufferedReader
			BufferedReader buffer = new BufferedReader(in);
			String inputLine = null;
			// 使用循环来读取获得的数据
			while (((inputLine = buffer.readLine()) != null)) {
				// 我们在每一行后面加上一个"\n"来换行
				// resultData += inputLine + "\n";
			}
			// 关闭InputStreamReader
			in.close();
			// 关闭http连接
			urlConn.disconnect();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void HttpURLConnectionPost() {
		String httpUrl = "http://192.168.1.110:8080/httpget.jsp";
		// 获得的数据
		String resultData = "";
		URL url = null;
		try {
			// 构造一个URL对象
			url = new URL(httpUrl);
		}
		catch (MalformedURLException e) {
			// Log.e(DEBUG_TAG, "MalformedURLException");
		}
		if (url != null) {
			try {
				// 使用HttpURLConnection打开连接
				HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
				// 因为这个是post请求,设立需要设置为true
				urlConn.setDoOutput(true);
				urlConn.setDoInput(true);
				// 设置以POST方式
				urlConn.setRequestMethod("POST");
				// Post 请求不能使用缓存
				urlConn.setUseCaches(false);
				urlConn.setInstanceFollowRedirects(true);
				// 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
				urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				// 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
				// 要注意的是connection.getOutputStream会隐含的进行connect。
				urlConn.connect();
				// DataOutputStream流
				DataOutputStream out = new DataOutputStream(urlConn.getOutputStream());
				// 要上传的参数
				String content = "par=" + URLEncoder.encode("ABCDEFG", "gb2312");
				// 将要上传的内容写入流中
				out.writeBytes(content);
				// 刷新、关闭
				out.flush();
				out.close();
			}
			catch (IOException e) {

			}
		}
	}
}
