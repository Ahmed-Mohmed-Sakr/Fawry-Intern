package org.tasks.week4.Structural_Design_Pattern.Task2;

public class main {
    public static void main(String[] args) {
        OriginalM original = new OriginalM();
        OriginalMAdaptor testAdaptor = new OriginalMAdaptor(original);
        
        testAdaptor.ClientDouble(5.7);
        testAdaptor.ClientInt(5);
        testAdaptor.ClientChar('s');
    }
}
