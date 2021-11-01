package strategy_double;

public class Context {
    private Classifier classifierStrategy;
    private Distance distanceStrategy;

    public Context(Classifier classifierStrategy, Distance distanceStrategy) {
        this.classifierStrategy = classifierStrategy;
        this.distanceStrategy = distanceStrategy;
    }

    public void run() {
        distanceStrategy.calculate();
        classifierStrategy.classify();
    }

    public void setClassifierStrategy(Classifier classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void setDistanceStrategy(Distance distanceStrategy) {
        this.distanceStrategy = distanceStrategy;
    }
}
