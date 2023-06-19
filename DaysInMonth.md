# Days in Month report
Author: Nick Nikolov

## UML class diagram
```plantuml
@startuml

+class Days{

+{static} howManyDaysInMonth(m : int) : int
-Days(): void
}

interface ActionListener{
}

+class MonthGUI {
-inputField : JTextField
-display : JTextArea

+MonthGUI (title: String) 
+actionPerformed(ae : ActionEvent) : void
+{static} main(args: String[]) : void

}

class MonthGUI implements ActionListener
MonthGUI --> Days : uses
@enduml
```


## Execution and Testing

**Testing `Days` class**

This screenshot shows successful execution of the DaysTester file

![Example screenshot](DaysTesterOutput.png)

This screenshot shows the UML diagram of the Days application 

![Example screenshot](DaysUML.png)


**Days in Month GUI Usage**

![Example screenshot](MonthGUI.png)

Input the number of the month between 1 to 12 inclusive (1 = January, 12 = December)
hit the enter key on the keyboard

The screen will output the number of days in the month that you input

To enter another month, delete the previous number you input, and input another number between 1 - 12, press enter when ready
