package tech.joelmwala.jmath.statistics;

public class Measures {
    // NOTE - find measures of position

    // percentile
    public double percentile(double position) {
        return 0.0;
    }

    // quartile
    public double quartile(int position) {
        return percentile(position * 25.0);
    }

    // decile
    public double decile(int position) {
        return percentile(position * 10.0);
    }

    // IQR - inter quartile range
    public double iqr(double[] data) {
        return 0.0;
    }

    // outliers
    public double[] outliers(double[] data) {
        return new double[0];
    }
    // percentile rank
}
