package task23_3_2;

public class Saboteur implements Spy {
    @Override
    public void visit(MilitaryBase militaryBase) {
        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        generalStaff.setGenerals(0);
        generalStaff.setSecretPaper(0);
    }
}
