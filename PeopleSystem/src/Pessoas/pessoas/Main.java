package Pessoas.pessoas;

import Pessoas.Pessoas;
import Pessoas.Funcionario;
import Pessoas.Cliente;

public class Main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        Funcionario funcionario = new Funcionario(123, "Gerente", 2000D, "01 de Janeiro de 2014");
        Cliente cliente = new Cliente("456", "Administrador");
    }
}