package org.sgx.momentgwttest1.client;

import java.util.Date;

import org.sgx.jsutil.client.DOMUtil;
import org.sgx.jsutil.client.JsUtil;
import org.sgx.momentgwt.client.Moment;
import org.sgx.momentgwttest1.client.tests.InternationalizationTest1;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;

public class MomentGwtTest1EP implements EntryPoint {

	@Override
	public void onModuleLoad() {
		test1();
	} 
	StringBuffer log= new StringBuffer(); 
	private void test1() {
//		JsUtil.consoleLog("HELLO");
		log(Moment.moment()); 
		log(Moment.moment());
		log(Moment.moment(new Date()).add(2, "days").format("MMMM Do YYYY, h:mm:ss a"));
		log("from french: "+ Moment.moment("2012 juillet", "YYYY MMM", "fr"));
		log("utc: "+Moment.utc());
		log("utc2: "+Moment.utc(new int[]{2010, 1, 14, 15, 25, 50, 125}));
		printLog();
//		new InternationalizationTest1().test1(); 
//		Window.alert("done2");
	}
	private void printLog() {
		DOMUtil.appendStringAsNodes(Document.get().getBody(), "<p>"+log+"/p>"); 
	}
	private void log(Object s) {
		log.append(s); 
		log.append("</br>"); 
	}

}
 