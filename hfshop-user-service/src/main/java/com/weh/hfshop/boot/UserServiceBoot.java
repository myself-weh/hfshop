package com.weh.hfshop.boot;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceBoot {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("启动用户服务");
		new ClassPathXmlApplicationContext("classpath:applicationContext-dubbo-provider.xml",
				"classpath:applicationContext-dao.xml");
		System.out.println("启动用户完成，可以开始调用服务");
		// 进行阻塞
		System.in.read();
		
	}
}
