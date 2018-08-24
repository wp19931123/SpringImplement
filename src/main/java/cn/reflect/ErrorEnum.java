package cn.reflect;

import java.util.ArrayList;
import java.util.List;

@EnumTag(name = "errorEnum")
public enum ErrorEnum {

    JAVA_TIME_OUT(1000),

    ZOOKEEPER_TIME_OUT(2000);

    private final int errorCode;

    private final String errMessage;

    /**
     * 枚举类构造函数,初识化
     *
     * @param errorCode errorCode
     */
    private ErrorEnum(int errorCode) {
        this.errorCode = errorCode;
        this.errMessage = "System Error";
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public static List<Integer> getErrorCodes() {
        List<Integer> errorCodeList = new ArrayList<Integer>();
        for (final ErrorEnum em : ErrorEnum.values()) {
            int code = em.getErrorCode();
            errorCodeList.add(code);
        }
        return errorCodeList;
    }

}
