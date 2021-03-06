/*******************************************************************************
 * Copyright (c) 2011 neXtep Software and contributors.
 * All rights reserved.
 *
 * This file is part of neXtep designer.
 *
 * NeXtep designer is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or any later version.
 *
 * NeXtep designer is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     neXtep Softwares - initial API and implementation
 *******************************************************************************/
package com.nextep.designer.sqlclient.ui.jface;

import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<Date> {

	@Override
	public int compare(Date o1, Date o2) {
		if (o1 == null && o2 != null) {
			return -1;
		} else if (o1 != null && o2 == null) {
			return 1;
		} else {
			return o1.compareTo(o2);
		}
	}

}
