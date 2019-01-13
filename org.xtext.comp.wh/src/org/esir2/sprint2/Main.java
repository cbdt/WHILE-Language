package org.esir2.sprint2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.comp.wh.WhStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Main {

	@Inject
	private Provider<ResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceValidator validator;
	
	private static Main instance;
	
	public static void main(String args[]) {
		Main main = Main.getInstance();
		main.launch(args);
	}
	
	public static Main getInstance() {
		if(instance == null) {
			instance = new WhStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(Main.class);
		}
		return instance;
	}
	
	public void launch(String args[]) {
			String filename = args[0];
			String output = args[1];
			//String filename = "assignTest.wh";
			//String output = "";
			boolean fileHasError = false;
			
			ResourceSet set = resourceSetProvider.get();
			Resource resource = set.getResource(URI.createFileURI(filename), true);
			
			List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			
			if (!list.isEmpty()) {
				for (Issue issue : list) {
					System.out.println(issue);
				}
				fileHasError = true;
			}
			
			if(fileHasError) {
				return;
			}
			
			TreeIterator<EObject> AST = resource.getAllContents();
			
			GenerateSymbolTable generator = new GenerateSymbolTable(AST);
			boolean error = generator.execute();
			//System.out.println(generator.toString());
			//System.out.println(generator.toTSCode());
			//System.out.println(generator.toString());
			/*if(error) {
				System.out.println("ERREUR");
				return;
			}
			System.out.println(generator.toTSCode());*/
			
			String basename = output.substring(0, output.length()-3);
			if(!error) {
				writeInFile("Code3Adresse/"+basename+".3ADDR", generator.toString());
			
				if(filename.contains("WHILE_TEST")) {
					String[] dirs = filename.split("/");
					String lastName = dirs[dirs.length-1];
					String name = lastName.substring(0, lastName.length()-3);
					String path = "GEN/CODE3A/" + name + ".txt";
					System.out.println(path);
					writeInFile(path, generator.toString());
					return;
				} 
	
				writeInFile("TS/"+output, generator.toTSCode());
			}
		
			//System.out.println(generator.toTSCode());*/
	}
	
	public static void writeInFile(String path, String content) {
		File file = new File(path);
		try {
			if(!file.exists())
				file.createNewFile();
			FileWriter fw;
			fw = new FileWriter(file);
			fw.write(content);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
