package org.jilt.test.data.getters;

import org.jilt.Builder;
import org.jilt.BuilderStyle;

@Builder(style = BuilderStyle.STAGED, generateGetters = true)
public class StagedGettersValue {
    public final int value;

    public StagedGettersValue(int value) {
        this.value = value;
    }
}
