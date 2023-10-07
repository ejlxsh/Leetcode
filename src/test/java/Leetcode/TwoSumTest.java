package Leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    public static Stream<Arguments> generator() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4},   6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3},      6, new int[]{0, 1})
        );
    }

    @DisplayName("Leetcode Example Tests")
    @ParameterizedTest(name = "Example {index}")
    @MethodSource("generator")
    public void testExamples(int[] nums, int target, int[] expectedResult) {
        int[] actualResult = TwoSum.Solve(nums, target);
        assertArrayEquals(expectedResult, actualResult);
    }
}
