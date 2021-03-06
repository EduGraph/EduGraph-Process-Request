package org.camunda.edugraph.processRequest;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Execution;


	  
	  public class SendChangeDeny implements JavaDelegate{
		  
		  public void execute(DelegateExecution arg0) throws Exception {
			  SimpleEmail email = new SimpleEmail();
			  email.setHostName("smtp.gmail.com");
			  email.setSmtpPort(587);
			  email.setAuthenticator(new DefaultAuthenticator("edugraph.process.request", "edugraph"));
			  email.setTLS(true);
			  email.addTo((String) arg0.getVariable("customerEmail"));
			  email.setFrom("edugraph.process.request@gmail.com", "Edugraph Process Request");
			  email.setSubject("Edugraph Anfrage wurde bearbeitet");
			  email.setMsg("Guten Tag "+ arg0.getVariable("customerName")+", Es tut uns Leid Ihnen mitteilen zu m�ssen, dass die " + arg0.getVariable("customerRequest") + "-Anfrage leider vom Team abgew�hlt wurde.");
			  email.send();
		  }
	  }
