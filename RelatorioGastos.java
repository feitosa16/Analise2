public class RelatorioGastos {
    private double totalSalario = 0.0;
    private double totalBonus = 0.0;

    // Método universal para adicionar salário e bônus
    public void adiciona(Funcionario funcionario) {
        this.totalSalario += funcionario.getSalario();
        this.totalBonus += funcionario.getBonusAnual();
    }

    public double getTotalSalario() {
        return totalSalario;
    }

    public double getTotalBonus() {
        return totalBonus;
    }

    // Utilizados na fase anterior 2.1
    //public void adicionaSalario(double salario) {
    //    totalSalario += salario;
    //}

    //public void adicionaBonus(double bonus) {
    //    totalBonus += bonus;
    //}

    // Os métodos getTotalSalario() e getTotalBonus() já existem acima.
    // Remova as definições duplicadas para evitar o erro.
}
