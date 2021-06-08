package oda.operators;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import io.javaoperatorsdk.operator.Operator;
import io.javaoperatorsdk.operator.api.config.ConfigurationService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class QuarkusOperator implements QuarkusApplication {  
    private static final Logger logger = Logger.getLogger(QuarkusOperator.class);
    
    @Inject Operator operator;
  
    @Inject ConfigurationService configuration;
  
    public static void main(String... args) {
      Quarkus.run(QuarkusOperator.class, args);
    }
  
    @Override
    public int run(String... args) throws Exception {

        logger.info("Starting up Operator");
        operator.start();
        Quarkus.waitForExit();        
        logger.info("Exiting Operator");
        return 0;
    }
}
