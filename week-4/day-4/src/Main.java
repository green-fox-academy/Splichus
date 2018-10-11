public class Main {
    static Argument arg = new Argument();

    public static void main(String[] args) {


        if (args.length==0) {
            System.out.println(arg.blankArgument());
        } else {
            if (args[0].equals("-a") && args.length > 1) {
                String task = "";
                for (int i = 1; i < args.length ; i++) {
                    task+=args[i]+" ";
                }
                arg.aArgument(task);
            } else if (args[0].equals("-a")){
                System.out.println("Unable to add: no task provided.");
            }
            if (args[0].equals("-l")) {
                System.out.println(arg.lArgument());
            }

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
            if (isNotSupportedArgument(args[0])) {
                System.out.println("Unsupported Argument");
                System.out.println("");
                System.out.println(arg.blankArgument());
            }
        }
    }

    static boolean isDigit (String string) {
        char[] stringToChar = string.toCharArray();
        for (int i = 0; i < stringToChar.length; i++) {
            if (!Character.isDigit(stringToChar[i])) {
                return false;
            }
        }
        return true;
    }
    static boolean isNotSupportedArgument(String text) {
        if (!text.equals("-a") || !text.equals("-l") || !text.equals("-r") || !text.equals("-c")) {
            return false;
        }
        return true;
    }
}
