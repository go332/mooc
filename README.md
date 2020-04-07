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
