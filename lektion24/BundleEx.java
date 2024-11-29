import java.nio.charset.Charset;
import java.util.Locale;
import java.util.ResourceBundle;

public class BundleEx {
    public static void main(String[] args) {
Locale locale = new Locale("en", "GB");
//Locale locale = new Locale("sv", "SE");
ResourceBundle bundle = ResourceBundle.getBundle("translations", locale);

System.out.println(bundle.getString("hello"));

String text = String.format(locale, bundle.getString("magicNumbers"), 22, Math.PI);
System.out.println(text);

System.out.println("Men trots att vi har gjort allt så blir det knas när vi kör programmet.");

System.out.println(Charset.defaultCharset());
    }
}
