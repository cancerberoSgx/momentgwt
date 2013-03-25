package org.sgx.momentgwttest1.client.tests;

import org.sgx.momentgwt.client.Moment;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;

/**
 * For setting other language than en, we must first load the language script and then call lang(). 
 * 
 * In this example we load the es language from url https://raw.github.com/timrwood/moment/develop/lang/es.js
 * 
 * Alternatively the same can be done in gwt copying the used lang/xx.js to a java package, and create a TextResource or ExternalResource and use ScriptInjector with the string for 
 * loading dynamiclly.  
 *
 * see http://momentjs.com/docs/#/i18n/
 * 
 * @author sg
 *
 */
public class InternationalizationTest1 {
public void test1() {
	String langEsUrl="https://raw.github.com/timrwood/moment/develop/min/lang/es.js";
	ScriptInjector.fromUrl(langEsUrl).setWindow(ScriptInjector.TOP_WINDOW).setCallback(new Callback<Void, Exception>() {		
		@Override
		public void onSuccess(Void result) {			
			//set the lang globally
			Moment.lang("es"); 
			System.out.println("hoy es : "+Moment.moment().format("dddd"));
		}		
		@Override
		public void onFailure(Exception reason) {			
		}
	}).inject(); 
}
}
