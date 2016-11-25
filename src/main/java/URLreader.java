import CityEntites.PlacesRoot;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import com.google.gson.*;

/**
 * Created by Pawel on 25.11.2016.
 */
public class URLreader {

    public String getStringJSON(String url) throws IOException {

        StringBuilder sb = new StringBuilder();


        try {
            InputStream is = new URL(url).openStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public String getDziennyAdres(String city) throws IOException {
        String cityCode = null;
        try {
            cityCode = getCityCodeByName(city);
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder adres = new StringBuilder();
        adres.append("http://dataservice.accuweather.com/forecasts/v1/daily/1day/");
        adres.append(cityCode);
        adres.append("?apikey=%092SL44VUWl3jjnvN4BkJPMGZaTOseXVHu&language=pl&metric=true");
        return adres.toString();
    }

    public String getCityCodeAddress(String miastoUTF8){
        return "http://dataservice.accuweather.com/locations/v1/cities/autocomplete?apikey=2SL44VUWl3jjnvN4BkJPMGZaTOseXVHu&q="+miastoUTF8+"&language=pl";
    }


    public String covertToUTF8(String input) {
        StringBuilder UTF8 = new StringBuilder();
        for (Character c : input.toCharArray()) {
            if (c == 'Ą')
                UTF8.append("%C4%84");
            else if (c == 'Ć')
                UTF8.append("%C4%86");
            else if (c == 'Ę')
                UTF8.append("%C4%98");
            else if (c == 'Ł')
                UTF8.append("%C5%81");
            else if (c == 'Ń')
                UTF8.append("%C5%83");
            else if (c == 'Ó')
                UTF8.append("%C3%93");
            else if (c == 'Ś')
                UTF8.append("%C5%9A");
            else if (c == 'Ź')
                UTF8.append("%C5%B9");
            else if (c == 'Ż')
                UTF8.append("%C5%BB");
            else if (c == 'ą')
                UTF8.append("%C4%85");
            else if (c == 'ć')
                UTF8.append("%C4%87");
            else if (c == 'ę')
                UTF8.append("%C4%99");
            else if (c == 'ł')
                UTF8.append("%C5%82");
            else if (c == 'ń')
                UTF8.append("%C5%84");
            else if (c == 'ó')
                UTF8.append("%C3%B3");
            else if (c == 'ś')
                UTF8.append("%C5%9B");
            else if (c == 'ż')
                UTF8.append("%C5%BA");
            else if (c == 'ź')
                UTF8.append("%C5%BC");
            else
            if (c == ' ')
                UTF8.append("%20");
            else
                UTF8.append(c);
        }
        return UTF8.toString();
    }

    public String getCityCodeByName(String name) throws IOException {
        String url = getCityCodeAddress(covertToUTF8(name));
        String jsonString = getStringJSON(url);
        StringBuilder json = new StringBuilder();
        json.append("{\"Places\":");
        json.append(jsonString);
        json.append("}");
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        PlacesRoot root = gson.fromJson(json.toString(), PlacesRoot.class);

        return root.getPlaces()[0].getKey();
    }


}
