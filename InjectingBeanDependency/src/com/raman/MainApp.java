package com.raman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(TextEditorConfig.class);
		      TextEditor te = ctx.getBean(TextEditor.class);
		      te.spellCheck();
	}

}
