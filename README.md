# Sudoku
Status: Not Finished & Broken

Sudoku (数独, sūdoku, digit-single) (/suːˈdoʊkuː/, /-ˈdɒk-/, /sə-/, originally called Number Place)[1] is a logic-based, combinatorial number-placement puzzle. In classic sudoku, the objective is to fill a 9×9 grid with digits so that each column, each row, and each of the nine 3×3 subgrids that compose the grid (also called "boxes", "blocks", or "regions") contains all of the digits from 1 to 9. The puzzle setter provides a partially completed grid, which for a well-posed puzzle has a single solution.

French newspapers featured variations of the Sudoku puzzles in the 19th century, and the puzzle has appeared since 1979 in puzzle books under the name Number Place. However, the modern Sudoku only began to gain widespread popularity in 1986 when it was published by the Japanese puzzle company Nikoli under the name Sudoku, meaning "single number". It first appeared in a U.S. newspaper, and then The Times (London), in 2004, thanks to the efforts of Wayne Gould, who devised a computer program to rapidly produce unique puzzles.

**Variations of grid sizes or region shapes**

Although the 9×9 grid with 3×3 regions is by far the most common, many other variations exist. Sample puzzles can be 4×4 grids with 2×2 regions; 5×5 grids with pentomino regions have been published under the name Logi-5; the World Puzzle Championship has featured a 6×6 grid with 2×3 regions and a 7×7 grid with six heptomino regions and a disjoint region. Larger grids are also possible, or different irregular shapes (under various names such as Suguru, Tectonic, Jigsaw Sudoku etc.). The Times offers a 12×12-grid "Dodeka Sudoku" with 12 regions of 4×3 squares. Dell Magazines regularly publishes 16×16 "Number Place Challenger" puzzles (using the numbers 1–16 or the letters A-P). Nikoli offers 25×25 "Sudoku the Giant" behemoths. A 100×100-grid puzzle dubbed Sudoku-zilla was published in 2010.

**Mathematics of Sudoku**

This section refers to classic Sudoku, disregarding jigsaw, hyper, and other variants.

A completed Sudoku grid is a special type of Latin square with the additional property of no repeated values in any of the nine blocks (or boxes of 3×3 cells). The relationship between the two theories is known, after it was proven that a first-order formula that does not mention blocks is valid for Sudoku if and only if it is valid for Latin squares.

The general problem of solving Sudoku puzzles on n2×n2 grids of n×n blocks is known to be NP-complete. Many computer algorithms, such as backtracking and dancing links can solve most 9×9 puzzles efficiently, but combinatorial explosion occurs as n increases, creating limits to the properties of Sudokus that can be constructed, analyzed, and solved as n increases. A Sudoku puzzle can be expressed as a graph coloring problem. The aim is to construct a 9-coloring of a particular graph, given a partial 9-coloring.

The fewest clues possible for a proper Sudoku is 17 (proven January 2012, and confirmed September 2013). Over 49,000 Sudokus with 17 clues have been found, many by Japanese enthusiasts. Sudokus with 18 clues and rotational symmetry have been found, and there is at least one Sudoku that has 18 clues, exhibits two-way diagonal symmetry and is automorphic. The maximum number of clues that can be provided while still not rendering a unique solution is four short of a full grid (77); if two instances of two numbers each are missing from cells that occupy the corners of an orthogonal rectangle, and exactly two of these cells are within one region, the numbers can be assigned two ways. Since this applies to Latin squares in general, most variants of Sudoku have the same maximum.

The number of classic 9×9 Sudoku solution grids is 6,670,903,752,021,072,936,960 (sequence A107739 in the OEIS), or around 6.67×1021. This is roughly 1.2×10−6 times the number of 9×9 Latin squares. Various other grid sizes have also been enumerated—see the main article for details. The number of essentially different solutions, when symmetries such as rotation, reflection, permutation, and relabelling are taken into account, was shown to be just 5,472,730,538 (sequence A109741 in the OEIS).

Unlike the number of complete Sudoku grids, the number of minimal 9×9 Sudoku puzzles is not precisely known. (A minimal puzzle is one in which no clue can be deleted without losing uniqueness of the solution.) However, statistical techniques combined with a puzzle generator show that about (with 0.065% relative error) 3.10 × 1037 minimal puzzles and 2.55 × 1025 nonessentially equivalent minimal puzzles exist.

**Sudoku techniques**</br>

Sudoku grid consists of 81 squares divided into nine columns marked a through i, and nine rows marked 1 through 9. The grid is also divided into nine 3x3 sub-grids named boxes which are marked box 1 through box 9.

Scanning techniques
The easiest way starting a Sudoku puzzle is to scan rows and columns within each triple-box area, eliminating numbers or squares and finding situations where only a single number can fit into a single square. The scanning technique is fast and usually sufficient to solve easy puzzles all the way to the end. The scanning technique is also very useful for hard puzzles up to the point where no further progress can be made and more advanced solving techniques are required. Here are some ways of using scanning techniques:

1. Scanning in one direction:
In our first example we will focus on box 2, which like any other box in Sudoku must contain 9. Looking at box 1 and box 3 we can see there are already 9s in row 2 and in row 3, which excludes the two bottom rows of box 2 from having 9. This leaves square e1 as the only possible place into which 9 can fit in.

![image](https://user-images.githubusercontent.com/40406575/120179901-c0e5a080-c23d-11eb-9dc2-62be058a337f.png)

2. Scanning in two directions:
The same technique can be expanded by using information from perpendicular rows and columns. Let’s see where we can place 1 in box 3. In this example, row 1 and row 2 contain 1s, which leaves two empty squares in the bottom of box 3. However, square g4 also contains 1, so no additional 1 is allowed in column g. This means that square i3 is the only place left for 1.

![image](https://user-images.githubusercontent.com/40406575/120179921-c80cae80-c23d-11eb-9dc5-8eb6aa405709.png)

3. Searching for Single Candidates:
Often only one number can be in a square because the remaining eight are already used in the relevant row, column and box. Taking a careful look at square b4 we can see that 3, 4, 7 and 8 are already used in the same box, 1 and 6 are used in the same row, and 5 and 9 are used in the same column. Eliminating all the above numbers leaves 2 as the single candidate for square b4.
![image](https://user-images.githubusercontent.com/40406575/120179965-d064e980-c23d-11eb-884b-83d81240e456.png)

4. Eliminating numbers from rows, columns and boxes:
There are more complex ways to find numbers by using the process of elimination. In this example the 1 in square c8 implies that either square e7 or square e9 must contain 1. Whichever the case may be, the 1 of column e is in box 8 and it is therefore not possible to have 1 in the centre column of box 2. So the only square left for 1 in box 2 is square d2.

![image](https://user-images.githubusercontent.com/40406575/120179999-d955bb00-c23d-11eb-9167-10be51d97996.png)

5. Searching for missing numbers in rows and columns:
This method can be particularly useful when rows (and columns) are close to completion. Let’s take a look at row 6. Seven of the nine squares contain the numbers 1, 2, 3, 4, 5, 8 and 9, which means that 6 and 7 are missing. However, 6 cannot be in square h6 because there is already 6 in that column. Therefore the 6 must be in square b6.

![image](https://user-images.githubusercontent.com/40406575/120180022-e1155f80-c23d-11eb-8ef8-0d323d74c089.png)

Analyzing techniques
As Sudoku puzzle levels get harder you will find the simple scanning methods described above are not enough and more sophisticated solving techniques must be used. Hard puzzles require deeper logic analysis which is done with the aid of pencilmarks. Sudoku pencilmarking is a systematic process writing small numbers inside the squares to denote which ones may fit in. After pencilmarking the puzzle, the solver must analyze the results, identify special number combinations and deduce which numbers should be placed where. Here are some ways of using analyzing techniques:

1. Eliminating squares using Naked Pairs in a box:
In this example, squares c7 and c8 in box 7 can only contain 4 and 9 as shown with the red pencilmarks below. We don’t know which is which, but we do know that both squares are occupied. In addition, square a6 excludes 6 from being in the left column of box 7. As a result the 6 can only be in square b9. Such cases where the same pair can only be placed in two boxes is called Disjoint Subsets, and if the Disjoint Subsets are easy to see then they are called Naked Pairs.

![image](https://user-images.githubusercontent.com/40406575/120180038-e672aa00-c23d-11eb-9489-721b99935808.png)

2. Eliminating squares using Naked Pairs in rows and columns:
The previous solving technique is useful for deducing a number within a row or column instead of a box. In this example we see that squares d9 and f9 in box 8 can only contain 2 and 7. Again we don’t know which is which, but we do know that both squares are occupied. The numbers which remain to be placed in row 9 are 1, 6 and 8. However, 6 can’t be placed in square a9 or in square i9, so the only possible place is square c9.


![image](https://user-images.githubusercontent.com/40406575/120180062-ec688b00-c23d-11eb-90e6-1266dd10dfa4.png)

3. Eliminating squares using Hidden Pairs in rows and columns:
Disjoint Subsets are not always obvious to see at first sight, in which case they are called Hidden Pairs. If we take a very close look at the pencilmarks in row 7 we can see that both 1 and 4 can only be in square f7 and square g7. This means that 1 and 4 are a Hidden Pair, and that square f7 and square g7 cannot contain any other number. Using the scanning technique we see that 7 can only be in square d7.

![image](https://user-images.githubusercontent.com/40406575/120180086-f1c5d580-c23d-11eb-84d0-1e7714718608.png)

4. Eliminating squares using X-Wing:
The X-Wing technique is used in rare situations which occur in some extremely difficult puzzles. Scanning column a we see that 4 can only be in square a2 or square a9. Similarly, 4 can only be in square i2 or square i9. Because of the X-Wing pattern where boxes are in the same row (or column), a new logic constraint occurs: it is obvious that in row 2 the 4 can only be either in square a2 or in square i2, and it cannot be in any other square. Therefore 4 is excluded from square c2, and square c2 must be 2.

![image](https://user-images.githubusercontent.com/40406575/120180120-f8ece380-c23d-11eb-8721-a4f6042cd4ea.png)
