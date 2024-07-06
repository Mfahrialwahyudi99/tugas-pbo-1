import java.util.HashMap;
import java.util.Map;

public class calculation {
    private char operation;
    private double operand1;
    private double operand2;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public calculation(double operand1, double operand2, char operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;

        operationMap.put('+', (Operation) new Addition());
        operationMap.put('-', (Operation) new Pengurangan());
        operationMap.put('*', (Operation) new Perkalian());
        operationMap.put('/', (Operation) new Pembagian());
    }

    public double makecalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
            System.out.println(operationMap.get(operation));
        } else {
            System.out.println("Invalid sign");
        }
        return operationMapValue.calculateResult(operand1, operand2);
    }
}
