package com.rd.Lesson14.annotations;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private List versions;

    @SuppressWarnings({"unchecked"})
    public void addVersion(String version) {
        versions.add(version);
    }
}