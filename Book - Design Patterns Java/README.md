﻿﻿﻿﻿﻿﻿﻿![BAIME banner](https://user-images.githubusercontent.com/47600826/89530907-9b3f6480-d7ef-11ea-9849-27617f6025cf.png)

# Head first design patterns

In this repo I'll store all my notes regarding the book [Head First Design Patterns](https://www.bol.com/nl/f/head-first-design-patterns/34499843/).  
As this book is written for JAVA (or C++) programming, I'll try to convert some of the solutions for Python users as well. 
See how this plays out! 


Should you have anything to add or to comment, let me know via [email](renate@baime.nl) or connect via [Linkedin](https://www.linkedin.com/in/renatevankempen/)


Kind regards, 

Renate van Kempen


## What if we could create a code that would never needed to be changed again? 

Wauw, that sounds really good, is that even possible? As there is one constant whenever you are making a code:  **CHANGE!!**

_There will always be:_ 
- A new situation
- New functionalities needed
- A different approach for the problem
- An update or upgrade in software
- ….. and much much more change!  


### _**Design principle**_
_**Identify the aspects of your application that vary and separate them from what stays the same.**_

This is not only applicable for JAVA code, but also for Python and even Power BI dashboards data or Power Apps design.

#### Example in Power BI
For example in a Power BI dashboard, if you are working with different SQL tables of which only one table will be changed several times per day, you want to import all static tables and only directquery (= direct connect) with that table that will be changed so often. This will enhance your performance drastically. 

### _**Design principle**_
_**Program to an interface not an implementation**_






