package com.honcharenko;

import java.math.BigInteger;
import java.util.Arrays;

public class TwentyMethods {
    /**
     * 1) Принимает массив чаров, выводит его на экран.
     */
    public static void printCharArray(char[] charArray) {
        System.out.print(charArray);
    }

    /**
     * 2) Принимает массив интов, возвращает массив чаров,
     * каждый символ в позиции массива соответствует коду символа передаваемого инта.
     */
    public static char[] getCharArrayFromIntArray(int[] intArray) {
        char[] charArray = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            charArray[i] = (char) intArray[i];
        }
        return charArray;
    }

    /**
     * 3.1) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxInt(int firstInt, int secondInt) {
        return Math.max(firstInt, secondInt);
    }

    /**
     * 3.2) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxIntWithTernary(int firstInt, int secondInt) {
        return (firstInt >= secondInt) ? firstInt : secondInt;
    }

    /**
     * 3.3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxIntWithBranching(int firstInt, int secondInt) {
        if (firstInt >= secondInt) {
            return firstInt;
        }
        return secondInt;
    }

    /**
     * 4) Принимает 3 инта, возвращает большее из них.
     */
    public static int getMaxInt(int firstInt, int secondInt, int thirdInt) {
        if (firstInt >= secondInt && firstInt >= thirdInt) {
            return firstInt;
        }
        if (secondInt >= firstInt && secondInt >= thirdInt) {
            return secondInt;
        }
        return thirdInt;
    }

    /**
     * 5) принимает 5 интов, возвращает большее из них.
     */
    public static int getMaxInt(int firstInt, int secondInt, int thirdInt, int fourthInt, int fifthInt) {
        int[] intArray = {firstInt, secondInt, thirdInt, fourthInt, fifthInt};
        int maxInt = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] >= maxInt) {
                maxInt = intArray[i];
            }
        }
        return maxInt;
    }

    /**
     * 6) Принимает массив чаров, возвращает строку состоящую из символов массива.
     */
    public static String getStringFromCharArray(char[] charArray) {
        StringBuilder string = new StringBuilder();
        for (char element : charArray) {
            string.append(element);
        }
        return string.toString();
    }

    /**
     * 8) Принимает массив интов и значение типа инт.
     * Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с начала массива.
     * Если значения в массиве нет - возвращает -1.
     */
    public static int findFirstIndexOfSearchValueInArray(int[] intArray, int searchInt) {
        int i = 0;
        for (int element : intArray) {
            if (element == searchInt) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * 9) Принимает массив интов и значение типа инт. Возвращает индекс массива,
     * в котором значение совпадает с передаваемым начиная с конца массива.
     * Если значения в массиве нет - возвращает -1.
     */
    public static int findLastIndexOfSearchValueInArray(int[] intArray, int searchInt) {
        int index = intArray.length - 1;
        for (int i = index; i >= 0; i--) {
            if (intArray[i] == searchInt) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 10.1) Метод принимает инт и возвращает факториал от заданого инта.
     */
    public static BigInteger calculateFactorial(int natural) throws IllegalArgumentException {
        if (natural < 0) {
            throw new IllegalArgumentException("Input argument: " + natural + "must be natural number.");
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = natural; i > 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /**
     * 10.2) Метод принимает инт и возвращает факториал от заданого инта.
     */
    public static BigInteger calculateFactorialRecursive(int natural) throws IllegalArgumentException {
        if (natural < 0) {
            throw new IllegalArgumentException("Input argument: " + natural + "must be natural number.");
        }
        if (natural == 0) {
            return BigInteger.ONE;
        }
        BigInteger bigInt = BigInteger.valueOf(natural);
        return bigInt.multiply(calculateFactorialRecursive(natural - 1));
    }

    /**
     * 11) Принимает инт год и возвращает тру, если год высокосный.
     */
    public static boolean isLeapYear(int year) throws IllegalArgumentException {
        if (year < 1582) {
            throw new IllegalArgumentException("Year: " + year + ". " +
                    "The logic for calculating leap years was changed in 1582 and is not valid for smaller years." +
                    " Input year more then 1582.");
        }
        if (year % 4 != 0) {
            return false;
        }
        if (year % 100 != 0) {
            return true;
        }
        return year % 400 == 0;
    }

    /**
     * 12) Принимает массив интов и число, выводит на екран только елементы массива, которые кратны этому числу.
     */
    public static void filterIntArrayMultiples(int[] intArray, int divider) throws ArithmeticException {
        if (divider == 0) {
            throw new ArithmeticException("Dividing by zero!");
        }
        for (int element : intArray) {
            if (element % divider == 0) {
                System.out.println(element);
            }
        }
    }

    /**
     * 13.1) Метод принимает массив интов, сортирует его по возрастанию.
     */
    public static void bubbleSortIntArrayInAscendingOrder(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 13.2) Метод принимает массив интов, сортирует его по возрастанию.
     */
    public static void selectionSortIntArrayInAscendingOrder(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = intArray[indexOfMin];
            intArray[indexOfMin] = intArray[i];
            intArray[i] = temp;
        }
    }

    /**
     * 14) Принимает массив байт. Если в массиве есть повторяющиеся елементы - возвращает тру.
     */
    public static boolean hasDuplicates(byte[] byteArray) {
        for (int i = 0; i < byteArray.length; i++) {
            for (int j = i + 1; j < byteArray.length; j++) {
                if (byteArray[i] == byteArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 15) Принимает два массива интов одинаковых по длинне, возращает массив интов,
     * который состоит из перемноженных елементов входящих массивов.
     */
    public static int[] multiplyArrays(int[] firstIntArray, int[] secondIntArray) throws IllegalArgumentException {
        if (firstIntArray.length != secondIntArray.length) {
            throw new IllegalArgumentException("Input arrays must be the same length.");
        }
        for (int i = 0; i < firstIntArray.length; i++) {
            firstIntArray[i] *= secondIntArray[i];
        }
        return firstIntArray;
    }

    /**
     * 16) Принимает два массива интов, возвращает массив из елементов, которые не совпадают в массивах.
     */
    public static int[] findNonMatchingElements(int[] firstIntArray, int[] secondIntArray) {
        int maxLength = Math.max(firstIntArray.length, secondIntArray.length);
        int[] result = new int[firstIntArray.length + secondIntArray.length];
        int resultIndex = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < firstIntArray.length && i < secondIntArray.length) {
                if (firstIntArray[i] != secondIntArray[i]) {
                    result[resultIndex++] = firstIntArray[i];
                    result[resultIndex++] = secondIntArray[i];
                }
            }
            if (i >= secondIntArray.length) {
                result[resultIndex++] = firstIntArray[i];
            }
            if (i >= firstIntArray.length) {
                result[resultIndex++] = secondIntArray[i];
            }
        }
        return Arrays.copyOfRange(result, 0, resultIndex);
    }

    /**
     * 17) Принимает масив интов, возвращает его же, но в реверсном порядке.
     */
    public static int[] reverseIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        return intArray;
    }

    /**
     * 18) Принимает 3 инта: размер выходного массива, нижняя граница, верхняя граница.
     * Возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы.
     */
    public static int[] generateRandomArray(int size, int lowerBound, int upperBound) throws IllegalArgumentException {
        if (size <= 0) {
            throw new IllegalArgumentException("Size: " + size + ". Size of array can't be negative or zero!!!");
        }
        if (lowerBound > upperBound) {
            throw new IllegalArgumentException("lowerBound: " + lowerBound + " > " + "upperBound: " + upperBound + ". lowerBound mast be less then upperBound!");
        }
        int[] intArray = new int[size];
        if (lowerBound == upperBound) {
            Arrays.fill(intArray, lowerBound);
            return intArray;
        }
        for (int i = 0; i < size; i++) {
            intArray[i] = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
        }
        return intArray;
    }

    /**
     * 19) Принимает 2 массива чаров, проверяет есть ли в 1 массиве такая же последовательность символов,
     * которую представляет собой второй массив. Возвращает булеан.
     */
    public static boolean isCharSubArray(char[] firstCharArray, char[] secondCharArray) throws IllegalArgumentException {
        if (firstCharArray.length == 0) {
            throw new IllegalArgumentException("First array must not be empty.");
        }
        if (secondCharArray.length == 0) {
            throw new IllegalArgumentException("Second array must not be empty.");
        }
        String firstString = String.valueOf(firstCharArray);
        String secondString = String.valueOf(secondCharArray);
        if (firstCharArray.length >= secondCharArray.length) {
            return firstString.contains(secondString);
        }
        return secondString.contains(firstString);
    }
}