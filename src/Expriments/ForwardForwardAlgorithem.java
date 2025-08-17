package Expriments;

//public class ForwardForwardAlgorithem {
//}

import java.util.Random;

public class ForwardForwardAlgorithem {
    static class Layer {
        int inputSize, outputSize;
        double[][] weights;
        Random rand = new Random();

        public Layer(int inputSize, int outputSize) {
            this.inputSize = inputSize;
            this.outputSize = outputSize;
            weights = new double[outputSize][inputSize];
            // Random init
            for (int i = 0; i < outputSize; i++) {
                for (int j = 0; j < inputSize; j++) {
                    weights[i][j] = rand.nextGaussian() * 0.01;
                }
            }
        }

        // Forward pass with ReLU
        public double[] forward(double[] input) {
            double[] output = new double[outputSize];
            for (int i = 0; i < outputSize; i++) {
                double sum = 0.0;
                for (int j = 0; j < inputSize; j++) {
                    sum += weights[i][j] * input[j];
                }
                output[i] = Math.max(0, sum); // ReLU
            }
            return output;
        }

        // Compute "goodness" = sum of squares of activations
        public double goodness(double[] hidden) {
            double g = 0.0;
            for (double h : hidden) {
                g += h * h;
            }
            return g / hidden.length;
        }

        // Training rule for Forward-Forward
        public void train(double[] input, boolean positive, double lr) {
            double[] hidden = forward(input);
            double g = goodness(hidden);
            double target = positive ? 1.0 : 0.0; // want high for positive, low for negative

            // Update weights (local learning)
            for (int i = 0; i < outputSize; i++) {
                for (int j = 0; j < inputSize; j++) {
                    double grad = (target - g) * hidden[i] * input[j];
                    weights[i][j] += lr * grad;
                }
            }
        }
    }

    public static void main(String[] args) {
        int inputSize = 10;
        int hiddenSize = 6;

        Layer layer = new Layer(inputSize, hiddenSize);

        Random rand = new Random();

        // Train with dummy data
        for (int epoch = 0; epoch < 1000; epoch++) {
            // Positive sample (real data)
            double[] pos = new double[inputSize];
            for (int i = 0; i < inputSize; i++) {
                pos[i] = rand.nextDouble(); // example real data
            }
            layer.train(pos, true, 0.01);

            // Negative sample (fake/noise)
            double[] neg = new double[inputSize];
            for (int i = 0; i < inputSize; i++) {
                neg[i] = rand.nextGaussian(); // noise
            }
            layer.train(neg, false, 0.01);
        }

        // Test with a real sample
        double[] test = new double[inputSize];
        for (int i = 0; i < inputSize; i++) test[i] = rand.nextDouble();

        double goodness = layer.goodness(layer.forward(test));
        System.out.println("Goodness of test sample: " + goodness);
    }
}
