
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum SearchParamTypeEnum {

	/**
	 * Code Value: <b>number</b>
	 *
	 * Search parameter SHALL be a number (a whole number, or a decimal).
	 */
	NUMBER("number", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>date</b>
	 *
	 * Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.
	 */
	DATE("date", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>string</b>
	 *
	 * Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.
	 */
	STRING("string", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>token</b>
	 *
	 * Search parameter on a coded element or identifier. May be used to search through the text, displayname, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a "|", depending on the modifier used.
	 */
	TOKEN("token", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>reference</b>
	 *
	 * A reference to another resource.
	 */
	REFERENCE("reference", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>composite</b>
	 *
	 * A composite search parameter that combines a search on two values together.
	 */
	COMPOSITE("composite", "http://hl7.org/fhir/search-param-type"),
	
	/**
	 * Code Value: <b>quantity</b>
	 *
	 * A search parameter that searches on a quantity.
	 */
	QUANTITY("quantity", "http://hl7.org/fhir/search-param-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * http://hl7.org/fhir/vs/search-param-type
	 */
	public static final String VALUESET_IDENTIFIER = "http://hl7.org/fhir/vs/search-param-type";

	/**
	 * Name for this Value Set:
	 * SearchParamType
	 */
	public static final String VALUESET_NAME = "SearchParamType";

	private static Map<String, SearchParamTypeEnum> CODE_TO_ENUM = new HashMap<String, SearchParamTypeEnum>();
	private static Map<String, Map<String, SearchParamTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, SearchParamTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (SearchParamTypeEnum next : SearchParamTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, SearchParamTypeEnum>());
			}
			SYSTEM_TO_CODE_TO_ENUM.get(next.getSystem()).put(next.getCode(), next);			
		}
	}
	
	/**
	 * Returns the code associated with this enumerated value
	 */
	public String getCode() {
		return myCode;
	}
	
	/**
	 * Returns the code system associated with this enumerated value
	 */
	public String getSystem() {
		return mySystem;
	}
	
	/**
	 * Returns the enumerated value associated with this code
	 */
	public SearchParamTypeEnum forCode(String theCode) {
		SearchParamTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<SearchParamTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<SearchParamTypeEnum>() {
		@Override
		public String toCodeString(SearchParamTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(SearchParamTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public SearchParamTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public SearchParamTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, SearchParamTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	SearchParamTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
