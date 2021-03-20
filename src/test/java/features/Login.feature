 Feature: Validate Techfios Login Functionality 

Background: 
	Given User is on the Techfios Page        
	
@smoke
Scenario Outline:  User should be able to Login with valid credentials 
	When User enters username as "demo@techfios.com"       
	When User enters password as "abc123"     
	When User clicks on sign in button  
	Then User should land on Dashboard Page  
 Then User clicks on bank and cash    
 Then User clicks on new account   
 When User fill up the form entering "<accountTitle>"and "<description>"and "<initialBalance>"and "<accountNumber>"and "<contactPerson>"and "<phone>"   
 Then User click in Submit Button 
    Then User Should land on Account Page  
    
  Examples: 
  |accountTitle  | description |initialBalance | accountNumber | contactPerson | phone |
  | Expense     |Savings      |    4500     |     a12345     |      SeemaKhan     |12345   |
	 