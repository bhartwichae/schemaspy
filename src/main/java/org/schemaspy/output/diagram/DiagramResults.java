/*
 * Copyright (C) 2018 Nils Petzaell
 *
 * This file is part of SchemaSpy.
 *
 * SchemaSpy is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SchemaSpy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with SchemaSpy. If not, see <http://www.gnu.org/licenses/>.
 */
package org.schemaspy.output.diagram;

import java.io.File;
import java.util.Objects;

/**
 * @author Nils Petzaell
 */
public class DiagramResults {

    private final File diagramFile;
    private final String diagramMapName;
    private final String diagramMap;

    public DiagramResults(File diagramFile, String diagramMapName, String diagramMap) {
        this.diagramFile = diagramFile;
        this.diagramMapName = diagramMapName;
        if (Objects.nonNull(diagramMap)) {
            this.diagramMap = diagramMap.trim();
        } else {
            this.diagramMap = "";
        }

    }

    public File getDiagramFile() {
        return diagramFile;
    }

    public String getDiagramMapName() {
        return diagramMapName;
    }

    public String getDiagramMap() {
        return diagramMap;
    }
}