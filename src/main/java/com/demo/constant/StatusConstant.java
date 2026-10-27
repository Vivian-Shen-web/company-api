package com.demo.constant;

/**
 * 系统状态常量
 */
public class StatusConstant {
    public interface Status {
        /**
         * Return the integer value of this status code.
         */
        int value();

        /**
         * Return the reason phrase of this status code.
         */
        String getMessage();
    }

    /**
     * 正常状态表
     */
    public enum SuccessStatus implements Status {
        /**
         * 正常状态
         */
        SUCCESS(200, "成功");

        private final int value;

        private final String message;

        SuccessStatus(int value, String message) {
            this.value = value;
            this.message = message;
        }

        /**
         * Return the integer value of this status code.
         */
        @Override
        public int value() {
            return this.value;
        }

        /**
         * Return the reason phrase of this status code.
         */
        @Override
        public String getMessage() {
            return this.message;
        }
    }

    /**
     * 系统异常表
     */
    public enum ErrorStatus implements Status {
        // ==================== 1. HTTP 标准异常（4xx）====================
        UNAUTHORIZED(401, "认证失败，请重新登录"),
        NO_OPERATION_PERMISSION(401, "您还没有此操作权限，请联系管理员处理。"),
        FORBIDDEN(403, "权限不足，无法访问"),
        NOT_FOUND(404, "资源不存在"),
        METHOD_NOT_ALLOWED(405, "请求方法不支持"),
        NOT_ACCEPTABLE(406, "不接受的请求类型"),
        UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型"),
        TOO_MANY_REQUESTS(429, "请求频繁，请稍后重试"),

        // ==================== 2. 通用系统异常（10000~10099）====================
        INTERNAL_SERVER_ERROR(10000, "系统异常，请稍后重试"),
        ILLEGAL_ARGUMENT(10001, "参数错误"),
        SERVICE_EXCEPTION(10002, "业务逻辑异常"),
        ILLEGAL_DATA(10003, "数据格式错误"),
        MULTIPART_TOO_LARGE(10004, "文件大小超出限制"),
        ILLEGAL_STATE(10005, "系统状态异常"),
        MISSING_ARGUMENT(10006, "缺少必填参数"),
        ILLEGAL_ACCESS(10007, "非法访问，未认证"),
        ILLEGAL_ARGUMENT_TYPE(10009, "参数类型不匹配"),
        DAO_EXCEPTION(10010, "数据操作异常"),
        NULL_POINTER(10011, "空指针异常"),
        INDEX_OUT_OF_BOUNDS(10012, "数组越界异常"),
        CLASS_CAST(10013, "类型转换异常"),
        IO_EXCEPTION(10014, "IO流异常"),
        TIME_OUT(10015, "请求超时"),
        ENCRYPT_ERROR(10016, "加密异常"),
        DECRYPT_ERROR(10017, "解密异常"),
        JSON_PARSE_ERROR(10018, "JSON解析失败"),
        SERIALIZE_ERROR(10019, "序列化异常"),

        // ==================== 3. 网关/中间件/第三方（20000~20099）====================
        GATEWAY_EXCEPTION(20000, "网关异常"),
        GATEWAY_TIMEOUT(20001, "网关超时"),
        FEIGN_ERROR(20002, "远程调用失败"),
        Dubbo_ERROR(20003, "RPC调用异常"),
        REDIS_ERROR(20004, "Redis操作异常"),
        MQ_PRODUCE_ERROR(20005, "消息发送失败"),
        MQ_CONSUME_ERROR(20006, "消息消费失败"),
        ES_ERROR(20007, "搜索引擎异常"),
        MINIO_ERROR(20008, "对象存储异常"),
        THIRD_PART_API_ERROR(20009, "第三方接口调用失败"),

        // ==================== 4. 用户/认证/权限（30000~30099）====================
        TOKEN_INVALID(30001, "Token无效"),
        TOKEN_EXPIRED(30002, "Token已过期"),
        TOKEN_NOT_FOUND(30003, "未携带Token"),
        LOGIN_FAIL(30004, "用户名或密码错误"),
        USER_DISABLED(30005, "账号已禁用"),
        USER_LOCKED(30006, "账号已锁定"),
        USER_NOT_EXIST(30007, "用户不存在"),
        USER_EXIST(30008, "用户已存在"),
        PASSWORD_ERROR(30009, "密码错误"),
        PASSWORD_EXPIRED(30010, "密码已过期"),
        MOBILE_CODE_ERROR(30011, "验证码错误"),
        MOBILE_CODE_EXPIRED(30012, "验证码已过期"),
        NO_ROLE(30013, "未分配角色"),
        NO_PERM(30014, "无此权限"),
        SINGLE_LOGIN(30015, "您已在其他设备登录"),
        LOGIN_EXPIRED(30016, "登录已过期"),

        // ==================== 5. 数据库/存储/数据层（40000~40099）====================
        DB_CONNECT_ERROR(40001, "数据库连接失败"),
        DB_TIMEOUT(40002, "数据库操作超时"),
        DATA_EXIST(40003, "数据已存在"),
        DATA_NOT_EXIST(40004, "数据不存在"),
        DATA_REPEAT(40005, "数据重复"),
        DATA_STATUS_ERROR(40006, "数据状态异常"),
        DATA_RELATED(40007, "数据被关联，无法删除"),
        TRANSACTION_ERROR(40008, "事务异常"),
        DUPLICATE_KEY(40009, "唯一键冲突"),
        SQL_ERROR(40010, "SQL语法异常"),
        IDEMPOTENT_TOKEN_INVALID(40011, "幂等Token无效"),

        // ==================== 6. 定时任务/异步/队列（50000~50099）====================
        TASK_EXECUTE_ERROR(50001, "定时任务执行失败"),
        TASK_LOCK_ERROR(50002, "任务抢占失败"),
        ASYNC_ERROR(50003, "异步任务异常"),
        THREAD_POOL_FULL(50004, "线程池已满"),
        SCHEDULE_ERROR(50005, "调度异常"),

        // ==================== 7. 文件/OSS/导入导出（60000~60099）====================
        FILE_NOT_FOUND(60001, "文件不存在"),
        FILE_UPLOAD_ERROR(60002, "文件上传失败"),
        FILE_DOWNLOAD_ERROR(60003, "文件下载失败"),
        FILE_EMPTY(60004, "文件内容为空"),
        FILE_FORMAT_ERROR(60005, "文件格式不支持"),
        FILE_READ_ERROR(60006, "文件读取失败"),
        FILE_WRITE_ERROR(60007, "文件写入失败"),
        EXPORT_ERROR(60008, "导出失败"),
        IMPORT_ERROR(60009, "导入失败"),
        IMAGE_ERROR(60010, "图片处理异常"),
        VIDEO_ERROR(60011, "视频处理异常"),
        FILE_TOO_LARGE(60012, "文件大小超出限制"),
        FILE_COUNT_EXCEEDED(60013, "上传文件数量超出限制"),
        FILE_TYPE_NOT_ALLOWED(60014, "不支持的文件类型"),

        // ==================== 8. 业务流程/订单/状态（70000~70099）====================
        ORDER_NOT_EXIST(70001, "订单不存在"),
        ORDER_STATUS_ERROR(70002, "订单状态异常"),
        ORDER_CANCEL_ERROR(70003, "订单取消失败"),
        PAY_ERROR(70004, "支付失败"),
        PAY_REFUND_ERROR(70005, "退款失败"),
        INVENTORY_NOT_ENOUGH(70006, "库存不足"),
        OPERATION_TOO_FAST(70007, "操作过于频繁"),
        FLOW_NOT_ALLOW(70008, "流程不允许"),
        SIGN_ERROR(70009, "签名验证失败"),

        // ==================== 9. 限流/降级/熔断/安全（90000~90099）====================
        RATE_LIMIT(90001, "接口限流"),
        DEGRADE(90002, "服务降级"),
        FUSE(90003, "服务熔断"),
        BLACK_LIST(90004, "已加入黑名单"),
        XSS_ATTACK(90005, "存在XSS攻击风险"),
        SQL_INJECT(90006, "存在SQL注入风险"),
        REPEAT_SUBMIT(90007, "请勿重复提交"),
        REQUEST_FREQUENTLY(90008, "请求过于频繁"),
        IP_LIMIT(90009, "IP访问受限");


        private final int value;

        private final String message;

        ErrorStatus(int value, String message) {
            this.value = value;
            this.message = message;
        }

        /**
         * Return the integer value of this status code.
         */
        @Override
        public int value() {
            return this.value;
        }

        /**
         * Return the reason phrase of this status code.
         */
        @Override
        public String getMessage() {
            return this.message;
        }
    }
}
