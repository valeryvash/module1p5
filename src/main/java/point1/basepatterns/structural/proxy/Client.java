package point1.basepatterns.structural.proxy;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Tool proxyTool = new ProxyTool();

        proxyTool.moveToUpState(); // uptime
        Thread.sleep(24L); // some work
        proxyTool.moveToDownState(); // failure
        Thread.sleep(24L); // some work

        proxyTool.moveToUpState();
        proxyTool.moveToDownState();
        proxyTool.moveToDownState();

        System.out.println("upstate counter equals " + ((ProxyTool) proxyTool).getUpStateCounter());

        System.out.println("downstate counter equals " + ((ProxyTool) proxyTool).getDownStateCounter());


    }
}
