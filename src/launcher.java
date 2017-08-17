import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DSimple;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;

/**
 * Created by DevWork on 8/16/17.
 */
public class launcher {

    public static void main(String[] args) {
        Chart2D chart = new Chart2D();
        ITrace2D trace = new Trace2DSimple();
        chart.addTrace(trace);
        Random random = new Random();
        // number of points to create
        for (int i = 100; i >= 0; i--) {
            trace.addPoint(i, random.nextDouble() * 10.0 + i);
        }

        JFrame frame = new JFrame("MinimalStaticChart");
        frame.getContentPane().add(chart);
        frame.setSize(400, 300);
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        frame.setVisible(true);
    }
}
