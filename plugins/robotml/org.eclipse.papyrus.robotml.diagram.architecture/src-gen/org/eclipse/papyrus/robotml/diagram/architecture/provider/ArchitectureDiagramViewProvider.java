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
package org.eclipse.papyrus.robotml.diagram.architecture.provider;

import static org.eclipse.papyrus.infra.core.Activator.log;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.papyrus.robotml.diagram.architecture.edit.part.ArchitectureDiagramEditPart;
import org.eclipse.papyrus.robotml.diagram.architecture.factory.ArchitectureDiagramViewFactory;

public class ArchitectureDiagramViewProvider extends AbstractViewProvider {

	@Override
	protected boolean provides(CreateDiagramViewOperation operation) {

		if(ArchitectureDiagramEditPart.DIAGRAM_ID.equals(operation.getSemanticHint())) {
			return true;
		}

		return false;
	}

	@Override
	protected Class<?> getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		if(ArchitectureDiagramEditPart.DIAGRAM_ID.equals(diagramKind)) {
			return ArchitectureDiagramViewFactory.class;
		}

		log.error(new Exception("Could not create View."));
		return null;
	}
}
