package com.demo.constant;

public class CommonConstants {
    private CommonConstants() {
        throw new IllegalStateException("工具类不允许实例化");
    }

    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String DOT = ".";
    public static final String COMMA = ",";
    public static final String PIPE = "|";
    public static final String UNDERSCORE = "_";

    public static final String LEFT_BRACE = "{";
    public static final String LEFT_BRACKET = "(";
    public static final String LEFT_CHEV = "<";
    public static final String ARRAY_START = "[";
    public static final String ARRAY_END = "]";
    public static final String RIGHT_BRACE = "}";
    public static final String RIGHT_BRACKET = ")";
    public static final String RIGHT_CHEV = ">";
    public static final String HASH = "#";
    public static final String ASTERISK = "*";
    public static final String SINGLE_QUOTE_COMMA = "','";

    public static final String NEWLINE = "\n";
    public static final String WHITESPACE_REGEX = "\\s+";

    public static final String DESENSITIZATION_STR = "***";

    /**
     * 时间格式
     */
    public final static String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";

    public final static String ZONE_ID = "Asia/Shanghai";

    /**
     * Authorization
     */
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";

    public static final String CONTEXT_KEY_USER_ID = "currentUserId";
    public static final String CONTEXT_KEY_USERNAME = "currentUserName";
    public static final String CONTEXT_KEY_ID = "currentId";
}
