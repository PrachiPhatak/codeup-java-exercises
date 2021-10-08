public class OloInterview {

    public static void main(String[] args) {
        System.out.print(wordWrap("   it is a biggest order ", 5));
        System.out.print(wordWrap1("   it is a biggest order ", 5));
    }

    //Solution given during interview
    public static String wordWrap(String spInstruction, int charLimit) {
        int start = 0;
        int end = 0;
        String printable = "";

        spInstruction = spInstruction.strip();

        for (int i = 0; i < spInstruction.length(); i += charLimit) {

            start = i;
            end = i + charLimit;

            if (end > spInstruction.length()) {
                end = spInstruction.length();
            }

            printable = printable + spInstruction.substring(start, end) + "\n";

        }
        return printable;
    }


    public static String wordWrap1(String spInstruction, int charLimit) {

        int start = 0;
        int end = 0;
        String printable = "";
        boolean flag = false;

        spInstruction = spInstruction.strip();

        int len = spInstruction.length();
        System.out.println("length " + len);

        for (int i = 0; i < len; i += charLimit) {

            if (flag) {
                i++;
                flag = false;
            }
            start = i;
            end = i + charLimit;

            if (end > spInstruction.length()) {
                end = spInstruction.length();
            }

            String line = spInstruction.substring(start, end);

            if (line.startsWith(" ")) {
                if (len % charLimit == 0 && (end + 1 <= len)) {
                    line = line.stripLeading() + spInstruction.charAt(end + 1);
                } else {
                    line = line.stripLeading() + spInstruction.charAt(end);
                    flag = true;
                }

            }
            printable = printable + line + "(" + line.length() + ")" + "\n";
        }
        return printable;
    }
}
