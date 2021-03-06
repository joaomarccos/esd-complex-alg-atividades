package io.github.joaomarccos;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingSortTest {

    @Test
    void sort() {
        Integer[] array = {5, 2, -1, 1, -1, -17, 9};
        var arr = Util.getArr(array);

        var sorter = new CountingSort();
        sorter.sort(arr);
        assertArrayEquals(new Integer[]{-17, -1, -1, 1, 2, 5, 9}, Arrays.stream(arr).map(AsNumber::intValue).toArray());
    }


    @Test
    void sortLongList() {
        Integer[] array = {3359, 7042, 1500, 6686, 4200, 6559, 6766, 2261, 7081, 5487, 7330, 402, 3314, 5892, 2674, 8370, 3208, 8077
                , 8497, 4554, 6125, 4704, 8933, 2622, 4161, 2764, 3419, 3987, 5891, 6054, 5524, 5949, 8010, 7172, 6001, 9080, 3990, 703, 8675,
                2376, 5690, 1003, 473, 7802, 61, 6651, 916, 7815, 130, 2686, 3639, 9614, 504, 7893, 2549, 5241, 1382, 8366, 6205, 4146, 6690,
                9661, 4536, 2770, 8200, 1556, 1217, 3729, 4909, 3732, 7897, 4695, 1353, 6836, 7024, 4457, 829, 2620, 3691, 3165, 9706, 3142,
                186, 8640, 8617, 9544, 1880, 7180, 8272, 2233, 5874, 3406, 7216, 8736, 409, 2498, 6316, 8398, 2721, 3959};
        var arr = Util.getArr(array);

        var sorter = new CountingSort();
        sorter.sort(arr);

        assertArrayEquals(new Integer[]{61, 130, 186, 402, 409, 473, 504, 703, 829, 916, 1003, 1217, 1353, 1382, 1500,
                        1556, 1880, 2233, 2261, 2376, 2498, 2549, 2620, 2622, 2674, 2686, 2721, 2764, 2770, 3142, 3165, 3208,
                        3314, 3359, 3406, 3419, 3639, 3691, 3729, 3732, 3959, 3987, 3990, 4146, 4161, 4200, 4457, 4536, 4554,
                        4695, 4704, 4909, 5241, 5487, 5524, 5690, 5874, 5891, 5892, 5949, 6001, 6054, 6125, 6205, 6316, 6559,
                        6651, 6686, 6690, 6766, 6836, 7024, 7042, 7081, 7172, 7180, 7216, 7330, 7802, 7815, 7893, 7897, 8010,
                        8077, 8200, 8272, 8366, 8370, 8398, 8497, 8617, 8640, 8675, 8736, 8933, 9080, 9544, 9614, 9661, 9706},
                Arrays.stream(arr).map(AsNumber::intValue).toArray());
    }
}