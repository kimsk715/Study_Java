package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
//		생선 종류를 파일에 출력한 뒤
//		입력받은 내용을 모두 콘솔에 출력.
//		생선은 3마리.
		String[] fish = {"고등어","참치","삼치"};
		String line = null;
		BufferedWriter fishList = new BufferedWriter(new FileWriter("fishList.txt"));
		BufferedReader fishRead = null; 
		

		
		for (int i = 0; i < fish.length; i++) {
			fishList.write(fish[i] + "\n");
		}


		String temp = "";

		try {
			fishRead = new BufferedReader(new FileReader("fishList.txt"));
	         while((line = fishRead.readLine()) != null) {
	        	 System.out.println();
	            if(line.equals("고등어")) {
	            	temp += "감성돔\n";
	            	System.out.println(temp);
	            	continue;
	            }
	            temp += line + "\n";
	            
	         }
	      } catch (FileNotFoundException e) {
	         System.out.println("경로를 다시 확인바랍니다.");
	      } finally {
	    	  fishRead.close();
	      }
		fishList.write(temp);
		fishList.close();
	}
}
