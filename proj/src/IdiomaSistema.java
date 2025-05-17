import java.util.Locale;

public class IdiomaSistema {
    public static void main(){
    Locale idiomaSistema = Locale.getDefault();
    System.out.println("O idioma do sistema é:");
    System.out.println(idiomaSistema.getDisplayLanguage() + " (" + idiomaSistema.getLanguage() + ")");
    }
}
