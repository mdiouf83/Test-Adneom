package test.technique.adneom;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import test.technique.adneom.service.IAdneomPartition;
import test.technique.adneom.service.impl.AdneomPartition;
import test.technique.adneom.util.AdneomUtils;

@SpringBootApplication
public class AdneomApplication {

	private static final Log LOG = LogFactory.getLog(AdneomApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdneomApplication.class, args);

		if (args == null || args.length == 0) {
			LOG.info("The input parameters are empty");
			return;
		} else if (args.length != 2) {
			LOG.info("The number of input parameters must be 2");
			return;
		} else if (!AdneomUtils.isStringInt(args[1])) {
			LOG.info("The second input parameter is not a integer value");
			return;
		} else if (Integer.valueOf(args[1]).intValue() <= 0) {
			LOG.info("The second input parameter must not equal 0 or be negative");
			return;
		}

		// call the partition function
		IAdneomPartition adneomPartition = new AdneomPartition();
		LOG.info(adneomPartition.partition(Arrays.asList(args[0].split(",")), Integer.valueOf(args[1]).intValue()));
	}

}
