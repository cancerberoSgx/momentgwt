package org.sgx.momentgwt.client;

import java.util.Date;

import org.sgx.jsutil.client.JsUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;
/**
 * this is the moment instance - this is, the object that it's returned from js moment(). 
 * It also contains static methods for calling the moment() function. 
 * Note, javadocs copied from momentjs.com site
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
return $wnd.moment();
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
public final native Moment utc()/*-{
return $wnd.utc();
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
public final native Moment utc(double i)/*-{
return $wnd.utc(i);
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
public final native Moment utc(double[]i)/*-{
return $wnd.utc(@org.sgx.jsutil.client.JsUtil::toJsArrayDouble([D)(i));
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
public final native Moment utc(JsArrayNumber i)/*-{
return $wnd.utc(i);
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
public final native Moment utc(String i)/*-{
return $wnd.utc(i);
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
public final native Moment utc(String i, String j)/*-{
return $wnd.utc(i, j);
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
public final native Moment utc(String i, JsArrayString j)/*-{
return $wnd.utc(i, j);
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
public final native Moment utc(String i, String[] j)/*-{
return $wnd.utc(i, @org.sgx.jsutil.client.JsUtil::toJsArrayString([Ljava/lang/String;)(j));
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
public final native Moment utc(String i, String j, String k)/*-{
return $wnd.utc(i, j, k);
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
public final native Moment utc(Moment m)/*-{
return $wnd.utc(m);
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
public final native Moment utc(JavaScriptObject date)/*-{
return $wnd.utc(date);
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
public final native Moment utc(Date date)/*-{
return $wnd.utc(@org.sgx.jsutil.client.JsUtil::toJsDate(Ljava/util/Date;)(date));
}-*/;
/**
 * <div><pre>moment(String);</pre><p>You can create a moment from a string that can be parsed by <code>Date.parse</code>.</p><div><pre><span>var</span> day = moment(<span>"Dec 25, 1995"</span>);
</pre></div><p><strong>Warning</strong> Browser support for this is inconsistent. Because there is no specification on which formats should be supported, what works in some browsers will not work in other browsers.</p><p>For more consistent results, you should use <a>String + Format</a>.</p><p>There is one exception. Moment.js does detect if you are using an ISO-8601 string and will parse that correctly without a format string.</p><p>The following ISO-8601 formats are supported across all browsers.</p><div><pre><span>"YYYY-MM-DD"</span><span>"YYYY-MM-DDTHH"</span><span>"YYYY-MM-DD HH"</span><span>"YYYY-MM-DDTHH:mm"</span><span>"YYYY-MM-DD HH:mm"</span><span>"YYYY-MM-DDTHH:mm:ss"</span><span>"YYYY-MM-DD HH:mm:ss"</span><span>"YYYY-MM-DDTHH:mm:ss.SSS"</span><span>"YYYY-MM-DD HH:mm:ss.SSS"</span><span>"YYYY-MM-DDTHH:mm:ss Z"</span><span>"YYYY-MM-DD HH:mm:ss Z"</span></pre></div><p><strong>Note:</strong> Automatic cross browser ISO-8601 support was added in version <strong>1.5.0</strong></p><p>If a string does not match any of the above formats and is not able to be parsed with <code>Date.parse</code>, <code>moment#isValid</code> will return false.</p><div><pre>moment(<span>"not a real date"</span>).isValid(); <span>// false</span></pre></div></div>
 * @param format
 * @return
 */
public final native String format(String format)/*-{
return this.format(format); 
}-*/;

/**
 * @return true iff this is a valid moment object, for example: 
 * <pre>moment("2010 notamonth 29", "YYYY MMM DD").isValid(); 
 * // false (not a real month name)</pre>
 */
public final native boolean isValid()/*-{
return this.isValid(); 
}-*/;


}
