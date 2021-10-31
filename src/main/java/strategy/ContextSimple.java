package strategy;

public class ContextSimple {
    private Classifier classifierStrategy;

    public ContextSimple(Classifier classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }

    public void run() {
        classifierStrategy.classify();
    }

    public void setClassifierStrategy(Classifier classifierStrategy) {
        this.classifierStrategy = classifierStrategy;
    }
}
