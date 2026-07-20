package tw.nekomimi.nekogram;

import org.telegram.messenger.BuildConfig;

import tw.nekomimi.nekogram.helpers.UserHelper;

public class Extra {

    // Вписываем напрямую — без BuildConfig
    public static int APP_ID = 38093981;
    public static String APP_HASH = "47ca2f2e0c2b21dce00bbab46e9d2bd5";
    public static String SENDER_ID = "921793833622";

    public static String SENTRY_DSN = BuildConfig.SENTRY_DSN;

    public static boolean FORCE_ANALYTICS = "play".equals(BuildConfig.BUILD_TYPE);

    private static final UserHelper.BotInfo HELPER_BOT = new UserHelper.BotInfo() {
        @Override
        public long getId() {
            return BuildConfig.HELPER_BOT_ID;
        }

        @Override
        public String getUsername() {
            return BuildConfig.HELPER_BOT_USERNAME;
        }
    };

    public static UserHelper.BotInfo getHelperBot() {
        if (BuildConfig.HELPER_BOT_USERNAME == null) {
            return null;
        }
        return HELPER_BOT;
    }

    public static boolean isDirectApp() {
        return "release".equals(BuildConfig.BUILD_TYPE) || "debug".equals(BuildConfig.BUILD_TYPE);
    }

    public static boolean isTrustedBot(long id) {
        return id == BuildConfig.HELPER_BOT_ID;
    }
}
