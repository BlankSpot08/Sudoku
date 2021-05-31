# Sudoku

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
