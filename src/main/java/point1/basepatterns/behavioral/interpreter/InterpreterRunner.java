package point1.basepatterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Does java developer knows JavaCore: " + isJava.interpret("Java Core"));
        System.out.println("Does java developer knows JavaEE: " + isJavaEEDeveloper.interpret("Java Spring"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("JavaCore");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }



}
