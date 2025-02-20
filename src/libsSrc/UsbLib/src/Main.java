package libsSrc.UsbLib.src;

import libsSrc.UsbLib.src.com.mobile.Legacy.Charger;
import libsSrc.UsbLib.src.com.mobile.Legacy.MobilePhone;

public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.pluginCharger(new Charger(5.0f, 1.0f));
        mobilePhone.charge(20);
        System.out.printf("Current power status = %s%n", mobilePhone.getChargingPercent());
        mobilePhone.call(10);

    }
}
