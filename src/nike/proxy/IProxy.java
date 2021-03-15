package nike.proxy;

public class IProxy {
    public static MyIp getIp() {
        return new MyIp();
    }
}
