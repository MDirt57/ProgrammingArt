package task15_3_3.command;

import task15_3_3.Device;

public class PrevChannelCommand implements Command{
    @Override
    public void execute(Device device) {
        device.prevChanel();
    }
}
