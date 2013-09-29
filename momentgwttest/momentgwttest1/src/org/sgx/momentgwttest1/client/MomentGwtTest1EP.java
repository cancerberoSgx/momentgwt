package org.sgx.momentgwttest1.client;

import java.util.Date;

import org.sgx.momentgwt.client.Moment;
import org.sgx.momentgwttest1.client.tests.InternationalizationTest1;

import com.google.gwt.core.client.EntryPoint;

public class MomentGwtTest1EP implements EntryPoint {

	@Override
	public void onModuleLoad() {
		test1();
	} 
	private void test1() {
		System.out.println(Moment.moment());
		System.out.println(Moment.moment(new Date()).add(2, "days").format("MMMM Do YYYY, h:mm:ss a"));
		System.out.println("from french: "+ Moment.moment("2012 juillet", "YYYY MMM", "fr"));
		System.out.println("utc: "+Moment.moment().utc());
		System.out.println("utc2: "+Moment.moment().utc(new int[]{2010, 1, 14, 15, 25, 50, 125}));		
//		new InternationalizationTest1().test1(); 
	}

}
