package com.weh.hfshop.boot;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *	服务启动类
 * @author Mr.Wu
 *
 */
public class GoodsStarter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("商品服务启动。。。");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-dubbo-provider.xml",
				"classpath:applicationContext-dao.xml");
		context.start();
		System.err.println("商品服务启动成功！！！");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
