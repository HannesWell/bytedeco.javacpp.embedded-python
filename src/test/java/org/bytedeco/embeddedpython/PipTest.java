package org.bytedeco.embeddedpython;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PipTest {
    @Test
    public void testInstall() throws IOException, InterruptedException {
        Pip.uninstall("pandas");
        Pip.install("pandas");
    }
}
