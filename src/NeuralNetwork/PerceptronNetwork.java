package NeuralNetwork;

public class PerceptronNetwork {
    private final int BIAS = 0;
    private final int WEIGHTS = 1;
    private int numLevers;
    private int[] sizes;

    public PerceptronNetwork(int... sizes) {
        this.sizes = sizes;
        this.numLevers = sizes.length;
    }

    public static void main(String[] args) {
        PerceptronNetwork net = new PerceptronNetwork(2, 3, 2);
        int[] inputs = {1, 1};
        int[] outputs = net.feedForward(inputs);

        for (int i = 0; i < outputs.length; i++) {
            System.out.println(outputs[i]);
        }
    }

    private int[] feedForward(int[] inputs) {
        int[] outputs = null;
        for (int i = 1; i < numLevers; i++) {
            int size = sizes[i];
            int[] z = new int[size];
            outputs = new int[size];
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < inputs.length; k++) {
                    z[j] += WEIGHTS * inputs[k];
                }
                z[j] += BIAS;
                outputs[j] = z[j] > 0 ? 1 : 0;
            }
            inputs = outputs;
        }
        return outputs;
    }
}
