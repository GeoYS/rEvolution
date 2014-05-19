package revolution.server;

import java.io.IOException;

public class SerializeUser {

	public static void Convert(String fileName, User user) {
		fileName = fileName + ".ser";
                
		//serialize to file
		try {
			ConversionUtil.serialize(user, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}


}
