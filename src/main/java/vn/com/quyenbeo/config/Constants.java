package vn.com.quyenbeo.config;

import java.util.Arrays;
import java.util.List;

/**
 * Application constants.
 */
public final class Constants {

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";
    public static final String DEFAULT_LANGUAGE = "en";

    public static final int NEW_ORDER = 0;
    public static final int DA_DAT_HANG = 1;
    public static final int DA_NHAN_HANG = 2;
    public static final int DA_GUI_KHACH = 3;

    public static List<Integer> ORDER_STATUS = Arrays.asList(NEW_ORDER, DA_DAT_HANG, DA_NHAN_HANG, DA_GUI_KHACH);

    private Constants() {
    }
}
