package org.sgx.momentgwt.client;

import java.util.Date;

import org.sgx.jsutil.client.JsObject;
import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;
/**
 * this is the moment instance - this is, the object that it's returned from js moment(). 
 * It also contains static methods for calling the moment() function. 
 * Note, javadocs copied & compressed from momentjs.com site
 * @author sg
 *
 */
public class Moment extends JavaScriptObject {
protected Moment(){}



///////////////////////////////////////////////////
////// MOMENT CREATION - moment() /////////////////
///////////////////////////////////////////////////


/**
 * Now. <div><pre>moment();</pre><p>To get the current date and time, just call <code>moment()</code> with no parameters.</p><div><pre><span>var</span> now = moment();
</pre></div><p>This is essentially the same as calling <code>moment(new Date())</code>.</p></div>
 * <p>Note, You can use static import java statement of this method :</p> 
 * <pre>static import org.sgx.momentgwt.client.Moment.moment;</pre> 
 * @return
 */
public static final native Moment moment()/*-{
	return $wnd.moment();
}-*/;

/**
 * <div><pre>moment(String);</pre><p>You can create a moment from a string that can be parsed by <code>Date.parse</code>.</p><div><pre><span>var</span> day = moment(<span>"Dec 25, 1995"</span>);
</pre></div><p><strong>Warning</strong> Browser support for this is inconsistent. Because there is no specification on which formats should be supported, what works in some browsers will not work in other browsers.</p><p>For more consistent results, you should use <a>String + Format</a>.</p><p>There is one exception. Moment.js does detect if you are using an ISO-8601 string and will parse that correctly without a format string.</p><p>The following ISO-8601 formats are supported across all browsers.</p><div><pre><span>"YYYY-MM-DD"</span><span>"YYYY-MM-DDTHH"</span><span>"YYYY-MM-DD HH"</span><span>"YYYY-MM-DDTHH:mm"</span><span>"YYYY-MM-DD HH:mm"</span><span>"YYYY-MM-DDTHH:mm:ss"</span><span>"YYYY-MM-DD HH:mm:ss"</span><span>"YYYY-MM-DDTHH:mm:ss.SSS"</span><span>"YYYY-MM-DD HH:mm:ss.SSS"</span><span>"YYYY-MM-DDTHH:mm:ss Z"</span><span>"YYYY-MM-DD HH:mm:ss Z"</span></pre></div><p><strong>Note:</strong> Automatic cross browser ISO-8601 support was added in version <strong>1.5.0</strong></p><p>If a string does not match any of the above formats and is not able to be parsed with <code>Date.parse</code>, <code>moment#isValid</code> will return false.</p><div><pre>moment(<span>"not a real date"</span>).isValid(); <span>// false</span></pre></div></div>
 * @param date
 * @return
 */
public static final native Moment moment(String date)/*-{
return $wnd.moment(date);
}-*/;

/**
 * <div><pre>moment(String);</pre><p>You can create a moment from a string that can be parsed by <code>Date.parse</code>.</p><div><pre><span>var</span> day = moment(<span>"Dec 25, 1995"</span>);
</pre></div><p><strong>Warning</strong> Browser support for this is inconsistent. Because there is no specification on which formats should be supported, what works in some browsers will not work in other browsers.</p><p>For more consistent results, you should use <a>String + Format</a>.</p><p>There is one exception. Moment.js does detect if you are using an ISO-8601 string and will parse that correctly without a format string.</p><p>The following ISO-8601 formats are supported across all browsers.</p><div><pre><span>"YYYY-MM-DD"</span><span>"YYYY-MM-DDTHH"</span><span>"YYYY-MM-DD HH"</span><span>"YYYY-MM-DDTHH:mm"</span><span>"YYYY-MM-DD HH:mm"</span><span>"YYYY-MM-DDTHH:mm:ss"</span><span>"YYYY-MM-DD HH:mm:ss"</span><span>"YYYY-MM-DDTHH:mm:ss.SSS"</span><span>"YYYY-MM-DD HH:mm:ss.SSS"</span><span>"YYYY-MM-DDTHH:mm:ss Z"</span><span>"YYYY-MM-DD HH:mm:ss Z"</span></pre></div><p><strong>Note:</strong> Automatic cross browser ISO-8601 support was added in version <strong>1.5.0</strong></p><p>If a string does not match any of the above formats and is not able to be parsed with <code>Date.parse</code>, <code>moment#isValid</code> will return false.</p><div><pre>moment(<span>"not a real date"</span>).isValid(); <span>// false</span></pre></div></div>
 * @param date
 * @return
 */
public static final native Moment moment(String date, String format, String lang)/*-{
return $wnd.moment(date, format, lang);
}-*/;


/**
 * <div><pre>moment(String, String[]);</pre><p>If you don't know the exact format of an input string, but know it could be one of many, you can use an array of formats.</p><p>This is the same as <a>String + Format</a>, only it will try to match the input to multiple formats.</p><div><pre>moment(<span>"12-25-1995"</span>, [<span>"MM-DD-YYYY"</span>, <span>"YYYY-MM-DD"</span>]);
</pre></div><p>This approach is fundamentally problematic in cases like the following, where there is a difference in big, medium, or little endian date formats.</p><div><pre>moment(<span>"05-06-1995"</span>, [<span>"MM-DD-YYYY"</span>, <span>"DD-MM-YYYY"</span>]); <span>// June 5th or May 6th?</span>
moment(<span>"040506"</span>, [<span>"MMDDYY"</span>, <span>"DDMMYY"</span>, <span>"YYMMDD"</span>]); <span>// Apr 5 2006, May 4 2006, or May 6 2004?</span></pre></div><p>This is also the reason Moment.js does not do "magical" string parsing.</p><p><strong>Note:</strong> Parsing multiple formats is considerably slower than parsing a single format. If you can avoid it, it is much faster to parse a single format.</p></div>

 * @param date
 * @param format
 * @return
 */
public static final native Moment moment(String date, String[]format)/*-{
return $wnd.moment(date, @org.sgx.jsutil.client.JsUtil::toJsArrayString([Ljava/lang/Object;)(format));
}-*/;

/**
 * <div><pre>moment(String, String[]);</pre><p>If you don't know the exact format of an input string, but know it could be one of many, you can use an array of formats.</p><p>This is the same as <a>String + Format</a>, only it will try to match the input to multiple formats.</p><div><pre>moment(<span>"12-25-1995"</span>, [<span>"MM-DD-YYYY"</span>, <span>"YYYY-MM-DD"</span>]);
</pre></div><p>This approach is fundamentally problematic in cases like the following, where there is a difference in big, medium, or little endian date formats.</p><div><pre>moment(<span>"05-06-1995"</span>, [<span>"MM-DD-YYYY"</span>, <span>"DD-MM-YYYY"</span>]); <span>// June 5th or May 6th?</span>
moment(<span>"040506"</span>, [<span>"MMDDYY"</span>, <span>"DDMMYY"</span>, <span>"YYMMDD"</span>]); <span>// Apr 5 2006, May 4 2006, or May 6 2004?</span></pre></div><p>This is also the reason Moment.js does not do "magical" string parsing.</p><p><strong>Note:</strong> Parsing multiple formats is considerably slower than parsing a single format. If you can avoid it, it is much faster to parse a single format.</p></div>

 * @param date
 * @param format
 * @return
 */
public static final native Moment moment(String date, JsArrayString format)/*-{
return $wnd.moment(date, format);
}-*/;

/**
 * <div>Unix Offset (milliseconds)<p>Similar to <code>new Date(Number)</code>, you can create a moment by passing an integer value representing the number of <em>milliseconds</em> since the Unix Epoch (Jan 1 1970 12AM UTC).</p>
<div class="highlight"><pre lang="javascript"><span class="keyword">var</span> day = moment(<span class="number">1318781876406</span>);
</pre></div>
 * @param i
 * @return
 */
public static final native Moment moment(int milliseconds)/*-{
return $wnd.moment(milliseconds);
}-*/;
/**
 * <div><pre>moment(Date);</pre><p>You can create a <code>Moment</code> with a pre-existing native Javascript <code>Date</code> object.</p><div><pre><span>var</span> day = <span>new</span> Date(<span>2011</span>, <span>9</span>, <span>16</span>);
<span>var</span> dayWrapper = moment(day);
</pre></div><p>This is the fastest way to get a Moment.js wrapper.</p></div>
 * @param date a javascript date object
 * @return
 */
public static final native Moment moment(JavaScriptObject date)/*-{
return $wnd.moment(date);
}-*/;
/**
 * creates a Moment from a Java date. 
 * @param date
 * @return
 */
public static final native Moment moment(Date date)/*-{
return $wnd.moment(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(date));
}-*/;
//public static Moment moment(Date date) {
//	return moment(JsDate.create(date.getTime()));
//}
/**
 * <div><pre>moment.unix(Number)</pre><p>To create a moment from a Unix timestamp (<em>seconds</em> since the Unix Epoch), use <code>moment.unix(Number)</code>.</p><div><pre><span>var</span> day = moment.unix(<span>1318781876</span>);
</pre></div><p>This is implemented as <code>moment(timestamp * 1000)</code>, so partial seconds in the input timestamp are included.</p><div><pre><span>var</span> day = moment.unix(<span>1318781876.721</span>);
</pre></div></div>
 * @param seconds
 * @return
 */
public final native Moment unix(double seconds)/*-{
return $wnd.unix(seconds);
}-*/;

/**
 * 
<div><pre>moment(Number[]);</pre><p>You can create a moment with an array of numbers that mirror the parameters passed to <a>new Date()</a></p><div><pre>[year, month, day, hour, minute, second, millisecond]
moment([<span>2010</span>, <span>1</span>, <span>14</span>, <span>15</span>, <span>25</span>, <span>50</span>, <span>125</span>]); <span>// February 14th, 3:25:50.125 PM</span></pre></div><p>Any value past the year is optional, and will default to the lowest possible number.</p><div><pre>moment([<span>2010</span>]); <span>// January 1st</span>
moment([<span>2010</span>, <span>6</span>]); <span>// July 1st</span>
moment([<span>2010</span>, <span>6</span>, <span>10</span>]); <span>// July 10th</span></pre></div><p>Construction with an array will create a date in the current timezone. To create a date from an array at UTC, use <code>moment.utc(Number[])</code>.</p><div><pre>moment.utc([<span>2010</span>, <span>1</span>, <span>14</span>, <span>15</span>, <span>25</span>, <span>50</span>, <span>125</span>]);
</pre></div><p><strong>Note:</strong> Because this mirrors the native Date parameters, the following parameters are all zero indexed: months, hours, minutes, seconds, and milliseconds. Years and days of the month are 1 indexed.</p><p>This is often the cause of frustration, especially with months, so take note!</p><p>If the date represented by the array does not exist, <code>moment#isValid</code> will return false.</p><div><pre>moment([<span>2010</span>, <span>13</span>]).isValid(); <span>// false (not a real month)</span>
moment([<span>2010</span>, <span>11</span>, <span>31</span>]).isValid(); <span>// false (not a real day)</span>
moment([<span>2010</span>, <span>2</span>, <span>29</span>]).isValid(); <span>// false (not a leap year)</span></pre></div></div>

 * @param a
 * @return
 */
public final native Moment moment(int[]a)/*-{
return $wnd.moment(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(a));
}-*/;

/**
 * Clone. <div><pre>moment(Moment);</pre><p>All moments are mutable. If you want a clone of a moment, you can do so explicitly or implicitly.</p><p>Calling <code>moment()</code> on a moment will clone it.</p><div><pre><span>var</span> a = moment([<span>2012</span>]);
<span>var</span> b = moment(a);
a.year(<span>2000</span>);
b.year(); <span>// 2012</span></pre></div><p>Additionally, you can call <code>moment#clone</code> to clone a moment.</p><div><pre><span>var</span> a = moment([<span>2012</span>]);
<span>var</span> b = a.clone();
a.year(<span>2000</span>);
b.year(); <span>// 2012</span></pre></div></div>
 * @param m
 * @return
 */
public final native Moment moment(Moment m)/*-{
return $wnd.moment(m);
}-*/;


/**<p>The main <code>moment()</code> function is very flexible and will allow overflowing in parsing input. For example, <code>moment("2012-01-40", "YYYY-MM-DD")</code> will overflow the date value into the months, making the actual moment Feb 9 (31 days in Jan + 9 days into Feb).</p><p>This can be useful when getting things like the 150th day of the year, or the 500th minute in a day, however, it can be problematic when trying to parse user input.</p><p><code>moment#isValid</code> was added to check if the input for a moment is indeed a valid date.</p><p><strong>Note:</strong> It is not intended to be used to validate that the input string matches the format string. Because the strictness of format matching can vary depending on the application and business requirements, this sort of validation is not included in Moment.js.</p><p>Instead, <code>moment#isValid</code> answers questions like "Does March 32nd exist?" and "Does February 29th 2011 exist?".</p><div><pre>moment(<span>"2011-10-10"</span>, <span>"YYYY-MM-DD"</span>).isValid(); <span>// true</span>
moment(<span>"2011-10-50"</span>, <span>"YYYY-MM-DD"</span>).isValid(); <span>// false (bad day of month)</span></pre></div><p>It works with ISO 8601 parsing.</p><div><pre>moment(<span>"2011-10-10T10:20:90"</span>).isValid(); <span>// false (bad seconds)</span></pre></div><p>It works with an array of numbers that mirror the parameters passed to <code>new Date()</code>.</p><div><pre>moment([<span>2011</span>, <span>0</span>, <span>1</span>]).isValid(); <span>// true</span>
moment([<span>2011</span>, <span>0</span>, <span>50</span>]).isValid(); <span>// false (bad day of month)</span></pre></div><p>It also works with a string that gets passed to <code>Date.parse()</code></p><div><pre>moment(<span>"not a date"</span>).isValid(); <span>// false</span></pre></div><p><strong>Note:</strong> The <code>moment#isValid</code> method will not work after manipulating the moment object with any of the manipulation methods.</p><div><pre>moment(<span>"2011-10-10"</span>, <span>"YYYY-MM-DD"</span>).isValid(); <span>// true</span>
moment(<span>"2011-10-10"</span>, <span>"YYYY-MM-DD"</span>).date(<span>20</span>).isValid(); <span>// false</span></pre></div></div>
 * @return true iff this is a valid moment object, for example: 
 * <pre>moment("2010 notamonth 29", "YYYY MMM DD").isValid(); 
 * // false (not a real month name)</pre>
 */
public final native boolean isValid()/*-{
return this.isValid(); 
}-*/;









//UTC
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc()/*-{
return $wnd.moment.utc();
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(double i)/*-{
return $wnd.moment.utc(i);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(double[]i)/*-{
return $wnd.moment.utc(@org.sgx.jsutil.client.JsUtil::toJsArrayDouble([D)(i));
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(int[]i)/*-{
	var param = @org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(i);  
//	debugger;	
//	@org.sgx.jsutil.client.JsUtil::consoleLog(Lcom/google/gwt/core/client/JavaScriptObject;)(param);	
	return $wnd.moment.utc(param); 
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(JsArrayNumber i)/*-{
return $wnd.moment.utc(i);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(String i)/*-{
return $wnd.moment.utc(i);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(String i, String j)/*-{
return $wnd.moment.utc(i, j);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(String i, JsArrayString j)/*-{
return $wnd.moment.utc(i, j);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(String i, String[] j)/*-{
return $wnd.moment.utc(i, @org.sgx.jsutil.client.JsUtil::toJsArrayString([Ljava/lang/String;)(j));
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(String i, String j, String k)/*-{
return $wnd.moment.utc(i, j, k);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(Moment m)/*-{
return $wnd.moment.utc(m);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(JavaScriptObject date)/*-{
return $wnd.moment.utc(date);
}-*/;
/**
 * <div><pre>moment.utc();
moment.utc(Number);
moment.utc(Number[]);
moment.utc(String);
moment.utc(String, String);
moment.utc(String, String[]);
moment.utc(String, String, String);
moment.utc(Moment);
moment.utc(Date);</pre><p>By default, moment parses and displays in local time.</p><p>If you want to parse or display a moment in UTC, you can use <code>moment.utc()</code> instead of <code>moment()</code>.</p><p>This brings us to an interesting feature of Moment.js. UTC mode.</p><p>While in UTC mode, all display methods will display in UTC time instead of local time.</p><div><pre>moment().format();     <span>// 2013-02-04T10:35:24-08:00</span>
moment.utc().format(); <span>// 2013-02-04T18:35:24+00:00</span></pre></div><p>Additionally, while in UTC mode, all getters and setters will internally use the <code>Date#getUTC*</code> and <code>Date#setUTC*</code> methods instead of the <code>Date#get*</code> and <code>Date#set*</code> methods.</p><div><pre>moment.utc().seconds(<span>30</span>) === <span>new</span> Date().setUTCSeconds(<span>30</span>);
moment.utc().seconds()   === <span>new</span> Date().getUTCSeconds();
</pre></div><p>It is important to note that though the displays differ above, they are both the same moment in time.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment.utc();
a.format();  <span>// 2013-02-04T10:35:24-08:00</span>
b.format();  <span>// 2013-02-04T18:35:24+00:00</span>
a.valueOf(); <span>// 1360002924000</span>
b.valueOf(); <span>// 1360002924000</span></pre></div><p>Any moment created with <code>moment.utc()</code> will be in UTC mode, and any moment created with <code>moment()</code> will not.</p><p>To switch from UTC to local time, you can use <a>moment#utc</a> or <a>moment#local</a>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div></div>
 * @return
 */
public static final native Moment utc(Date date)/*-{
return $wnd.moment.utc(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(date));
}-*/;



 
















//getters/setters

/**
 * Gets or sets the seconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
 * @return
 */
public native final int seconds() /*-{
return this["seconds"](val); 
}-*/;
/**
 * Gets or sets the seconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment seconds(int val) /*-{
this["seconds"](val); 
return this; 
}-*/;
/**
 * Gets or sets the seconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
 * @return
 */
public native final int second() /*-{
return this["second"](val); 
}-*/;
/**
 * Gets or sets the seconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the minutes.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment second(int val) /*-{
this["second"](val); 
return this; 
}-*/;

/**
 * Gets or sets the milliseconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the seconds.
 * @return
 */
public native final int milliseconds() /*-{
return this["milliseconds"](val); 
}-*/;
/**
 * Gets or sets the milliseconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the seconds.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment milliseconds(int val) /*-{
this["milliseconds"](val); 
return this; 
}-*/;
/**
 * Gets or sets the milliseconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the seconds.
 * @return
 */
public native final int millisecond() /*-{
return this["millisecond"](val); 
}-*/;
/**
 * Gets or sets the milliseconds.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the seconds.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment millisecond(int val) /*-{
this["millisecond"](val); 
return this; 
}-*/;
/**
 * Gets or sets the minutes.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hours.
 * @return
 */
public native final int minutes() /*-{
return this["minutes"](val); 
}-*/;
/**
 * Gets or sets the minutes.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hours.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment minutes(int val) /*-{
this["minutes"](val); 
return this; 
}-*/;
/**
 * Gets or sets the minutes.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hours.
 * @return
 */
public native final int minute() /*-{
return this["minute"](val); 
}-*/;
/**
 * Gets or sets the minutes.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the hours.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment minute(int val) /*-{
this["minute"](val); 
return this; 
}-*/;
/**
 * Gets or sets the hours.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the  day.
 * @return
 */
public native final int hours() /*-{
return this["hours"](val); 
}-*/;
/**
 * Gets or sets the hours.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the  day.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment hours(int val) /*-{
this["hours"](val); 
return this; 
}-*/;
/**
 * Gets or sets the hours.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the  day.
 * @return
 */
public native final int hour() /*-{
return this["hour"](val); 
}-*/;
/**
 * Gets or sets the hours.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the  day.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment hour(int val) /*-{
this["hour"](val); 
return this; 
}-*/;
/**
 * Gets or sets the dates.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#date is for the date of the month, and Moment#day is for the day of the week.
 * @return
 */
public native final int dates() /*-{
return this["dates"](val); 
}-*/;
/**
 * Gets or sets the dates.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#date is for the date of the month, and Moment#day is for the day of the week.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment dates(int val) /*-{
this["dates"](val); 
return this; 
}-*/;
/**
 * Gets or sets the dates.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#date is for the date of the month, and Moment#day is for the day of the week.
 * @return
 */
public native final int date() /*-{
return this["date"](val); 
}-*/;
/**
 * Gets or sets the dates.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#date is for the date of the month, and Moment#day is for the day of the week.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment date(int val) /*-{
this["date"](val); 
return this; 
}-*/;

/**<div><pre>moment().day(Number);
moment().day(); <span>// Number</span>
moment().days(Number);
moment().days(); <span>// Number</span></pre><p>Gets or sets the day of the week.</p><p>This method can be used to set the day of the week, with Sunday as 0 and Saturday as 6.</p><p>If the range is exceeded, it will bubble up to other weeks.</p><div><pre>moment().day(-<span>7</span>); <span>// last Sunday (0 - 7)</span>
moment().day(<span>7</span>); <span>// next Sunday (0 + 7)</span>
moment().day(<span>10</span>); <span>// next Wednesday (3 + 7)</span>
moment().day(<span>24</span>); <span>// 3 Wednesdays from now (3 + 7 + 7 + 7)</span></pre></div><p><em>Note:</em><code>Moment#date</code> is for the date of the month, and <code>Moment#day</code> is for the day of the week.</p></div>
 * @return
 */
public native final int days() /*-{
return this["days"](val); 
}-*/;
/**<div><pre>moment().day(Number);
moment().day(); <span>// Number</span>
moment().days(Number);
moment().days(); <span>// Number</span></pre><p>Gets or sets the day of the week.</p><p>This method can be used to set the day of the week, with Sunday as 0 and Saturday as 6.</p><p>If the range is exceeded, it will bubble up to other weeks.</p><div><pre>moment().day(-<span>7</span>); <span>// last Sunday (0 - 7)</span>
moment().day(<span>7</span>); <span>// next Sunday (0 + 7)</span>
moment().day(<span>10</span>); <span>// next Wednesday (3 + 7)</span>
moment().day(<span>24</span>); <span>// 3 Wednesdays from now (3 + 7 + 7 + 7)</span></pre></div><p><em>Note:</em><code>Moment#date</code> is for the date of the month, and <code>Moment#day</code> is for the day of the week.</p></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment days(int val) /*-{
this["days"](val); 
return this; 
}-*/;
/**<div><pre>moment().day(Number);
moment().day(); <span>// Number</span>
moment().days(Number);
moment().days(); <span>// Number</span></pre><p>Gets or sets the day of the week.</p><p>This method can be used to set the day of the week, with Sunday as 0 and Saturday as 6.</p><p>If the range is exceeded, it will bubble up to other weeks.</p><div><pre>moment().day(-<span>7</span>); <span>// last Sunday (0 - 7)</span>
moment().day(<span>7</span>); <span>// next Sunday (0 + 7)</span>
moment().day(<span>10</span>); <span>// next Wednesday (3 + 7)</span>
moment().day(<span>24</span>); <span>// 3 Wednesdays from now (3 + 7 + 7 + 7)</span></pre></div><p><em>Note:</em><code>Moment#date</code> is for the date of the month, and <code>Moment#day</code> is for the day of the week.</p></div>
 * @return
 */
public native final int day() /*-{
return this["day"](val); 
}-*/;
/**<div><pre>moment().day(Number);
moment().day(); <span>// Number</span>
moment().days(Number);
moment().days(); <span>// Number</span></pre><p>Gets or sets the day of the week.</p><p>This method can be used to set the day of the week, with Sunday as 0 and Saturday as 6.</p><p>If the range is exceeded, it will bubble up to other weeks.</p><div><pre>moment().day(-<span>7</span>); <span>// last Sunday (0 - 7)</span>
moment().day(<span>7</span>); <span>// next Sunday (0 + 7)</span>
moment().day(<span>10</span>); <span>// next Wednesday (3 + 7)</span>
moment().day(<span>24</span>); <span>// 3 Wednesdays from now (3 + 7 + 7 + 7)</span></pre></div><p><em>Note:</em><code>Moment#date</code> is for the date of the month, and <code>Moment#day</code> is for the day of the week.</p></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment day(int val) /*-{
this["day"](val); 
return this; 
}-*/;

/**
 * Gets or sets the dayOfYears.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#dayOfYear is for the dayOfYear of the month, and Moment#day is for the day of the years.
 * @return
 */
public native final int dayOfYears() /*-{
return this["dayOfYears"](val); 
}-*/;
/**
 * Gets or sets the dayOfYears.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#dayOfYear is for the dayOfYear of the month, and Moment#day is for the day of the years.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment dayOfYears(int val) /*-{
this["dayOfYears"](val); 
return this; 
}-*/;
/**
 * Gets or sets the dayOfYears.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#dayOfYear is for the dayOfYear of the month, and Moment#day is for the day of the years.
 * @return
 */
public native final int dayOfYear() /*-{
return this["dayOfYear"](val); 
}-*/;
/**
 * Gets or sets the dayOfYears.
Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the months.
Note: Moment#dayOfYear is for the dayOfYear of the month, and Moment#day is for the day of the years.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment dayOfYear(int val) /*-{
this["dayOfYear"](val); 
return this; 
}-*/;

/**<p>Gets or sets the week of the year.</p><p>Because different locales define week of year numbering differently, Moment.js added <code>moment#week</code> to get/set the localized week of the year.</p><p>The week of the year varies depending on which day is the first day of the week (Sunday, Monday, etc), and which week is the first week of the year.</p><p>For example, in the United States, Sunday is the first day of the week. The week with January 1st in it is the first week of the year.</p><p>In France, Monday is the first day of the week, and the week with January 4th is the first week of the year.</p><p>The output of <code>moment#week</code> will depend on the <a>locale/language</a> for that moment.</p><p>When setting the week of the year, the day of the week is retained.</p>
 * @return
 */
public native final int weeks() /*-{
return this["weeks"](val); 
}-*/;
/**<p>Gets or sets the week of the year.</p><p>Because different locales define week of year numbering differently, Moment.js added <code>moment#week</code> to get/set the localized week of the year.</p><p>The week of the year varies depending on which day is the first day of the week (Sunday, Monday, etc), and which week is the first week of the year.</p><p>For example, in the United States, Sunday is the first day of the week. The week with January 1st in it is the first week of the year.</p><p>In France, Monday is the first day of the week, and the week with January 4th is the first week of the year.</p><p>The output of <code>moment#week</code> will depend on the <a>locale/language</a> for that moment.</p><p>When setting the week of the year, the day of the week is retained.</p>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment weeks(int val) /*-{
this["weeks"](val); 
return this; 
}-*/;
/**<p>Gets or sets the week of the year.</p><p>Because different locales define week of year numbering differently, Moment.js added <code>moment#week</code> to get/set the localized week of the year.</p><p>The week of the year varies depending on which day is the first day of the week (Sunday, Monday, etc), and which week is the first week of the year.</p><p>For example, in the United States, Sunday is the first day of the week. The week with January 1st in it is the first week of the year.</p><p>In France, Monday is the first day of the week, and the week with January 4th is the first week of the year.</p><p>The output of <code>moment#week</code> will depend on the <a>locale/language</a> for that moment.</p><p>When setting the week of the year, the day of the week is retained.</p>
 * @return
 */
public native final int week() /*-{
return this["week"](val); 
}-*/;
/**<p>Gets or sets the week of the year.</p><p>Because different locales define week of year numbering differently, Moment.js added <code>moment#week</code> to get/set the localized week of the year.</p><p>The week of the year varies depending on which day is the first day of the week (Sunday, Monday, etc), and which week is the first week of the year.</p><p>For example, in the United States, Sunday is the first day of the week. The week with January 1st in it is the first week of the year.</p><p>In France, Monday is the first day of the week, and the week with January 4th is the first week of the year.</p><p>The output of <code>moment#week</code> will depend on the <a>locale/language</a> for that moment.</p><p>When setting the week of the year, the day of the week is retained.</p>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment week(int val) /*-{
this["week"](val); 
return this; 
}-*/;


/**Gets or sets the ISO week of the year. (http://en.wikipedia.org/wiki/ISO_week_date)
When setting the week of the year, the day of the week is retained.
 * @return
 */
public native final int isoWeeks() /*-{
return this["isoWeeks"](val); 
}-*/;
/**Gets or sets the ISO week of the year. (http://en.wikipedia.org/wiki/ISO_week_date)
When setting the week of the year, the day of the week is retained.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment isoWeeks(int val) /*-{
this["isoWeeks"](val); 
return this; 
}-*/;
/**Gets or sets the ISO week of the year. (http://en.wikipedia.org/wiki/ISO_week_date)
When setting the week of the year, the day of the week is retained.
 * @return
 */
public native final int isoWeek() /*-{
return this["isoWeek"](val); 
}-*/;
/**Gets or sets the ISO week of the year. (http://en.wikipedia.org/wiki/ISO_week_date)
When setting the week of the year, the day of the week is retained.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment isoWeek(int val) /*-{
this["isoWeek"](val); 
return this; 
}-*/;


/**<p>Gets or sets the month.</p><p>Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.</p><p><strong>Note</strong>: Months are zero indexed, so January is month 0.</p>
 * @return
 */
public native final int month() /*-{
return this["month"](val); 
}-*/;
/**<p>Gets or sets the month.</p><p>Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.</p><p><strong>Note</strong>: Months are zero indexed, so January is month 0.</p>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment month(int val) /*-{
this["month"](val); 
return this; 
}-*/;
/**<p>Gets or sets the month.</p><p>Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.</p><p><strong>Note</strong>: Months are zero indexed, so January is month 0.</p>
 * @return
 */
public native final int months() /*-{
return this["months"](val); 
}-*/;
/**<p>Gets or sets the month.</p><p>Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the year.</p><p><strong>Note</strong>: Months are zero indexed, so January is month 0.</p>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment months(int val) /*-{
this["months"](val); 
return this; 
}-*/;


/**Gets or sets the year.Accepts numbers from -270,00 to 270,000.
 * @return
 */
public native final int year() /*-{
return this["year"](val); 
}-*/;
/**Gets or sets the year.Accepts numbers from -270,00 to 270,000.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment year(int val) /*-{
this["year"](val); 
return this; 
}-*/;
/**Gets or sets the year.Accepts numbers from -270,00 to 270,000.
 * @return
 */
public native final int years() /*-{
return this["years"](val); 
}-*/;
/**Gets or sets the year.Accepts numbers from -270,00 to 270,000.
 * @param val
 * @return this - for setter chaining
 */
public native final Moment years(int val) /*-{
this["years"](val); 
return this; 
}-*/;























//Manipulate
/**<div><pre>moment().add(String, Number);
moment().add(Number, String); <span>// 2.0.0</span>
moment().add(Duration); <span>// 1.6.0</span>
moment().add(Object);</pre><p>Mutates the original moment by adding time.</p><p>This is a pretty robust function for adding time to an existing moment. To add time, pass the key of what time you want to add, and the amount you want to add.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>);
</pre></div><p>There are some shorthand keys as well if you're into that whole brevity thing.</p><div><pre>moment().add(<span>'d'</span>, <span>7</span>);
</pre></div><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>If you want to add multiple different keys at the same time, you can pass them in as an object literal.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>).add(<span>'months'</span>, <span>1</span>); <span>// with chaining</span>
moment().add({days:<span>7</span>,months:<span>1</span>}); <span>// with object literal</span></pre></div><p>There are no upper limits for the amounts, so you can overload any of the parameters.</p><div><pre>moment().add(<span>'milliseconds'</span>, <span>1000000</span>); <span>// a million milliseconds</span>
moment().add(<span>'days'</span>, <span>360</span>); <span>// 360 days</span></pre></div><h4>Special considerations for months and years</h4><p>If the day of the month on the original date is greater than the number of days in the final month,the day of the month will change to the last day in the final month.</p><div><pre>moment([<span>2010</span>, <span>0</span>, <span>31</span>]);                  <span>// January 31</span>
moment([<span>2010</span>, <span>0</span>, <span>31</span>]).add(<span>'months'</span>, <span>1</span>); <span>// February 28</span></pre></div><p>There are also special considerations to keep in mind when adding time that crosses over Daylight Savings Time.If you are adding years, months, weeks, or days, the original hour will always match the added hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'days'</span>, <span>1</span>).hours(); <span>// 5</span></pre></div><p>If you are adding hours, minutes, seconds, or milliseconds, the assumption is that you want precision to the hour, and will result in a different hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'hours'</span>, <span>24</span>).hours(); <span>// 6</span></pre></div><p>Alternatively, you can use <a>durations</a> to add to moments.</p><div><pre><span>var</span> duration = moment.duration({<span>'days'</span> : <span>1</span>});
moment([<span>2012</span>, <span>0</span>, <span>31</span>]).add(duration); <span>// February 1</span></pre></div><p>As of version <strong>2.0.0</strong>, a reversed syntax is also supported to ease development. The syntaxes below will all work.</p><div><pre>moment().add(<span>'seconds'</span>, <span>1</span>);
moment().add(<span>'seconds'</span>, <span>'1'</span>);
moment().add(<span>1</span>, <span>'seconds'</span>);
</pre></div><p>This syntax will not work. The first parameter would need to be a number, not a string.</p><div><pre>moment().add(<span>'1'</span>, <span>'seconds'</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment add(Moment val) /*-{
this["add"](val); 
return this; 
}-*/;
/**<div><pre>moment().add(String, Number);
moment().add(Number, String); <span>// 2.0.0</span>
moment().add(Duration); <span>// 1.6.0</span>
moment().add(Object);</pre><p>Mutates the original moment by adding time.</p><p>This is a pretty robust function for adding time to an existing moment. To add time, pass the key of what time you want to add, and the amount you want to add.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>);
</pre></div><p>There are some shorthand keys as well if you're into that whole brevity thing.</p><div><pre>moment().add(<span>'d'</span>, <span>7</span>);
</pre></div><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>If you want to add multiple different keys at the same time, you can pass them in as an object literal.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>).add(<span>'months'</span>, <span>1</span>); <span>// with chaining</span>
moment().add({days:<span>7</span>,months:<span>1</span>}); <span>// with object literal</span></pre></div><p>There are no upper limits for the amounts, so you can overload any of the parameters.</p><div><pre>moment().add(<span>'milliseconds'</span>, <span>1000000</span>); <span>// a million milliseconds</span>
moment().add(<span>'days'</span>, <span>360</span>); <span>// 360 days</span></pre></div><h4>Special considerations for months and years</h4><p>If the day of the month on the original date is greater than the number of days in the final month,the day of the month will change to the last day in the final month.</p><div><pre>moment([<span>2010</span>, <span>0</span>, <span>31</span>]);                  <span>// January 31</span>
moment([<span>2010</span>, <span>0</span>, <span>31</span>]).add(<span>'months'</span>, <span>1</span>); <span>// February 28</span></pre></div><p>There are also special considerations to keep in mind when adding time that crosses over Daylight Savings Time.If you are adding years, months, weeks, or days, the original hour will always match the added hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'days'</span>, <span>1</span>).hours(); <span>// 5</span></pre></div><p>If you are adding hours, minutes, seconds, or milliseconds, the assumption is that you want precision to the hour, and will result in a different hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'hours'</span>, <span>24</span>).hours(); <span>// 6</span></pre></div><p>Alternatively, you can use <a>durations</a> to add to moments.</p><div><pre><span>var</span> duration = moment.duration({<span>'days'</span> : <span>1</span>});
moment([<span>2012</span>, <span>0</span>, <span>31</span>]).add(duration); <span>// February 1</span></pre></div><p>As of version <strong>2.0.0</strong>, a reversed syntax is also supported to ease development. The syntaxes below will all work.</p><div><pre>moment().add(<span>'seconds'</span>, <span>1</span>);
moment().add(<span>'seconds'</span>, <span>'1'</span>);
moment().add(<span>1</span>, <span>'seconds'</span>);
</pre></div><p>This syntax will not work. The first parameter would need to be a number, not a string.</p><div><pre>moment().add(<span>'1'</span>, <span>'seconds'</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment add(String s, double i) /*-{
this["add"](s, i); 
return this; 
}-*/;
/**<div><pre>moment().add(String, Number);
moment().add(Number, String); <span>// 2.0.0</span>
moment().add(Duration); <span>// 1.6.0</span>
moment().add(Object);</pre><p>Mutates the original moment by adding time.</p><p>This is a pretty robust function for adding time to an existing moment. To add time, pass the key of what time you want to add, and the amount you want to add.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>);
</pre></div><p>There are some shorthand keys as well if you're into that whole brevity thing.</p><div><pre>moment().add(<span>'d'</span>, <span>7</span>);
</pre></div><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>If you want to add multiple different keys at the same time, you can pass them in as an object literal.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>).add(<span>'months'</span>, <span>1</span>); <span>// with chaining</span>
moment().add({days:<span>7</span>,months:<span>1</span>}); <span>// with object literal</span></pre></div><p>There are no upper limits for the amounts, so you can overload any of the parameters.</p><div><pre>moment().add(<span>'milliseconds'</span>, <span>1000000</span>); <span>// a million milliseconds</span>
moment().add(<span>'days'</span>, <span>360</span>); <span>// 360 days</span></pre></div><h4>Special considerations for months and years</h4><p>If the day of the month on the original date is greater than the number of days in the final month,the day of the month will change to the last day in the final month.</p><div><pre>moment([<span>2010</span>, <span>0</span>, <span>31</span>]);                  <span>// January 31</span>
moment([<span>2010</span>, <span>0</span>, <span>31</span>]).add(<span>'months'</span>, <span>1</span>); <span>// February 28</span></pre></div><p>There are also special considerations to keep in mind when adding time that crosses over Daylight Savings Time.If you are adding years, months, weeks, or days, the original hour will always match the added hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'days'</span>, <span>1</span>).hours(); <span>// 5</span></pre></div><p>If you are adding hours, minutes, seconds, or milliseconds, the assumption is that you want precision to the hour, and will result in a different hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'hours'</span>, <span>24</span>).hours(); <span>// 6</span></pre></div><p>Alternatively, you can use <a>durations</a> to add to moments.</p><div><pre><span>var</span> duration = moment.duration({<span>'days'</span> : <span>1</span>});
moment([<span>2012</span>, <span>0</span>, <span>31</span>]).add(duration); <span>// February 1</span></pre></div><p>As of version <strong>2.0.0</strong>, a reversed syntax is also supported to ease development. The syntaxes below will all work.</p><div><pre>moment().add(<span>'seconds'</span>, <span>1</span>);
moment().add(<span>'seconds'</span>, <span>'1'</span>);
moment().add(<span>1</span>, <span>'seconds'</span>);
</pre></div><p>This syntax will not work. The first parameter would need to be a number, not a string.</p><div><pre>moment().add(<span>'1'</span>, <span>'seconds'</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment add(double i, String s) /*-{
this["add"](i, s); 
return this; 
}-*/;
/**<div><pre>moment().add(String, Number);
moment().add(Number, String); <span>// 2.0.0</span>
moment().add(Duration); <span>// 1.6.0</span>
moment().add(Object);</pre><p>Mutates the original moment by adding time.</p><p>This is a pretty robust function for adding time to an existing moment. To add time, pass the key of what time you want to add, and the amount you want to add.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>);
</pre></div><p>There are some shorthand keys as well if you're into that whole brevity thing.</p><div><pre>moment().add(<span>'d'</span>, <span>7</span>);
</pre></div><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>If you want to add multiple different keys at the same time, you can pass them in as an object literal.</p><div><pre>moment().add(<span>'days'</span>, <span>7</span>).add(<span>'months'</span>, <span>1</span>); <span>// with chaining</span>
moment().add({days:<span>7</span>,months:<span>1</span>}); <span>// with object literal</span></pre></div><p>There are no upper limits for the amounts, so you can overload any of the parameters.</p><div><pre>moment().add(<span>'milliseconds'</span>, <span>1000000</span>); <span>// a million milliseconds</span>
moment().add(<span>'days'</span>, <span>360</span>); <span>// 360 days</span></pre></div><h4>Special considerations for months and years</h4><p>If the day of the month on the original date is greater than the number of days in the final month,the day of the month will change to the last day in the final month.</p><div><pre>moment([<span>2010</span>, <span>0</span>, <span>31</span>]);                  <span>// January 31</span>
moment([<span>2010</span>, <span>0</span>, <span>31</span>]).add(<span>'months'</span>, <span>1</span>); <span>// February 28</span></pre></div><p>There are also special considerations to keep in mind when adding time that crosses over Daylight Savings Time.If you are adding years, months, weeks, or days, the original hour will always match the added hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'days'</span>, <span>1</span>).hours(); <span>// 5</span></pre></div><p>If you are adding hours, minutes, seconds, or milliseconds, the assumption is that you want precision to the hour, and will result in a different hour.</p><div><pre><span>var</span> m = moment(<span>new</span> Date(<span>2011</span>, <span>2</span>, <span>12</span>, <span>5</span>, <span>0</span>, <span>0</span>)); <span>// the day before DST in the US</span>
m.hours(); <span>// 5</span>
m.add(<span>'hours'</span>, <span>24</span>).hours(); <span>// 6</span></pre></div><p>Alternatively, you can use <a>durations</a> to add to moments.</p><div><pre><span>var</span> duration = moment.duration({<span>'days'</span> : <span>1</span>});
moment([<span>2012</span>, <span>0</span>, <span>31</span>]).add(duration); <span>// February 1</span></pre></div><p>As of version <strong>2.0.0</strong>, a reversed syntax is also supported to ease development. The syntaxes below will all work.</p><div><pre>moment().add(<span>'seconds'</span>, <span>1</span>);
moment().add(<span>'seconds'</span>, <span>'1'</span>);
moment().add(<span>1</span>, <span>'seconds'</span>);
</pre></div><p>This syntax will not work. The first parameter would need to be a number, not a string.</p><div><pre>moment().add(<span>'1'</span>, <span>'seconds'</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment add(JsObject o) /*-{
this["add"](o); 
return this; 
}-*/;


/**<div><pre>moment().subtract(String, Number);
moment().subtract(Number, String); <span>// 2.0.0</span>
moment().subtract(Duration); <span>// 1.6.0</span>
moment().subtract(Object);</pre><p>Mutates the original moment by subtracting time.</p><p>This is exactly the same as <code>moment#add</code>, only instead of adding time, it subtracts time.</p><div><pre>moment().subtract(<span>'days'</span>, <span>7</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment subtract(Moment val) /*-{
this["subtract"](val); 
return this; 
}-*/;
/**<div><pre>moment().subtract(String, Number);
moment().subtract(Number, String); <span>// 2.0.0</span>
moment().subtract(Duration); <span>// 1.6.0</span>
moment().subtract(Object);</pre><p>Mutates the original moment by subtracting time.</p><p>This is exactly the same as <code>moment#add</code>, only instead of adding time, it subtracts time.</p><div><pre>moment().subtract(<span>'days'</span>, <span>7</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment subtract(String s, double i) /*-{
this["subtract"](s, i); 
return this; 
}-*/;
/**<div><pre>moment().subtract(String, Number);
moment().subtract(Number, String); <span>// 2.0.0</span>
moment().subtract(Duration); <span>// 1.6.0</span>
moment().subtract(Object);</pre><p>Mutates the original moment by subtracting time.</p><p>This is exactly the same as <code>moment#add</code>, only instead of adding time, it subtracts time.</p><div><pre>moment().subtract(<span>'days'</span>, <span>7</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment subtract(double i, String s) /*-{
this["subtract"](i, s); 
return this; 
}-*/;
/**<div><pre>moment().subtract(String, Number);
moment().subtract(Number, String); <span>// 2.0.0</span>
moment().subtract(Duration); <span>// 1.6.0</span>
moment().subtract(Object);</pre><p>Mutates the original moment by subtracting time.</p><p>This is exactly the same as <code>moment#add</code>, only instead of adding time, it subtracts time.</p><div><pre>moment().subtract(<span>'days'</span>, <span>7</span>);
</pre></div></div>
 * @param val
 * @return this - for setter chaining
 */
public native final Moment subtract(JsObject o) /*-{
this["subtract"](o); 
return this; 
}-*/;

/**
<div><pre>moment().startOf(String);</pre><p>Mutates the original moment by setting it to the start of a unit of time.</p><div><pre>moment().startOf(<span>'year'</span>);   <span>// set to January 1st, 12:00 am this year</span>
moment().startOf(<span>'month'</span>);  <span>// set to the first of this month, 12:00 am</span>
moment().startOf(<span>'week'</span>);   <span>// set to the first day of this week, 12:00 am</span>
moment().startOf(<span>'day'</span>);    <span>// set to 12:00 am today</span>
moment().startOf(<span>'hour'</span>);   <span>// set to now, but with 0 mins, 0 secs, and 0 ms</span>
moment().startOf(<span>'minute'</span>); <span>// set to now, but with 0 seconds and 0 milliseconds</span>
moment().startOf(<span>'second'</span>); <span>// same as moment().milliseconds(0);</span></pre></div><p>These shortcuts are essentially the same as the following.</p><div><pre>moment().startOf(<span>'year'</span>);
moment().month(<span>0</span>).date(<span>1</span>).hours(<span>0</span>).minutes(<span>0</span>).seconds(<span>0</span>).milliseconds(<span>0</span>);
</pre></div><div><pre>moment().startOf(<span>'hour'</span>);
moment().minutes(<span>0</span>).seconds(<span>0</span>).milliseconds(<span>0</span>)
</pre></div><p>As of version <strong>2.0.0</strong>, <code>moment#startOf('day')</code> replaced <code>moment#sod</code>.</p></div>
 * @param s
 * @return
 */
public native final Moment startOf(String s) /*-{
this["startOf"](s); 
return this; 
}-*/;
/**<div><pre>moment().endOf(String);</pre><p>Mutates the original moment by setting it to the end of a unit of time.</p><p>This is the same as <code>moment#startOf</code>, only instead of setting to the start of a unit of time, it sets to the end of a unit of time.</p><div><pre>moment().endOf(<span>"year"</span>); <span>// set the moment to 12-31 11:59:59.999 pm this year</span></pre></div><p>As of version <strong>2.0.0</strong>, <code>moment#endOf('day')</code> replaced <code>moment#eod</code>.</p></div>
 * @param s
 * @return
 */
public native final Moment endOf(String s) /*-{
this["endOf"](s); 
return this; 
}-*/;
/**
 * <div><pre>moment().local();</pre><p>Toggles a flag on the original moment to internally use <code>Date#get*</code> and <code>Date#set*</code> instead of <code>Date#getUTC*</code> and <code>Date#setUTC*</code>.</p><div><pre><span>var</span> a = moment.utc([<span>2011</span>, <span>0</span>, <span>1</span>, <span>8</span>]);
a.hours(); <span>// 8 UTC</span>
a.local();
a.hours(); <span>// 0 PST</span></pre></div><p>See <a>moment.utc()</a> for more information on UTC mode.</p></div>
 * @return
 */
public native final Moment local() /*-{
this["local"](s); 
return this; 
}-*/;
///**
// * @return
// */
//public native final Moment utc() /*-{
//this["utc"](s); 
//return this; 
//}-*/;


















//Display

/**<div><pre>moment().format();
moment().format(String);</pre><p>This is the most robust display option. It takes a string of tokens and replaces them with their corresponding values.</p><div><pre>moment().format(<span>"dddd, MMMM Do YYYY, h:mm:ss a"</span>); <span>// "Sunday, February 14th 2010, 3:25:50 pm"</span>
moment().format(<span>"ddd, hA"</span>);                       <span>// "Sun, 3PM"</span></pre></div><p>There are a couple conventions used with the naming of the</p><table><tbody><tr><th>Token</th><th>Output</th></tr><tr><td><b>Month</b></td><td>M</td><td>1 2 ... 11 12</td></tr><tr><td>Mo</td><td>1st 2nd ... 11th 12th</td></tr><tr><td>MM</td><td>01 02 ... 11 12</td></tr><tr><td>MMM</td><td>Jan Feb ... Nov Dec</td></tr><tr><td>MMMM</td><td>January February ... November December</td></tr><tr><td><b>Day of Month</b></td><td>D</td><td>1 2 ... 30 30</td></tr><tr><td>Do</td><td>1st 2nd ... 30th 31st</td></tr><tr><td>DD</td><td>01 02 ... 30 31</td></tr><tr><td><b>Day of Year</b></td><td>DDD</td><td>1 2 ... 364 365</td></tr><tr><td>DDDo</td><td>1st 2nd ... 364th 365th</td></tr><tr><td>DDDD</td><td>001 002 ... 364 365</td></tr><tr><td><b>Day of Week</b></td><td>d</td><td>0 1 ... 5 6</td></tr><tr><td>do</td><td>0th 1st ... 5th 6th</td></tr><tr><td>ddd</td><td>Sun Mon ... Fri Sat</td></tr><tr><td>dddd</td><td>Sunday Monday ... Friday Saturday</td></tr><tr><td><b>Week of Year</b></td><td>w</td><td>1 2 ... 52 53</td></tr><tr><td>wo</td><td>1st 2nd ... 52nd 53rd</td></tr><tr><td>ww</td><td>01 02 ... 52 53</td></tr><tr><td><b>ISO Week of Year</b></td><td>W</td><td>1 2 ... 52 53</td></tr><tr><td>Wo</td><td>1st 2nd ... 52nd 53rd</td></tr><tr><td>WW</td><td>01 02 ... 52 53</td></tr><tr><td><b>Year</b></td><td>YY</td><td>70 71 ... 29 30</td></tr><tr><td>YYYY</td><td>1970 1971 ... 2029 2030</td></tr><tr><td><b>AM/PM</b></td><td>A</td><td>AM PM</td></tr><tr><td>a</td><td>am pm</td></tr><tr><td><b>Hour</b></td><td>H</td><td>0 1 ... 22 23</td></tr><tr><td>HH</td><td>00 01 ... 22 23</td></tr><tr><td>h</td><td>1 2 ... 11 12</td></tr><tr><td>hh</td><td>01 02 ... 11 12</td></tr><tr><td><b>Minute</b></td><td>m</td><td>0 1 ... 58 59</td></tr><tr><td>mm</td><td>00 01 ... 58 59</td></tr><tr><td><b>Second</b></td><td>s</td><td>0 1 ... 58 59</td></tr><tr><td>ss</td><td>00 01 ... 58 59</td></tr><tr><td><b>Fractional Second</b></td><td>S</td><td>0 1 ... 8 9</td></tr><tr><td>SS</td><td>0 1 ... 98 99</td></tr><tr><td>SSS</td><td>0 1 ... 998 999</td></tr><tr><td>ss</td><td>00 01 ... 58 59</td></tr><tr><td><b>Timezone</b></td><td>z or zz</td><td>
        EST CST ... MST PST
        <b>Note:</b> as of <b>1.6.0</b>, the z/zz format tokens have been deprecated. <a>Read more about it here.</a></td></tr><tr><td>Z</td><td>-07:00 -06:00 ... +06:00 +07:00</td></tr><tr><td>ZZ</td><td>
        -0700 -0600 ... +0600 +0700
      </td></tr><tr><td><b>Unix Timestamp</b></td><td>X</td><td>1360013296</td></tr></tbody></table><p><code>Z ZZ</code> were added in <strong>1.2.0</strong>. <code>S SS SSS</code> were added in <strong>1.6.0</strong>. <code>X</code> was added in <code>2.0.0</code>.</p><h4>Localized formats</h4><p>Because preferred formatting differs based on locale, there are a few tokens that can be used to format a moment based on its language.</p><p>There are upper and lower case variations on the same formats. The lowercase version is intended to be the shortened version of its uppercase counterpart.</p><table><tbody><tr><td><b>Time</b></td><td>LT</td><td>8:30 PM</td></tr><tr><td><b>Month numeral, day of month, year</b></td><td>L</td><td>09/04/1986</td></tr><tr><td>l</td><td>9/4/1986</td></tr><tr><td><b>Month name, day of month, year</b></td><td>LL</td><td>September 4th 1986</td></tr><tr><td>ll</td><td>Sep 4 1986</td></tr><tr><td><b>Month name, day of month, year, time</b></td><td>LLL</td><td>September 4th 1986 8:30 PM</td></tr><tr><td>lll</td><td>Sep 4 1986 8:30 PM</td></tr><tr><td><b>Month name, day of month, day of week, year, time</b></td><td>LLLL</td><td>Thursday, September 4th 1986 8:30 PM</td></tr><tr><td>llll</td><td>Thu, Sep 4 1986 8:30 PM</td></tr></tbody></table><p><code>L LL LLL LLLL LT</code> are available in version <strong>1.3.0</strong>. <code>l ll lll llll</code> are available in <strong>2.0.0</strong>.</p><h4>Escaping characters</h4><p>To escape characters in format strings, you can wrap the characters in square brackets.</p><div><pre>moment().format(<span>'[today] DDDD'</span>); <span>// 'today Sunday'</span></pre></div><h4>Similarities and differences with LDML</h4><p><strong>Note:</strong> While these date formats are very similar to LDML date formats, there are a few minor differences regarding day of month, day of year, and day of week.</p><p>For a breakdown of a few different date formatting tokens across different languages, see <a>this chart of date formatting tokens.</a></p><h4>Formatting speed</h4><p>To compare Moment.js formatting speed against other libraries, check out <a>this comparison against other libraries</a>.</p><h4>Other tokens</h4><p>If you are more comfortable working with strftime instead of LDML-like parsing tokens, you can use Ben Oakes' plugin. <a>benjaminoakes/moment-strftime</a>.</p><h4>Default format</h4><p>As of version <strong>1.5.0</strong>, calling <code>moment#format</code> without a format will default to <code>moment.defaultFormat</code>. Out of the box, <code>moment.defaultFormat</code> is the ISO8601 format <code>YYYY-MM-DDTHH:mm:ssZ</code>.</p></div>
 * @param format
 * @return 
 */
public final native String format(String format)/*-{
return this.format(format); 
}-*/;
/**<div><pre>moment().format();
moment().format(String);</pre><p>This is the most robust display option. It takes a string of tokens and replaces them with their corresponding values.</p><div><pre>moment().format(<span>"dddd, MMMM Do YYYY, h:mm:ss a"</span>); <span>// "Sunday, February 14th 2010, 3:25:50 pm"</span>
moment().format(<span>"ddd, hA"</span>);                       <span>// "Sun, 3PM"</span></pre></div><p>There are a couple conventions used with the naming of the</p><table><tbody><tr><th>Token</th><th>Output</th></tr><tr><td><b>Month</b></td><td>M</td><td>1 2 ... 11 12</td></tr><tr><td>Mo</td><td>1st 2nd ... 11th 12th</td></tr><tr><td>MM</td><td>01 02 ... 11 12</td></tr><tr><td>MMM</td><td>Jan Feb ... Nov Dec</td></tr><tr><td>MMMM</td><td>January February ... November December</td></tr><tr><td><b>Day of Month</b></td><td>D</td><td>1 2 ... 30 30</td></tr><tr><td>Do</td><td>1st 2nd ... 30th 31st</td></tr><tr><td>DD</td><td>01 02 ... 30 31</td></tr><tr><td><b>Day of Year</b></td><td>DDD</td><td>1 2 ... 364 365</td></tr><tr><td>DDDo</td><td>1st 2nd ... 364th 365th</td></tr><tr><td>DDDD</td><td>001 002 ... 364 365</td></tr><tr><td><b>Day of Week</b></td><td>d</td><td>0 1 ... 5 6</td></tr><tr><td>do</td><td>0th 1st ... 5th 6th</td></tr><tr><td>ddd</td><td>Sun Mon ... Fri Sat</td></tr><tr><td>dddd</td><td>Sunday Monday ... Friday Saturday</td></tr><tr><td><b>Week of Year</b></td><td>w</td><td>1 2 ... 52 53</td></tr><tr><td>wo</td><td>1st 2nd ... 52nd 53rd</td></tr><tr><td>ww</td><td>01 02 ... 52 53</td></tr><tr><td><b>ISO Week of Year</b></td><td>W</td><td>1 2 ... 52 53</td></tr><tr><td>Wo</td><td>1st 2nd ... 52nd 53rd</td></tr><tr><td>WW</td><td>01 02 ... 52 53</td></tr><tr><td><b>Year</b></td><td>YY</td><td>70 71 ... 29 30</td></tr><tr><td>YYYY</td><td>1970 1971 ... 2029 2030</td></tr><tr><td><b>AM/PM</b></td><td>A</td><td>AM PM</td></tr><tr><td>a</td><td>am pm</td></tr><tr><td><b>Hour</b></td><td>H</td><td>0 1 ... 22 23</td></tr><tr><td>HH</td><td>00 01 ... 22 23</td></tr><tr><td>h</td><td>1 2 ... 11 12</td></tr><tr><td>hh</td><td>01 02 ... 11 12</td></tr><tr><td><b>Minute</b></td><td>m</td><td>0 1 ... 58 59</td></tr><tr><td>mm</td><td>00 01 ... 58 59</td></tr><tr><td><b>Second</b></td><td>s</td><td>0 1 ... 58 59</td></tr><tr><td>ss</td><td>00 01 ... 58 59</td></tr><tr><td><b>Fractional Second</b></td><td>S</td><td>0 1 ... 8 9</td></tr><tr><td>SS</td><td>0 1 ... 98 99</td></tr><tr><td>SSS</td><td>0 1 ... 998 999</td></tr><tr><td>ss</td><td>00 01 ... 58 59</td></tr><tr><td><b>Timezone</b></td><td>z or zz</td><td>
        EST CST ... MST PST
        <b>Note:</b> as of <b>1.6.0</b>, the z/zz format tokens have been deprecated. <a>Read more about it here.</a></td></tr><tr><td>Z</td><td>-07:00 -06:00 ... +06:00 +07:00</td></tr><tr><td>ZZ</td><td>
        -0700 -0600 ... +0600 +0700
      </td></tr><tr><td><b>Unix Timestamp</b></td><td>X</td><td>1360013296</td></tr></tbody></table><p><code>Z ZZ</code> were added in <strong>1.2.0</strong>. <code>S SS SSS</code> were added in <strong>1.6.0</strong>. <code>X</code> was added in <code>2.0.0</code>.</p><h4>Localized formats</h4><p>Because preferred formatting differs based on locale, there are a few tokens that can be used to format a moment based on its language.</p><p>There are upper and lower case variations on the same formats. The lowercase version is intended to be the shortened version of its uppercase counterpart.</p><table><tbody><tr><td><b>Time</b></td><td>LT</td><td>8:30 PM</td></tr><tr><td><b>Month numeral, day of month, year</b></td><td>L</td><td>09/04/1986</td></tr><tr><td>l</td><td>9/4/1986</td></tr><tr><td><b>Month name, day of month, year</b></td><td>LL</td><td>September 4th 1986</td></tr><tr><td>ll</td><td>Sep 4 1986</td></tr><tr><td><b>Month name, day of month, year, time</b></td><td>LLL</td><td>September 4th 1986 8:30 PM</td></tr><tr><td>lll</td><td>Sep 4 1986 8:30 PM</td></tr><tr><td><b>Month name, day of month, day of week, year, time</b></td><td>LLLL</td><td>Thursday, September 4th 1986 8:30 PM</td></tr><tr><td>llll</td><td>Thu, Sep 4 1986 8:30 PM</td></tr></tbody></table><p><code>L LL LLL LLLL LT</code> are available in version <strong>1.3.0</strong>. <code>l ll lll llll</code> are available in <strong>2.0.0</strong>.</p><h4>Escaping characters</h4><p>To escape characters in format strings, you can wrap the characters in square brackets.</p><div><pre>moment().format(<span>'[today] DDDD'</span>); <span>// 'today Sunday'</span></pre></div><h4>Similarities and differences with LDML</h4><p><strong>Note:</strong> While these date formats are very similar to LDML date formats, there are a few minor differences regarding day of month, day of year, and day of week.</p><p>For a breakdown of a few different date formatting tokens across different languages, see <a>this chart of date formatting tokens.</a></p><h4>Formatting speed</h4><p>To compare Moment.js formatting speed against other libraries, check out <a>this comparison against other libraries</a>.</p><h4>Other tokens</h4><p>If you are more comfortable working with strftime instead of LDML-like parsing tokens, you can use Ben Oakes' plugin. <a>benjaminoakes/moment-strftime</a>.</p><h4>Default format</h4><p>As of version <strong>1.5.0</strong>, calling <code>moment#format</code> without a format will default to <code>moment.defaultFormat</code>. Out of the box, <code>moment.defaultFormat</code> is the ISO8601 format <code>YYYY-MM-DDTHH:mm:ssZ</code>.</p></div>
 * @param format
 * @return 
 */
public final native String format()/*-{
return this.format(); 
}-*/;

/**
 * <div><pre>moment().fromNow();
moment().fromNow(Boolean);</pre><p>A common way of displaying time is handled by <code>moment#fromNow</code>. This is sometimes called timeago or relative time.</p><div><pre>moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow(); <span>// 4 years ago</span></pre></div><p>If you pass <code>true</code>, you can get the value without the suffix.</p><div><pre>moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow();     <span>// 4 years ago</span>
moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow(<span>true</span>); <span>// 4 years</span></pre></div><p>The base strings are <a>customized by the current language</a>.</p><p>The breakdown of which string is displayed for each length of time is outlined in the table below.</p><table><thead><tr><th>Range</th><th>Key</th><th>Sample Output</th></tr></thead><tbody><tr><td>0 to 45 seconds</td><td>s</td><td>seconds ago</td></tr><tr><td>45 to 90 seconds</td><td>m</td><td>a minute ago</td></tr><tr><td>90 seconds to 45 minutes</td><td>mm</td><td>2 minutes ago ... 45 minutes ago</td></tr><tr><td>45 to 90 minutes</td><td>h</td><td>an hour ago</td></tr><tr><td>90 minutes to 22 hours </td><td>hh</td><td>2 hours ago ... 22 hours ago</td></tr><tr><td>22 to 36 hours</td><td>d</td><td>a day ago</td></tr><tr><td>36 hours to 25 days</td><td>dd</td><td>2 days ago ... 25 days ago</td></tr><tr><td>25 to 45 days</td><td>M</td><td>a month ago</td></tr><tr><td>45 to 345 days</td><td>MM</td><td>2 months ago ... 11 months ago</td></tr><tr><td>345 to 547 days (1.5 years)</td><td>y</td><td>a year ago</td></tr><tr><td>548 days+</td><td>yy</td><td>2 years ago ... 20 years ago</td></tr></tbody></table></div>
 * @return
 */
public final native String fromNow()/*-{
return this.fromNow(); 
}-*/;
/**
 * <div><pre>moment().fromNow();
moment().fromNow(Boolean);</pre><p>A common way of displaying time is handled by <code>moment#fromNow</code>. This is sometimes called timeago or relative time.</p><div><pre>moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow(); <span>// 4 years ago</span></pre></div><p>If you pass <code>true</code>, you can get the value without the suffix.</p><div><pre>moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow();     <span>// 4 years ago</span>
moment([<span>2007</span>, <span>0</span>, <span>29</span>]).fromNow(<span>true</span>); <span>// 4 years</span></pre></div><p>The base strings are <a>customized by the current language</a>.</p><p>The breakdown of which string is displayed for each length of time is outlined in the table below.</p><table><thead><tr><th>Range</th><th>Key</th><th>Sample Output</th></tr></thead><tbody><tr><td>0 to 45 seconds</td><td>s</td><td>seconds ago</td></tr><tr><td>45 to 90 seconds</td><td>m</td><td>a minute ago</td></tr><tr><td>90 seconds to 45 minutes</td><td>mm</td><td>2 minutes ago ... 45 minutes ago</td></tr><tr><td>45 to 90 minutes</td><td>h</td><td>an hour ago</td></tr><tr><td>90 minutes to 22 hours </td><td>hh</td><td>2 hours ago ... 22 hours ago</td></tr><tr><td>22 to 36 hours</td><td>d</td><td>a day ago</td></tr><tr><td>36 hours to 25 days</td><td>dd</td><td>2 days ago ... 25 days ago</td></tr><tr><td>25 to 45 days</td><td>M</td><td>a month ago</td></tr><tr><td>45 to 345 days</td><td>MM</td><td>2 months ago ... 11 months ago</td></tr><tr><td>345 to 547 days (1.5 years)</td><td>y</td><td>a year ago</td></tr><tr><td>548 days+</td><td>yy</td><td>2 years ago ... 20 years ago</td></tr></tbody></table></div>
 * @param noSuffix
 * @return
 */
public final native String fromNow(boolean noSuffix)/*-{
return this.fromNow(noSuffix); 
}-*/;


/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(Moment o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(Moment o, boolean noSuffix)/*-{
return this.from(o, noSuffix); 
}-*/;

/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(String o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(String o, boolean noSuffix)/*-{
return this.from(o, noSuffix); 
}-*/;

/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(double o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(double o, boolean noSuffix)/*-{
return this.from(o, noSuffix); 
}-*/;

/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(JavaScriptObject o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(JavaScriptObject o, boolean noSuffix)/*-{
return this.from(o, noSuffix); 
}-*/;

/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(JsArrayNumber o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(JsArrayNumber o, boolean noSuffix)/*-{
return this.from(o, noSuffix); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(int[] o)/*-{
return this.from(o); 
}-*/;
/**<div><pre>moment().from(Moment|String|Number|Date|Array);
moment().from(Moment|String|Number|Date|Array, Boolean);</pre><p>You may want to display a moment in relation to a time other than now. In that case, you can use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b) <span>// "a day ago"</span></pre></div><p>The first parameter is anything you can pass to <code>moment()</code> or an actual <code>Moment</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.from(b);                     <span>// "a day ago"</span>
a.from([<span>2007</span>, <span>0</span>, <span>28</span>]);         <span>// "a day ago"</span>
a.from(<span>new</span> Date(<span>2007</span>, <span>0</span>, <span>28</span>)); <span>// "a day ago"</span>
a.from(<span>"1-28-2007"</span>);           <span>// "a day ago"</span></pre></div><p>Like <code>moment#fromNow</code>, passing <code>true</code> as the second parameter returns value without the suffix. This is useful wherever you need to have a human readable length of time.</p><div><pre><span>var</span> start = moment([<span>2007</span>, <span>0</span>, <span>5</span>]);
<span>var</span> end = moment([<span>2007</span>, <span>0</span>, <span>10</span>]);
start.from(end);       <span>// "in 5 days"</span>
start.from(end, <span>true</span>); <span>// "5 days"</span></pre></div></div>
 * @param o
 * @return
 */
public final native String from(int[] o, boolean noSuffix)/*-{
return this.from(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(o), noSuffix); 
}-*/;



/**
 * <div><pre>moment().calendar();</pre><p>Calendar time is displays time relative to now, but slightly differently than <code>moment#fromNow</code>.</p><p><code>moment#calendar</code> will format a date with different strings depending on how close to today the date is.</p><table><tbody><tr><td>Last week</td><td>Last Monday 2:30 AM</td></tr><tr><td>The day before</td><td>Yesterday 2:30 AM</td></tr><tr><td>The same day</td><td>Today 2:30 AM</td></tr><tr><td>The next day</td><td>Tomorrow 2:30 AM</td></tr><tr><td>The next week</td><td>Sunday 2:30 AM</td></tr><tr><td>Everything else</td><td>7/10/2011</td></tr></tbody></table><p>These strings are localized, and <a>can be customized</a>.</p></div>
 * @return
 */
public final native String calendar()/*-{
return this.calendar(); 
}-*/;


/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>

 * @param o
 * @return
 */
public final native double diff(Moment o)/*-{
return this.diff(o); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @return
 */
public final native double diff(Moment o, String type)/*-{
return this.diff(o, type); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @param noRound
 * @return
 */
public final native double diff(Moment o, String type, boolean noRound)/*-{
return this.diff(o, type, noRound); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @return
 */
public final native double diff(JavaScriptObject o)/*-{
return this.diff(o); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @return
 */
public final native double diff(JavaScriptObject o, String type)/*-{
return this.diff(o, type); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @param noRound
 * @return
 */
public final native double diff(JavaScriptObject o, String type, boolean noRound)/*-{
return this.diff(o, type, noRound); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @return
 */
public final native double diff(double o)/*-{
return this.diff(o); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @return
 */
public final native double diff(double o, String type)/*-{
return this.diff(o, type); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @param noRound
 * @return
 */
public final native double diff(double o, String type, boolean noRound)/*-{
return this.diff(o, type, noRound); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @return
 */
public final native double diff(JsArrayNumber o)/*-{
return this.diff(o); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @return
 */
public final native double diff(JsArrayNumber o, String type)/*-{
return this.diff(o, type); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @param noRound
 * @return
 */
public final native double diff(JsArrayNumber o, String type, boolean noRound)/*-{
return this.diff(o, type, noRound); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @return
 */
public final native double diff(int[] o)/*-{
return this.diff(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(o)); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @return
 */
public final native double diff(int[] o, String type)/*-{
return this.diff(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(o), type); 
}-*/;
/**
 * <div><pre>moment().diff(Moment|String|Number|Date|Array);
moment().diff(Moment|String|Number|Date|Array, String);
moment().diff(Moment|String|Number|Date|Array, String, Boolean);</pre><p>To get the difference in milliseconds, use <code>moment#diff</code> like you would use <code>moment#from</code>.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b) <span>// 86400000</span></pre></div><p>To get the difference in another unit of measurement, pass that measurement as the second argument.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>, <span>29</span>]);
<span>var</span> b = moment([<span>2007</span>, <span>0</span>, <span>28</span>]);
a.diff(b, <span>'days'</span>) <span>// 1</span></pre></div><p>The supported measurements are years, months, weeks, days, hours, minutes, and seconds. For ease of development, the singular forms are supported as of <strong>2.0.0</strong>. Units of measurement other than milliseconds are available in version <strong>1.1.1</strong>.</p><p>By default, <code>moment#diff</code> will return number rounded down. If you want the floating point number, pass <code>true</code> as the third argument. Before <strong>2.0.0</strong>, <code>moment#diff</code> returned rounded number, not a rounded <em>down</em> number.</p><div><pre><span>var</span> a = moment([<span>2007</span>, <span>0</span>]);
<span>var</span> b = moment([<span>2008</span>, <span>5</span>]);
a.diff(b, <span>'years'</span>)       <span>// 1</span>
a.diff(b, <span>'years'</span>, <span>true</span>) <span>// 1.5</span></pre></div><p>If the moment is later than the moment you are passing to <code>moment.fn.diff</code>, the return value will be negative.</p><div><pre><span>var</span> a = moment();
<span>var</span> b = moment().add(<span>'seconds'</span>, <span>1</span>);
a.diff(b) <span>// -1000</span>
b.diff(a) <span>// 1000</span></pre></div><p>A easy way to think of this is by replacing <code>.diff(</code> with a minus operator.</p><div><pre><span>// a < b</span>
a.diff(b) <span>// a - b < 0</span>
b.diff(a) <span>// b - a < 0</span></pre></div><h4>Month and year diffs</h4><p><code>moment#diff</code> has some special handling for month and year diffs. It is optimized to ensure that two months with the same date are always a whole number apart.</p><p>So Jan 15 to Feb 15 should be exactly 1 month.</p><p>Feb 28 to Mar 28 should be exactly 1 month.</p><p>Feb 28 2011 to Feb 28 2012 should be exactly 1 year.</p><p><a>See more discussion on the month and year diffs here</a></p><p>This change to month and year diffs was made in <strong>2.0.0</strong>.</p></div>
 * @param o
 * @param type
 * @param noRound
 * @return
 */
public final native double diff(int[] o, String type, boolean noRound)/*-{
return this.diff(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(o), type, noRound); 
}-*/;
/**
 * Unix Offset (milliseconds)
<div><pre>moment().valueOf();
+moment();</pre><p><code>moment#valueOf</code> simply outputs the number of milliseconds since the Unix Epoch, just like <code>Date#valueOf</code>.</p><div><pre>moment(<span>1318874398806</span>).valueOf(); <span>// 1318874398806</span>
+moment(<span>1318874398806</span>); <span>// 1318874398806</span></pre></div><p>To get a Unix timestamp (the number of seconds since the epoch) from a <code>Moment</code>, use <code>moment#unix</code>.</p></div>
 * @return
 */
public final native int valueOf()/*-{
return this.valueOf();
}-*/;
/**
 * Unix Timestamp (seconds).moment#unix outputs a Unix timestamp (the of seconds since the Unix Epoch).
<pre>moment(1318874398806).unix(); // 1318874398</pre>
This value is floored to the nearest second, and does not include a milliseconds component.
 * @return
 */
public final native int unix()/*-{
return this.unix();
}-*/;
/**
 * Timezone Offset. Get the timezone offset in minutes.
<pre>moment().zone(); // (60, 120, 240, etc.)</pre>
This value is floored to the nearest second, and does not include a milliseconds component.
 * @return
 */
public final native int zone()/*-{
return this.zone();
}-*/;
/**
 * 
Get the number of days in the current month.
<pre>
moment("2012-02", "YYYY-MM").daysInMonth() // 29
moment("2012-01", "YYYY-MM").daysInMonth() // 31
</pre>
 * @return
 */
public final native int daysInMonth()/*-{
return this.daysInMonth();
}-*/;

/**
 * <pre>moment().toDate();</pre><p>To get the native Date object that Moment.js wraps, use <code>moment#toDate</code>.</p><p>This will return the <code>Date</code> that the moment uses, so any changes to that <code>Date</code> will cause the moment to change. If you want a <code>Date</code> that is a copy, use <code>moment#clone</code> before you use <code>moment#toDate</code>.</p><p><code>moment#native</code> has been replaced by <code>moment#toDate</code> and has been deprecated as of <strong>1.6.0</strong>.</p>
 * @return
 */
public final native JsDate toDate()/*-{
return this.toDate();
}-*/;
/**
 * returns a java.util.Date
 * @return
 */
public final native Date toJavaDate()/*-{
return @org.sgx.jsutil.client.JsUtil::toJavaDate(Lcom/google/gwt/core/client/JsDate;)(this.toDate());
}-*/;
/**
 * This returns an array that mirrors the parameters from new Date().
<pre>moment().toArray(); // [2013, 1, 4, 14, 40, 16, 154];</pre>
 * @return
 */
public final native JsArrayNumber toArray()/*-{
	return this.toArray(); 
}-*/;
/**
 * This returns an array that mirrors the parameters from new Date().
<pre>moment().toArray(); // [2013, 1, 4, 14, 40, 16, 154];</pre>
 * @return
 */
public final native int[] toArrayJava()/*-{
return @org.sgx.jsutil.client.JsUtil::toJavaIntArray(Lcom/google/gwt/core/client/JsArrayNumber;)(this.toArray()); 
}-*/;
/**
 * When serializing an object to JSON, if there is a Moment object, it will be represented as an ISO8601 string.
JSON.stringify({
    postDate : moment()
}); // {"postDate":"2013-02-04T22:44:30.652Z"}
 * @return
 */
public final native String toJSON()/*-{
return this.toJSON(); 
}-*/;
















//Queries
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(Moment m)/*-{
return this.isBefore(m); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(Moment m, String g)/*-{
return this.isBefore(m, g); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(String m)/*-{
return this.isBefore(m); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(String m, String g)/*-{
return this.isBefore(m, g); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(double m)/*-{
return this.isBefore(m); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(double m, String g)/*-{
return this.isBefore(m, g); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(JavaScriptObject m)/*-{
return this.isBefore(m); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(JavaScriptObject m, String g)/*-{
return this.isBefore(m, g); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(Date m)/*-{
return this.isBefore(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m)); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(Date m, String g)/*-{
return this.isBefore(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m), g); 
}-*/;

/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(JsArrayNumber m)/*-{
return this.isBefore(m); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(JsArrayNumber m, String g)/*-{
return this.isBefore(m, g); 
}-*/;
/**
 * <pre>moment().isBefore(Moment|String|Number|Date|Array);
moment().isBefore(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is before another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-10-21'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isBefore(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isBefore(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isSame</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isBefore</code>. Year, month, week, day, hour, minute, and second.</p>
 * @return
 */
public final native boolean isBefore(int[] m, String g)/*-{
return this.isBefore(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(m), g); 
}-*/;


/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(Moment m)/*-{
return this.isSame(m); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(Moment m, String g)/*-{
return this.isSame(m, g); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(String m)/*-{
return this.isSame(m); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(String m, String g)/*-{
return this.isSame(m, g); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(double m)/*-{
return this.isSame(m); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(double m, String g)/*-{
return this.isSame(m, g); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(JavaScriptObject m)/*-{
return this.isSame(m); 
}-*/;
/**<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(JavaScriptObject m, String g)/*-{
return this.isSame(m, g); 
}-*/;
/**
 * <pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(Date m)/*-{
return this.isSame(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m)); 
}-*/;
/**
 *<pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(Date m, String g)/*-{
return this.isSame(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m), g); 
}-*/;

/**
 * <pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(JsArrayNumber m)/*-{
return this.isSame(m); 
}-*/;
/**
 * <pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p> 
 */
public final native boolean isSame(JsArrayNumber m, String g)/*-{
return this.isSame(m, g); 
}-*/;
/**
 * <pre>moment().isSame(Moment|String|Number|Date|Array);
moment().isSame(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is the same as another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2010-10-20'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isSame(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2010-12-31'</span>, <span>'year'</span>); <span>// true</span>
moment(<span>'2010-10-20'</span>).isSame(<span>'2011-01-01'</span>, <span>'year'</span>); <span>// false</span></pre></div><p>Like <code>moment#isAfter</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isSame</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isSame(int[] m, String g)/*-{
return this.isSame(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(m), g); 
}-*/;




/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(Moment m)/*-{
return this.isAfter(m); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(Moment m, String g)/*-{
return this.isAfter(m, g); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(String m)/*-{
return this.isAfter(m); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(String m, String g)/*-{
return this.isAfter(m, g); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(double m)/*-{
return this.isAfter(m); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(double m, String g)/*-{
return this.isAfter(m, g); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
 */
public final native boolean isAfter(JavaScriptObject m)/*-{
return this.isAfter(m); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(JavaScriptObject m, String g)/*-{
return this.isAfter(m, g); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(Date m)/*-{
return this.isAfter(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m)); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(Date m, String g)/*-{
return this.isAfter(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(m), g); 
}-*/;

/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(JsArrayNumber m)/*-{
return this.isAfter(m); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(JsArrayNumber m, String g)/*-{
return this.isAfter(m, g); 
}-*/;
/**<pre>moment().isAfter(Moment|String|Number|Date|Array);
moment().isAfter(Moment|String|Number|Date|Array, String);</pre><p>Check if a moment is after another moment.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-10-19'</span>); <span>// true</span></pre></div><p>If you want to limit the granularity to a unit other than milliseconds, pass the units as the second parameter.</p><div><pre>moment(<span>'2010-10-20'</span>).isAfter(<span>'2010-01-01'</span>, <span>'year'</span>); <span>// false</span>
moment(<span>'2010-10-20'</span>).isAfter(<span>'2009-12-31'</span>, <span>'year'</span>); <span>// true</span></pre></div><p>Like <code>moment#isSame</code> and <code>moment#isBefore</code>, any of the units of time that are supported for <code>moment#startOf</code> are supported for <code>moment#isAfter</code>. Year, month, week, day, hour, minute, and second.</p>
*/
public final native boolean isAfter(int[] m, String g)/*-{
return this.isAfter(@org.sgx.jsutil.client.JsUtil::toJsArrayInt([I)(m), g); 
}-*/;

/**
moment#isLeapYear returns true if that year is a leap year, and false if it is not.
<pre>moment([2000]).isLeapYear() // true
moment([2001]).isLeapYear() // false
moment([2100]).isLeapYear() // false</pre>
 * @return
 */
public final native boolean isLeapYear()/*-{
return this.isLeapYear();
}-*/;
/**
 * checks if the current moment is in daylight savings time.
<pre>moment([2011, 2, 12]).isDST(); // false, March 12 2011 is not DST
moment([2011, 2, 14]).isDST(); // true, March 14 2011 is DST</pre>
 * @return
 */
public final native boolean isDST()/*-{
return this.isDST();
}-*/;
/**
To check if a variable is a moment object, use moment.isMoment().
<pre>moment.isMoment() // false
moment.isMoment(new Date()) // false
moment.isMoment(moment()) // true</pre>
 * @return
 */
public final native boolean isMoment(Object o)/*-{
return $wnd.moment.isMoment(o);
}-*/;

/**
 * Moment.js has pretty robust support for internationalization. You can load multiple languages and easily switch between them. In addition to assigning a global language, you can assign a language to a specific moment.
 * <h2>Changing language globally 1.0.0</h2><p>By default, Moment.js comes with English language strings. If you need other languages, you can load them into Moment.js for later use.</p><p>To load a language, pass the key and the string values to <code>moment.lang</code>.</p><p>More details on each of the parts of the language bundle can be found in the <a>customization</a> section.</p><div><pre>moment.lang(<span>'fr'</span>, {
    months : <span>"janvier_février_mars_avril_mai_juin_juillet_août_septembre_octobre_novembre_décembre"</span>.split(<span>"_"</span>),
    monthsShort : <span>"janv._févr._mars_avr._mai_juin_juil._août_sept._oct._nov._déc."</span>.split(<span>"_"</span>),
    weekdays : <span>"dimanche_lundi_mardi_mercredi_jeudi_vendredi_samedi"</span>.split(<span>"_"</span>),
    weekdaysShort : <span>"dim._lun._mar._mer._jeu._ven._sam."</span>.split(<span>"_"</span>),
    weekdaysMin : <span>"Di_Lu_Ma_Me_Je_Ve_Sa"</span>.split(<span>"_"</span>),
    longDateFormat : {
        LT : <span>"HH:mm"</span>,
        L : <span>"DD/MM/YYYY"</span>,
        LL : <span>"D MMMM YYYY"</span>,
        LLL : <span>"D MMMM YYYY LT"</span>,
        LLLL : <span>"dddd D MMMM YYYY LT"</span>
    },
    calendar : {
        sameDay: <span>"[Aujourd'hui à] LT"</span>,
        nextDay: <span>'[Demain à] LT'</span>,
        nextWeek: <span>'dddd [à] LT'</span>,
        lastDay: <span>'[Hier à] LT'</span>,
        lastWeek: <span>'dddd [dernier à] LT'</span>,
        sameElse: <span>'L'</span>
    },
    relativeTime : {
        future : <span>"dans %s"</span>,
        past : <span>"il y a %s"</span>,
        s : <span>"quelques secondes"</span>,
        m : <span>"une minute"</span>,
        mm : <span>"%d minutes"</span>,
        h : <span>"une heure"</span>,
        hh : <span>"%d heures"</span>,
        d : <span>"un jour"</span>,
        dd : <span>"%d jours"</span>,
        M : <span>"un mois"</span>,
        MM : <span>"%d mois"</span>,
        y : <span>"une année"</span>,
        yy : <span>"%d années"</span>
    },
    ordinal : <span><span>function</span><span>(number)</span> {</span><span>return</span> number + (number === <span>1</span> ? <span>'er'</span> : <span>'ème'</span>);
    },
    week : {
        dow : <span>1</span>, <span>// Monday is the first day of the week.</span>
        doy : <span>4</span><span>// The week that contains Jan 4th is the first week of the year.</span>
    }
});
</pre></div><p>Once you load a language, it becomes the active language. To change active languages, simply call <code>moment.lang</code> with the key of a loaded language.</p><div><pre>moment.lang(<span>'fr'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// il y a une heure</span>
moment.lang(<span>'en'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// an hour ago</span></pre></div>

<h2>Changing language locally</h2>
<p>A global language configuration can be problematic when passing around moments that may need to be formatted into different languages.</p><p>In <strong>1.7.0</strong> we added instance specific language configurations.</p><div><pre>moment.lang(<span>'en'</span>); <span>// default the language to English</span><span>var</span> globalLang = moment();
<span>var</span> localLang = moment();

localLang.lang(<span>'fr'</span>); <span>// set this instance to use French</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Sunday, July 15 2012 11:01 AM</span>

moment.lang(<span>'es'</span>); <span>// change the global language to Spanish</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>

localLang.lang(<span>false</span>); <span>// reset the instance language</span>
localLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span></pre></div><p>If you call <code>moment#lang</code> with no parameters, you get back the language configuration that would be used for that moment.</p><div><pre><span>var</span> fr = moment().lang(<span>'fr'</span>);
fr.lang().months <span>// ["janvier", "février", "mars", ...]</span>
fr.lang(<span>'en'</span>);
fr.lang().months <span>// ["January", "February", "March", ...]</span></pre></div><p>If you need to access the language data for a moment, this is the preferred way to do so.</p>
 */
public final native void lang_(String langId)/*-{
this.lang(langId);
}-*/;
/**
 * 
 * @return this instance current lang id.
 */
public final native String lang_()/*-{
this.lang();
}-*/;
/**
 *  * Moment.js has pretty robust support for internationalization. You can load multiple languages and easily switch between them. In addition to assigning a global language, you can assign a language to a specific moment.
 * <h2>Changing language globally 1.0.0</h2><p>By default, Moment.js comes with English language strings. If you need other languages, you can load them into Moment.js for later use.</p><p>To load a language, pass the key and the string values to <code>moment.lang</code>.</p><p>More details on each of the parts of the language bundle can be found in the <a>customization</a> section.</p><div><pre>moment.lang(<span>'fr'</span>, {
    months : <span>"janvier_février_mars_avril_mai_juin_juillet_août_septembre_octobre_novembre_décembre"</span>.split(<span>"_"</span>),
    monthsShort : <span>"janv._févr._mars_avr._mai_juin_juil._août_sept._oct._nov._déc."</span>.split(<span>"_"</span>),
    weekdays : <span>"dimanche_lundi_mardi_mercredi_jeudi_vendredi_samedi"</span>.split(<span>"_"</span>),
    weekdaysShort : <span>"dim._lun._mar._mer._jeu._ven._sam."</span>.split(<span>"_"</span>),
    weekdaysMin : <span>"Di_Lu_Ma_Me_Je_Ve_Sa"</span>.split(<span>"_"</span>),
    longDateFormat : {
        LT : <span>"HH:mm"</span>,
        L : <span>"DD/MM/YYYY"</span>,
        LL : <span>"D MMMM YYYY"</span>,
        LLL : <span>"D MMMM YYYY LT"</span>,
        LLLL : <span>"dddd D MMMM YYYY LT"</span>
    },
    calendar : {
        sameDay: <span>"[Aujourd'hui à] LT"</span>,
        nextDay: <span>'[Demain à] LT'</span>,
        nextWeek: <span>'dddd [à] LT'</span>,
        lastDay: <span>'[Hier à] LT'</span>,
        lastWeek: <span>'dddd [dernier à] LT'</span>,
        sameElse: <span>'L'</span>
    },
    relativeTime : {
        future : <span>"dans %s"</span>,
        past : <span>"il y a %s"</span>,
        s : <span>"quelques secondes"</span>,
        m : <span>"une minute"</span>,
        mm : <span>"%d minutes"</span>,
        h : <span>"une heure"</span>,
        hh : <span>"%d heures"</span>,
        d : <span>"un jour"</span>,
        dd : <span>"%d jours"</span>,
        M : <span>"un mois"</span>,
        MM : <span>"%d mois"</span>,
        y : <span>"une année"</span>,
        yy : <span>"%d années"</span>
    },
    ordinal : <span><span>function</span><span>(number)</span> {</span><span>return</span> number + (number === <span>1</span> ? <span>'er'</span> : <span>'ème'</span>);
    },
    week : {
        dow : <span>1</span>, <span>// Monday is the first day of the week.</span>
        doy : <span>4</span><span>// The week that contains Jan 4th is the first week of the year.</span>
    }
});
</pre></div><p>Once you load a language, it becomes the active language. To change active languages, simply call <code>moment.lang</code> with the key of a loaded language.</p><div><pre>moment.lang(<span>'fr'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// il y a une heure</span>
moment.lang(<span>'en'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// an hour ago</span></pre></div>

<h2>Changing language locally</h2>
<p>A global language configuration can be problematic when passing around moments that may need to be formatted into different languages.</p><p>In <strong>1.7.0</strong> we added instance specific language configurations.</p><div><pre>moment.lang(<span>'en'</span>); <span>// default the language to English</span><span>var</span> globalLang = moment();
<span>var</span> localLang = moment();

localLang.lang(<span>'fr'</span>); <span>// set this instance to use French</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Sunday, July 15 2012 11:01 AM</span>

moment.lang(<span>'es'</span>); <span>// change the global language to Spanish</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>

localLang.lang(<span>false</span>); <span>// reset the instance language</span>
localLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span></pre></div><p>If you call <code>moment#lang</code> with no parameters, you get back the language configuration that would be used for that moment.</p><div><pre><span>var</span> fr = moment().lang(<span>'fr'</span>);
fr.lang().months <span>// ["janvier", "février", "mars", ...]</span>
fr.lang(<span>'en'</span>);
fr.lang().months <span>// ["January", "February", "March", ...]</span></pre></div><p>If you need to access the language data for a moment, this is the preferred way to do so.</p>

 * @param o
 * @return
 */
public static final native void lang(String langId, JavaScriptObject langDef)/*-{
$wnd.moment.lang(langId, langDef);
}-*/;
/**
 *  * Moment.js has pretty robust support for internationalization. You can load multiple languages and easily switch between them. In addition to assigning a global language, you can assign a language to a specific moment.
 * <h2>Changing language globally 1.0.0</h2><p>By default, Moment.js comes with English language strings. If you need other languages, you can load them into Moment.js for later use.</p><p>To load a language, pass the key and the string values to <code>moment.lang</code>.</p><p>More details on each of the parts of the language bundle can be found in the <a>customization</a> section.</p><div><pre>moment.lang(<span>'fr'</span>, {
    months : <span>"janvier_février_mars_avril_mai_juin_juillet_août_septembre_octobre_novembre_décembre"</span>.split(<span>"_"</span>),
    monthsShort : <span>"janv._févr._mars_avr._mai_juin_juil._août_sept._oct._nov._déc."</span>.split(<span>"_"</span>),
    weekdays : <span>"dimanche_lundi_mardi_mercredi_jeudi_vendredi_samedi"</span>.split(<span>"_"</span>),
    weekdaysShort : <span>"dim._lun._mar._mer._jeu._ven._sam."</span>.split(<span>"_"</span>),
    weekdaysMin : <span>"Di_Lu_Ma_Me_Je_Ve_Sa"</span>.split(<span>"_"</span>),
    longDateFormat : {
        LT : <span>"HH:mm"</span>,
        L : <span>"DD/MM/YYYY"</span>,
        LL : <span>"D MMMM YYYY"</span>,
        LLL : <span>"D MMMM YYYY LT"</span>,
        LLLL : <span>"dddd D MMMM YYYY LT"</span>
    },
    calendar : {
        sameDay: <span>"[Aujourd'hui à] LT"</span>,
        nextDay: <span>'[Demain à] LT'</span>,
        nextWeek: <span>'dddd [à] LT'</span>,
        lastDay: <span>'[Hier à] LT'</span>,
        lastWeek: <span>'dddd [dernier à] LT'</span>,
        sameElse: <span>'L'</span>
    },
    relativeTime : {
        future : <span>"dans %s"</span>,
        past : <span>"il y a %s"</span>,
        s : <span>"quelques secondes"</span>,
        m : <span>"une minute"</span>,
        mm : <span>"%d minutes"</span>,
        h : <span>"une heure"</span>,
        hh : <span>"%d heures"</span>,
        d : <span>"un jour"</span>,
        dd : <span>"%d jours"</span>,
        M : <span>"un mois"</span>,
        MM : <span>"%d mois"</span>,
        y : <span>"une année"</span>,
        yy : <span>"%d années"</span>
    },
    ordinal : <span><span>function</span><span>(number)</span> {</span><span>return</span> number + (number === <span>1</span> ? <span>'er'</span> : <span>'ème'</span>);
    },
    week : {
        dow : <span>1</span>, <span>// Monday is the first day of the week.</span>
        doy : <span>4</span><span>// The week that contains Jan 4th is the first week of the year.</span>
    }
});
</pre></div><p>Once you load a language, it becomes the active language. To change active languages, simply call <code>moment.lang</code> with the key of a loaded language.</p><div><pre>moment.lang(<span>'fr'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// il y a une heure</span>
moment.lang(<span>'en'</span>);
moment(<span>1316116057189</span>).fromNow() <span>// an hour ago</span></pre></div>

<h2>Changing language locally</h2>
<p>A global language configuration can be problematic when passing around moments that may need to be formatted into different languages.</p><p>In <strong>1.7.0</strong> we added instance specific language configurations.</p><div><pre>moment.lang(<span>'en'</span>); <span>// default the language to English</span><span>var</span> globalLang = moment();
<span>var</span> localLang = moment();

localLang.lang(<span>'fr'</span>); <span>// set this instance to use French</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Sunday, July 15 2012 11:01 AM</span>

moment.lang(<span>'es'</span>); <span>// change the global language to Spanish</span>
localLang.format(<span>'LLLL'</span>); <span>// dimanche 15 juillet 2012 11:01</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>

localLang.lang(<span>false</span>); <span>// reset the instance language</span>
localLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span>
globalLang.format(<span>'LLLL'</span>); <span>// Domingo 15 Julio 2012 11:03</span></pre></div><p>If you call <code>moment#lang</code> with no parameters, you get back the language configuration that would be used for that moment.</p><div><pre><span>var</span> fr = moment().lang(<span>'fr'</span>);
fr.lang().months <span>// ["janvier", "février", "mars", ...]</span>
fr.lang(<span>'en'</span>);
fr.lang().months <span>// ["January", "February", "March", ...]</span></pre></div><p>If you need to access the language data for a moment, this is the preferred way to do so.</p>

 * @param o
 * @return
 */
public static final native void lang(String langId)/*-{
$wnd.moment.lang(langId);
}-*/;
/**
 * returns current lang id
 * @return
 */
public static final native String lang()/*-{
return $wnd.moment.lang();
}-*/;










//Duration
/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public static final native Duration Duration(int i)/*-{
return $wnd.moment.duration(i);
}-*/;
/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public final native Duration duration(int i)/*-{
return this.duration(i);
}-*/;

/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public static final native Duration Duration(int i, String s)/*-{
return $wnd.moment.duration(i, s);
}-*/;

/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public static final native Duration duration(int i, String s)/*-{
return this.duration(i, s);
}-*/;
/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public static final native Duration Duration(DurationData d)/*-{
return $wnd.moment.duration(d);
}-*/;
/**
 * <pre>moment.duration(Number, String);
moment.duration(Number);
moment.duration(Object);</pre><p>To create a duration, call <code>moment.duration()</code> with the length of time in milliseconds.</p><div><pre>moment.duration(<span>100</span>); <span>// 100 milliseconds</span></pre></div><p>If you want to create a moment with a unit of measurement other than seconds, you can pass the unit of measurement as well.</p><div><pre>moment.duration(<span>2</span>, <span>'seconds'</span>);
moment.duration(<span>2</span>, <span>'minutes'</span>);
moment.duration(<span>2</span>, <span>'hours'</span>);
moment.duration(<span>2</span>, <span>'days'</span>);
moment.duration(<span>2</span>, <span>'weeks'</span>);
moment.duration(<span>2</span>, <span>'months'</span>);
moment.duration(<span>2</span>, <span>'years'</span>);
</pre></div><p>The same shorthand for <code>moment#add</code> and <code>moment#subtract</code> works here as well.</p><table><tbody><tr><th>Key</th><th>Shorthand</th></tr><tr><td>years</td><td>y</td></tr><tr><td>months</td><td>M</td></tr><tr><td>weeks</td><td>w</td></tr><tr><td>days</td><td>d</td></tr><tr><td>hours</td><td>h</td></tr><tr><td>minutes</td><td>m</td></tr><tr><td>seconds</td><td>s</td></tr><tr><td>milliseconds</td><td>ms</td></tr></tbody></table><p>Much like <code>moment#add</code>, you can pass an object of values if you need multiple different units of measurement.</p><div><pre>moment.duration({
    seconds: <span>2</span>,
    minutes: <span>2</span>,
    hours: <span>2</span>,
    days: <span>2</span>,
    weeks: <span>2</span>,
    months: <span>2</span>,
    years: <span>2</span>
});
</pre></div>
 * @param i
 * @return
 */
public static final native Duration duration(DurationData d)/*-{
return this.duration(d);
}-*/;


}
