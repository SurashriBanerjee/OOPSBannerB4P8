public class UC6 {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] banner = {
                createO(),
                createP(),
                createS()
        };

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static function for letter O
    public static String createO() {
        return String.join("\n",
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** ");
    }

    // Static function for letter P
    public static String createP() {
        return String.join("\n",
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ");
    }

    // Static function for letter S
    public static String createS() {
        return String.join("\n",
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** ");
    }
}