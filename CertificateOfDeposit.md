# Days in Month report
Author: Nick Nikolov

## UML class diagram
```plantuml
@startuml
+class BankCD{

~principal : double
~rate : double
~years : double

+BankCD()
+BankCD(p : double, r : double, y : double)
+calcYearly(p : double, r : double, y : double) : double
+calcDaily(p : double, r : double, y : double) : double

}

+class BankCDApp {
-bank : BankCD
-cli : InteractiveCLI

+BankCDApp()
+run() : void
+{static} main(args : String[]) : void

}

+class InteractiveCLI {

-reader : Scanner
+InteractiveCLI()
+getKeyboardInteger() : int
+getKeyboardDouble() : double
+prompt(s : String) : void
+display(s : String) : void




}

BankCDApp *-- BankCD : has-a
BankCDApp *-- InteractiveCLI : has-a



@enduml

```



## Execution and Testing
This screenshot shows successful execution and test of the BankCDApp

![Example screenshot](BankCDOutput.png)

This screenshot shows the BankCDApp UML diagram

![Example screenshot](BankCDUML.png)

# Reflection
I liked that the goal of the assignment was clear, I understood the problem and the purpose of solving it. Easy to visualize real world examples. The most challenging part was I kept getting a nullpointer error in the BankCDApp.java file. I didn't realize I had to create a new BankCD object, since I thought the first line "private BankCD bank;" would initialize a BankCD object. After initializing the object, everything was simple.
