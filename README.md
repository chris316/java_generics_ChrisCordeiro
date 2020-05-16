final exam generics repository

Code pretty much creates a generic interface that takes in two generic types and has two methods to get key and value

The MyGenClass implements the generic interface from before and contains a constructor that initializes the attribues for key and value, and then implments code to run the get key and value methods inherited from the interface

The MyRegularClass is a regular java class that has a method that utilizes generics. It takes in two generic types named int 1 and 2 and then returns int 1.

The main class pretty much instantiates two objects of the generic interface and initializes them to the MyGenClass instance with passed in values. The first one has an integer and string, second one has two integers. Then there are two other instantiated objects, the first being an integer i1 that is initializes to the regular class with two integers as parameters. The second is a float f1 that is initialized to the regular class with two floats. Lastly, the main just prints the data on separate lines
