public class ErrorsHandler {

    private Todos todos;


    public ErrorsHandler() {
        todos = new Todos();
    }

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
//                if (Integer.valueOf(args[1]) <= todos.todos.size()) {
                    todos.rArgument(Integer.valueOf(args[1]));

//                } else {
//                    System.out.println("Unable to remove, index out of bounds.");
//                }
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
//                if (Integer.valueOf(args[1]) <= todos.todos.size()) {
                    todos.cArgument(Integer.valueOf(args[1]));
//                } else {
//                    System.out.println("Unable to check, index out of bounds.");
//                }
            } else {
                System.out.println("Unable to check: index is not a number");
            }
        } else if (args[0].equals("-c")) {
            System.out.println("Unable to check: no index provided.");
        }
    }
    void resolvingArgumentL (String[] args) {
        if (args[0].equals("-l")) {
            System.out.println(todos.lArgument());
        }
    }
    void resolvingArgumentA (String[] args) {
        if (args[0].equals("-a") && args.length > 1) {
            String task = "";
            for (int i = 1; i < args.length ; i++) {
                task+=args[i]+" ";
            }
            todos.aArgument(task);
        } else if (args[0].equals("-a")){
            System.out.println("Unable to add: no task provided.");
        }
    }

    void resolvingArgumentU (String[] args) {
        if (args[0].equals("-u") && args.length > 1) {
            String task = "";
            for (int i = 2; i < args.length ; i++) {
                task+=args[i]+" ";
            }
            todos.uArgument(Integer.valueOf(args[1]), task);
        } else if (args[0].equals("-u")){
            System.out.println("Unable to change: no task name provided.");
        }
    }

    void notSupportedArgument (String[] args) {
        if (!args[0].equals("-a") && !args[0].equals("-l") && !args[0].equals("-r") && !args[0].equals("-c") && !args[0].equals("-u")) {
            System.out.println("Unsupported Argument");
            System.out.println("");
            System.out.println(todos.blankArgument());
        }
    }
    public void resolvingEmptyArgument() {
        System.out.println("Command line todo application\n" +
                "===========================\n" +
                "\n" +
                "Command line arguments: \n" +
                "-l  Lists all new tasks\n" +
                "-a [Task Name] Adds new task\n" +
                "-r [id] Removes a task\n" +
                "-c [id] Completes a task\n"+
                "-u [id] [new todo name] updates the todo\n");
    }
}
