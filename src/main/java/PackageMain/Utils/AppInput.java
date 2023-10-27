package PackageMain.Utils;

import static PackageMain.Utils.Utils.print;

public class AppInput {
    //    public static void main(String[] args) {
//        String s=StringInput("helloo");
//
//    }
    public static String StringInput(String msg) {
        print(msg);
        return AppScanner.getScanner().next();
    }

    public static int IntInput(String msg) throws Exception {
        print(msg);
        int input;
        try {
            input = Integer.parseInt(AppScanner.getScanner().nextLine());
        } catch (Exception e) {
            throw new AppException(StringUtils.INVALID_CHOICE);
        }
        return input;
    }
}


