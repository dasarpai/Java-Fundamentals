package edureka3.xml;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONEncode{
		public static void main(String args[]) throws IOException, ParseException {
	
		  	JSONObject studentJson=new JSONEncode().createJSON();
			new JSONEncode().printJSON(studentJson);
			new JSONEncode().writeToFile(studentJson,"student.json");
			new JSONEncode().readJSON("student.json");
		}
	
		private JSONObject createJSON(){
			JSONObject studentJson=new JSONObject();
			studentJson.put("firstname","John");
			studentJson.put("lastname","Lee");
			studentJson.put("email","John@123");
			studentJson.put("marks",new Integer(45));
	        return studentJson;
		}
	
		private void printJSON(JSONObject json){
			System.out.println(json);
		}
		private void writeToFile(JSONObject json, String absoluteFileName) throws IOException {
			FileWriter jsonFileWriter = new FileWriter(absoluteFileName);
			jsonFileWriter.write(json.toJSONString());
			jsonFileWriter.flush();
			jsonFileWriter.close();
		}
		private void readJSON(String absoluteFileName) throws IOException, ParseException {
		  JSONObject jsonAsObject=(JSONObject)new JSONParser().parse( new FileReader(absoluteFileName));
			System.out.println(jsonAsObject.get("firstname"));
			System.out.println(jsonAsObject.get("lastname"));
			System.out.println(jsonAsObject.get("email"));
		}
}    