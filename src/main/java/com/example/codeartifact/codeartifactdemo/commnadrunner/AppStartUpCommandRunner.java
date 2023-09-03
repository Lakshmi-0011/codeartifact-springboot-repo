package com.example.codeartifact.codeartifactdemo.commnadrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.test.codeartifact.util.DateUtil;

@Component
public class AppStartUpCommandRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Today Date: " + DateUtil.getTodayDate());
		
	}

}
