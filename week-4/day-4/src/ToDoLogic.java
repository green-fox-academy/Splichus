public class ToDoLogic {

    static ArgumentHandler arg = new ArgumentHandler();


    boolean isDigit(String string) {
        char[] stringToChar = string.toCharArray();
        for (int i = 0; i < stringToChar.length; i++) {
            if (!Character.isDigit(stringToChar[i])) {
                return false;
            }
        }
        return true;
    }
    void resolvingArgumentR (String[] args) {
        if (args[0].equals("-r") && args.length > 1) {
            if (isDigit(args[1])){
                if (Integer.valueOf(args[1]) <= arg.lines.size()) {
                    arg.rArgument(Integer.valueOf(args[1])-1);

                } else {
                    System.out.println("Unable to remove, index out of bounds.");
                }
            } else {
                System.out.println("Unable to remove: index is not a number");
            }
        } else if (args[0].equals("-r")){
            System.out.println("Unable to remove: no index provided.");
        }
    }

    void resolvingArgumentC (String[] args) {
        if (args[0].equals("-c") && args.length > 1) {
            if (args[0].equals("-c") && isDigit(args[1])){
                if (Integer.valueOf(args[1]) <= arg.lines.size()) {
                    arg.cArgument(Integer.valueOf(args[1])-1);
                } else {
                    System.out.println("Unable to check, index out of bounds.");
                }
            } else {
                System.out.println("Unable to check: index is not a number");
            }
        } else if (args[0].equals("-c")) {
            System.out.println("Unable to check: no index provided.");
        }
    }
    void resolvingArgumentL (String[] args) {
        if (args[0].equals("-l")) {
            System.out.println(arg.lArgument());
        }
    }
    void resolvingArgumentA (String[] args) {
        if (args[0].equals("-a") && args.length > 1) {
            String task = "";
            for (int i = 1; i < args.length ; i++) {
                task+=args[i]+" ";
            }
            arg.aArgument(task);
        } else if (args[0].equals("-a")){
            System.out.println("Unable to add: no task provided.");
        }
    }
    void notSupportedArgument (String[] args) {
        if (!args[0].equals("-a") || !args[0].equals("-l") || !args[0].equals("-r") || !args[0].equals("-c")) {
            System.out.println("Unsupported ArgumentHandler");
            System.out.println("");
            System.out.println(arg.blankArgument());
        }
    }


}
