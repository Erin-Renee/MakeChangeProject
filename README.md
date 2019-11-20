#### MakeChangeProject#### 

### Overview
The Cash Register application will read the price of the item, intake the amount
tendered by the customer, and then calculate change rendered depending on the amount the customer has given.
 In addition to telling the change needing to be rendered to the customer, the program also tells the cashier
 what bills and specific coins to return to the customer.
 ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) The program is written in a way that
 it will choose the largest dollars and coins before it will render smaller coins.
The user or cashier is prompted asking for the price of the item.  The user/cashier is then prompted asking
how much money was provided by the customer. If the customer does not give enough money, an error message
will be displayed. If the customer provides the exact amount, the system will print a message saying 0.00 due,
 and a thank you for your purchase. If the amount provided by the customer is more
than the cost of the item, the program will display a message with the number of
bills and coins that the cashier should be give to the customer.
### Concepts
If/else statements were used to compare the
variables tender and price.
i inputted a Scanner to enable input from the user
I used System.out.println(); to print messages to the user
I used separate methods from the main method for different parts of the code.

### Technology Used
Atom
Eclipse
Github
Macbook Pro

### Lessons Learned
I learned that once i wrote the code, I needed to adjust my code and try some
different techniques we have learned in order to find a solution that met all
of the requirements.
I first used double for my numbers and I got errors when getting the proper
change. I then decided to multiply them by 100 so there would only be integers.
I could run my code then convert the numbers back by dividing by 100.
I then used while loop to have the program run the code that delivers the
change. I wanted the register to dispense the largest form of currency first
before moving on to the smaller currencies. 
