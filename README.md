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

I initially wrote the application in Ruby and then translated it to Java.  The classes used in both languages are the same.  

The classes are:

- Rover: It holds the Rover position and direction.
- Plateau: It holds the upper right coordinates (the bounds) of the Plateau.
- Direction: It is an abstract class that changes the direction and moves of the rover per its current direction and position.
- Manager: It acts as a driver, moving the rover per the directions provided in the input.
- RoverMain: It contains the main method to launch the application

Assumptions:

- The rover could not go beyond the bounds of the plateau.
- The application uses coordinates on a rectangular plateau.
- Rover #2 does not move until Rover #1 has stopped moving -- so there is no bumping.

If time had allowed:

- Add unit tests with JUnit
- Add more error handling for incorrect input
- Add visualization in which one can see the rover move on a plateau in the command line



## How to Run

For all directions, please use a Linux or Apple OS X computer.

#### Application

###### Step 1: Compile


In the command line, open the src directory and run:

```
/usr/bin/javac RoverMain.java Rover.java
```

###### Step 2: Run with provided input

In the command line, make sure you are inside of the src folder and run:

```
java RoverMain input.txt  
```

#### Testing Script

###### Step 1: Make testing-script executable

The script assumes your javac compiler is at /user/bin/javac. 

Because the submission instructions asked for no executable files, you will need to make the test-script file executable. To do so, run the following command in the src directory:

```
chmod +x test/test-script
```

###### Step 2: Run

In the command line, make sure you are inside the src folder and run:

```
test/test-script 
```
