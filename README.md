# Employee Salary

In this example, we are attempting to organize a group of classes with different abilities using an inheritance hierarchy. We aim to identify more specialized classes among them and categorize them into different levels of work. This enables differentiation between classes and, consequently, provides objects with distinct capabilities. The following steps outline the process:

In the first step, we establish the classes into an inheritance hierarchy. As outlined in the problem description, we identify three classes: Hourly Employee, Salaried Employee, and Manager. To express the commonality among them, we introduce a superclass called Employee.

Next, in step two, we determine the common responsibilities of the classes. For each employee, we need to print their name, read the number of hours worked from the keyboard, and compute the wages due for those hours. Hence, we conclude that the Employee superclass should be responsible for obtaining the name and calculating the wages due for a given number of hours.

In step three, we decide which methods are implemented differently in subclasses from their superclass(es). This is essential to accommodate the different levels of work within the hierarchy.

Step four involves identifying instance variables specific to each class.

Step five consists of implementing constructors and methods containing the public interface. 

Lastly, in step six, we utilize a Tester class to process objects. This allows us to handle and test the functionality of the objects created from the defined classes.
