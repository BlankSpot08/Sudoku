package sudoku;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Sudoku {
    public int[][][] generate() {
        int[][][] tiles = new int[3][9][3];

        for (int i = 0; i < tiles.length; i++) {
            if (i == 0) {
                for (int j = 0, z = 0; j <= 3; j++) {
                    LinkedList<Integer> numbersOneToNine = putNumbersOneToNine();

                    if (j == 0) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toRight(tiles, i, k, 2,  findThis)
                                            && toDown(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] = numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 1) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toLeft(tiles, i, k, 1,  findThis)
                                        && toDown(tiles, i, k, l, findThis)
                                        && toRight(tiles, i, k, 1, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 2) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toLeft(tiles, i, k, 2,  findThis)
                                            && toDown(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    }
                }
            } else if (i == 1) {
                for (int j = 0, z = 0; j <= 3; j++) {
                    LinkedList<Integer> numbersOneToNine = putNumbersOneToNine();

                    if (j == 0) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toUp(tiles, i, k, l, findThis)
                                            && toRight(tiles, i, k, 2, findThis)
                                            && toDown(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] = numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 1) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toUp(tiles, i, k, l, findThis)
                                            && toLeft(tiles, i, k,  1, findThis)
                                            && toRight(tiles, i, k, 1, findThis)
                                            && toDown(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 2) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toUp(tiles, i, k, l, findThis)
                                            && toLeft(tiles, i, k, 2, findThis)
                                            && toDown(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    }
                }
            } else if (i == 2) {
                for (int j = 0, z = 0; j <= 3; j++) {
                    LinkedList<Integer> numbersOneToNine = putNumbersOneToNine();

                    if (j == 0) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toUp(tiles, i, k, l, findThis)
                                            && toRight(tiles, i, k, 2, findThis)) {

                                        tiles[i][k][l] = numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 1) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);

                                    if (toLeft(tiles, i, k,  1, findThis)
                                            && toUp(tiles, i, k, l, findThis)
                                            && toRight(tiles, i, k, 1, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    } else if (j == 2) {
                        for (int k = j; k < tiles[i].length; k+=3) {
                            for (int l = 0; l < tiles[i][k].length; l++) {
                                for (int m = 0; m < numbersOneToNine.size(); m++) {
                                    int findThis = numbersOneToNine.get(m);
                                    if (toLeft(tiles, i, k, 2, findThis)
                                            && toUp(tiles, i, k, l, findThis)) {

                                        tiles[i][k][l] =  numbersOneToNine.remove(m);
                                        break;
                                    }
                                }
                            }
                        }

                        if (numbersOneToNine.size() != 0) {
                            if (z <= 5) {
                                clear3x3(tiles, i, j);
                                j--;
                                z++;
                            }
                            else {
                                i = -1;
                                tiles = clear9x9(tiles);
                                break;
                            }
                        }
                    }
                }
            }
        }

        return tiles;
    }

    private int[][][] clear9x9(int[][][] mdArray) {
        return new int[mdArray.length][mdArray[0].length][mdArray[0][0].length];
    }

    private int[][][] clear3x3(int[][][] mdArray, int i, int j) {
        for (int k = j; k < mdArray[i].length; k+=3) {
            mdArray[i][j] = new int[mdArray[i][j].length];
        }

        return mdArray;
    }

    private boolean toUp(int[][][] tiles, int i, int j, int k, int number) {
        j = ((j + 3) < 9) ? (((j + 6) < 9) ? (j + 6) : (j + 3)) : j;

        for (int l = i - 1; l >= 0; l--) {
            for (int m = j ; m >= 0; m-=3) {
                if (tiles[l][m][k] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toDown(int[][][] tiles, int i, int j, int k, int number) {
        j = ((j - 3) >= 0) ? (((j - 6) >= 0) ? (j - 6) : (j - 3)) : j;

        for (int l = i + 1; l < tiles.length; l++) {
            for (int m = j; m < tiles[l].length; m+=3) {
                if (tiles[l][m][k] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toLeft(int[][][] tiles, int i, int j, int length, int number) {
        for (int l = j - 1; l > j - (length + 1); l--) {
            for (int m = 0; m < tiles[i][l].length; m++) {
                if (tiles[i][l][m] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toRight(int[][][] tiles, int i, int j, int length, int number) {
        for (int l = j + 1; l < j + (length + 1); l++) {
            for (int m = 0; m < tiles[i][l].length; m++) {
                if (tiles[i][l][m] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    public void print(int[][][] mdArray) {
        System.out.println("\nSudoku Board");
        for (int[][] ints : mdArray) {
            for (int j = 1, l = 1; j < ints.length + 1; j++) {
                for (int k = 0; k < ints[j - 1].length; k++, l++) {
                    System.out.print(ints[j - 1][k] + " ");
                }

                System.out.print(j % 3 == 0 ? "\n" : "");
            }
        }

        System.out.println("\nArray Position:");

        for (int[][] ints : mdArray) {
            for (int j = 1, l = 1; j < ints.length + 1; j++) {
                for (int k = 0; k < ints[j - 1].length; k++, l++) {
                    System.out.print(ints[j - 1][k] + " ");
                }
            }
            System.out.println();
        }
    }

    private LinkedList<Integer> putNumbersOneToNine() {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(linkedList);

        return linkedList;
    }
}