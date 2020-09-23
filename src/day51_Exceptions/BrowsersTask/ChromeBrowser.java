package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends WebDriver {
  /*
  get(url) ,close()
   */
     @Override
    public void get(String url){
        System.out.println("Opening the  "+url+" in default browser");


    }

    public void close(){
        System.out.println("Closing the default browser");
    }



}
