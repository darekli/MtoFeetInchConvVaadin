//package mf;
//
//import com.vaadin.flow.i18n.I18NProvider;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.Locale;
//
//import static java.util.Locale.forLanguageTag;
//
//@Component
//public class SimpleI18NProvider implements I18NProvider {
//    @Override
//    public List<Locale> getProvidedLocales() {
//        return Collections.unmodifiableList(
//                Arrays.asList(forLanguageTag("en"), forLanguageTag("pl")));
//    }
//
//    @Override
//    public String getTranslation(String key, Locale locale, Object... params) {
//        if (Locale.forLanguageTag("en").equals(locale)) {
//            if (key.equals("root.navigate_to_component")) {
//                return "Navigate to another component";
//            }
//        } else if (Locale.forLanguageTag("pl").equals(locale)) {
//            if (key.equals("root.navigate_to_component")) {
//                return "Nawiguj";
//            }
//        }
//        return null;
//    }
//}
