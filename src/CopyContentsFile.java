import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyContentsFile {

	public static void main(String[] args) {
		FileReader fr = null;;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(
					"/Users/Swathi/Documents/workspace/Test/src/sample1.txt");
			 br = new BufferedReader(fr);
			 fw = new FileWriter(
					"/Users/Swathi/Documents/workspace/Test/src/sample2.txt");
			 bw = new BufferedWriter(fw);
			String str = null;
			while (null != ((str = br.readLine()))) {
				System.out.println(str);
				bw.write(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
