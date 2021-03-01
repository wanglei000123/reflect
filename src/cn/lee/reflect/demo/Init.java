package cn.lee.reflect.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//初始化配置文件
public class Init {
	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File("fruit.properties");
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("apple", "cn.lee.reflect.demo.Apple");
			pro.setProperty("orange", "cn.lee.reflect.demo.Orange");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}
