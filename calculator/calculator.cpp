class Calculator {
public:
    double add(double x, double y) {
        return x + y;
    }
    
    double subtract(double x, double y) {
        return x - y;
    }
    
    double multiply(double x, double y) {
        return x * y;
    }
    
    double divide(double x, double y) {
        if (y == 0) {
            throw std::invalid_argument("Cannot divide by zero");
        }
        return x / y;
    }
};

int main() {
    Calculator calc;
    double result = calc.divide(15, 3);
    std::cout << result << std::endl;  // Output: 5.0
    return 0;
}