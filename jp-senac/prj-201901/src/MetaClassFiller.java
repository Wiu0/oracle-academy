import java.io.Console;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.function.Supplier;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;

/**
 * Little changes to be faster reading
 * @author http://www.herongyang.com/JVM/Data-Area-Method-Area-Expansion-Demonstration.html
 */

public class MetaClassFiller {

	public static void loadRtJar() throws IOException {
		String jarName = System.getProperty("java.home") + "\\lib\\rt.jar";
		System.out.println("Loading all classes in: "+ jarName);
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		JarFile jar = new JarFile(jarName); 
		
//		execJava8(jar, loader);
		execJava7(loader, jar);
	}
	
	public static void execJava7(ClassLoader loader, JarFile jar) {
		try {
			int count = 0;
			Enumeration<JarEntry> all = jar.entries();
			while (all.hasMoreElements()) {
				JarEntry one = (JarEntry) all.nextElement();
				String name = one.getName();
				if (name.indexOf(".class")>=0) {
					name = name.replaceAll(".class$", "");
					name = name.replaceAll("/", ".");
					loader.loadClass(name);
					count++;
				}
			}
			System.out.println("# of classes loaded: "+count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void execJava8(JarFile jar, ClassLoader loader) throws IOException {
		//J8			
		Supplier<Stream<JarEntry>> s = () -> Collections.list(jar.entries()).stream();
		Stream<JarEntry> filter = s.get().filter(c -> c.getName().indexOf(".class") >= 0);
		filter.forEach(cc -> {
			try {
				loader.loadClass(cc.getName().replaceAll(".class$", "").replaceAll("/", "."));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		System.out.println("# of classes loaded: " + s.get().count());
	}
	
	public static void heapCheck() {
		Runtime rt = Runtime.getRuntime();
		Console con = System.console();
		long total = rt.totalMemory()/1048576;
		long free = rt.freeMemory()/1048576;
		long used = total - free;
		con.format("Total memory: %s%n",total);
		con.format(" Free memory: %s%n",free);
		con.format(" Used memory: %s%n",used);
		@SuppressWarnings("unused")
		String str = con.readLine("Press ENTER key to continue: ");
	}

	public static void main(String[] a) throws IOException {
		heapCheck();
		loadRtJar();
		heapCheck();
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		heapCheck();
	}
}
