package task15_3_3.command;

import task15_3_3.Device;

public class VolumeDownCommand implements Command{
    @Override
    public void execute(Device device) {
        device.volumeDown();
    }
}
