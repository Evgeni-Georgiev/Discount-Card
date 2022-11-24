# Discount cards
A market store offers its clients three different types of discount cards: bronze, silver, and gold. Each
card stores information about its owner, the turnover for the previous month, and the initial discount
rate. With each card, you can calculate the discount on the current purchase. In general, this is done
using the formula: value_of_purchase * discount_rate. <br>
The bronze card comes with no discount rate if the turnover for the previous month is below $100. If
it is between $100 and $300, the discount rate is 1%. And if it is above $300, the rate is 2.5%. <br>
The silver card comes with an initial discount rate of 2%. In case, the turnover is over $300, the rate
is 3.5%. <br>
The gold card comes with an initial discount rate of 2%. The discount rate grows 1% for each $100
from the turnover, capping at 10%. <br>
Task is:
* to write an object-oriented model of this market store system;
