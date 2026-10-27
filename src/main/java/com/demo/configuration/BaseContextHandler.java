package com.demo.configuration;

import com.demo.constant.CommonConstants;

import java.util.HashMap;
import java.util.Map;

public class BaseContextHandler {
    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    public static void set(String key, String value) {
        Map<String, Object> map = getContextMap();
        map.put(key, value);
    }

    public static void set(String key, Object value) {
        Map<String, Object> map = getContextMap();
        map.put(key, value);
    }

    public static String get(String key) {
        Map<String, Object> map = getContextMap();
        Object val = map.get(key);
        return val == null ? null : val.toString();
    }

    @SuppressWarnings("unchecked")
    public static <T> T getObject(String key) {
        Map<String, Object> map = getContextMap();
        return (T) map.get(key);
    }

    private static Map<String, Object> getContextMap() {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        return map;
    }

    public static String getAuthorization() {
        return get(CommonConstants.AUTHORIZATION);
    }

    public static void setAuthorization(String userId) {
        set(CommonConstants.AUTHORIZATION, userId);
    }

    public static String getUserId() {
        return get(CommonConstants.CONTEXT_KEY_USER_ID);
    }

    public static void setUserId(String userId) {
        set(CommonConstants.CONTEXT_KEY_USER_ID, userId);
    }

    public static String getId() {
        return get(CommonConstants.CONTEXT_KEY_ID);
    }

    public static void setId(String id) {
        set(CommonConstants.CONTEXT_KEY_ID, id);
    }

    public static String getUsername() {
        return get(CommonConstants.CONTEXT_KEY_USERNAME);
    }

    public static void setUsername(String username) {
        set(CommonConstants.CONTEXT_KEY_USERNAME, username);
    }

    public static void remove() {
        threadLocal.remove();
    }
}
