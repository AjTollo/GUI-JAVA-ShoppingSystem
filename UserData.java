import java.util.HashMap;

/**
 * UserData
 */
public class UserData {

    HashMap<String, String> userData = new HashMap<String, String>() {
        {

            put("Khesir", "123");
        }

    };

    public HashMap<String, String> getUser() {
        return userData;
    }
}