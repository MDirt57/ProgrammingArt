package task15_3_3;

import task15_3_3.command.*;

import java.util.Arrays;
import java.util.List;

public class RemoteController {

    private List<Device> devices;
    private Command onCommand = new OnCommand();
    private Command offCommand = new OffCommand();
    private Command nextChannelCommand = new NextChannelCommand();
    private Command prevChannelCommand = new PrevChannelCommand();
    private Command volumeUpCommand = new VolumeUpCommand();
    private Command volumeDownCommand = new VolumeDownCommand();

    public RemoteController(Device... devices){
        this.devices = Arrays.asList(devices);
    }

    void deviceOn(){
        for (Device device: devices){
            onCommand.execute(device);
        }
    }
    void deviceOff(){
        for (Device device: devices){
            offCommand.execute(device);
        }
    }
    void deviceVolumeUp(){
        for (Device device: devices){
            volumeUpCommand.execute(device);
        }
    }
    void deviceVolumeDown(){
        for (Device device: devices){
            volumeDownCommand.execute(device);
        }
    }
    void deviceNextChanel(){
        for (Device device: devices){
            nextChannelCommand.execute(device);
        }
    }
    void devicePrevChanel(){
        for (Device device: devices){
            prevChannelCommand.execute(device);
        }
    }
}
