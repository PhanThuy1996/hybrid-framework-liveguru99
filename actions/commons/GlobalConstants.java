package commons;

import java.io.File;

public class GlobalConstants {
	public final static String USER_URL="http://live.techpanda.org/";
	public final static String ADMIN_URL="";
	
	public final static String PROJECT_PATH =System.getProperty("user.dir");
	public final static String OS_NAME = System.getProperty("os.name");
	public final static String UPLOAD_FILE = PROJECT_PATH+File.separator+"uploadFiles";
	public final static String DOWNLOAD_FILE = PROJECT_PATH+File.separator+"downloadFiles";
	public final static String BROWSER_LOG = PROJECT_PATH+File.separator+"browserLog";
	public final static String DRAG_DROP_HTML5 = PROJECT_PATH+File.separator+"dragDropHTML5";
	public static final String DB_URL = "";
	public static final String DB_USER="";
	public static final String DB_PASS = "";
	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;
	
	
	
}
