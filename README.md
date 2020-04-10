# mooc notes  https://www.mooc.fi/en
The Integer.valueOf command converts a string to an integer. It takes the string containing the value to be converted as a parameter.

String valueAsString = "42";
int value = Integer.valueOf(valueAsString);

System.out.println(value);

Same thing for doubles and booleans.

--------------------
Practice a bit with boolean variables.
---------------------
Ending a Loop//continue a loop
The loop statement can be broken out of with command 'break'. When a computer executes the command 'break', the program execution moves onto the next command following the loop block.
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Input positive numbers.");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break;
    }

    if (number < 0) {
        System.out.println("Unfit number! Try again.");
        continue;
    }

    System.out.println("Your input was " + number);
}
----------------------------------------
 the computation executed after the loop has ended has been implemented inside of the loop: This approach is not recommended as it can easily lead to very complex program structure.
Scanner reader = new Scanner(System.in);

// Create variables needed for the loop

while (true) {
    // read input

    // end the loop -- break

    // check for invalid input -- continue

    // handle valid input
}

// functionality to execute after the loop ends
In other words, the program structure is cleaner if the things to be done after the loop ends are placed outside of it.
------------------------------
Execution of Method Calls and the Call Stack
How does the computer remember where to return after the execution of a method?

The environment that executes Java source code keeps track of the method being executed in the call stack. The call stack contains frames, each of which includes information about a specific method's internal variables and their values. When a method is called, a new frame containing its variables is created in the call stack. When the execution of a method ends, the frame relating to a method is removed from the call stack, which leads to execution resuming at the previous method of the stack.
------------------------------
Lists, among practically all the variables that can store large amounts of information, are reference-type variables. This means that the value of the variable is a reference that points to the location that contains the information.

(When a list (or any reference-type variable) is copied for a method's use, the method receives the value of the list variable, i.e., a reference. In such a case the method receives a reference to the real value of a reference-type variable, and the method is able to modify the value of the original reference type variable, such as a list. In practice, the list that the method receives as a parameter is the same list that is used in the program that calls the method.)

If the list contains integers, you cannot remove a number value by giving an int type parameter to the remove method. This would remove the number from the index that the parameter indicates, instead of an element on the list that has the same value as the parameter. To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf method of the Integer class.
----------------------------------
Indices and the structure of the memory
Every programmer should know a bit about the structure of the memory used by a computer program. Each variable — let it be primitive or reference type — is saved in the memory. Each variable has size i.e. a defined number of bits (zeros and ones) it takes in the memory. The value of the variable is also represented in bits.

The reference of the array object is actually information about the location of the data. By stating array[0] we're referring to the first element of the array. The statement array[0] can also be read "Go to the beginning of the array and move forward 0 times the size of the variable contained in the array — and return a chunk of data the size of the variable.

The size of an int variable in java is 32 bits. One bit is reserved for the sign, so the largest possible number to present in int is 231-1. When you create an int array of 4 elements, 4 * 32 bits of memory is allocated to hold the integers. When you access array[2], 32 bits are read starting from beginning of the array + 2 * 32 bits.
Some programming languages try to make sure that the programmer doesn't go "in the wrong area". If java didn't cause the exception when we say array[-1], we would find the data located just before the array in the memory of the program. In such case there wouldn't be anything preventing us from writing a program reading the whole memory reserved for the program.

---------------------------
Splitting a String
You can split a string to multiple pieces with the split-method of the String class. The method takes as a parameter a string denoting the place around which the string should be split. The split method returns an array of the resulting sub-parts. In the example below, the string has been split around a space
