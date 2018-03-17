package excelProjectTestbed;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DisplayDirectory {
	
	public static int countFiles(File[] files) {
		int numXLSXFiles = 1;
		if(files == null) return 1;
	    for (File file : files) {
	    			numXLSXFiles = 0;
	        if (file.isDirectory()) {
	         
	        } else {
	            String fileName = file.getName();
	            if (fileName.endsWith(".xlsx"))
	            		numXLSXFiles++;
	        }
	    }
	    return numXLSXFiles;
	}
	
	public static void listXLSXFiles(File[] files) {
	    for (File file : files) {
	        if (file.isDirectory()) {
	            // Do nothing with directories when it comes to list out .xlsx files
	        } else {
	            String fileName = file.getName();
	            if (fileName.toLowerCase().endsWith(".xlsx") && 
	            				!fileName.toLowerCase().startsWith("~$"))
	            		System.out.println("     " + fileName);
	        }
	    }
	}
	
	public static void showFiles(File[] files, String parents) {
	    for (File file : files) {
	        if (file.isDirectory()) {
	        		// Display the directory name only if it directly contains at least
	        		// one .xlsx type of file
	        		if (countFiles(file.listFiles()) > 0) {
	        			System.out.println("Directory: " + parents + "/" + file.getName());
	        			listXLSXFiles(file.listFiles());
	        		}
	        		
	        		// Recursively process child folders on the off chance they have
	        		// one or more .xlsx files.
	            showFiles(file.listFiles(), parents + "/" + file.getName());
	        }
	    }
	}

	public static void main(String[] args) {

		try {
			Files.newDirectoryStream(Paths.get("./poi-3.17"), path -> path.toFile().isFile())
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//
		System.out.println("\n**********\n");

		String dir = "./poi-3.17";
		List <String> fileNamesList = new ArrayList <String> ();
		
		try {
			Files.newDirectoryStream(Paths.get(dir),
					path -> path.toString().endsWith(".jar")).forEach(filePath -> fileNamesList.add(filePath.toString()));
		}catch (IOException e) {
			e.printStackTrace();
		}

		
		for (String name : fileNamesList) {
			System.out.println(name.substring(dir.length()+1));
		}

		//
		System.out.println("\n**********\n");

		try {
			Files.newDirectoryStream(Paths.get(dir),
					path -> path.toString().endsWith(".jar")).forEach(filePath -> 
					System.out.println(filePath.toString().substring(dir.length()+1)));
		}catch (IOException e) {
			e.printStackTrace();
		}

		//
		System.out.println("\n**********\n");

		try {
			Files.newDirectoryStream(Paths.get(dir),
					path -> path.toString().endsWith(".jar")).forEach(filePath -> 
					System.out.println(filePath.toString().substring(dir.length()+1)));
		}catch (IOException e) {
			e.printStackTrace();
		}

		//
		System.out.println("\n**********\n");

	    File[] files = new File("../..").listFiles();
	    showFiles(files, "");

	}

}
