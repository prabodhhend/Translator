import java.lang.reflect.Type;
import java.util.Locale;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Translator {

	public static void main(String[] args) throws java.lang.Exception {
		String inputJsonString = "";
		inputJsonString = "{\"text\":\"Hello World\",\"language\":\"mandarin\"}";
		Gson gson = new Gson();
		Type type = new TypeToken<TranslatorInputClass>() {
		}.getType();
		TranslatorInputClass jsonObject = gson.fromJson(inputJsonString, type);
		try {
			if (LanguageDictionary.values().equals(jsonObject.getLanguage().toString())) {
				System.out.println("heee");

				byte[] byteCode = inputJsonString.getBytes();

				String country = "";
				String lang = "eng";
				Locale localeVariable = new Locale(lang, country);
				System.out.println(localeVariable.getCountry());
			} else {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Object LanguageDictionary() {
		// TODO Auto-generated method stub
		return null;
	}
}
