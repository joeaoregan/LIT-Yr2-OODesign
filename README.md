# Object Oriented Design
## BSc Computing (Games Design and Development)

![LIT](https://img.shields.io/badge/Limerick%20Institute%20of%20Technology-2015-red?style=flat-square&logo=data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+CjwhLS0gQ3JlYXRlZCB3aXRoIElua3NjYXBlIChodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy8pIC0tPgoKPHN2ZwogICB3aWR0aD0iNTYuMzI5OTQ4bW0iCiAgIGhlaWdodD0iNTYuODY3NzgzbW0iCiAgIHZpZXdCb3g9IjAgMCA1Ni4zMjk5NDggNTYuODY3NzgzIgogICB2ZXJzaW9uPSIxLjEiCiAgIGlkPSJzdmcxIgogICB4bWw6c3BhY2U9InByZXNlcnZlIgogICB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciCiAgIHhtbG5zOnN2Zz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxkZWZzCiAgICAgaWQ9ImRlZnMxIiAvPjxnCiAgICAgaWQ9ImxheWVyMSIKICAgICB0cmFuc2Zvcm09InRyYW5zbGF0ZSgtMTAwLjgwNjE2LC0xMTEuMDAxNTMpIj48cGF0aAogICAgICAgZD0ibSAxMjMuMzIyMzgsMTExLjYxNTU4IGMgMy43MDQxNiwtMC43NjcyOSA3LjUxNDE2LC0wLjgyMDIxIDExLjI0NDc5LC0wLjEzMjI5IGwgLTIuMzU0NzksMTIuNDYxODcgYyAtMC45NTI1LC0wLjE4NTIgLTEuOTMxNDYsLTAuMjY0NTggLTIuOTEwNDIsLTAuMjY0NTggLTUuNzY3OTIsMCAtMTEuMDU5NTgsMy4xMjIwOCAtMTMuODM3NzEsOC4xNDkxNyBsIC00LjE4MDQyLC0yLjI3NTQyIGMgMi44ODM5NiwtNS4yMTIyOSA3Ljg1ODEzLC04LjkxNjQ2IDEzLjcwNTQyLC0xMC4xODY0NiB6IG0gNi42OTM5NSwyMi4xNzIwOCBjIC0wLjIzODEyLC0wLjAyNjQgLTAuNDc2MjUsLTAuMDUyOSAtMC43MTQzNywtMC4wNTI5IC0xLjY0MDQyLDAgLTMuMjAxNDYsMC43MTQzNyAtNC4yNTk3OSwxLjkzMTQ2IGwgLTIuNjk4NzUsLTIuMzU0OCBjIDEuNzcyNzEsLTIuMDEwODMgNC4zMTI3MSwtMy4xNDg1NCA2Ljk4NSwtMy4xNDg1NCAwLjM3MDQxLDAgMC43NjcyOSwwLjAyNjUgMS4xMzc3MSwwLjA3OTQgeiBtIDE5LjU1MjcxLDI1LjYzODEzIGMgLTYuNjY3NSw2LjcyMDQyIC0xNi4yMTg5Niw5LjY4Mzc1IC0yNS41MzIyOSw3Ljk2Mzk2IGwgMS40ODE2NywtNy43Nzg3NSBjIDYuNzIwNDEsMS4yNDM1NCAxMy41OTk1OCwtMC44OTk1OSAxOC40MTUsLTUuNzQxNDYgeiBtIC0xMy42Nzg5NiwtMTMuNDkzNzUgNC42MzAyMSw0LjU1MDgzIGMgLTMuNjc3NzEsMy43MzA2MyAtOC45OTU4Myw1LjM3MTA0IC0xNC4xNTUyMSw0LjQxODU0IGwgMS4xOTA2MywtNi4zNzY0NSBjIDAuNTU1NjIsMC4xMDU4MyAxLjEzNzcxLDAuMTU4NzUgMS43MTk3OSwwLjE1ODc1IDIuNTEzNTQsMCA0Ljg2ODMzLC0wLjk3ODk2IDYuNjE0NTgsLTIuNzUxNjcgeiBtIC0xNy42NDc3LDQuNzA5NTggYyAxLjAwNTQxLDEuMDA1NDIgMi4xNDMxMiwxLjg1MjA5IDMuMzg2NjYsMi41NCBsIC0yLjMyODMzLDQuMTUzOTYgYyAtMS42MTM5NiwtMC44OTk1OCAtMy4wOTU2MywtMi4wMTA4MyAtNC40MTg1NCwtMy4zMDcyOSBsIC01LjU4MjcxLDUuNjM1NjIgYyAtNS40NTA0MiwtNS4zMTgxMiAtOC41MTk1OCwtMTIuNjIwNjIgLTguNDkzMTMsLTIwLjI0MDYyIDAsLTEuNzk5MTcgMC4xNTg3NSwtMy41OTgzMyAwLjUwMjcxLC01LjM3MTA0IGwgNy44MDUyMSwxLjUwODEyIGMgLTAuMjM4MTIsMS4yNyAtMC4zNzA0MiwyLjU2NjQ2IC0wLjM3MDQyLDMuODYyOTIgMCwyLjQwNzcxIDAuNDIzMzQsNC43ODg5NiAxLjI0MzU1LDcuMDY0MzcgbCA0LjQ3MTQ1LC0xLjY0MDQxIGMgLTAuOTc4OTUsLTIuNjcyMjkgLTEuMjE3MDgsLTUuNTgyNzEgLTAuNjg3OTEsLTguMzg3MjkgbCA2LjM3NjQ2LDEuMjQzNTQgYyAtMC4xMDU4NCwwLjU4MjA4IC0wLjE1ODc1LDEuMTY0MTYgLTAuMTU4NzUsMS43NDYyNSAwLDIuNDg3MDggMS4wMDU0MSw0Ljg2ODMzIDIuNzc4MTIsNi41ODgxMiB6IG0gMjQuNTc5NzksLTI2LjY0MzU0IDYuNTA4NzUsMTAuOTI3MjkgYyAwLjU1NTYyLDIuNDA3NzEgMC42NjE0NSw0LjkyMTI1IDAuMzE3NSw3LjM1NTQyIEwgMTM4LjQ4MywxNDAuNzE5NzUgYyAtMC4xMzIyOSwwLjk3ODk2IC0wLjQyMzMzLDEuOTA1IC0wLjg0NjY3LDIuODA0NTggbCAtMy4yNTQzNywtMS41NjEwNCBjIDEuMTM3NzEsLTIuMzAxODggMC42MDg1NCwtNS4xMDY0NiAtMS4zNDkzOCwtNi43OTk3OSBsIDIuMzU0OCwtMi42OTg3NSBjIDEuNDgxNjYsMS4yOTY0NiAyLjUxMzU0LDMuMDE2MjUgMi45MzY4Nyw0LjkyMTI1IGwgNi4zNSwtMS40Mjg3NSBjIC0wLjc0MDgzLC0zLjI1NDM4IC0yLjQ4NzA4LC02LjE5MTI1IC01LjAwMDYzLC04LjM4NzI5IHogbSA2LjUzNTIsMTAuOTAwODMgLTYuNTA4NzUsLTEwLjkyNzI5IGMgLTEuMzc1ODMsLTEuMjE3MDggLTIuOTEwNDEsLTIuMjIyNSAtNC41NTA4MywtMy4wMTYyNSBsIDMuNDY2MDQsLTcuMTQzNzUgYyA3LjgwNTIxLDMuNzgzNTQgMTMuNDY3MjksMTAuOTAwODQgMTUuMzcyMjksMTkuMzQxMDQgeiIKICAgICAgIHN0eWxlPSJmaWxsOiNkNzFkMWU7c3Ryb2tlLXdpZHRoOjAuMjY0NTgzIgogICAgICAgaWQ9InBhdGgxLTgiIC8+PC9nPjxzdHlsZQogICAgIHR5cGU9InRleHQvY3NzIgogICAgIGlkPSJzdHlsZTEiPgoJLnN0MHtmaWxsOiNENzFEMUU7fQo8L3N0eWxlPjwvc3ZnPgo=)
![Object Oriented Design](https://img.shields.io/badge/Module-Object%20Oriented%20Design-blue?style=flat-square)
![Object Oriented](https://img.shields.io/badge/Topic-Object%20Oriented-gold?style=flat-square)
![Java](https://img.shields.io/badge/Language-Java-007396?style=flat-square&logo=java&logoColor=white)
![BlueJ](https://img.shields.io/badge/IDE-BlueJ-blue?style=flat-square)

![GitHub repo size](https://img.shields.io/github/repo-size/joeaoregan/LIT-Yr2-OODesign?style=flat-square\&color=orange)
![Last Commit](https://img.shields.io/github/last-commit/joeaoregan/LIT-Yr2-OODesign?style=flat-square\&color=blue)
![GitHub top language](https://img.shields.io/github/languages/top/joeaoregan/LIT-Yr2-OODesign)
![Stars](https://img.shields.io/github/stars/joeaoregan/LIT-Yr2-OODesign?style=social)

### Limerick Institute of Technology
#### Year 2 (2015/16), Semester 3

**Student Name**: Joe O'Regan  
**Student Number**: K00203642  
**Course**: BSc (Honours) in Computing (Games Design and Development)  
**Module**: Object Oriented Design

[Portfolio Docs](https://joeaoregan.github.io/college/2018-lit/year2/#object-oriented-design)

--- 

## Yr2 Object Oriented Design Labs

### MODULE AIMS:
* Examine the concepts of Object Oriented Software Development and the Object Oriented 
Development Lifecycle 
* To provide an understanding of the concepts and advantages of the object-oriented approach to system development 
* To provide students with the ability to apply the range of models in the Unified Modelling 
Language in developing applications 
* To provide an understanding of the ways in which object-oriented systems may be 
implemented 
* To provide an understanding of approaches to testing Object Oriented Systems

---

## CA: Tic Tac Toe

### What the game does:

---

players will take it in turns to pick numbers from a 3 x 3 grid, replacing the number with either an X or a O

```text
1 2 3
4 5 6
7 8 9
```

The winner will be the first to get 3 in a row, either in a row column or diagonal, e.g.:

```text
X X X
4 5 6
O O 9
```
**3 x's in a row**

So players will have to get 3 in a row, but at the same time stop the opposing player from doing so

The game will first display the grid on the screen  

- Player 1 will be X  
- Player 2 will be O  

The players will then take turns picking a number from the grid  

As the numbers are picked, the program will check to see if it is a valid entry:  

- An integer number 1 to 9  
- And if the position has already been taken:
  - e.g for this grid:  

```text
1 2 3
4 5 6
X 8 O
```

if player 1 selects 7 or 9 on his 2nd turn he will be informed   

- if he selects 7 that it is already X  
- if he selects 9 that it is already O   

If the selection is available, e.g. 4 this selection will be written to the stored 2d array, and ouput to screen, to give

```text
1 2 3
X 5 6
X 8 O
```

this will continue until a player has 3 in a row


then the program outputs the winner name, e.g.

```text
X 2 3
X 5 O
X 8 O
```
**Player 1 is the winner**

### Steps:

---

1. draw original numbered grid

Then for each turn:

2. take in input from players
3. check the input is valid integer 1 to 9
4. check the input is available (not already used on grid)
5. ouput updated grid with X and / or O
6. check for 3 in a row  

Then  

7. if step 6 is 3 in a row, output the winner
8. display gameover message & option to restart / replay game

## Links

[JavaWithUs: Get and Set Methods](http://www.javawithus.com/tutorial/get-and-set-methods)
[BlueJ](https://www.bluej.org/)