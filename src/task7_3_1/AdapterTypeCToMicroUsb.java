package task7_3_1;

import libsSrc.UsbLib.src.com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger){ this.typeCCharger = typeCCharger; }

    final TypeCCharger typeCCharger;

    @Override
    public float getOutputVoltage() {
        return typeCCharger.getOutputPower();
    }

    @Override
    public float getOutputAmperage() {
        return 1;
    }
}
