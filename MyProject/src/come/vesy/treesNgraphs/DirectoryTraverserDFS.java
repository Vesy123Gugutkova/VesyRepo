package come.vesy.treesNgraphs;

import java.io.File;

public class DirectoryTraverserDFS {
	
	private static void traverseDir(File dir, String spaces) {
		if (dir.isDirectory()) {
			System.out.println(spaces + dir.getAbsolutePath());
			String[] children = dir.list();
			
			for (String child : children) {
				traverseDir(new File(dir, child),spaces);
			}
		}
	}
	
	public static void traverseDir(String directoryPath) {
		traverseDir(new File(directoryPath), new String());
	}
	
	public static void main(String[] args) {
		traverseDir("C:\\");
	}

}
