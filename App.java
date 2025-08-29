public class App{
  
  public class WebServiceDataProvider implements UserDataProvider{
    
  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext();
    MyBean myBean = context.getBean("");
    
  }
}
