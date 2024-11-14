package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car nissan = new Car();
        //Un metodo booleano que verifique si el valor del tacómetro es cero
        nissan.isTachometerEqualToZero();
        System.out.println("Valor del tacómetro: " + nissan.tachometer);
        //Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        nissan.start();
        //Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        nissan.start();
        //Apagar el coche comprobando que el valor del tacómetro es correcto
        nissan.stop();
        //Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        nissan.start();
        nissan.accelerate();
        nissan.stop();
        //Acelerar el coche
        nissan.start();
        nissan.accelerate();
        //Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        nissan.accelerate();
        nissan.accelerate();
        nissan.accelerate();
        nissan.accelerate();
        nissan.accelerate();
       //Frenar la velocidad
        nissan.brake();
        //Frenar hasta un valor negativo -->
        nissan.brake();
        nissan.brake();
        nissan.brake();
        nissan.brake();
        nissan.brake();
        //   -->   (y comprobar que no se puede)
        nissan.brake();
        //Girar el volante 20 grados
        nissan.turnAngleOfWheels(20);
        //Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        nissan.turnAngleOfWheels(30);

        //Detener el coche y poner marcha atrás
        nissan.setReverse(true);
        //Poner marcha atrás mientras el coche está en movimiento marcha adelante -->
        nissan.setReverse(false);
        nissan.accelerate();
        // -->(y comprobar que no se puede)
        nissan.setReverse(true);











    }
}

/*
- Un metodo booleano que verifique si el valor del tacómetro es cero
-?
-
-
-
-
-
-
-
-
-
-

*/