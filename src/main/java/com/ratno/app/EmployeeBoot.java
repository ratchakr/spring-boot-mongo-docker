/**
 * 
 */
package com.ratno.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author eratnch
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class EmployeeBoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmployeeBoot.class);
	}

}
