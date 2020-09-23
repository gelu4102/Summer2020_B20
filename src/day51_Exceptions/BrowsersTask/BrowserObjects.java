package day51_Exceptions.BrowsersTask;

public class BrowserObjects {
    public static void main(String[] args) {

      ChromeBrowser chrome = new ChromeBrowser();
      chrome.get("http://www.google.com/");
      chrome.close();

        System.out.println("==================================================");

        FireFoxBrowser fireFox = new FireFoxBrowser();
        fireFox.get("http://www.google.com/");
        fireFox.close();

        System.out.println("==================================================");

        OperaBrowser opera = new OperaBrowser();
        opera.get("http://www.google.com/");
        opera.close();





    }




}
