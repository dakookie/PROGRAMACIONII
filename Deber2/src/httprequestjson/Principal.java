package httprequestjson;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.*;


public class Principal {
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("https://jsonplaceholder.typicode.com/users");
        HttpURLConnection cx = (HttpURLConnection) url.openConnection();
        cx.setRequestMethod("GET");

        InputStream strm = cx.getInputStream();
        byte[] arrStream = strm.readAllBytes();

        String cntJson = "";

        for (byte tmp : arrStream) 
            cntJson += (char)tmp;
        System.out.println(cntJson);
        //JSONArray json = new JSONArray(cntJson);

        /* 
        for(Object obj : json)
            System.out.println(new JSONObject(((JSONObject)obj).get("company").toString()).get("name"));
        */
    }
}
