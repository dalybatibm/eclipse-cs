//============================================================================
//
// Copyright (C) 2002-2004  David Schneider
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//============================================================================

package com.atlassw.tools.eclipse.checkstyle.projectconfig.filters;

import java.util.List;

/**
 * Interface for a filter.
 * 
 * @author Lars K�dderitzsch
 */
public interface IFilter extends Cloneable
{

    /**
     * Initializes this filter with common attributes.
     * 
     * @param name the name of the filter
     * @param internalName the internal name of the filter
     * @param desc the filters description
     * @param editor the filter editor or null if not editable
     * @param readonly true if the filter is readonly
     */
    void initialize(String name, String internalName, String desc, Class editor, boolean readonly);

    /**
     * Gets the displayable name of the filter.
     * 
     * @return the filter name
     */
    String getName();

    /**
     * Gets the internal name of the filter.
     * 
     * @return the internal name
     */
    String getInternalName();

    /**
     * Gets the description of the filter.
     * 
     * @return the description
     */
    String getDescription();

    /**
     * Gets the editor class for the filter.
     * 
     * @return the editor class
     */
    Class getEditorClass();

    /**
     * Returns if a filter is editable.
     * 
     * @return true - the filter is editable
     */
    boolean isEditable();

    /**
     * Returns if the filter is readonly.
     * 
     * @return true - if the filter is readonly
     */
    boolean isReadonly();

    /**
     * Returns if the filter is selected.
     * 
     * @return true - if the filter is selected
     */
    boolean isEnabled();

    /**
     * Sets the filter as selected.
     * 
     * @param selected true - if the filter is selected
     */
    void setEnabled(boolean selected);

    /**
     * Returns the data of this filter.
     * 
     * @return the filter data
     */
    List getFilterData();

    /**
     * Sets the filter data for this filter.
     * 
     * @param filterData the filter data
     */
    void setFilterData(List filterData);

    /**
     * Returns a presentable form of the filter data of editable filters.
     * 
     * @return Presentable filter data
     */
    String getPresentableFilterData();

    /**
     * A clone of this filter.
     * 
     * @return the clone
     */
    Object clone();

    /**
     * Determines wheter an object passes this filter.
     * 
     * @param element the element to check
     * @return true - the element passes the filter
     */
    boolean accept(Object element);

}