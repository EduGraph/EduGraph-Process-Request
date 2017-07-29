# EduGraph-Process-Request
#####CONTRIBUTERS##### 
   
Sebastian Kobiella  
Caroline Engel  
  
#####DESCRIPTION#####  
  
The process describes the story of the request from a customer of EduGraph. The customer sent a request via a form. 
This form handles the two big types of a request and brings the process to the right way. On the one hand is the "incident"- and on the other hand the "change"-Request.
The incident request goes at first to the first level Agent, who will try to solve the incident. If he can not solve the incident, the process automatically puts it through to the second Level Agent.
If he can not solve the incident, too, the customer gets an email with the state that the incident will be fixed in the next release by the developer.
Beside the incident request there is the change request, which will go directly to the second level agent. He will decide via a form some attributes. These will go into a dmn table. The output will be "yes", "no" or "maybe". This means at "yes", that the team will work on the change-request, "no" means that the team will not work on the change-request and "maybe" means that the boss needs to be asked before a decision can be made. Here the boss gets a form with all information the process has collected.
At the end, no matter which end, the customer gets always an email with the result.

#####STAKEHOLDER#####
  - Customer
  - First Level Agent
  - Second Level Agent
  - Chef (if required)
  - Developer (inside the CMMN(if required)) 
  
#####DEPENDENCIES#####
  - For the mail support:
    - groupId: org.apache.commons
	- artifactId: commons-email
	- version: 1.2
	
#####REQUIREMENTS#####
  - On the WebServer following library must be installed:
    - standard camunda-libraries
    - commons-email-1.2.jar
      - for mail services

#####RESSOURCES#####
  - BPMN
    - is described in the description
  - CMMN
    - describes the UserTask of the second level agent at controlling from a change-request
  - DMN
    - this decide if the change request would be applied, denied or send to the chef

#####JAVA-CLASSES#####
  - ClassificateRequest
    - The DMN could not be implemented by the team. But this class simulates a DMN Table. So the process will work completely
  - ProcessRequestApplication
    - Interface between Java and Camunda
  - many Email classes
    - every class is for sending an email to the customer
