package utilities;

import day40_FinalKeword.ProtectedAccesModifier;

public class AccessModifierTest4 extends ProtectedAccesModifier {
    public static void main(String[] args) {

       // System.out.println(AccessModifierTest4.name1);//default is not visible outside the package
        System.out.println(AccessModifierTest4.name2);//protected is visible outside the package if is a subclass
        AccessModifierTest4.method2();
      //  AccessModifierTest4.method1();//default method wecant not see in another class
    }
}
