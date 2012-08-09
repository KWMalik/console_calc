package calccore;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class for working with *.txt files. Reading and writing
 * 
 *  @author alexandr afanasev
 */

public class TxtFileWorker {
	private String readPath;
	private String writePath;

	public TxtFileWorker(String readPath,String writePath) {
		this.readPath = readPath;
		this.writePath=writePath;
	}
	
	
/**
 * Reading text file with readPath path.
 * @return <i>List</i> with Strings from file been read.
 */
	public List<String> readTxt() throws FileNotFoundException {

		Scanner in = new Scanner(new File(readPath));
		List<String> result = new ArrayList<String>();
		//Line counter
		int i=0;
		while (in.hasNextLine()) {
			result.add(in.nextLine());
			i++;
		}
		in.close();
		System.out.println(i+" line(s) have been read from "+readPath);
		return result;
	}
	
	/**
	 * Writing String into file with writePath path.
	 * @param <i>List</i>to write.
	 */	
	public void writeTxt(List<String> toWrite) throws FileNotFoundException{
		PrintWriter out=new PrintWriter(new File(writePath));
		for (int i=0;i<toWrite.size();i++){
			out.write(toWrite.get(i)+"\n");
		}
		out.close();
		System.out.println("Wrinig to file "+writePath+" completed");
	}
	
	@Override
	public String toString(){
		return "Reading from "+readPath+" | Writing to "+ writePath;
	}
	
}
