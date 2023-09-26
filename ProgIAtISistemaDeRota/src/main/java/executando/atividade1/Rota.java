package executando.atividade1;

/**
 *
 * @author valmir
 */
import javax.swing.JOptionPane;

public class Rota {

   public void planejarDia() {
       
         // Leitura da quantidade de rotas
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas do dia:"));

        double totalKm = 0; // Variável para armazenar o total de km percorridos por todos os ônibus

        // Leitura do km de cada ônibus e cálculo do total de km
        for (int i = 1; i <= quantidadeRotas; i++) {
            double kmOnibus = Double.parseDouble(JOptionPane.showInputDialog("Digite a km do ônibus " + i + ":"));
            totalKm += kmOnibus;
        }

        double mediaConsumo = 2.5; // Média de consumo de 2,5 km/litro de óleo diesel

        // Cálculo da quantidade necessária de combustível para atender toda a demanda
        double litrosNecessarios = totalKm / mediaConsumo;

        // Leitura do valor do litro do óleo diesel
        double valorLitroDiesel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));

        // Cálculo do valor que a empresa desembolsará
        double valorDesembolsado = litrosNecessarios * valorLitroDiesel;

        // Exibição dos resultados
        JOptionPane.showMessageDialog(null, "Total de km percorridos por todos os ônibus: " + totalKm + " km");
        JOptionPane.showMessageDialog(null, "Quantidade de litros de combustível necessários: " + litrosNecessarios + " litros");
        JOptionPane.showMessageDialog(null, "Valor que a empresa desembolsará: R$ " + valorDesembolsado);
    }
    
}
