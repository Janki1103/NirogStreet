package app.constants;

import java.time.Duration;


	public abstract class ApplicationConstants {

		public static String URL = "https://stg4web.1veda.in/";
		public static String ADMINURL = "https://stg4admin.1veda.in/site/login";
		public static String browser = "chrome";
		public static String environment = "Automation QA";
		public static final Duration EXP_WAIT = Duration.ofSeconds(40);
		//public static final Duration Page_load_timeout=Duration.ofMillis(2000);
		public static final Duration Page_load_timeout=Duration.ofSeconds(30);

		public static final long IMP_WAIT=10;
		public static String product = "Kudos";
		public static String APIForOrder="https://stg4web.1veda.in/api/core/v1/status";
		public static String APIForDispatch="https://stg4web.1veda.in/api/core/orders/status/";
		public static String TokenType="x-access-token";
		public static String Token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzNTg0LCJpYXQiOjE2NTQ3Njg0MjF9.emOEgu-w87Ey66MnLWHoc8GCaownT3kHT5rxIn2ETNQ";

		
		// public static final String EMAIL = new String(Base64.getDecoder().decode("dGltaXIudHJpdmVkaUBzeW5vdmVyZ2UuY29t"));
		// public static final String PASSWORD =new String(Base64.getDecoder().decode("U3lub3ZlcmdlQDEyMw=="));
		
		/* To encode any String use below code
		public static void main(String[] args) {
			String originalInput = "yourName.surname@gmail.com";
			String encryptedData = Base64.getEncoder().encodeToString(originalInput.getBytes());
			System.out.println("encryptedData: "+encryptedData);
		}*/
		
	}

