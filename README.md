## Table of Contents

* [Prerequisites](#prerequisites)
* [Setup](#setup)
* [Task 1](#task-1)
* [Task 2](#task-2)
* [Task 3](#task-3)

## Prerequisites
To start an app you need JDK in version at least 16

## Setup
To pull project on your local environment:
```
git clone https://github.com/Ryniek/dev-task
```
To run first task:
```
$ cd dev-task-1
$ javac DevTaskApplication.java
$ java DevTaskApplication
```
To run second task:
```
$ cd dev-task-2
$ javac DevTaskApplication.java
$ java DevTaskApplication
```
To run third task:
```
$ cd dev-task-3
$ javac DevTaskApplication.java
$ java DevTaskApplication
```

## Task 1
To solve this task I am using inbuilt Java methods to sort passed list of integers and fetch only distinct elements. To count elements of original and changed list I am using .length method and to get minimum and maximum element of the list I am fetching first and last element of sorted list.
## Task 2
In order to solve this task I decided to devide input numbers into two lists that first contains all numbers higher or equal to 7 and second list that contains numbers lower or equal to 6. After that for each element of one list I filter second list that sum of those two numbers gives 13 and then I am printing the result.
## Task 3
To check how many separated graphs are in input I am looping through the list of Pairs that contains two points connected with each other. I am comparing both points to the points we previously iterated through and checks if any of the points is the same as in the previous pairs. If yes then we know that this Pair belongs to the graph created before but if no then we know that this Pair is completely new graph and we can increase our counter of graphs.
