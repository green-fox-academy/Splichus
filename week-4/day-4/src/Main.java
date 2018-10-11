public class Main {
    static ArgumentHandler arg = new ArgumentHandler();


    public static void main(String[] args) {
        ToDoLogic logic = new ToDoLogic();

        if (args.length==0) {
            System.out.println(arg.blankArgument());
        } else {
            logic.resolvingArgumentA(args);
            logic.resolvingArgumentL(args);
            logic.resolvingArgumentC(args);
            logic.resolvingArgumentR(args);
            logic.notSupportedArgument(args);
        }
    }
}
