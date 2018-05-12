import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    
    public static void main(String[] args) throws Exception {

        String request = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        String result = Service.performRequest(request);
        Gson gson = new GsonBuilder().create();

        Item[] itemArr = gson.fromJson(result, Item[].class);
        for (Item item : itemArr) {
            System.out.println(item.getTxt() + " = " + item.getRate());
        }

         System.out.println("JSON: \n\t" + gson.toJson(itemArr));
    }
}