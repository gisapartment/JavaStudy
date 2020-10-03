package com.gisapartment.java.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 注释教程对应的代码实现,可以在{@link HelloGISApartment} 类构造 Description 对象来调用 run 方法，
 * 也可以在这个类加 Main 方法来执行
 *
 * @author www.gisapartment.com
 * Copyright © www.gisapartment.com
 */
public class Description {

	/**
	 * @see String
	 */
	private String message;

	public Description() {
		this.message = "Description Code";//  初始化 message 对象
	}

	/**
	 * @deprecated 没意义
	 */
	public void run() {
		System.out.println(this.message);
	}

	/**
	 * @param filePath 要读取的文件路径
	 * @return 返回读取文件是否成功，true 成功，抛异常则失败
	 * @throws IOException
	 * @version 1.0
	 * @author www.gisapartment.com
	 * @author www.kuwancode.com
	 * @since 1.0
	 */
	public boolean readFile(String filePath) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("filePath"));
		String str;
		while ((str = in.readLine()) != null) {
			System.out.println(str);
		}
		return true;
	}
}
