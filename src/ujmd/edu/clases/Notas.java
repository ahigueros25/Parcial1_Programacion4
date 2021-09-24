/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.clases;

import java.util.Scanner;

/**
 *
 * @author Ale Higueros
 */
public class Notas {

    String[] materia, grado, nombre;
    float[] nota1, nota2, nota3, nota4, nota5;
    private Scanner teclado;

    public Notas() {

    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public String[] getMateria() {
        return materia;
    }

    public void setMateria(String[] materia) {
        this.materia = materia;
    }

    public String[] getGrado() {
        return grado;
    }

    public void setGrado(String[] grado) {
        this.grado = grado;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public float[] getNota1() {
        return nota1;
    }

    public void setNota1(float[] nota1) {
        this.nota1 = nota1;
    }

    public float[] getNota2() {
        return nota2;
    }

    public void setNota2(float[] nota2) {
        this.nota2 = nota2;
    }

    public float[] getNota3() {
        return nota3;
    }

    public void setNota3(float[] nota3) {
        this.nota3 = nota3;
    }

    public float[] getNota4() {
        return nota4;
    }

    public void setNota4(float[] nota4) {
        this.nota4 = nota4;
    }

    public float[] getNota5() {
        return nota5;
    }

    public void setNota5(float[] nota5) {
        this.nota5 = nota5;
    }

    public void DigitarNotas() {
        teclado = new Scanner(System.in);
        String materia, grado, nombre;
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0;
        System.out.println("Introduzca la materia: ");
        materia = teclado.next();
        System.out.println("Introduzca el grado: ");
        grado = teclado.next();
        System.out.println("Introduzca el nombre del alumno: ");
        nombre = teclado.next();
        System.out.println("Introduzca la primera nota: ");
        nota1 = teclado.nextInt();
        if (nota1 >= 0 && nota1 <= 10) {
            System.out.println("Introduzca la segunda nota: ");
            nota2 = teclado.nextInt();
            if (nota2 >= 0 && nota2 <= 10) {
                System.out.println("Introduzca la tercera nota: ");
                nota3 = teclado.nextInt();

                if (nota3 >= 0 && nota3 <= 10) {
                    System.out.println("Introduzca la cuarta nota: ");
                    nota4 = teclado.nextInt();
                    if (nota4 >= 0 && nota4 <= 10) {
                        System.out.println("Introduzca la quinta nota: ");
                        nota5 = teclado.nextInt();
                        if (nota5 >= 0 && nota5 <= 10) {
                            double operacion = ((nota1 * (0.15)) + (nota2 * (0.10)) + (nota3 * (0.20)) + (nota4 * (0.30)) + (nota5 * (0.25)));
                            System.out.println("Nombre del alumno: ");
                            System.out.println(nombre);
                            System.out.println("Materia: ");
                            System.out.println(materia);
                            System.out.println("Nota final: ");
                            System.out.println(operacion);
                            if (operacion >= 7) {
                                System.out.println("La materia fue aprobada");
                            } else {
                                if (operacion <= 6) {
                                    System.out.println("La materia fue reprobada");
                                } else {
                                    if (operacion >= 6.01 && operacion <= 6.99) {
                                        System.out.println("Debe realizar examen");
                                    } else {
                                        System.out.println("Error en el calculo, favor revisarlo");
                                    }
                                }
                            }
                        } else {
                            System.out.println("No se aceptan notas menores a 0 y mayores a 10 ");
                        }
                    } else {
                        System.out.println("No se aceptan notas menores a 0 y mayores a 10 ");
                    }
                } else {
                    System.out.println("No se aceptan notas menores a 0 y mayores a 10 ");
                }
            } else {
                System.out.println("No se aceptan notas menores a 0 y mayores a 10 ");
            }
        } else {
            System.out.println("No se aceptan notas menores a 0 y mayores a 10 ");
        }
    }
}
