package task23_3_2;

public class SecretAgent implements Spy {
    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.printf(
                "The military base has %d officers, %d soldiers, %d jeeps and %d tanks\n",
                militaryBase.getOfficers(),
                militaryBase.getSoldiers(),
                militaryBase.getJeeps(),
                militaryBase.getTanks()
                );
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        System.out.printf("Secret paper from the general staff: %d\n", generalStaff.getSecretPaper());
    }
}
