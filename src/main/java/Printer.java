public class Printer implements IConnect {

    public String print(String data){
        return "printing: " + data;
    }

    public String connect(String data){
        return String.format("connecting to %s network", data);
    }
}