package day62_Maps;

public class Test {

    public static void main(String[] args) {
        //String favoriteColor = "pink";
        Color favoriteColor = Color.Red;

        System.out.println(favoriteColor);

        //String browserName =  String you can assign enum didn't have it

        //Browser browserName = Browser.opera;
        Browser browserName = Browser.chrome;

        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");
                break;

            case safari:
                System.out.println("Safari browser is set");
                break;

            case edge:
                System.out.println("Edge browser is set");
                break;


        }

        System.out.println("=====================================================");

        Days day = Days.Monday;
        Days day2 = Days.Tuesday;
        Days day3 = Days.Thursday;

        Months month1 = Months.Jan;

        Level level1 = Level.Low;
        Level level2 = Level.Medium;
        Level level3 = Level.High;
        Level level4 = Level.ChuckNorries;

    }
}
