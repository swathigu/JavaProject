import java.io.File;

/*
 * Write a program to show list of all file names in a folder
 */
public class FileListFromFolder {

	public static void main(String[] args) {
		File file = new File("/Users/Swathi/Documents/workspace/Test/src");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
	}

}
