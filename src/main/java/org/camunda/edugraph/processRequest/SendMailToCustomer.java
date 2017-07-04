package org.camunda.edugraph.processRequest;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendMailToCustomer implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("PROCESS-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("ZZZZZ An dieser Stelle wird eine Email an: '" + execution.getVariable("customerEmail") + "' von " + execution.getVariable("customerName") + " gesendet");
	  }
}
