package org.camunda.edugraph.processRequest;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendMailToCustomer implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("Processing request by '" + execution.getVariable("customerName") + "'...");
	  }
}
