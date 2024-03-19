package com.honcharenko;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static com.honcharenko.TwentyMethods.*;
import static org.junit.jupiter.api.Assertions.*;


class TwentyMethodsTest {

    @Test
    void givenCharArray_whenPrintCharArray_thenPrintToConsole() {
        // given
        char[] charArray = {'e', 'b', '@', '&', '^'};
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        printCharArray(charArray);
        // then
        assertEquals("eb@&^", outputStream.toString());
    }

    @Test
    void givenEmptyCharArray_whenPrintCharArray_thenPrintToConsole() {
        // given
        char[] charArray = {};
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        printCharArray(charArray);
        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    void givenIntArray_whenGetCharArrayFromIntArray_thenReturnCharArray() {
        // given
        int[] intArray = {1000, 2000, 3000, 4000, 5000};
        // when
        char[] actual = getCharArrayFromIntArray(intArray);
        // then
        assertArrayEquals(new char[]{'Ϩ', 'ߐ', 'ஸ', 'ྠ', 'ᎈ'}, actual);
    }

    @Test
    void givenEmptyIntArray_whenGetCharArrayFromIntArray_thenReturnEmptyCharArray() {
        // given
        int[] intArray = {};
        // when
        char[] actual = getCharArrayFromIntArray(intArray);
        // then
        assertArrayEquals(new char[]{}, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenGetMaxIntWithTernary_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxIntWithTernary_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxIntWithTernary_thenReturnOneOfThem() {
        //given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenMaxIntWithBranching_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxIntWithBranching_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxIntWithBranching_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenThreeIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 15;
        int secondInt = 10;
        int thirdInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 10;
        int secondInt = 15;
        int thirdInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeIntsAndThirdIsGreater_whenGetMaxInt_thenReturnThird() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        int thirdInt = 15;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        int thirdInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenFiveIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 25;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 10;
        int secondInt = 25;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndThirdIsGreater_whenGetMaxInt_thenReturnThird() {
        // given
        int firstInt = 15;
        int secondInt = 10;
        int thirdInt = 25;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndFourthIsGreater_whenGetMaxInt_thenReturnFourth() {
        // given
        int firstInt = 20;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 25;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndFifthIsGreater_whenGetMaxInt_thenReturnFifth() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 25;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 25;
        int secondInt = 25;
        int thirdInt = 25;
        int fourthInt = 25;
        int fifthInt = 25;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenCharArrayWithOneCharacter_whenGetStringFromCharArray_thenReturnStringWithOneCharacter() {
        // given
        char[] charArray = {'$'};
        // when
        String actual = getStringFromCharArray(charArray);
        // then
        assertEquals("$", actual);
    }

    @Test
    void givenCharArray_whenGetStringFromCharArray_thenReturnString() {
        // given
        char[] charArray = {'&', '^', '$', '#', '@', '!', '|'};
        // when
        String actual = getStringFromCharArray(charArray);
        // then
        assertEquals("&^$#@!|", actual);
    }

    @Test
    void givenEmptyCharArray_whenGetStringFromCharArray_thenReturnExpectedString() {
        // given
        char[] charArray = {};
        // when
        String actual = getStringFromCharArray(charArray);
        // then
        assertEquals("", actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithDuplicatesValue_whenFindFirstIndexOfSearchValueInArray_thenReturnFirstIndexOfSearchValue() {
        // given
        int[] intArray = {12, 34, 678, 3456, 1, 8976, 12};
        int searchInt = 12;
        // when
        int actual = findFirstIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(0, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithoutDuplicatesValue_whenFindFirstIndexOfSearchValueInArray_thenReturnFirstIndexOfSearchValue() {
        // given
        int[] intArray = {12, 34, 678, 3456, 1, 8976};
        int searchInt = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(4, actual);
    }

    @Test
    void givenIntArrayAndNotExistingInArrayValue_whenFindFirstIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] intArray = {12, 34, 678, 3456, 8976, 12};
        int searchInt = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenEmptyIntArrayAndIntValue_whenFindFirstIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] intArray = {};
        int searchInt = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithDuplicatesValue_whenFindLastIndexOfSearchValueInArray_thenReturnLastIndexOfSearchValue() {
        // given
        int[] intArray = {12, 34, 678, 3456, 1, 8976, 12};
        int searchInt = 12;
        // when
        int actual = findLastIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(6, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithoutDuplicatesValue_whenFindLastIndexOfSearchValueInArray_thenReturnLastIndexOfSearchValue() {
        // given
        int[] intArray = {12, 34, 678, 3456, 1, 8976};
        int searchInt = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(4, actual);
    }

    @Test
    void givenIntArrayAndNotExistingInArrayValue_whenFindLastIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] intArray = {12, 34, 678, 3456, 8976, 12};
        int searchInt = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenEmptyIntArrayAndIntValue_whenFindLastIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] intArray = {};
        int searchInt = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(intArray, searchInt);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenInt_whenCalculateFactorial_thenReturnFactorial() {
        // given
        int natural = 9;
        // when
        BigInteger actual = calculateFactorial(natural);
        // then
        assertEquals(BigInteger.valueOf(362880), actual);
    }

    @Test
    void givenIntLessZero_whenCalculateFactorial_thenThrowIllegalArgumentException() {
        // given
        int natural = -9;
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculateFactorial(natural));
        assertEquals("Input argument: " + natural + "must be natural number.", exception.getMessage());
    }

    @Test
    void givenZero_whenCalculateFactorial_thenReturnOne() {
        // given
        int natural = 0;
        // when
        BigInteger actual = calculateFactorial(natural);
        // then
        assertEquals(BigInteger.ONE, actual);
    }

    @Test
    void givenInt_whenCalculateFactorialRecursive_thenReturnFactorial() {
        // given
        int natural = 5;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        assertEquals(BigInteger.valueOf(120), actual);
    }

    @Test
    void givenIntLessZero_whenCalculateFactorialRecursive_thenThrowIllegalArgumentException() {
        // given
        int natural = -9;
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculateFactorialRecursive(natural));
        assertEquals("Input argument: " + natural + "must be natural number.", exception.getMessage());
    }

    @Test
    void givenZero_whenCalculateFactorialRecursive_thenReturnOne() {
        // given
        int natural = 0;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        assertEquals(BigInteger.ONE, actual);
    }

    @Test
    void givenInt_whenCalculateFactorialRecursive_thenReturnBigFactorial() {
        // given
        int natural = 100;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        BigInteger expected = calculateFactorialRecursive(99).multiply(BigInteger.valueOf(100));
        assertEquals(expected, actual);
    }

    @Test
    void givenIntAsLeapYear_whenIsLeapYear_thenReturnTrue() {
        // given
        int year = 2024;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertTrue(actual);
    }

    @Test
    void givenIntAsNotLeapYear_whenIsLeapYear_thenReturnFalse() {
        // given
        int year = 2023;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertFalse(actual);
    }

    @Test
    void givenIntAsNotLeapYear_whenIsLeapYear_thenThrowIllegalArgumentException() {
        // given
        int year = 456;
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> isLeapYear(year));
        assertEquals("Year: " + year + ". " +
                "The logic for calculating leap years was changed in 1582 and is not valid for smaller years." +
                " Input year more then 1582.", exception.getMessage());

    }

    @Test
    void givenIntAsNotLeapYearDivisibleBy100AndNotDivisibleBy400_whenIsLeapYear_thenReturnFalse() {
        // given
        int year = 1700;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertFalse(actual);
    }

    @Test
    void givenIntAsNotLeapYear1582_whenIsLeapYear_thenReturnFalse() {
        // given
        int year = 1582;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertFalse(actual);
    }

    @Test
    void givenIntArrayAndIntDivider_whenFilterIntArrayMultiples_thenReturnExpectedString() {
        // given
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int divider = 2;
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        filterIntArrayMultiples(intArray, divider);
        // then
        assertEquals("2" + System.lineSeparator() + "4" + System.lineSeparator() + "6" + System.lineSeparator() + "8" + System.lineSeparator() + "10" + System.lineSeparator(), outputStream.toString());
    }

    @Test
    void givenIntArrayAndDividerIsZero_whenFilterIntArrayMultiples_thenThrowArithmeticException() {
        // given
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int divider = 0;
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // then
        assertThrows(ArithmeticException.class, () -> filterIntArrayMultiples(intArray, divider));
    }

    @Test
    void givenEmptyIntArrayAndDivide_whenFilterIntArrayMultiples_thenReturnExpectedString() {
        // given
        int[] intArray = {};
        int divider = 2;
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        filterIntArrayMultiples(intArray, divider);
        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    void givenIntArrayWithoutDuplicates_whenBubbleSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {5, 2, 8, 1, 7};
        // when
        bubbleSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 7, 8}, intArray);
    }

    @Test
    void givenIntArrayWithDuplicates_whenBubbleSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {5, 2, 8, 1, 8};
        // when
        bubbleSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 8, 8}, intArray);
    }

    @Test
    void givenIntArrayWithEqualElements_whenBubbleSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {8, 8, 8, 8, 8};
        // when
        bubbleSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{8, 8, 8, 8, 8}, intArray);
    }

    @Test
    void givenEmptyIntArray_whenBubbleSortIntArrayInAscendingOrder_thenReturnEmptyIntArray() {
        // given
        int[] intArray = {};
        // when
        bubbleSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{}, intArray);
    }

    @Test
    public void givenIntArrayWithDuplicates_whenSelectionSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {5, 2, 8, 1, 8};
        // when
        selectionSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 8, 8}, intArray);
    }

    @Test
    void givenIntArrayWithoutDuplicates_whenSelectionSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {5, 2, 8, 1, 7};
        // when
        selectionSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 7, 8}, intArray);
    }

    @Test
    void givenIntArrayWithEqualElements_whenSelectionSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] intArray = {8, 8, 8, 8, 8};
        // when
        selectionSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{8, 8, 8, 8, 8}, intArray);
    }

    @Test
    void givenEmptyIntArray_whenSelectionSortIntArrayInAscendingOrder_thenReturnEmptyIntArray() {
        // given
        int[] intArray = {};
        // when
        selectionSortIntArrayInAscendingOrder(intArray);
        // then
        assertArrayEquals(new int[]{}, intArray);
    }

    @Test
    void givenByteArrayWithDuplicates_whenHasDuplicates_thenReturnTrue() {
        // given
        byte[] byteArray = {1, 2, 3, 4, 4, 5};
        // then
        assertTrue(hasDuplicates(byteArray));
    }

    @Test
    void givenByteArrayWithoutDuplicates_whenHasDuplicates_thenReturnFalse() {
        // given
        byte[] byteArray = {1, 2, 3, 4, 6, 5};
        // then
        assertFalse(hasDuplicates(byteArray));
    }

    @Test
    void givenEmptyByteArray_whenHasDuplicates_thenReturnFalse() {
        // given
        byte[] byteArray = {};
        // then
        assertFalse(hasDuplicates(byteArray));
    }

    @Test
    void givenTwoIntArraysWithEqualLength_whenMultiplyArrays_thenReturnMultipliedArray() {
        // given
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {4, 5, 6};
        // when
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{4, 10, 18}, actual);
    }

    @Test
    void givenTwoIntArraysWithNotEqualLength_whenMultiplyArrays_thenThrowIllegalArgumentException() {
        // given
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {4, 6};
        // then
        assertThrows(IllegalArgumentException.class, () -> multiplyArrays(firstIntArray, secondIntArray));
    }

    @Test
    void givenTwoEmptyIntArrays_whenMultiplyArrays_thenReturnEmptyArray() {
        // given
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        // when
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenTwoIntArraysWithEqualLength_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] firstIntArray = {1, 2, 3, 4, 5};
        int[] secondIntArray = {1, 2, 3, 6, 7};
        // when
        int[] actual = findNonMatchingElements(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{4, 6, 5, 7}, actual);
    }

    @Test
    void givenTwoEmptyIntArrays_whenFindNonMatchingElements_thenReturnEmptyArray() {
        // given
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        // when
        int[] actual = findNonMatchingElements(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenTwoIntArraysAndFirstIsEmpty_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] firstIntArray = {};
        int[] secondIntArray = {1, 2, 3};
        // when
        int[] actual = findNonMatchingElements(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    void givenTwoIntArraysAndSecondIsEmpty_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {};
        // when
        int[] actual = findNonMatchingElements(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    void givenTwoIntArraysWithDifferentLength_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {1, 2, 3, 4, 5};
        // when
        int[] actual = findNonMatchingElements(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{4, 5}, actual);
    }

    @Test
    void givenIntArray_whenReverseIntArray_thenReturnReversedArray() {
        // given
        int[] intArray = {1, 2, 3, 4, 5};
        // when
        int[] actual = reverseIntArray(intArray);
        // then
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, actual);
    }

    @Test
    void givenIntArrayWithEqualElements_whenReverseIntArray_thenReturnReversedArray() {
        // given
        int[] intArray = {5, 5, 5, 5, 5};
        // when
        int[] actual = reverseIntArray(intArray);
        // then
        assertArrayEquals(new int[]{5, 5, 5, 5, 5}, actual);
    }

    @Test
    void givenEmptyIntArray_whenReverseIntArray_thenReturnEmptyArray() {
        // given
        int[] intArray = {};
        // when
        int[] actual = reverseIntArray(intArray);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenThreeIntsAndSizeIsZero_whenGenerateRandomArray_thenThrowIllegalArgumentException() {
        // given
        int size = 0;
        int lowerBound = 1;
        int upperBound = 10;
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> generateRandomArray(size, lowerBound, upperBound));
        assertEquals("Size: " + size + ". Size of array can't be negative or zero!!!", exception.getMessage());
    }

    @Test
    void givenThreeIntsAndLowerBoundGreaterThenUpperBound_whenGenerateRandomArray_thenThrowIllegalArgumentException() {
        // given
        int size = 5;
        int lowerBound = 10;
        int upperBound = 1;
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> generateRandomArray(size, lowerBound, upperBound));
        assertEquals("lowerBound: " + lowerBound + " > " + "upperBound: " + upperBound + ". lowerBound mast be less then upperBound!", exception.getMessage());

    }

    @Test
    void givenThreeIntsAndLowerBoundEqualUpperBound_whenGenerateRandomArray_thenReturnIntArrayWithEqualElements() {
        // given
        int size = 5;
        int lowerBound = 5;
        int upperBound = 5;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertEquals(lowerBound, element);
        }
    }

    @Test
    void givenThreeIntsAndUpperBoundGreaterThanLowerBound_whenGenerateRandomArray_thenReturnGeneratedIntArray() {
        // given
        int size = 5;
        int lowerBound = 1;
        int upperBound = 10;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertTrue(element >= lowerBound && element <= upperBound);
        }
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsLonger_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] firstCharArray = {'a', 'b', 'c', 'd', 'e'};
        char[] secondCharArray = {'b', 'c', 'd'};
        // then
        assertTrue(isCharSubArray(firstCharArray, secondCharArray));
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsLonger_whenIsCharSubArray_thenReturnFalse() {
        // given
        char[] firstCharArray = {'a', 'b', 'c', 'd', 'e'};
        char[] secondCharArray = {'b', 'd', 'e'};
        // then
        assertFalse(isCharSubArray(firstCharArray, secondCharArray));
    }

    @Test
    void givenTwoCharArraysAndSecondArrayIsLonger_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] firstCharArray = {'c', 'd'};
        char[] secondCharArray = {'a', 'b', 'c', 'd', 'e'};
        // then
        assertTrue(isCharSubArray(firstCharArray, secondCharArray));
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsEmpty_whenIsCharSubArray_thenThrowIllegalArgumentException() {
        // given
        char[] firstCharArray = {};
        char[] secondCharArray = {'c', 'd'};
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> isCharSubArray(firstCharArray, secondCharArray));
        assertEquals("First array must not be empty.", exception.getMessage());

    }

    @Test
    void givenTwoCharArraysAndSecondArrayIsEmpty_whenIsCharSubArray_thenThrowIllegalArgumentException() {
        // given
        char[] firstCharArray = {'c', 'd'};
        char[] secondCharArray = {};
        // then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> isCharSubArray(firstCharArray, secondCharArray));
        assertEquals("Second array must not be empty.", exception.getMessage());
    }

    @Test
    void givenTwoCharArraysAndArraysAreEqual_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] firstCharArray = {'a', 'b', 'c'};
        char[] secondCharArray = {'a', 'b', 'c'};
        // then
        assertTrue(isCharSubArray(firstCharArray, secondCharArray));
    }
}