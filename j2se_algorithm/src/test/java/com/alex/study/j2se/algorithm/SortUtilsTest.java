package com.alex.study.j2se.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortUtilsTest {

    @Test
    public void should_return_right_result_when_call_inserSort_given_int_list() {
        int expectResult[] = {1, 2, 3};
        int originalListp[] = {2, 3, 1};
        int actualList[] = SortUtils.insertSort(originalListp);
        assertArrayEquals(expectResult, actualList);
    }

}