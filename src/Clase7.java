public class Clase7 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,9},{4,5,8}, {7,8,9}};


    }

    public static void  carrusel(String pal) {
        ///// char

    }

    public static char letraMasRepetida(String pal) {
        int cantMax = 0;
        char letraMax = ' ';
        int cant = 0;

        for (int i=0; i< pal.length(); i++) {
            char letra = pal.charAt(i);
            cant = 0;
            for (int j=0; j<pal.length(); j+=1) {
                char letraC =pal.charAt(j);
                if (letra == letraC) {
                    cant ++;
                }
            }
            if (cant > cantMax) {
                cantMax = cant;
                letraMax = letra;
            }
        }

        return letraMax;
    }
    /*
    Todos los objetos instancian de una clase
    Florista: Florencia, Mateo
    Los atributos son las caracteristicas que tiene la clase
    Florista atributos: nombre, apellido, ci, edad
    Metodos: lo que le da comportamiento al objeto, es lo que saben hacer
    Florista metodos: regar flores, plantar flores, emitir una factura(vender)
    set y get
    TODAS LAS CLASES DE JAVA Y LAS QUE YO CREO SON CLASES DE OBJECT
    Si tenemos una clase comerciante, florista seria una herencia de cometciante, de alli heredaria el metodo "emitir factura"
    Polimorfismo: Es un mismo metodo en dos objetos, segun quien lo invoque tiene una devolucion diferente
    Los atributos y metodos tienen una visibilidad (publico, privado, protegido)
    Atributos son siempre privados (son mios) Los puedo dar a traves de los metodo publico

    Como se podrian agrupar: a, Medio de transporte, , ruedas, terrestre (vivo o no), capacidad, motorizado/sangre, ruedas
    b.Funciones, Trigonometrica o no, creciente/no
    c. Visualizacion, electronico/no, alarga vision/no,

    Material, grosor, diametro,

    UML estandar de clases (relaciones, vinculos)
    Definicion de clases
    Nombre en singular
    atributos
    visibilidad -Privado +Publico #Protected En camelCase
    atributo:Tipo de dato String int
    Metodos
    +Plantar():void
    Debe ingcluir la firma y el retorno
    +SetNombre(nom:String):void


    Relaciones
    1. Generalizacion/Especializacion (Herencia) Se modela con un triangulo


    2.Asociacion con linea o link (flecha sin rellenar) Tiene atributo del tipo al que va la flecha
    Linea continua para bidireccional

    3.Agregacion/composicion (Rombo)
    Tiene una cardinalidad
    *
     Zoo 1...100 Animal (El rombo va en el zoo)

    crh

     */



}

