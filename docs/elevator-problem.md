# 1. Elevator Problem  

A product is to be installed to control elevators in a building with m floors. The problem concerns the logic required to move elevators between floors according to the following constraints:    

- Each elevator has a set of m buttons, one for each floor. These illuminate when pressed and cause the elevator to visit the corresponding floor. The illumination is cancelled when the elevator visits the corresponding floor.    
- Each floor, except the first floor and top floor has two buttons, one to request an up-elevator and one to request a down-elevator. These buttons illuminate when pressed. The illumination is cancelled when an elevator visits the floor and then moves in the desired direction.    
- When an elevator has no requests, it remains at its current floor with its doors closed. 
