package csp.tool.bt;

import csp.data.simpleVariable;
import csp.tool.relatedJudge;

import java.util.ArrayList;
import java.util.List;

abstract public class variableChooser {
    public enum heuristicType {LX, LD, DEG, UU, DD, MWO, dLD, dDEG, dDD}
    protected List<simpleVariable> refOrg = null;
    protected relatedJudge isRelated = null;
    protected heuristicType mode;
    public List<simpleVariable> li = null;

    public variableChooser(List<simpleVariable> refOrg, heuristicType mode, relatedJudge isRelated) {
        this.refOrg = refOrg;
        this.isRelated = isRelated;
        this.mode = mode;
    }

    // Rearrange the list according to the input sequence
    public List<Integer> transSequence(int[] v) {
        List<Integer> ret = new ArrayList<>();
        for (simpleVariable i : refOrg) {
            ret.add(v[li.indexOf(i)]);
        }
        return ret;
    }

    public simpleVariable get(int i) {
        if(i>li.size()) throw new java.lang.UnknownError("WRONG INDEX");
        return li.get(i);
    }

    public int getCurSize() {
        return li.size()-1;
    }
    public int getSize() {return refOrg.size(); }

    public abstract void next();
    public abstract void back();
    public abstract List<simpleVariable> getUnusedVariables(int pos);
}
