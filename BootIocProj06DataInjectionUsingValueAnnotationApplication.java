package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class BootIocProj06DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj06DataInjectionUsingValueAnnotationApplication.class, args);
		PatientInfo info=ctx.getBean("pInfo",PatientInfo.class);
		System.out.println(info);
		((ConfigurableApplicationContext)ctx).close();
	}
}
