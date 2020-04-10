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
´´´´´´´´´´´´´´´´´´´´
If the list contains integers, you cannot remove a number value by giving an int type parameter to the remove method. This would remove the number from the index that the parameter indicates, instead of an element on the list that has the same value as the parameter. To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf method of the Integer class.
