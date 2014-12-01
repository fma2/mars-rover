mars-rover-java
==========

#### Problem: Mars Rovers
 
A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
 
A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
 
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.
 
Assume that the square directly North from (x, y) is (x, y+1).
 
INPUT:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.
 
The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau.
 
The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation.
 
Each rover will be finished sequentially, which means that the second rover won't start to move until the first one has finished moving.
 
OUTPUT:

The output for each rover should be its final co-ordinates and heading.

#### Language Used: Java


#### Description of Design & Assumptions: 

The classes are:

- Rover: It holds the rover position.
- Plateau: It holds the upper right coordinates (the bounds) of the Plateau.
- Position: It stores and manipulates the position of the rover.
- Program: It contains the main method to launch the application

There is also Direction enum with compass directions (values of NORTH, SOUTH, EAST, WEST).


Assumptions:

- The rover could not go beyond the bounds of the plateau.
- The application uses coordinates on a rectangular plateau.
- Rover #2 does not move until Rover #1 has stopped moving -- so there is no bumping.
- Rover #2 knows nothing about Rover #1.  If Rover #2 has the same end position as Rover #1, it is as if Rover #1 is not presently there.

If time had allowed:

- Add more error handling for incorrect input
- Add visualization in which one can see the rover move on a plateau in the command line
- Add more input files to run rover

## How to Run

For all directions, please use a Linux or Apple OS X computer.

There are three options for running:

1.  Application only
2.  Tests only
3.  Application and Tests

#### Option #1: Application only

###### Step 1: Compile

In the command line, open the src directory and run:

```
javac main/Program.java main/Position.java main/Direction.java main/Plateau.
java main/Rover.java
```

###### Step 2: Run with provided input

In the command line, make sure you are inside of the src folder and run:

```
java main.Program input.txt
```

#### Option #2: Tests only

###### Step 1: Download JUNIT

For this application, JUnit was used for testing.  In order to run the tests, you will need to download [junit.jar](https://github.com/junit-team/junit/wiki/Download-and-Install) and [hamcrest-core.jar](https://github.com/junit-team/junit/wiki/Download-and-Install), if you do not have them already. 

###### Step 2: Set JUNIT environment

Assuming you have stored the jar files in a JUNIT folder, in the command line, open the src directory and run:

```
export JUNIT_HOME=/Library/JUNIT
```
Reference: [http://www.tutorialspoint.com/junit/junit_environment_setup.htm](http://www.tutorialspoint.com/junit/junit_environment_setup.htm)

###### Step 3: Set CLASSPATH varriable

Assuming you have stored the jar files in a JUNIT folder and downloaded junit-4.11.jar and hamcrest-core-1.3.jar, set the CLASSPATH variable to point to the JUNIT jars location.

```
export CLASSPATH=$CLASSPATH:$JUNIT_HOME/junit-4.11.jar:$JUNIT_HOME/hamcrest-core-1.3.jar
```
###### Step 4: Compile 

Make sure you are in the src directory, and run the following in the command line:

```
javac test/DirectionTest.java test/PlateauTest.java test/PositionTest.java test/RoverTest.java test/AllTests.java test/TestRunner.java
```

###### Step 5: Run Tests

Again, make sure you are in the src directory, and run the following in the command line:

```
java test.TestRunner
```


#### Option #3: Application + Tests

###### Step 1: Download JUNIT

For this application, JUnit was used for testing.  In order to run the tests, you will need to download [junit.jar](https://github.com/junit-team/junit/wiki/Download-and-Install) and [hamcrest-core.jar](https://github.com/junit-team/junit/wiki/Download-and-Install), if you do not have them already. 

###### Step 2: Set JUNIT environment

Assuming you have stored the jar files in a JUNIT folder, in the command line, open the src directory and run:

```
export JUNIT_HOME=/Library/JUNIT
```
Reference: [http://www.tutorialspoint.com/junit/junit_environment_setup.htm](http://www.tutorialspoint.com/junit/junit_environment_setup.htm)

###### Step 3: Set CLASSPATH varriable

Assuming you have stored the jar files in a JUNIT folder and downloaded junit-4.11.jar and hamcrest-core-1.3.jar, set the CLASSPATH variable to point to the JUNIT jars location.

```
export CLASSPATH=$CLASSPATH:$JUNIT_HOME/junit-4.11.jar:$JUNIT_HOME/hamcrest-core-1.3.jar
```

###### Step 4: Compile 

Make sure you are in the src directory, and run the following in the command line:

```
javac test/DirectionTest.java test/PlateauTest.java test/PositionTest.java test/RoverTest.java test/AllTests.java test/TestRunner.java main/Direction.java main/Plateau.java main/Position.java main/Program.java main/Rover.java
```

###### Step 5: Run Application

Again, make sure you are in the src directory, and run the following in the command line:

```
java main.Program input.txt
```

```
java test.TestRunner
```
