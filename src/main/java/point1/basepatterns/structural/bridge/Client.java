package point1.basepatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Program[] progs =
                {
                        new BankSystem(new CppDeveloper()),
//                        new StockExchange(new CppDeveloper()),
//                        new BankSystem(new JavaDeveloper()),
                        new StockExchange(new JavaDeveloper())
                };

        for (Program prog : progs) {
            prog.developProgram();
        }
    }
}
