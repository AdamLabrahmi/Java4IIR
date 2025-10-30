package JavaAvance4IIR;

import java.util.TreeMap;
import java.util.Map;

class CodeProjet implements Comparable<CodeProjet> {
    private String code;

    public CodeProjet(String code) {
        this.code = code;
    }

    @Override
    public int compareTo(CodeProjet cp) {
        return this.code.compareTo(cp.code);
    }

    @Override
    public String toString() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeProjet cp = (CodeProjet) o;
        return code.equals(cp.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

