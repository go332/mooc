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
