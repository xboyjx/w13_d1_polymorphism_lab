import java.util.*;

public class Network {
    private String name;
//    private ArrayList<Desktop> devicesDesktop;
//    private ArrayList<Printer> devicesPrinter;
    private ArrayList<IConnect> devices;

    public Network(String name){
//        this.devicesDesktop = new ArrayList<Desktop>();
//        this.devicesPrinter = new ArrayList<Printer>();
        this.devices = new ArrayList<IConnect>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(Desktop desktop){
        devices.add(desktop);
    }

    public void connect(IConnect device){
        devices.add(device);
    }

    public void disconnectAll(){
//        devicesDesktop.clear();
        devices.clear();
    }
}