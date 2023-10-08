package Leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    public static Stream<Arguments> generator() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3, new int[]{1,2,2,3,5,6}),
                Arguments.of(new int[]{1}, 1, new int[]{0}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1})
        );
    }

    @DisplayName("Leetcode Example Tests")
    @ParameterizedTest(name = "Example {index}")
    @MethodSource("generator")
    public void testExamples(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        int[] actualResult = MergeSortedArray.solve(nums1, m, nums2, n);
        assertArrayEquals(expectedResult, actualResult);
    }
}
