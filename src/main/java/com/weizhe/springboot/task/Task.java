package com.weizhe.springboot.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Task {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// @Scheduled(fixedRate=5000)
	public void test() {
		System.out.println("当前时间：" + dateFormat.format(new Date()));
	}

}
