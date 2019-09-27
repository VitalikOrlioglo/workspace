package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileHandler {
	public static File[] createImageFiles(String path) {
		File file = new File(path);
		//Anonymous inner class
//		File files[] = file.listFiles(new FilenameFilter() {
			
//			@Override
//			public boolean accept(File dir, String name) {
//				System.out.println(">>>" + name);
//				name = name.toLowerCase();
//				return name.endsWith(".jpg") ||
//						name.endsWith(".png") ||
//						name.endsWith(".jpeg") ||
//						name.endsWith(".gif");
//			}
//		});
		
		//lambda
		File files[] = file.listFiles( ( dir, name) -> {
			return name.endsWith(".jpg") ||
					name.endsWith(".png") ||
					name.endsWith(".jpeg") ||
					name.endsWith(".gif");
		});
		return files;
	}

	public static void main(String[] args) {
		File[] images = createImageFiles("C:\\Users\\Student\\Desktop\\bilder_gross");
		System.out.println(Arrays.toString(images));
		System.out.println(images.length);
	}

}
