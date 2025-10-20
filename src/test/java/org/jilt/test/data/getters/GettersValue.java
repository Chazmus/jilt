package org.jilt.test.data.getters;

import org.jilt.Builder;
import org.jilt.BuilderStyle;

import java.util.List;

public class GettersValue {
    public final int intField;
    public final boolean booleanField;
    public final List<String> names;

    @Builder(generateGetters = true)
    public GettersValue(int intField, boolean booleanField, List<String> names) {
        this.intField = intField;
        this.booleanField = booleanField;
        this.names = names;
    }
}
