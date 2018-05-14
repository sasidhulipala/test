
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ReadFile rf = new ReadFile();
       rf.processFile();
		
	}
	
	
	public void processFile() {
		File inFile = new File("D:\\test.txt");
		BufferedReader in = null;
		try {
		  in = new BufferedReader(new FileReader(inFile));
		  String str;
		  while ((str = in.readLine()) != null) {
		    	parseString(str);
		  }
		} catch (IOException ex) {
			ex.printStackTrace();
		  }
		try {
			in.close();
		} catch (IOException e) {
		  }
	}
	
	public void parseString(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		int counter = 0;
		boolean found = false;
		String locStr;
		String res = "";
		if (str.indexOf("Feb") > 0) 
			;
		else
			return;
		
		while (st.hasMoreTokens()) {
			locStr = st.nextToken();
            if (counter == 0 && locStr.indexOf("/") > 0) {
            	found = true;
                res = locStr;
            	break;
            }
            if (counter == 0 && locStr.indexOf("rw") > 0) {
            	found = true;
          	
            }
            
            if (found && counter > 4)
            	res += locStr + " ";
            counter++;
 		}
		 if (found)
 			System.out.println(res);
		
	}
	
	
	

}
