package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class SpelProjectApplication {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		//expression string is a string literal denoted by the surrounding single quotes. 
			Expression exp = parser.parseExpression("'Hello World'");
			String message = (String)exp.getValue();
			SpringApplication.run(SpelProjectApplication.class, args);
	}

}
