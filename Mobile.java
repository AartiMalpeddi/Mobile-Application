// import javax.xml.catalog.CatalogFeatures.Feature;

public class Mobile 
{
   public static void main(String args[])
   {
    simCard s=new Airtel();
    System.out.println("----------This is Airtel Network----------");
    s.calls();
    s.sms();
    ((Airtel)s).data();

    System.out.println("----------This is JIO Network----------");
    s=new JIO();
    s.calls();
    s.sms();
    ((JIO)s).data();
    ((JIO)s).feature();

    System.out.println("----------This is VodaPhone Network----------");
    s=new vodaPhone();
    s.calls();
    s.sms();
    ((vodaPhone)s).data();

   } 
    
}
