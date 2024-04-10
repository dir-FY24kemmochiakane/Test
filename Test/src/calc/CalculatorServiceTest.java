package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class CalculatorServiceTest {
    
    private Calculator calculator;
    private CalculatorService service;
    
    @BeforeEach
    public void setUp() {
        //テスト前にCalculatorとCalculatorServiceをセットアップ
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }

    @Test
    void testCalculatorService() {
        //CalculatorのAddメソッドとCalculatorServiceのaddAndReportメソッドが正しく連携するかテスト
        assertEquals("Result: 5", service.addAndReport(2, 3));
        
    }

    @Test
    public void testAddAndReport() {
        public void testSubtractAndReport() {
            // CalculatorのsubtractメソッドとCalculatorServiceのsubtractAndReportメソッドが正しく連携するかテスト
            assertEquals("Result: 1", service.subtractAndReport(3, 2));
        }
       
 
    }
}
