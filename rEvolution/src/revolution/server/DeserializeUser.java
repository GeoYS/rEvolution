package revolution.server;

import java.io.IOException;

public class DeserializeUser {

    String fileName;
    public static User Convert(String fileName){
        User user = null;
        try {
                user = (User) ConversionUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
        }
        
        return user;
    }

}
