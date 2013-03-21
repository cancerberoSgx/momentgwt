package org.sgx.momentgwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Duration extends JavaScriptObject {
protected Duration(){}

/**
 * <pre>moment.duration().humanize();</pre><p>Sometimes, you want all the goodness of <code>moment#from</code> but you don't want to have to create two moments, you just want to display a length of time.</p><p>Enter <code>moment.duration().humanize()</code>.</p><div><pre>moment.duration(<span>1</span>, <span>"minutes"</span>).humanize(); <span>// a minute</span>
moment.duration(<span>2</span>, <span>"minutes"</span>).humanize(); <span>// 2 minutes</span>
moment.duration(<span>24</span>, <span>"hours"</span>).humanize();  <span>// a day</span></pre></div><p>By default, the return string is suffixless. If you want a suffix, pass in true as seen below.</p><div><pre>moment.duration(<span>1</span>, <span>"minutes"</span>).humanize(<span>true</span>); <span>// in a minute</span></pre></div><p>For suffixes before now, pass in a negative number.</p><div><pre>moment.duration(-<span>1</span>, <span>"minutes"</span>).humanize(<span>true</span>); <span>// a minute ago</span></pre></div>
 * @return
 */
public native final String humanize()/*-{
	return this.humanize();
}-*/;

/**
 * <p>To get the number of milliseconds in a duration, use <code>moment.duration().milliseconds()</code>.</p><p>It will return a number between 0 and 1000.</p><div><pre>moment.duration(<span>500</span>).milliseconds(); <span>// 500</span>
moment.duration(<span>1500</span>).milliseconds(); <span>// 500</span>
moment.duration(<span>15000</span>).milliseconds(); <span>// 0</span></pre></div><p>If you want the length of the duration in milliseconds, use <code>moment.duration().asMilliseconds()</code> instead.</p><div><pre>moment.duration(<span>500</span>).asMilliseconds(); <span>// 500</span>
moment.duration(<span>1500</span>).asMilliseconds(); <span>// 1500</span>
moment.duration(<span>15000</span>).asMilliseconds(); <span>// 15000</span></pre></div>
 * @return
 */
public native final int milliseconds()/*-{
return this.milliseconds();
}-*/;

/**
 * <p>To get the number of milliseconds in a duration, use <code>moment.duration().milliseconds()</code>.</p><p>It will return a number between 0 and 1000.</p><div><pre>moment.duration(<span>500</span>).milliseconds(); <span>// 500</span>
moment.duration(<span>1500</span>).milliseconds(); <span>// 500</span>
moment.duration(<span>15000</span>).milliseconds(); <span>// 0</span></pre></div><p>If you want the length of the duration in milliseconds, use <code>moment.duration().asMilliseconds()</code> instead.</p><div><pre>moment.duration(<span>500</span>).asMilliseconds(); <span>// 500</span>
moment.duration(<span>1500</span>).asMilliseconds(); <span>// 1500</span>
moment.duration(<span>15000</span>).asMilliseconds(); <span>// 15000</span></pre></div>
 * @return
 */
public native final int asMilliseconds()/*-{
return this.asMilliseconds();
}-*/;
/**
<p>To get the number of seconds in a duration, use <code>moment.duration().seconds()</code>.</p><p>It will return a number between 0 and 60.</p><div><pre>moment.duration(<span>500</span>).seconds(); <span>// 0</span>
moment.duration(<span>1500</span>).seconds(); <span>// 1</span>
moment.duration(<span>15000</span>).seconds(); <span>// 15</span></pre></div><p>If you want the length of the duration in seconds, use <code>moment.duration().asSeconds()</code> instead.</p><div><pre>moment.duration(<span>500</span>).asSeconds(); <span>// 0.5</span>
moment.duration(<span>1500</span>).asSeconds(); <span>// 1.5</span>
moment.duration(<span>15000</span>).asSeconds(); <span>// 15</span></pre></div>
 * @return
 */
public native final int seconds()/*-{
return this.seconds();
}-*/;
/**
<p>To get the number of seconds in a duration, use <code>moment.duration().seconds()</code>.</p><p>It will return a number between 0 and 60.</p><div><pre>moment.duration(<span>500</span>).seconds(); <span>// 0</span>
moment.duration(<span>1500</span>).seconds(); <span>// 1</span>
moment.duration(<span>15000</span>).seconds(); <span>// 15</span></pre></div><p>If you want the length of the duration in seconds, use <code>moment.duration().asSeconds()</code> instead.</p><div><pre>moment.duration(<span>500</span>).asSeconds(); <span>// 0.5</span>
moment.duration(<span>1500</span>).asSeconds(); <span>// 1.5</span>
moment.duration(<span>15000</span>).asSeconds(); <span>// 15</span></pre></div>
 * @return
 */
public native final int asSeconds()/*-{
return this.asSeconds();
}-*/;
/**
 * As with the other getters for durations, moment.duration().minutes() gets the minutes (0 - 60).
moment.duration().asMinutes() gets the length of the duration in minutes.
 * @return
 */
public native final int minutes()/*-{
return this.minutes();
}-*/;
/**
 * As with the other getters for durations, moment.duration().minutes() gets the minutes (0 - 60).
moment.duration().asMinutes() gets the length of the duration in minutes.
 * @return
 */
public native final int asMinutes()/*-{
return this.asMinutes();
}-*/;
/**
 * As with the other getters for durations, moment.duration().hours() gets the hours (0 - 24).
moment.duration().asHours() gets the length of the duration in hours. 
 * @return
 */
public native final int hours()/*-{
return this.hours();
}-*/;
/**
 * As with the other getters for durations, moment.duration().hours() gets the hours (0 - 24).
moment.duration().asHours() gets the length of the duration in hours. 
 */
public native final int asHours()/*-{
return this.asHours();
}-*/;

/**
 * As with the other getters for durations, moment.duration().days() gets the days (0 - 30).
moment.duration().asDays() gets the length of the duration in days.
 * @return
 */
public native final int days()/*-{
return this.days();
}-*/;
/**
 * As with the other getters for durations, moment.duration().days() gets the days (0 - 30).
moment.duration().asDays() gets the length of the duration in days.
 * @return
 */
public native final int asDays()/*-{
return this.asDays();
}-*/;

/**
 * As with the other getters for durations, moment.duration().months() gets the months (0 - 12).
moment.duration().asMonths() gets the length of the duration in months.
Note: The length of a duration in months is defined as 30 days.
 * @return
 */
public native final int months()/*-{
return this.months();
}-*/;
/**
 * As with the other getters for durations, moment.duration().months() gets the months (0 - 12).
moment.duration().asMonths() gets the length of the duration in months.
Note: The length of a duration in months is defined as 30 days.
 * @return
 */
public native final int asMonths()/*-{
return this.asMonths();
}-*/;

/**
 * As with the other getters for durations, moment.duration().years() gets the years.
moment.duration().asYears() gets the length of the duration in years.
Note: The length of a duration in years is defined as 365 days.
 * @return
 */
public native final int years()/*-{
return this.years();
}-*/;
/**
 * As with the other getters for durations, moment.duration().years() gets the years.
moment.duration().asYears() gets the length of the duration in years.
Note: The length of a duration in years is defined as 365 days.
 * @return
 */
public native final int asYears()/*-{
return this.asYears();
}-*/;

}
