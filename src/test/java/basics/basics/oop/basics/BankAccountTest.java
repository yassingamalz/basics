package basics.basics.oop.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount(1000);
    }

    @Test
    void getBalance() {
        assertEquals(1000, bankAccount.getBalance());
        BankAccount emptyBankAccount = new BankAccount();
        assertEquals(0, emptyBankAccount.getBalance());
    }

    @Test
    void deposit() {
        bankAccount.deposit(1000);
        assertEquals(2000, bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        bankAccount.withdraw(1000);
        assertEquals(0, bankAccount.getBalance());
    }
}
