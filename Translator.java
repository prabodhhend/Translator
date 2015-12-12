import java.lang.reflect.Type;
import java.util.Locale;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Translator {

	public static void main(String[] args) throws java.lang.Exception {
		String inputJsonString = "";
		inputJsonString = "{\"text\":\"Hello World\",\"language\":\"mandarin\"}";
		Gson gson = new Gson();
		Type type = new TypeToken<TranslatorInputClass>() {}.getType();
		TranslatorInputClass jsonObject = gson.fromJson(inputJsonString, type);
		System.out.println(jsonObject.getLanguage());
		
		
		byte[] byteCode = inputJsonString.getBytes();

		String country = "";
		String lang = "eng";
		Locale localeVariable = new Locale(lang, country);
		System.out.println(localeVariable.getCountry());

	}
}
