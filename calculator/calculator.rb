class Calculator
    def add(x, y)
      x + y
    end
    
    def subtract(x, y)
      x - y
    end
    
    def multiply(x, y)
      x * y
    end
    
    def divide(x, y)
      raise ArgumentError, "Cannot divide by zero" if y == 0
      x.to_f / y
    end
  end