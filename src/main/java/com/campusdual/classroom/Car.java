package com.campusdual.classroom;

public class Car {
    public static final int MAX_SPEED = 120;

    public String brand;
    public String model;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public Car(){

    }


    public void start() {
        if (isTachometerEqualToZero()) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (this.speedometer == Car.MAX_SPEED) {
            System.out.println("Velocidade máxima alcanzada");
        } else {
            if (this.isReverse() && this.speedometer == 25) {
                System.out.println("O vehículo non pode ir a máis velocidade marcha atrás.");
            } else {
                this.speedometer += 20;
                System.out.println("A nova velocidade é " + this.speedometer);
            }
        }
    }

    public void brake() {
        if (isTachometerEqualToZero()){
            System.out.println("O vehículo xa está apagado, non se pode frenar");
        } else if (this.speedometer == 0) {
            System.out.println("O vehículo xa está detido");
        } else {
            this.speedometer -= 20;
            System.out.println("A nova velocidade é " + this.speedometer);
        }
    }

    public void turnAngleOfWheels(int angle) {
        //0 -> posición central
        //+45 -> máximo giro a la derecha
        //-45 -> máximo giro a la izquierda
        if(this.wheelsAngle < 45 && this.wheelsAngle > -45) {
            if ((this.wheelsAngle + angle) > 45 || (this.wheelsAngle + angle) < -45) {
                System.out.println("O volante non pode xirar máis. Xa está ao máximo de xiro.");
            } else {
                this.wheelsAngle += angle;
                System.out.println("O volante está xirado " + this.wheelsAngle + " grados");
            }
        }
       else{
            System.out.println("O volante non pode xirar máis. Xa está ao máximo de xiro.");
            }
        }


    public String showSteeringWheelDetail() {
        StringBuilder builder = new StringBuilder();
        builder.append("O volante está ");

        if (this.wheelsAngle == 0) {
            builder.append("no centro.");
        } else if (this.wheelsAngle > 0) {
            builder.append("xirado á dereita.");
        } else {
            builder.append("xirado á esquerda.");
        }
        builder.append(" O ángulo de xiro do volante é " + this.wheelsAngle);

        return builder.toString();
    }

    private boolean isReverse() { //isAlgo es nomenclatura tipica en métodos que devuelven boolean
        return this.reverse;
    }



    public void setReverse(boolean reverse) {
        if (isTachometerGreaterThanZero() && this.speedometer == 0) {
            if (this.isReverse() == reverse) {
                System.out.println("O vehículo xa ten esa marcha indicada.");
            } else {
                this.reverse = reverse;
            }
        }

        if (reverse && this.speedometer == 0) {
            this.gear = "R";
        }else if(reverse && this.speedometer > 0) {
            System.out.println("O vehiculo ten que estar parado e acendido para cambiar á marcha atrás");
        }else if (!reverse) {
            this.gear = "N";
            System.out.println("Punto morto ou adiante");
        }
        System.out.println("A marcha engranada e " + this.gear);
    }//setReverse()

    public boolean isTachometerEqualToZero(){
        if (this.tachometer == 0){
            return true;
        }
        else{
            return false;
        }
    }



    public void showDetails() {
       /* StringBuilder builder = new StringBuilder();
        builder.append("O coche marca " + this.brand);
        builder.append(" modelo " + this.model);
        builder.append(" ten unha velocidade de "+ this.speedometer + ".");
        builder.append("\n O tacógrafo marca " + this.tachometer);
        builder.append(" . O sentido da marcha é " + this.gear);
        builder.append(". O ángulo de xiro do volante é " + this.showSteeringWheelDetail());
        builder.toString();
        System.out.println(builder.toString());*/

        System.out.println("O coche marca " + this.brand + " modelo " + this.model + " ten unha velocidade de "
                + this.speedometer + " . " + "\n O tacógrafo marca " + this.tachometer + " . O sentido da marcha é " + this.gear
                + ". O ángulo de xiro do volante é " + this.wheelsAngle);
    }

    public boolean isTachometerGreaterThanZero() {
        if(this.tachometer > 0){
            return true;
        }
        else{
            return false;
        }
    }
}
