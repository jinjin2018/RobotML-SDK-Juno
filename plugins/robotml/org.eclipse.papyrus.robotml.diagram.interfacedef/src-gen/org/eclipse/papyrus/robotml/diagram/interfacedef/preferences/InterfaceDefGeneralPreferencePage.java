/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-C Free Software License v1.0
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-C_V1-en.html
 *
 * Contributors:
 *  Saadia DHOUIB (CEA LIST) - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.papyrus.robotml.diagram.interfacedef.preferences;

import org.eclipse.papyrus.robotml.diagram.interfacedef.Activator;

public class InterfaceDefGeneralPreferencePage extends DiagramPreferencePage {

	public InterfaceDefGeneralPreferencePage() {
		setPreferenceStore(Activator.getInstance().getPreferenceStore());
	}
}
