/*
 * generated by Xtext
 */
package org.svlang.v0.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractV0Validator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.svlang.v0.v0.V0Package.eINSTANCE);
		return result;
	}
}