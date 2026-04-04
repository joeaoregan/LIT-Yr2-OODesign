# Joe O'Regan
## K00203642

### Game: Tic Tac Toe

*****************

#### What the game does:

---

players will take it in turns to pick numbers from a 3 x 3 grid, replacing the number with either an X or a O

```text
1 2 3
4 5 6
7 8 9
```

The winner will be the first to get 3 in a row, either in a row column or diagonal

e.g.:

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
  e.g for this grid  

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

#### Steps:

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

---

Could also do the same program as 1 player Vs computer.  
I did this program yesterday in C.  
Looking at the player v computer option today.  
The program I did already has 7 functions, with 2 players, as in the program outlined above.