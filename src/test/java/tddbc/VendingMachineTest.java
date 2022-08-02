package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    @DisplayName("test instance")
    public void _test_instance() throws Exception {
        // Setup
        VendingMachine vm = new VendingMachine();
        // Verify
        assertEquals(true, vm instanceof VendingMachine);
        assertEquals(0, vm.total);
    }

    @Test
    @DisplayName("test input")
    public void _test_input() throws Exception {
        // Setup
        VendingMachine vm = new VendingMachine();
        vm.input(10);
        // Verify
        assertEquals(10, vm.total);
    }

    @Test
    @DisplayName("test refund")
    public void _test_refund() throws Exception {
        // Setup
        VendingMachine vm = new VendingMachine();

        vm.input(10);
        vm.input(50);
        vm.input(100);
        vm.input(500);
        // Verify
        assertEquals(660, vm.refund());
        assertEquals(0, vm.total);
    }

    @Test
    @DisplayName("test input exception")
    public void _test_input_exception() throws Exception {
        // Setup
        VendingMachine vm = new VendingMachine();

        Exception ex = assertThrows(NumberFormatException.class, () -> {
            vm.input(0);
        });
        assertTrue(ex.getMessage().contains("coin should be 10,50,100,500 or 1000"));

    }

}
