package app.constants;

import java.io.File;

public abstract class FilePaths {

	/**
	 * This is Base path for all the page locators
	 */
//	public static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
//			+ File.separator + "main" + File.separator + "resources" + File.separator + "WebObjects" + File.separator;

////	public static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
//			+ File.separator + "main" + File.separator + "java" + File.separator + "app" + File.separator + "constants" + File.separator;

/////public static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator;
 public static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator  + "config" + File.separator;

	
	public static final String PNG_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator + "PNG.png";

	
	public static final String SCREENSHOT_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator + "Failed Evidance";

	public static final String JPG_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator + "JPG.jpg";

	public static final String PDF_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator + "PDFSampleFile.pdf";

	public static final String MP4_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" + File.separator + "MP4.mp4";
	public static final String FAILSS = System.getProperty("user.dir") + File.separator + "src"
            + File.separator + "main" + File.separator + "resources" + File.separator + "MediaFiles" ;

	
}
