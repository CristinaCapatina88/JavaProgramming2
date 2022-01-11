package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("12","MaxPro",700,"black");
        Samsung samsung = new Samsung("Samsung","Galaxy","small",25645,"white");
        Nokia nokia = new Nokia("NokiaTEn","10z","medium",236,"gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(2658);
        iphone.faceTime(45887);

        samsung.freeze();
        samsung.call(5666);
        samsung.text(56656);

        nokia.selfDefense();
        nokia.call(5656);
        nokia.text(565);

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }
}
