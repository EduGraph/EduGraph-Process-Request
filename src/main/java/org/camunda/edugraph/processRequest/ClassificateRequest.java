package org.camunda.edugraph.processRequest;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ClassificateRequest implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("Classificate-REQUESTS");

	  public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("ZZZZZ an dieser Stelle wird die Anfragenart klassifiziert. In unserem Fall: " + execution.getVariable("customerRequest"));
	  }
}
