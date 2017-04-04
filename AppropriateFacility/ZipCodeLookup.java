import net.sf.json.JSONObject;
import java.util.Scanner;

/**
 * Created by Xin Yang.
 */
public class ZipCodeLookup 
{
    // using api https://www.zipcodeapi.com/API#zipToLoc
    private static final String URL = "https://www.zipcodeapi.com/rest/" +
            "slWHjL2Fm0yJDYEKUIde0wwCezO7XV7qh48APagcbOWPNAzHiNWiktVy2JF0FNqW/" +
            "info.json/";
    private static final String UNITS = "/degrees";
    private static final String CITY = "city";
    private static final String STATE = "state";

    public String convertZipcode(String zipcode) 
    {
        String getUrl = URL + zipcode + UNITS;
        return sendGet(getUrl);
    }

    /**
     * using API to get zipcode info
     * @param url
     * @return
     */
    public static String sendGet(String url) 
    {
        String result = HttpGetAPI.getAPI(url);
        JSONObject json = JSONObject.fromObject(result);
        StringBuilder sb = new StringBuilder();
        sb.append(json.getString(CITY));
        sb.append(" ");
        sb.append(json.getString(STATE));
        return sb.toString();
    }

    public static void main(String[] argus) 
    {
        ZipCodeLookup lookup = new ZipCodeLookup();
        System.out.println("Please input zipcode:");
        Scanner sc = new Scanner(System.in);
        System.out.println(lookup.convertZipcode(sc.nextLine()));
    }
}