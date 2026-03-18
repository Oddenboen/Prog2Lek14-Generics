package snackssupply;

import java.util.Arrays;

public class SnackBar {
    public <E extends Comparable<E>> void sortSnacks(E[] snackContainer) {
        Arrays.sort(snackContainer);
    }
}
