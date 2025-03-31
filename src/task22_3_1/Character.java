package task22_3_1;

public abstract class Character {

    /**
     * Стратегія захисту та відступу
     */
    final public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }

    abstract public void pickUpWeapon();

    /**
     * Захищатися за допомогою булави
     */
    abstract public void defenseAction();

    /**
     * Повернутися в безпечне місце в горах
     */
    abstract public void moveToSafety();

}
