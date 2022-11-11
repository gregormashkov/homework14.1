public class Main {
    public static void main(String[] args) {
        Author1 pushkin = new Author1("Alexander", "Pushkin");
        Author1 esenin = new Author1("Sergey", "Esenin");
        Book1 onegin = new Book1("Eugene Onegin", pushkin, 1839);
        Book1 shagane = new Book1("Shagane", esenin, 1920);
        System.out.println(onegin.getYear());
        onegin.setYear(1837);
        System.out.println(onegin.getYear());
        System.out.println(pushkin);
        System.out.println(esenin);
        System.out.println(onegin);
        System.out.println(shagane);
        System.out.println(pushkin.equals(esenin));
        Author1 pushkin2 = new Author1("Alexander", "Pushkin");
        System.out.println(pushkin.equals(pushkin2));
        System.out.println(pushkin.hashCode() == pushkin2.hashCode());

    }
}
