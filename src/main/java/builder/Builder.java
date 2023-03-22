/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package builder;

/**
 *
 * @author JCMB
 */
public class Builder {

    public static void main(String[] args) {
        
        Carro carro = new Carro.CarroBuilder("Fusca", "Volkswagen", 1972)
        .setNumPortas(2)
        .setArCondicionado(false)
        .setVidroEletrico(false)
        .build();

// Imprimindo as características do carro criado
System.out.println("Modelo: " + carro.getModelo());
System.out.println("Marca: " + carro.getMarca());
System.out.println("Ano: " + carro.getAno());
System.out.println("Número de Portas: " + carro.getNumPortas());
System.out.println("Ar Condicionado: " + (carro.isArCondicionado() ? "Sim" : "Não"));
System.out.println("Vidro Elétrico: " + (carro.isVidroEletrico() ? "Sim" : "Não"));
    }
}
