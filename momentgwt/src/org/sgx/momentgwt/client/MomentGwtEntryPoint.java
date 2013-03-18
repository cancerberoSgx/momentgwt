package org.sgx.momentgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public class MomentGwtEntryPoint implements EntryPoint {
	/*
	 * raphael javascript loading using a TextResource and ScriptInjector.fromString(), not using the unsuported <script> in gwt.xml
	 */

	interface RaphaelScripts extends ClientBundle {

		public static RaphaelScripts instance = GWT.create(RaphaelScripts.class);

		@Source("scripts/moment.min.js")
		TextResource momentjs();

	}

	static void loadMomentJs() {
		String text = 
				RaphaelScripts.instance.momentjs().getText();
		ScriptInjector.fromString(text).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	@Override
	public void onModuleLoad() {
		loadMomentJs();
	}
}
