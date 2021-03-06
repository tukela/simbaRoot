package com.simba.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Jetty {

	public static void main(String[] args) throws Exception {
		Server server = buildNormalServer(8000, "/simba");
		server.start();
	}

	/**
	 * 创建用于正常运行调试的Jetty Server, 以src/main/webapp为Web应用目录.
	 */
	public static Server buildNormalServer(int port, String contextPath) {
		Server server = new Server(port);
		WebAppContext webContext = new WebAppContext("src/main/webapp", contextPath);
		webContext.setClassLoader(Thread.currentThread().getContextClassLoader());
		webContext.setConfigurationDiscovered(true);
		webContext.setDefaultsDescriptor("./webdefault.xml");
		server.setHandler(webContext);
		server.setStopAtShutdown(true);
		return server;
	}
}
