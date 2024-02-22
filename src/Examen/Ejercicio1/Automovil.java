package Examen.Ejercicio1;

import java.util.Objects;

public class Automovil {
    private String marca;
    private String modelo;
    private String matricula;
    private int añoFabricacion;
    private  TipoMotor tipoMotor;
    private int potencia;

    public Automovil(String marca, String modelo, String matricula, int añoFabricacion, TipoMotor tipoMotor, int potencia) {
        if (añoFabricacion < 0 || añoFabricacion > 2024 || potencia <= 0) {
            throw new IllegalArgumentException("El año de fabricación no puede ser negativo ni superior a 2024. La potencia tampoco puede ser 0");

        }
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.tipoMotor = tipoMotor;
        this.potencia = potencia;
    }
    public Automovil(String marca, String modelo, String matricula, int añoFabricacion, String tipoMotor, int potencia){
        this(marca, modelo, matricula, añoFabricacion, TipoMotor.valueOf(tipoMotor.toUpperCase()), potencia);

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public int getPotencia() {
        return potencia;
    }

    public int compareTo(Automovil otro) {
        int comparacionMarca = this.marca.compareTo(otro.marca);
        if (comparacionMarca != 0) {
            return comparacionMarca;
        }
        int comparacionModelo = this.modelo.compareTo(otro.modelo);
        if (comparacionModelo != 0) {
            return comparacionModelo;
        }
        return this.tipoMotor.compareTo(otro.tipoMotor);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovil automovil = (Automovil) o;
        return añoFabricacion == automovil.añoFabricacion && potencia == automovil.potencia && Objects.equals(marca, automovil.marca) && Objects.equals(modelo, automovil.modelo) && Objects.equals(matricula, automovil.matricula) && tipoMotor == automovil.tipoMotor;
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, matricula, añoFabricacion, tipoMotor, potencia);
    }

    @Override
    public String toString() {
        return "Automovil{ " + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' +", matricula='" + matricula + '\'' + ", añoFabricacion=" + añoFabricacion + ", tipoMotor=" + tipoMotor + ", potencia=" + potencia + '}';
    }
    enum TipoMotor {
        GASOLINA,
        DIESEL,
        HIBRIDO,
        ELECTRICO
    }
}
