/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/trunk/sakai/admin-tools/su/src/java/org/sakaiproject/tool/su/SuTool.java $
 * $Id: SuTool.java 6970 2006-03-23 23:25:04Z zach.thomas@txstate.edu $
 ***********************************************************************************
 *
 * Copyright (c) 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.user.tool;

import java.util.Comparator;
import java.util.Locale;

/**
 * Comparator for sorting locale by DisplayName
 */
public final class LocaleComparator implements Comparator<Locale>
{
	/**
	 * * Compares Locale objects by comparing the DisplayName * *
	 * 
	 * @param localeOne
	 *        1st Locale Object for comparison *
	 * @param localeTwo
	 *        2nd Locale Object for comparison *
	 * @return negative, zero, or positive integer * (obj1 charge is less than, equal to, or greater than the obj2 charge)
	 */
	public int compare(Locale localeOne, Locale localeTwo)
	{
		String displayNameOne = localeOne.getDisplayName(localeOne).toLowerCase();
		String displayNameTwo = localeTwo.getDisplayName(localeTwo).toLowerCase();
		return displayNameOne.compareTo(displayNameTwo);
	}

	/**
	 * * Override of equals method * *
	 * 
	 * @param obj
	 *        LocaleComparator object *
	 * @return true if equal, false if not equal
	 */
	public boolean equals(Object obj)
	{
		if (obj instanceof LocaleComparator)
			return super.equals(obj);
		else
			return false;
	}
}
