package org.esir2.sprint2;

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
		// String filename = args[0];
			String filename = "assignTest.wh";
			
			boolean fileHasError = false;
			
			ResourceSet set = resourceSetProvider.get();
			Resource resource = set.getResource(URI.createFileURI(filename), true);
			
			List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
			
			if (!list.isEmpty()) {
				for (Issue issue : list) {
					System.err.println(issue);
				}
				fileHasError = true;
			}
			
			TreeIterator<EObject> AST = resource.getAllContents();
			
			GenerateSymbolTable generator = new GenerateSymbolTable(AST);
			generator.execute();
			System.out.println(generator.toString());
	}
	

}
