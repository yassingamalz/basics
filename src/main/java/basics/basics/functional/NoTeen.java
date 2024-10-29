package basics.basics.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(integer -> integer > 19 || integer < 13)
                .collect(Collectors.toList());
    }
}
