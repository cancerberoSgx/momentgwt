package org.sgx.momentgwt.client;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Duration definition. 
 * @author sg
 */
public class DurationData extends JavaScriptObject {
	protected DurationData() {
	}

	public static final native DurationData create()/*-{
		return {};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int seconds() /*-{
		return this["seconds"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData seconds(int val) /*-{
		this["seconds"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int minutes() /*-{
		return this["minutes"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData minutes(int val) /*-{
		this["minutes"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int hours() /*-{
		return this["hours"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData hours(int val) /*-{
		this["hours"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int days() /*-{
		return this["days"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData days(int val) /*-{
		this["days"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int weeks() /*-{
		return this["weeks"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData weeks(int val) /*-{
		this["weeks"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int months() /*-{
		return this["months"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData months(int val) /*-{
		this["months"] = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final int years() /*-{
		return this["years"];
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final DurationData years(int val) /*-{
		this["years"] = val;
		return this;
	}-*/;
}
