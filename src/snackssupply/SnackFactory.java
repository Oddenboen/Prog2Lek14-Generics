package snackssupply;

import snacks.Snack;

public class SnackFactory {
    // TODO: Implement getNewSnacks(E[] snackContainer)

    public <E extends Snack> E[] getNewSnacks(E[] snackContainer) {
        Class objectArrayClass = snackContainer.getClass();
        Class objectType = objectArrayClass.getComponentType();

        try {

            for (int i = 0; i < snackContainer.length; i++) {
                E newInstance = (E) objectType.getDeclaredConstructor().newInstance();
                snackContainer[i] = newInstance;
            }

        } catch (Exception e) {
            e.getMessage();
        }

        return snackContainer;
    }
}
