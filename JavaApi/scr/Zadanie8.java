
import org.json.JSONArray;
import org.json.JSONObject;

public class Zadanie8 {
    public static void main(String[] args) throws Exception {
        String adres = "https://store.steampowered.com/api/featuredcategories/?cc=pl&l=polish";

        JSONObject odpowiedz = Api.pobierz(adres);

        JSONObject specials = odpowiedz.getJSONObject("specials");
        JSONArray items = specials.getJSONArray("items");

        if (items.length() > 0) {
            JSONObject gra = items.getJSONObject(0);

            String nazwa = gra.getString("name");
            int rabat = gra.getInt("discount_percent");

            System.out.println("Nazwa gry: " + nazwa);
            System.out.println("Rabat: " + rabat + "%");
        }
    }
}
