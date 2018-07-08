package com.hhp.memento;

/**
 * Created by Hu on 2017/10/29.
 */
public class Boy implements Cloneable{

    private String state = "";
   // private Boy backup;

    public void changeState() {
        this.state = "心情可能不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

    @Override
    protected Boy clone() throws CloneNotSupportedException {
        return (Boy)super.clone();
    }
}
