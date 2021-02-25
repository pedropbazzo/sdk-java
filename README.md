
## Introduction ##

This **Java** library allows for easy integration with the **maxiPago! Smart Payments** API. Our payment platform allows online merchants to accept payments in many countries in Latin America, and the US, and includes such functionalities as Automated Recurring Billing, "Single-Click" payments, Online Returns, Credit Card Payment Reconciliation, Fraud Tools and more. You can find out more about **maxiPago!** by visiting [www.maxipago.com](http://www.maxipago.com/).

This library has all the functionalities currently available through our XML-based API and can be freely copied and used by Merchants and developers.

You can get a more comprehensive view of our API by our documentation, [which can be downloaded here](http://www.maxipago.com/docs/maxiPago_API_Latest.pdf). If you are looking for a hosted payment page solution, please see the section "smartPages!".


## Setup ##

Setup is pretty straightforward: simply download the [maxiPago.jar](http://www.maxipago.com/docs/maxiPago.jar.zip) file, copy it to your server and import it.

To import use the following code:

```java
		import maxiPago.DataContract.ResponseBase;
		import maxiPago.Gateway.Transaction; 
		import maxiPago.DataContract.Transactional.TransactionResponse;
```

## Environment and Credentials ##

In order to send requests you will need valid Merchant Credentials. They can be obtained with our Customer Support team at support [@] maxipago [.] com.

**maxiPago!** provides a fully functional sandbox environment to simulate the transaction responses. You need to set the environment so the library knows where to send the transaction to.

The environment can be set using:

```java
		transaction.setEnvironment("TEST")
		transaction.setEnvironment("LIVE")
```

You also need to provide your Merchant Credentials, which is done by adding the **merchantId** and **merchantKey** fields in each request made.


## Available transaction types ##

* **Authorization:** checks if the credit card used is valid (number, security code and expiration date) and if the card holder has sufficient funds for that purchase.

* **Capture:** confirms the authorization previously made and completes the transaction. If the transaction is never captured the Merchant does not receive the funds and the Card Holder is never charged.

>*Separating the authorization and capture in two different moments is an excellent way to check if you have the purchased items in stock or to run a fraud check, while still guaranteeing payment.*

* **Sale:** combines the authorization and the capture in a single request. When performing a Sale we send the credit card for authorization and immediately captures that transaction, if approved.

* **Void:** cancels the transaction and no money is charged from the buyer. You can only void a transaction until 11:59pm of the day of capture.

* **Return:** reverses a credit card transaction, taking funds from the Merchant and giving them back to the buyer. This is a financial operation that might take a few days to be completed, depending on your credit card processor.

* **Recurring:** schedules a credit card transaction to be charged at a specific interval, defined by the Merchant.

* **Card On File:** saves a card in our system and returns a unique token, which can be used to process future transactions. **This allows the implementation of "single-click" payments.**

* **Boleto:** *(Brazil only)* Transactions made with Boletos are different than credit card purchases. This creates a boleto and returns an URL to the buyer to access the boleto payment slip. It can be accessed at any time before the boleto expiration and up to 60 days after it has expired.


## Available methods ##

This is the complete list of actions that can be executed using this library

#####Credit Card Transactions#####
* Authorization
* Capture
* Sale (Authorization + Capture)
* Token Authorization (Authorization with saved card) 
* Token Sale (Sale with saved card)
* Automatically save card 
* Void
* Refund
 
#####Recurring Transactions#####
* Create recurring credit card billing 
 
#####Boleto Transactions#####
* Create boleto payment slip (Brazil only)

#####Reports#####
* Query one single transaction 
* Query a list of transactions 
* Flip through pages of a transaction list 
* Query a pending report 

#####Customer Profile / Card On File#####
* Create a profile *(a customer profile must be created before saving a card)*
* Update a profile 
* Remove a profile 
* Add a credit card
* Remove a credit card


## Requests ##

You can find examples of each individual request type in this repository. If you have questions about the requests or responses received, [please see our documentation](http://www.maxipago.com/docs/maxiPago_API_Latest.pdf). You can also contact our Support Team if you'd like.


## Support ##

Our support team is happy to help you with any questions you might have, be it about the functionalities of our platform or about payments in general. They are available to customers and non-customers alike and can be reached at support [@] maxipago [.] com.

## License ##

Library for integration with the **maxiPago! Payment Gateway**     
**_Copyright (C) 2013, maxiPago!_**        
                                                                      
This program is free software: you can redistribute it and/or modify  it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.                                   
                                                                      
This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.                          
                                                                      
You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>. 
