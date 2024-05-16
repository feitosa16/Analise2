import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        //Funcionario Plinio = new Funcionario("Plinio", "123456789", "04/05/1972", 1, 5000.00);
        //Funcionario Angelis = new Funcionario.PessoaProgramadora("Angelis", 5500.00, 1234);
        Funcionario.CientistaDados Ieda = new Funcionario.CientistaDados("Ieda", 6000.00, 4560);
        Funcionario.GerenteTI Livia = new Funcionario.GerenteTI("Livia", "789456123", "04/05/2000", 2, 10000, 3, "1236-4");
        Funcionario.DevFrontEnd Camolesi= new Funcionario.DevFrontEnd("Camolesi",4500.00, 321);
        Funcionario assistenteRH = new Funcionario.AssistenteRH("Ceolmar", "098765432", "04/05/1968", 1, 2500.00, 789, "RHsenha");
        //Adicionando o objeto Funcionario à lista de funcionarios
        //funcionarios.add(Plinio);
        //funcionarios.add(Angelis);
        funcionarios.add(Ieda);
        funcionarios.add(Livia);
        funcionarios.add(Camolesi);
        funcionarios.add(assistenteRH);




        RelatorioGastos relatorio = new RelatorioGastos();
        //Calculo de gastos
        //  relatorio.adiciona(Plinio);
        //relatorio.adiciona(Angelis);
        relatorio.adiciona(Ieda);
        relatorio.adiciona(Livia);
        relatorio.adiciona(Camolesi);
        relatorio.adiciona(assistenteRH);


        for (Funcionario funcionario : funcionarios) {
            String tipoFuncionario = "Funcionario"; // Inicialização padrão

          /*if (funcionario instanceof Funcionario.PessoaProgramadora) {
                tipoFuncionario = "Pessoa Programadora";
            }*/ if (funcionario instanceof Funcionario.CientistaDados) {
                tipoFuncionario = "Cientista de Dados";
            } else if (funcionario instanceof Funcionario.GerenteTI) {
                tipoFuncionario = "Gerente de TI";
            }
          /*  System.out.println("Bem Vinde!\nTipo: " + tipoFuncionario);
            System.out.println("Nome: " + funcionario.getNome()+"\n");*/
            funcionario.saudacao();
        }


        //Impressao de total de gastos em salario e bonus anual
        System.out.print("\nTotal Gasto em Salario e Bonus Anual " + "\n");
        System.out.println("Total de Salários: " + relatorio.getTotalSalario());
        System.out.println("Total de Bônus: " + relatorio.getTotalBonus());



        /* Atributos do funcionario */
        /*Plinio.setNome("Plinio");
        Plinio.setCpf("123456789");
        Plinio.setDataNascimento("04/05/1972");
        Plinio.setNumDependentes(1);
        Plinio.setSalario(5000.00);
        Plinio.setSenha("Psenha.123");*/
        /* Impressao dos atributos Classe Funcionário
        System.out.print("Nome: " + Plinio.getNome() + "\n");
        System.out.print("CPF: " + Plinio.getCpf() + "\n");
        System.out.print("Data de Nascimento: " + Plinio.getDataNascimento() + "\n");
        System.out.print("Número de Dependentes: " + Plinio.getNumDependentes() + "\n");
        System.out.print("Salário: " + Plinio.getSalario() + "\n");
        System.out.print("Bonus Anual: " + Plinio.getBonusAnual() + "\n");
        //System.out.print("Senha: " + Plinio.getSenha() + "\n");*/
        /* Atributos da pessoa programadora
        //Angelis.setNome("Angelis");
        Angelis.setCpf("456789123");
        Angelis.setDataNascimento("04/05/1952");
        Angelis.setNumDependentes(2);
        //Angelis.setSalario(5500.00);
        //Angelis.setCrp(1234);
        // Angelis.setSenha("Asenha.123");
        if (Angelis.Autentica("sjsjs")) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Acesso negado");
        }*/
      /* Impressao dos atributos Classe Pessoa programadora
        System.out.print("\nNome: " + Angelis.getNome() + "\n");
        System.out.print("CPF: " + Angelis.getCpf() + "\n");
        System.out.print("Data de Nascimento: " + Angelis.getDataNascimento() + "\n");
        System.out.print("Número de Dependentes: " + Angelis.getNumDependentes() + "\n");
        System.out.print("Salário: " + Angelis.getSalario() + "\n");
        System.out.print("CRP: " + ((Funcionario.PessoaProgramadora) Angelis).getCrp() + "\n");
        System.out.print("Bonus Anual: " + Angelis.getBonusAnual() + "\n");*/
        //System.out.print("Senha: " + Angelis.getSenha() + "\n");
        /* Atributos da Pessoa Cientista de Dados*/
        //Ieda.setNome("Ieda");
        Ieda.setCpf("894561237");
        Ieda.setDataNascimento("04/05/1998");
        Ieda.setNumDependentes(0);
        //Ieda.setSalario(6000.00);
        //Ieda.setCrcd(4560);
        //Ieda.setSenha("Isenha.123");
        if (Ieda.Autentica("sjsjs")) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Acesso negado");
        }
        /* Impressao dos atributos Classe Cientista de Dados*/
        System.out.print("\nNome: " + Ieda.getNome() + "\n");
        System.out.print("CPF: " + Ieda.getCpf() + "\n");
        System.out.print("Data de Nascimento: " + Ieda.getDataNascimento() + "\n");
        System.out.print("Número de Dependentes: " + Ieda.getNumDependentes() + "\n");
        System.out.print("Salário: " + Ieda.getSalario() + "\n");
        System.out.print("CRCD: " + Ieda.getCrcd() + "\n");
        System.out.print("Bonus Anual: " + Ieda.getBonusAnual() + "\n");
        // System.out.print("Senha: " + Ieda.getSenha() + "\n");
        /* Atributos da pessoa Gerente de T.I*/
        /*Livia.setNome("Livia");
        Livia.setCpf("789456123");
        Livia.setDataNascimento("04/05/2000");
        Livia.setNumDependentes(2);
        Livia.setSalario(10000.00);
        Livia.setRamal("1236-4");
        Livia.setNumFuncionarios(3);*/
        Livia.setSenha("Lsenha.123");

        /*Impressão dos dados da classe Gerente de T.I*/
        System.out.print("\nNome: " + Livia.getNome() + "\n");
        System.out.print("CPF: " + Livia.getCpf() + "\n");
        System.out.print("Data de Nascimento: " + Livia.getDataNascimento() + "\n");
        System.out.print("Número de Dependentes: " + Livia.getNumDependentes() + "\n");
        System.out.print("Salário: " + Livia.getSalario() + "\n");
        System.out.print("Ramal: " + Livia.getRamal() + "\n");
        System.out.print("Número de Funcionários: " + Livia.getNumeroFunciosarios() + "\n");
        System.out.print("Senha: " + Livia.getSenha() + "\n");
        System.out.print("Bonus Anual: " + Livia.getBonusAnual() + "\n");
        if (Livia.Autentica("789456123", "Lsenha.123")) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Acesso negado");
        }

        Camolesi.setCpf("567098331");
        Camolesi.setDataNascimento("04/05/1986");
        Camolesi.setNumDependentes(2);
        System.out.print("\nNome: " + Camolesi.getNome() + "\n");
        System.out.print("CPF: " + Camolesi.getCpf() + "\n");
        System.out.print("Data de Nascimento: " + Camolesi.getDataNascimento() + "\n");
        System.out.print("Número de Dependentes: " + Camolesi.getNumDependentes() + "\n");
        System.out.print("Salário: " + Camolesi.getSalario() + "\n");
        System.out.print("Bonus Anual: " + Camolesi.getBonusAnual() + "\n");
        if (Ieda.Autentica("sjsjs")) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Acesso negado");
        }


        assistenteRH.setCpf("098765432");
        assistenteRH.setDataNascimento("04/05/1968");
        assistenteRH.setNumDependentes(2);
        assistenteRH.setSalario(2500.00);
        System.out.print("\nNome: " + assistenteRH.getNome() + "\n");
        System.out.print("CPF: " + assistenteRH.getCpf() + "\n");
        System.out.print("Data Nascimento: " + assistenteRH.getDataNascimento() + "\n");
        System.out.print("Numero de Dependentes: "+assistenteRH.getSalario() + "\n");

        Funcionario.Autenticavel autenticavelLivia = (Funcionario.Autenticavel) Livia;
        Funcionario.Autenticavel autenticavelRH = (Funcionario.Autenticavel) assistenteRH;

        System.out.println("\nAutenticacao de gerente e assistente");
        System.out.println("Autenticação do Gerente de TI (Livia): " + autenticavelLivia.autentica("Lsenha.123"));
        System.out.println("Autenticação do Assistente de RH (Ceolmar): " + autenticavelRH.autentica("RHsenha"));

    }
    }
