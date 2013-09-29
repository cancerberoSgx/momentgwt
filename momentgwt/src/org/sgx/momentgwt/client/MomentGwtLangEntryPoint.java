package org.sgx.momentgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public class MomentGwtLangEntryPoint implements EntryPoint {
	/*
	 * raphael javascript loading using a TextResource and ScriptInjector.fromString(), not using the unsuported <script> in gwt.xml
	 */

	interface MomentScripts extends ClientBundle {

		public static MomentScripts instance = GWT.create(MomentScripts.class);

		@Source("scripts/moment+langs.min.js")
		TextResource moment_langs_js();

	}

	static void loadMomentJs() {
		String text = 
				MomentScripts.instance.moment_langs_js().getText();
		ScriptInjector.fromString(text).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	@Override
	public void onModuleLoad() {
		loadMomentJs();
	}
}
