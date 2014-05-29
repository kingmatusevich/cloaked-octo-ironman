/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merca1;

/**
 *
 * @author javiermatusevich
 */
public class CalculadoraController {
    private final Calculadora operations = new Calculadora();
    private double firstOperand = 0;
    private double secondOperand = 0;
    private boolean ready = false;
   
    public void addOperand(double operand)
    {
        if (!this.ready)
        {
            this.firstOperand = operand;
            this.ready = !this.ready;
        } else 
        {
            this.secondOperand = operand;
        }
    }
    private void transferResults(double result)
    {
        this.firstOperand = result;
        this.ready = true; 
    }
    public double add()
    {
        double result = this.operations.add(firstOperand, secondOperand);
        this.transferResults(result);
        return result;
    }
    
    public double substract()
    {
        double result = this.operations.substract(firstOperand, secondOperand);
        this.transferResults(result);
        return result;
    }
    
    public double multiply()
    {
        double result = this.operations.multiply(firstOperand, secondOperand);
        this.transferResults(result);
        return result;
    }
    
    public double division()
    {
        double result = this.operations.division(firstOperand, secondOperand);
        this.transferResults(result);
        return result;
    }
    
    public void clear()
    {
        this.firstOperand = 0;
        this.secondOperand = 0;
        this.ready = false;
    }
    
    
    
    
    
}
