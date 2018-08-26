package demo_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	
	private static Logger logger = LogManager.getLogger(log4jdemo.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		logger.info("information");
		logger.error("error");
		logger.fatal("fatal");
		logger.warn("warn");
		
		System.out.println("done");
	}

}
