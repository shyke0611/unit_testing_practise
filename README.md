

<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">Java Unit Testing using Junit and jacoco using simple Prime number storing algorithm</h3>
</div>

<br><br>

## Control Flow Diagram
![IMG_0AD0B59B9686-1](https://github.com/user-attachments/assets/491d69dc-4fc5-459a-adb3-4b01b79ae6e9)

## Testing Strategy

- **Branch Testing**: Ensures that every possible branch (decision point) in the code is executed at least once.
- **Data Flow Testing**: Focuses on testing the paths from variable definitions to their uses to ensure correct usage. In this project, the variable `index` in the `PrimeNumbers` class is tracked from its definition to its uses.
- **Equivalence Partitioning**: Divides input data into partitions of equivalent data to reduce the number of test cases while maintaining coverage. In this project, the input range for the `PrimeNumbers` class is partitioned into valid (1 to 10000) and invalid (less than 1, greater than 10000) classes.

## JaCoCo Code Coverage Report

<img width="895" alt="image" src="https://github.com/user-attachments/assets/ff18cee9-c4bf-48c2-af4a-65a417b8540f">
<img width="956" alt="image" src="https://github.com/user-attachments/assets/717c5bbb-8103-4196-a6e6-a7792d5b9c6c">










