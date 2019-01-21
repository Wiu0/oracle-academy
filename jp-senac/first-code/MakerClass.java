import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import java.io.File;
import java.io.FileWriter;

public class MakerClass {
//java -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+PrintTenuringDistribution -XX:+HeapDumpOnOutOfMemoryError MakerClass
//java -classpath ".;meta" -XX:MaxMetaspace Size=9m MakerClass Picked up JAVA_TOOL_OPTION: -Duser.language=en
	public static void main(String[] args) {
		try{
			for(int i = 0; i < 256; i++){
				File sf = new File("metaspace/HelloWorld" + i + ".java");
				FileWriter w = new FileWriter(sf);
				w.write("public class HelloWorld" + i + "{ public static void main(String[] args){ System.out.println(\"Hello World\");}}");
				w.flush();
				w.close();
				//Thread.sleep(1000);
			}
		}catch(Exception e){}

		System.setProperty("java.home", "C:\\Program Files\\Java\\jdk1.8.0_141");
		JavaCompiler c = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fm = c.getStandardFileManager(null, null, null);
		File f = new File("D:\\Workspace\\oracle\\jp-senac\\first-code\\metaspace\\");
		Iterable<? extends File> path = Collections.singletonList(f);
		
		try {
			fm.setLocation(StandardLocation.CLASS_OUTPUT, path);
			c.getTask(null, fm, null, null, null, 
					fm.getJavaFileObjects(f.listFiles())).call();
			fm.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
