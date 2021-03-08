package APIautomation;

public class APIService {

	public static String getBody() {
		return "[\r\n" + 
				"  {\r\n" + 
				"    \"id\": 9222968140497184000,\r\n" + 
				"    \"category\": {\r\n" + 
				"      \"id\": 3,\r\n" + 
				"      \"name\": \"Kitten\"\r\n" + 
				"    },\r\n" + 
				"    \"name\": \"cutie\",\r\n" + 
				"    \"photoUrls\": [\r\n" + 
				"      \"photos_yet_to_be_take_for_update.com\"\r\n" + 
				"    ],\r\n" + 
				"    \"tags\": [\r\n" + 
				"      {\r\n" + 
				"        \"id\": 1,\r\n" + 
				"        \"name\": \"white cutie\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"status\": \"pending\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"id\": 1410,\r\n" + 
				"    \"category\": {\r\n" + 
				"      \"id\": 1410,\r\n" + 
				"      \"name\": \"Walter\"\r\n" + 
				"    },\r\n" + 
				"    \"name\": \"doggie\",\r\n" + 
				"    \"photoUrls\": [\r\n" + 
				"      \"www.google.com\"\r\n" + 
				"    ],\r\n" + 
				"    \"tags\": [\r\n" + 
				"      {\r\n" + 
				"        \"id\": 1410,\r\n" + 
				"        \"name\": \"White\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"status\": \"pending\"\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"id\": 1111,\r\n" + 
				"    \"category\": {\r\n" + 
				"      \"id\": 1111,\r\n" + 
				"      \"name\": \"Steve\"\r\n" + 
				"    },\r\n" + 
				"    \"name\": \"doggie\",\r\n" + 
				"    \"photoUrls\": [\r\n" + 
				"      \"www.stevehanks.com/io/photos\"\r\n" + 
				"    ],\r\n" + 
				"    \"tags\": [\r\n" + 
				"      {\r\n" + 
				"        \"id\": 1111,\r\n" + 
				"        \"name\": \"Hanks\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"status\": \"pending\"\r\n" + 
				"  }\r\n" + 
				"]";
	}
	
	public static String postBody(int id, String petname) {
		return "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    },\r\n" + 
				"{\r\n" + 
				"      \"id\": "+id+",\r\n" + 
				"      \"name\": "+petname+"\r\n" + 
				"    },\r\n" + 
				"\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}";
				
	}
	
	public static String putBody(String id, String name) {
		return "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": "+id+",\r\n" + 
				"      \"name\": "+name+"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}";
	}
}
