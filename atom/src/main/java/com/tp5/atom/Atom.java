package com.tp5.atom;

import jakarta.persistence.*;

@Entity
public class Atom {

    public Integer getAtomicnumber() {
        return atomicnumber;
    }

    public void setAtomicnumber(Integer atomicnumber) {
        this.atomicnumber = atomicnumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    private Integer atomicnumber;

    @Id
    private String symbol;

    private String fullname;

    protected Atom() {

    }

}
