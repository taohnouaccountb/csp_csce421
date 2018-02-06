package csp.tool;

import csp.data.simpleVariable;

public class solverSimpleVarPair {
    private simpleVariable a=null;
    private simpleVariable b=null;
    public solverSimpleVarPair(){}
    public solverSimpleVarPair(simpleVariable a, simpleVariable b){
        this.a=a;
        this.b=b;
    }

    @Override
    public boolean equals(Object x){
        if(x instanceof  solverSimpleVarPair){
            solverSimpleVarPair xx=(solverSimpleVarPair) x;
            if(xx.getA()==a&&xx.getB()==b){
                return true;
            }
        }
        return false;
    }

    public simpleVariable getA() {
        return a;
    }

    public simpleVariable getB() {
        return b;
    }
}
