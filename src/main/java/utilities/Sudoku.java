package utilities;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Sudoku {
    private IntegerProperty[][][] tiles = new IntegerProperty[3][9][3];

    public final IntegerProperty[][][] generate() {
        tiles = initialize9x9(tiles);

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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].setValue(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

                                        tiles[i][k][l].set(numbersOneToNine.remove(m));
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

    private IntegerProperty[][][] clear9x9(IntegerProperty[][][] mdArray) {
        return initialize9x9(mdArray);
    }

    private IntegerProperty[][][] clear3x3(IntegerProperty[][][] mdArray, int i, int j) {
        for (int k = j; k < mdArray[i].length; k+=3) {
            mdArray[i][j] = new IntegerProperty[mdArray[i][j].length];
            for (int l = 0; l < mdArray[i][j].length; l++) {
                mdArray[i][j][l] = new SimpleIntegerProperty();
            }
        }

        return mdArray;
    }

    private boolean toUp(IntegerProperty[][][] tiles, int i, int j, int k, int number) {
        j = ((j + 3) < 9) ? (((j + 6) < 9) ? (j + 6) : (j + 3)) : j;

        for (int l = i - 1; l >= 0; l--) {
            for (int m = j ; m >= 0; m-=3) {
                if (tiles[l][m][k].getValue().equals(number)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toDown(IntegerProperty[][][] tiles, int i, int j, int k, int number) {
        j = ((j - 3) >= 0) ? (((j - 6) >= 0) ? (j - 6) : (j - 3)) : j;

        for (int l = i + 1; l < tiles.length; l++) {
            for (int m = j; m < tiles[l].length; m+=3) {
                if (tiles[l][m][k].getValue().equals(number)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toLeft(IntegerProperty[][][] tiles, int i, int j, int length, int number) {
        for (int l = j - 1; l > j - (length + 1); l--) {
            for (int m = 0; m < tiles[i][l].length; m++) {
                if (tiles[i][l][m].getValue().equals(number)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean toRight(IntegerProperty[][][] tiles, int i, int j, int length, int number) {
        for (int l = j + 1; l < j + (length + 1); l++) {
            for (int m = 0; m < tiles[i][l].length; m++) {
                if (tiles[i][l][m].getValue().equals(number)) {
                    return false;
                }
            }
        }

        return true;
    }

    public void print(IntegerProperty[][][] mdArray) {
        System.out.println("\nSudoku Board");
        for (IntegerProperty[][] ints : mdArray) {
            for (int j = 1, l = 1; j < ints.length + 1; j++) {
                for (int k = 0; k < ints[j - 1].length; k++, l++) {
                    System.out.print(ints[j - 1][k].getValue() + " ");
                }

                System.out.print(j % 3 == 0 ? "\n" : "");
            }
        }

        System.out.println("\nArray Position:");

        for (IntegerProperty[][] ints : mdArray) {
            for (int j = 1, l = 1; j < ints.length + 1; j++) {
                for (int k = 0; k < ints[j - 1].length; k++, l++) {
                    System.out.print(ints[j - 1][k].getValue() + " ");
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

    private IntegerProperty[][][] initialize9x9(IntegerProperty[][][] integerProperties) {
        IntegerProperty[][][] temp = new IntegerProperty[integerProperties.length][integerProperties[0].length][integerProperties[0][0].length];

        for (int i = 0; i < integerProperties.length; i++) {
            for (int j = 0; j < integerProperties[i].length; j++) {
                for (int k = 0; k < integerProperties[i][j].length; k++) {
                    temp[i][j][k] = new SimpleIntegerProperty();
                }
            }
        }

        return temp;
    }
}
