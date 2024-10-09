package Agregacao;

public class MainEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("Nhandes Cosm.");
        Departamento departamento = new Departamento("Marketing e Vendas");

        System.out.println("Empresa: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());
    }
}
