# policyExpertAutomation
This file gives an overview of what this project does and how to execute these tests
The project is designed by making use of Core java Concepts
The Locators Class helps us to identify the pageElements using xpath
The HomePageActions class has got all the necessary methods to perform various User actions to fill the Customer details to get a Home Insurance Quote on the PolicyExpert WebPage
I've provided the testdata under TestData class. If needed, I can also create a BDD framework to pass the input data via Feature file
The ElementActions has got the generic methods to assist the HomePageActions in performing various User operations
The HomeTest class has got the actual Test scenarios to perform below actions:
fillCustomerDetailsWithDualOccupation
fillCustomerDetailsWithSingleOccupation
validateContactDetails
This makes use of the methods in HomePageActions to perform various Operations and Validate the behavior