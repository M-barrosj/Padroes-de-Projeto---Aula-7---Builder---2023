/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author JCMB
 */
public class CarroBuilder {    
       private String modelo;
        private String marca;
        private int ano;
        private int numPortas;
        private boolean arCondicionado;
        private boolean vidroEletrico;

        public CarroBuilder(String modelo, String marca, int ano) {
            this.modelo = modelo;
            this.marca = marca;
            this.ano = ano;
        }

        public CarroBuilder setNumPortas(int numPortas) {
            this.numPortas = numPortas;
            return this;
        }

        public CarroBuilder setArCondicionado(boolean arCondicionado) {
            this.arCondicionado = arCondicionado;
            return this;
        }

        public CarroBuilder setVidroEletrico(boolean vidroEletrico) {
            this.vidroEletrico = vidroEletrico;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
}