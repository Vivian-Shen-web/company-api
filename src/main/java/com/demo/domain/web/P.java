package com.demo.domain.web;

import com.demo.constant.StatusConstant;

import java.lang.reflect.Method;
import java.util.List;

/**
 * 返回分页结果封装类
 */
public class P<T extends List<?>> extends R<P.Page<T>> {
    private P(long pageNo, long pageSize, long total, long totalPages, T t) {
        super(StatusConstant.SuccessStatus.SUCCESS, new Page<>(pageNo, pageSize, total, totalPages, t));
    }

    @SuppressWarnings("unchecked")
    public static <T extends List<?>> P<T> page(Object page) {
        long pageNo = (long) getParam(page, "getCurrent");
        long pageSize = (long) getParam(page, "getSize");
        long total = (long) getParam(page, "getTotal");
        long totalPages = (long) getParam(page, "getPages");
        T t = (T) getParam(page, "getRecords");
        return new P<T>(pageNo, pageSize, total, totalPages, t);
    }

    public static <T extends List<?>> P<T> page(long pageNo, long pageSize, long total, long totalPages, T t) {
        return new P<T>(pageNo, pageSize, total, totalPages, t);
    }

    private static Object getParam(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            return method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("the input object requires [" + methodName + "] method", e);
        }
    }

    static class Page<T extends List<?>> {
        private final long page;
        private final long size;
        private final long totalElements;
        private final long totalPages;
        private final T content;

        private Page(long page, long size, long totalElements, long totalPages, T content) {
            this.page = page;
            this.size = size;
            this.totalElements = totalElements;
            this.totalPages = totalPages;
            this.content = content;
        }

        public long getPage() {
            return page;
        }

        public long getSize() {
            return size;
        }

        public long getTotalElements() {
            return totalElements;
        }

        public long getTotalPages() {
            return totalPages;
        }

        public T getContent() {
            return content;
        }
    }
}
