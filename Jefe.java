public class Jefe extends DuendeGrande implements Iduende{
    private int armor;

     public Jefe() {
        super();
        armor = 0;

        
    }

    public Jefe(int Vida, String arma, int danio, int turnos, int armor) {
        super(Vida, arma, danio, turnos);
        this.armor = armor;
        
    }

    /**
    * Sets the armadura of the player. This is used to determine if the player is in the middle of a game or not
    * 
    * @param armadura - Armadura of the player
    */
    public void setArmadura(int armadura) {
        this.armor = armadura;
    }

    /**
    * Devuelve el armado del tiempo. Aqui se encuentra en la pantalla de armo.
    * 
    * 
    * @return Numero de la pantalla de armo a traves del tiempo ( 0 si hay algun asignado
    */
    public int getArmadura() {
        return this.armor;
    }

    /**
    * Returns a String representation of this Armadura. This is useful for debugging purposes. If you want to see the result of this method be sure to call toString () on the result otherwise it will be an empty String.
    * 
    * 
    * @return a String representation of this Armadura as described in the Java™ Language Specification for
    */
    @Override
    public String toString() {
        return "{" +
            " armadura='" + getArmadura() + "'" +
            "}";
    }



    /**
    * Atacar_jugador Consequeda o danio de turno aleatorio
    * 
    * 
    * @return int Nombre de turno aleatorio ( 0 - 13 ) o danio
    */
    public int Atacar_jugador() {
        turnos += 1;
        
        // Duende realiza un golpe crítico cada 3er.
        if(turnos < 3){
            return danio;

        } else {
            turnos = 0;
            System.out.println("CONSOLA: Duende realiza un golpe crítico cada 3er ataque.");
            return 13;
        }
        
    }

    /**
    * Metodo que cerebra la conexion al mismo de pensar si esta neces
    */
    @Override
    public void cerebro_peque() {
        
         System.out.println("");
         System.out.println("CONSOLA: ¿Todos los duendes son iguales? Intenta pensar por si mismo. (No hace nada por sobrepensar)");
    }

    /**
    * Metodo que permite realizar el numero de neuronas encontradas.
    * 
    * 
    * @return Numero de neuronas encontradas ( int ) y devuelve el numero
    */
    @Override
    public int neuronas() {
        System.out.println("CONSOLA: Ocurre un milagro, el duende obtiene una neurona y ataca. (+1 de daño)");
        danio += 1;
        return danio;
        
    }

    /**
    * Metodo que permite realizar el tamanio de la conexion. Ejemplo : DUENDE AUMENTA SU TAMAUNDO
    * 
    * 
    * @return Devuelve la cantidad de tamanio a partir del usuario Vida +
    */
    @Override
    public int tamanio() {
        System.out.println("CONSOLA: DUENDE AUMENTA SU TAMAÑO (GANA UN POCO DE VIDA)");

        return (Vida + 15);

    }

    /**
    * Lazo is used to determine if the user is allowed to enter a text. This is a hack that allows the user to enter text without having to worry about it being in the middle of a line ( for example if they are trying to enter a text that does not exist ).
    * 
    * 
    * @return true if the user is allowed to enter a text false otherwise. In this case the user will be prompted
    */
    @Override
    public boolean lazo() {
        return true;
    }

    /**
    * Metodo que devuelve el numero de armaduras a partir desde la pantalla
    * 
    * 
    * @return Numero de armo adicionales a partir del pantalla desde la p
    */
    @Override
    public int armadura() {
        System.out.println("CONSOLA: JEFE DUENDE REFUERZA SUS DEFENSAS (GANA UN POCO DE ARMADURA)");
        return (armor + 10);
    }

    /**
    * Returns vampirismo of the entity. This method is called by #update ( int ) and should return the number of entities that have been removed from the entity's list of entities to be reinserted in the new list.
    * 
    * 
    * @return int value of the entity's vampirismo ( 0 - 4095 ) or - 1 if entity is
    */
    @Override
    public int vampirismo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vampirismo'");
    }

    /**
    * Metodo que muestra el armadura de la ventana y el xvida
    */
    @Override
    public void armaduraXvida() {
        System.out.println("CONSOLA: JEFE DUENDE SACRIFICA UN POCO DE ARMADURA POR VIDA. ");
        Vida = Vida + 20;
        armor = armor - 10;
    }

    /**
    * Vida XDano is used to draw a texture. It's a good idea to call this method in a non - JNI thread
    */
    @Override
    public void vidaXdano() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vidaXdano'");
    }
}
