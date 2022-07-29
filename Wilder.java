public class Wilder {
    /* attributs */
    private String firstname;
    private boolean isAware;

    /* constructeur */
    public Wilder(String firstname, boolean isAware) {
        this.firstname = firstname;
        this.isAware = isAware;
    }

    /* getters et setters */
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean getIsAware() {
        return this.isAware;
    }

    public void setIsAware(boolean isAware) {
        this.isAware = isAware;
    }

    public void whoAmI() {
        if (isAware) {
            System.out.println("Je m'appelle " + firstname + " je suis aware");
        } else {
            System.out.println("Je m'appelle " + firstname + " je ne suis pas aware");
        }

    }

    public static void main(String[] args) {

    }
}