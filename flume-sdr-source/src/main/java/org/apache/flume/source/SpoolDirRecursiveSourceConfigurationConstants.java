package org.apache.flume.source;

/**
 * Created with IntelliJ IDEA.
 * User: zhuhongyin
 * Date: 16-5-3
 * Time: 下午3:20
 */
public class SpoolDirRecursiveSourceConfigurationConstants {
    /**
     * Delay(in milliseconds) used when polling for new files. The default is 500ms
     */
    public static final String POLL_DELAY = "pollDelay";
    public static final int DEFAULT_POLL_DELAY = 500;
    public static final String AFTER_MODIFIED = "afterModified";
    public static final long DEFAULT_AFTER_MODIFY = 6000;
    public static final String HOURS_DELAY = "hoursDelay";
    public static final int DEFAULT_HOURS_DELAY = 168;
    public static final String DATE_PATTERN = "datePattern";
    public static final String DEFAULT_DATE_PATTERN = "^20\\d{6}$";
}
