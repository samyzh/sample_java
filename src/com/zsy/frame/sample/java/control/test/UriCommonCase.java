package com.zsy.frame.sample.java.control.test;

import java.util.List;

import android.net.Uri;

/**
 * 得在Andorid环境下运行
 * @author samy
 */
public class UriCommonCase {

	public static void main(String[] args) {
		Uri uri = Uri.parse("content://com.zsy.frame.sample.java/diaries/1");
        List<String> list = uri.getPathSegments();
        for(int i=0;i<list.size();i++)
        System.out.print(list.get(i));
        System.out.println();
       
        String path = uri.getEncodedPath();
        System.out.println(path);
       
        path = uri.getLastPathSegment();
        System.out.println(path);
       
        path = uri.getAuthority();
        System.out.println(path);
       
        path = uri.getHost();
        System.out.println(path);
       
        path = uri.getScheme();
        System.out.println(path);
               
        path = uri.getPath();
        System.out.println(path); 

	}

}
