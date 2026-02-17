public class Banner {

    public static void main(String[] args) {

        System.out.println("OOPS\n");

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        int height = 5;

        for (int i = 0; i < height; i++) {
            System.out.print(O[i] + "  ");
            System.out.print(O[i] + "  ");
            System.out.print(P[i] + "  ");
            System.out.print(S[i]);
            System.out.println();
        }
    }
}
