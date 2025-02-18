package br.com.oracle.lesson1;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

public class HelloWorld {

	public static void main(String[] args) {

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
