package org.jilt.test;

import org.jilt.test.data.getters.GettersValue;
import org.jilt.test.data.getters.GettersValueBuilder;
import org.jilt.test.data.getters.StagedGettersValue;
import org.jilt.test.data.getters.StagedGettersValueBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GettersTest {
    @Test
    public void classic_builder_with_getters() {
        GettersValueBuilder builder = GettersValueBuilder.gettersValue()
                .intField(12)
                .booleanField(true)
                .names(new ArrayList<String>());

        assertThat(builder.getIntField()).isEqualTo(12);
        assertThat(builder.isBooleanField()).isTrue();
        assertThat(builder.getNames()).isNotNull().isEmpty();

        builder.getNames().add("test");

        GettersValue value = builder.build();

        assertThat(value.names).containsExactly("test");
    }

    @Test
    public void staged_builder_ignores_generate_getters() {
        // This test primarily verifies that the StagedGettersValueBuilder compiles,
        // which it wouldn't if it had getter methods that don't return the next stage.
        StagedGettersValue value = StagedGettersValueBuilder.stagedGettersValue()
                .value(1)
                .build();

        assertThat(value.value).isEqualTo(1);
    }
}
