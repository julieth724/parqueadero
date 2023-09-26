package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String placa;
        String nombre;
        double horaInicio,horaFin, horaTotal, pagoTotal;
        int vehiculo;


        JOptionPane.showMessageDialog(null, "====================================== \n" +
                                                                    "Bienvenidos al parqueadero Pepito \n"+
                                                                    "Valor hora o fraccion  \n" +
                                                                    "Carro: $2000      Moto: $1000 \n"+
                                                                    "====================================== \n"  );

        placa = JOptionPane.showInputDialog("Por favor ingrese la placa del vehiculo:");
        nombre = JOptionPane.showInputDialog("Por favor ingrese el nombre del conductor:");
        horaInicio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la hora de llegada:"));

        JOptionPane.showMessageDialog(null, "====================================== \n" +
                "Bienvenidos al parqueadero Pepito \n"+
                "Valor hora o fraccion  \n" +
                "Carro: $2000      Moto: $1000 \n"+
                "====================================== \n"+"\n"+"\n"+"====================================== \n" +
                "su nombre es:" + nombre + "\n"+
                "su placa es:" + placa + "\n" +
                "su hora de entrada es:" + horaInicio +"\n"+
                "====================================== \n"  );
        horaFin = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la hora de Salida:"));
        vehiculo = Integer.parseInt(JOptionPane.showInputDialog("su ingrese el valor a pagar por su vehiculo:"));
        horaTotal = (horaFin - horaInicio);
        pagoTotal = vehiculo * Math.ceil(horaTotal);



        JOptionPane.showMessageDialog(null, "====================================== \n" +
                "Bienvenidos al parqueadero Pepito \n"+
                "Valor hora o fraccion  \n" +
                "Carro: $2000      Moto: $1000 \n"+
                "====================================== \n"+"\n"+"\n"+"====================================== \n" +
                "su nombre es: " + nombre + "\n"+
                "su placa es: " + placa + "\n" +
                "su hora de entrada es: " + horaInicio +"\n"+
                "su hora de salida es: " + horaFin +"\n"+
                 "su valor a pagar es $" + pagoTotal +"\n"+
                "====================================== \n"  );

    }
}
