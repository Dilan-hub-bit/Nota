/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Sala de Sistemas
 */
public class Notas {
    private Double Nota1;
    private Double Nota2;
    private Double Nota3;

    /**
     * @return the Nota1
     */
    public Double getNota1() {
        return Nota1;
    }

    /**
     * @param Nota1 the Nota1 to set
     */
    public void setNota1(Double Nota1) {
        this.Nota1 = Nota1;
    }

    /**
     * @return the Nota2
     */
    public Double getNota2() {
        return Nota2;
    }

    /**
     * @param Nota2 the Nota2 to set
     */
    public void setNota2(Double Nota2) {
        this.Nota2 = Nota2;
    }

    /**
     * @return the Nota3
     */
    public Double getNota3() {
        return Nota3;
    }

    /**
     * @param Nota3 the Nota3 to set
     */
    public void setNota3(Double Nota3) {
        this.Nota3 = Nota3;
    }
    public double calcularNota(){
        return(Nota1*0.30)+(Nota2*0.30)+(Nota3*0.40);
    }
}
