// Singleton with static factory
// Additional Notes :
// The lack of a public or protected constructor guarantees only one Elvis
// instance will exists once the Elvis class is initialized , with one caveat :
// a privileged client can invoke the private constructor reflectively(Item50) with
// the aid of the AccessibleObject.setAccessible method. If you need to defend against
// this attack, modify the constructor to make it throw an exception if it is asked
// to create a second instance.
package org.effectivejava.examples.chapter02.item03.method;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here !");
    }

    // This code would normally appear outside the class !
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
