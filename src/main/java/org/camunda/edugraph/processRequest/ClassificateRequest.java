package org.camunda.edugraph.processRequest;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ClassificateRequest implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("Classificate-REQUESTS");
	public String result = "nein";
	public void execute(DelegateExecution execution) throws Exception {
	    LOGGER.info("ZZZZZ an dieser Stelle wird die DMN selbst klassifiziert");
	    
	    if(execution.getVariable("isChangeSerious")=="false"){
	    	this.result = "nein";
	    }
	    if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isChangeSerious")))==true){
	    	if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessTime"))) == true){
	    		if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessCost"))) == true){
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == true){
	    				this.result = "ja";
	    			}
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == false){
	    				this.result = "ja";
	    			}
	    		}
	    		if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessCost"))) == false){
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == true){
	    				this.result = "vielleicht";
	    			}
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == false){
	    				this.result = "nein";
	    			}
	    		}
	    	}
	    	if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessTime"))) == false){
	    		if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessCost"))) == true){
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == true){
	    				this.result = "ja";
	    			}
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == false){
	    				this.result = "vielleicht";
	    			}
	    		}
	    		if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isLessCost"))) == false){
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == true){
	    				this.result = "vielleicht";
	    			}
	    			if(Boolean.parseBoolean(String.valueOf(execution.getVariable("isMoreThanOne"))) == false){
	    				this.result = "nein";
	    			}
	    		}
	    	}
	    }
	    execution.setVariable("result", this.result);
	    LOGGER.info("ZZZZZ an dieser Stelle wird die DMN selbst klassifiziert, da es sich nicht implementieren lieﬂ."+execution.getVariable("isChangeSerious")+execution.getVariable("isLessTime")+execution.getVariable("isLessCost")+execution.getVariable("isMoreThanOne")+this.result);
	 }
}
