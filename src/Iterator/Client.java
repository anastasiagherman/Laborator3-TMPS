package Iterator;

public class Client {
    public static void main(String[] args) {
        TechnicalSettings techSettings = new TechnicalSettings();
        System.out.println("Technical Settings:");
        for(Iterator iter = techSettings.getIterator(); iter.hasNext();){
            String setting = (String)iter.next();
            System.out.println( setting);
        }

    }
}
