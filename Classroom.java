public class Classroom {
    public static void main(String[] args) {
        Wilder[] wilders = {
                new Wilder("Tatiana", true),
                new Wilder("Thibault", false)
        };

        for (Wilder wilder : wilders) {
            wilder.whoAmI();
        }
    }
}
