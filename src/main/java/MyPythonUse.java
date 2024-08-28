import java.io.IOException;
import java.util.StringJoiner;

import org.bytedeco.embeddedpython.Pip;
import org.bytedeco.embeddedpython.Python;

public class MyPythonUse {

    public static void main(String[] args) throws IOException, InterruptedException {

        Pip.install("matplotlib", "numpy"); // "numpy"

        StringJoiner lines = new StringJoiner("\n");
        lines.add("import matplotlib.pyplot as plt");
        lines.add("import numpy as np");
        lines.add("x = np.linspace(0, 2 * np.pi, 200)");
        lines.add("y = np.sin(x)");
        lines.add("fig, ax = plt.subplots()");
        lines.add("ax.plot(x, y)");
        lines.add("fig.savefig('plot.png')");

        Python.eval(lines.toString());

    }

}
