package com.zsy.frame.sample.java.control.net.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 *  使用Apache提供的HttpClient接口同样可以进行HTTP操作。
 *  http://hc.apache.org/downloads.cgi jar包下载
 * @description：
 * @author samy
 * @date 2015年12月4日 上午10:28:03
 */
public class HttpClientUtils {

	private void HttpClientGet() {
		// http地址
		String httpUrl = "http://192.168.1.110:8080/httpget.jsp?par=HttpClient_android_Get";
		// HttpGet连接对象
		HttpGet httpRequest = new HttpGet(httpUrl);
		// 取得HttpClient对象
		DefaultHttpClient httpclient = new DefaultHttpClient();
		// 请求HttpClient，取得HttpResponse
		try {
			HttpResponse httpResponse = httpclient.execute(httpRequest);
			// 请求成功
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				// 取得返回的字符串
				String strResult = EntityUtils.toString(httpResponse.getEntity());
				// mTextView.setText(strResult);
			}
			else {
				// mTextView.setText("请求错误!");
			}
		}
		catch (ClientProtocolException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 *  
	 *  使用POST方法进行参数传递时，需要使用NameValuePair来保存要传递的参数。另外，还需要设置所使用的字符集。
	 * @description：
	 * @author samy
	 * @date 2015年12月4日 上午10:28:41
	 */
	private void HttpClientPost() {
		// http地址
		String httpUrl = "http://192.168.1.110:8080/httpget.jsp";
		// HttpPost连接对象
		HttpPost httpRequest = new HttpPost(httpUrl);
		// 使用NameValuePair来保存要传递的Post参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		// 添加要传递的参数
		params.add(new BasicNameValuePair("par", "HttpClient_android_Post"));
		try {
			// 设置字符集
			HttpEntity httpentity = new UrlEncodedFormEntity(params, "gb2312");
			// 请求httpRequest
			httpRequest.setEntity(httpentity);
			// 取得默认的HttpClient
			DefaultHttpClient httpclient = new DefaultHttpClient();
			// 取得HttpResponse
			HttpResponse httpResponse = httpclient.execute(httpRequest);
			// HttpStatus.SC_OK表示连接成功
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				// 取得返回的字符串
				String strResult = EntityUtils.toString(httpResponse.getEntity());
				// mTextView.setText(strResult);
			}
			else {
				// mTextView.setText("请求错误!");
			}
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch (ClientProtocolException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
