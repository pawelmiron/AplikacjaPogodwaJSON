import DailyForecastEntities.DailyForecasts;
import DailyForecastEntities.Root;
import com.google.gson.*;
import java.io.IOException;


public class app {
    public static void main(String []args) throws IOException {

        URLreader urLreader = new URLreader();
        //String url = "http://dataservice.accuweather.com/forecasts/v1/daily/1day/274455?apikey=%092SL44VUWl3jjnvN4BkJPMGZaTOseXVHu&language=pl&metric=true";
        String url = urLreader.getDziennyAdres("Augustów");
        String jsonString = urLreader.getStringJSON(url);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Root root = gson.fromJson(jsonString, Root.class);
        System.out.println(root);
        jsonString = gson.toJson(root);

        System.out.println(root.getHeadline().getText());
        for (DailyForecasts d: root.getDailyForecasts())
        {System.out.println("Maximum " + d.getTemperature().getMaximum().getValue()+d.getTemperature().getMaximum().getUnit() +
                    " Minimum " + d.getTemperature().getMinimum().getValue()+d.getTemperature().getMinimum().getUnit());
            System.out.println("Data " + d.getDate());
            System.out.println("W dzień " + d.getDay().getIconPhrase());
            System.out.println("W nocy " + d.getNight().getIconPhrase());
        }






    }
}
