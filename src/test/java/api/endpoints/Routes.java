package api.endpoints;

public class Routes {
//Here we basically add our base url
	
	public static String baseURL="https://petstore.swagger.io/v2";
	
	
	//User module
	public static String post_url=baseURL+"/user";
	public static String get_url=baseURL+"/user/{username}";
	public static String update_url=baseURL+"/user/{username}";
	public static String delete_url=baseURL+"/user/{username}";
}
