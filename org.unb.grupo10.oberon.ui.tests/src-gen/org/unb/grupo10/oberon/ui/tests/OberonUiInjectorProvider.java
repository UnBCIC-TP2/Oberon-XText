/*
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.unb.grupo10.oberon.ui.internal.OberonActivator;

public class OberonUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return OberonActivator.getInstance().getInjector("org.unb.grupo10.oberon.Oberon");
	}

}
