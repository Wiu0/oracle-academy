import java.io.File;
import java.io.FileWriter;

public class MakerFile{
	public static void main(String[] args){
		try{
			for(int i = 0; i < 100000; i++){
				File sf = new File("metaspace/HelloWorld" + i + ".java");
				FileWriter w = new FileWriter(sf);
				w.write("public class HelloWorld" + i + "{ public static void main(String[] args){ System.out.println(\"Hello World\");}}");
				w.flush();
				w.close();
			}
		}catch(Exception e){}
	
	}
}