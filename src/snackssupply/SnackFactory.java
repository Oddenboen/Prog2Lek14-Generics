package snackssupply;

import snacks.Snack;

public class SnackFactory {
    // TODO: Implement getNewSnacks(E[] snackContainer)

    public <E extends Snack> E[] getNewSnacks(E[] snackContainer) {

        for (int i = 0; i < snackContainer.length; i++) {
            snackContainer[i] = 
        }

        return snackContainer;
    }
}
