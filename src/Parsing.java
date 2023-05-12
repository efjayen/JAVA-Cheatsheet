public class Parsing {
    public static void main(String[] args) {

public int {
    int s = 14;
s.parseDouble(s); }
    }

    // CHAT GPT gave this example
    /*
    public class CommandLineParser {
        public static void main(String[] args) {
            if(args.length == 0) {
                System.out.println("No arguments provided!");
                return;
            }

            for(int i = 0; i < args.length; i++) {
                String arg = args[i];
                if(arg.equals("-h") || arg.equals("--help")) {
                    System.out.println("Help information...");
                } else if(arg.equals("-f") || arg.equals("--file")) {
                    if(i + 1 < args.length) {
                        String filename = args[i + 1];
                        System.out.println("File name: " + filename);
                        i++; // skip the next argument since it is the filename
                    } else {
                        System.out.println("No filename provided after " + arg);
                    }
                } else {
                    System.out.println("Unknown argument: " + arg);
                }
            }
        }
    }
    */