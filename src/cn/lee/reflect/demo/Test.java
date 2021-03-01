package cn.lee.reflect.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import cn.lee.test.Sub;

public class Test {
	public static void main(String[] a) throws FileNotFoundException, IOException {

		/*
		 * 没有配置文件的时候
		 */
/*		Fruit f = Factory.getInstance("cn.lee.reflect.demo.Apple");
		if (f != null) {
			f.eat();
		}*/

		/*
		 * 有配置文件的时候
		 */
/*		Properties pro = Init.getPro();
		Fruit f = Factory.getInstance(pro.getProperty("apple"));
		if (f != null) {
			f.eat();
		}*/

		 System.out.println(Sub.B); 
	}
}




