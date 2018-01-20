package com.demo.jee.runner;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.demo.jee.data.DataInitializer;

@WebListener
public class TestDataRunner implements ServletContextListener {

	@EJB
	private DataInitializer dataInitializer;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		dataInitializer.persistDataSample();
	}
}
