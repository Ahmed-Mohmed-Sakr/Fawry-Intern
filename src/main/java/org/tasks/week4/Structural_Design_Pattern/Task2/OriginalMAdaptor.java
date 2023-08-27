package org.tasks.week4.Structural_Design_Pattern.Task2;

public class OriginalMAdaptor implements OriginalClient{
    private OriginalM original;

    public OriginalMAdaptor(OriginalM original) {
        this.original = original;
    }
    @Override
    public void ClientDouble(Double aDouble) {
        original.OriginalDouble(aDouble);
    }
    @Override
    public void ClientInt(int i) {
        original.OriginalInt(i * 2);
    }
    @Override
    public void ClientChar(char c) {
        for (int i = 0; i < 5; i++)
            original.OriginalChar(c);
    }

}
