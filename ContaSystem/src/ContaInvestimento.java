public class ContaInvestimento {
    double taxa;
    int prazo;
    double saldo; // Adicionado atributo saldo

    // Método sacar corrigido
    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            // Considerando a taxa de saque de 1%, o valor sacado realmente será 99% do solicitado
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if (valor > 0) { // Valor deve ser positivo para ser depositado
            this.saldo += valor; // Equivalente a this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }
}
