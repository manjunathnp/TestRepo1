public class GetInfo
{
    public static void main(String[] args) {
        System.out.println("Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("JRE Version: "+System.getProperty("java.runtime.version"));

    }
}
