package part4_repeated_recommender;
import common.Input;
public class Main {
    public static String recommend(int age, String genre) {
        genre=genre.toLowerCase(java.util.Locale.ROOT).trim();
        if(genre.equals("detective")) return age<17?"The Westing Game":"The Hound of the Baskervilles";
        if(genre.equals("fantasy")) return age<17?"The Hobbit":"The Lord of the Rings";
        if(genre.equals("non-fiction")) return age<17?"A Short History of Nearly Everything":"The Design of Everyday Things";
        return age<17?"The Little Prince":"Animal Farm";
    }
    public static void conversation() {
        String name=Input.text("Your name: ");
        int age=Input.integer("Age (0-120): ",0,120);
        String genre=Input.text("Genre (detective/fantasy/non-fiction/other): ");
        System.out.println(name + ", try reading: " + recommend(age,genre));
    }

    public static void main(String[] args) { do { conversation(); } while(Input.again()); }
}
