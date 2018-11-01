public class Main {

    public static void main(String[] args) {
        ErrorsHandler logic = new ErrorsHandler();

        if (args.length==0) {
            logic.resolvingEmptyArgument();
        } else {
            logic.resolvingArgumentA(args);
            logic.resolvingArgumentL(args);
            logic.resolvingArgumentC(args);
            logic.resolvingArgumentR(args);
            logic.resolvingArgumentU(args);
            logic.notSupportedArgument(args);

        }
    }
}
