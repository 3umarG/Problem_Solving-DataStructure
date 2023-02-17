package helper;

import java.util.Arrays;
import java.util.HashSet;

public abstract class Helper<T> {
    HashSet<T> fromArrayToSet(T[] arr) {
        return new HashSet<>(Arrays.stream(arr).toList());
    }
}
