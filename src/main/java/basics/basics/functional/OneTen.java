package basics.basics.functional;

import java.util.List;
import java.util.stream.Collectors;

public class OneTen {
    public static List<Integer> oneTen(List<Integer> nums) {
        return nums.stream()
                .map(integer -> integer + 1)
                .map(integer -> integer * 10)
                .collect(Collectors.toList());
    }
}
