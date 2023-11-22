public class DuendeGrande extends Duende implements Iduende{
    
    protected int turnos;


     public DuendeGrande() {
        super();
        turnos = 0;
        
    }

    public DuendeGrande(int Vida, String arma, int danio, int turnos) {
        super(Vida, arma, danio);
        this.turnos = turnos;
        
    }

    /**
    * Returns the number of turnos. This is an int because we don't have a way to check if a player is in the game and if so how many turns it has
    * 
    * 
    * @return the number of turn
    */
    public int getTurnos() {
        return this.turnos;
    }

    /**
    * Sets the turnos of the player. This is used to determine how many turns are in the player's turn of life
    * 
    * @param turnos - The number of turnos in
    */
    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    /**
    * Valor de turnos a DuendeGrande. Ejecuta un int
    * 
    * 
    * @return this so it is possible to chain calls. E. g. new DuendeGrande ( new int [] { 1 2 3 }
    */
    public DuendeGrande turnos(int turnos) {
        setTurnos(turnos);
        return this;
    }

    /**
    * Returns a String representation of this Turno. This is useful for debugging purposes. If you want to see the result of this method be sure to call toString () on the return value.
    * 
    * 
    * @return a String representation of this Turno ; never null but may be empty or contains line breaks and / or
    */
    @Override
    public String toString() {
        return "{" +
            " turnos='" + getTurnos() + "'" +
            "}";
    }

   
    
    /**
    * Retorna o valor da jugador. Danio de cada pantalla
    * 
    * 
    * @return devuelve la posicion de dan
    */
    public int Atacar_jugador() {
        return danio;
    }

    /**
    * Metodo que muestra el cerebro de este Duende es tan peque
    */
    @Override
    public void cerebro_peque() {
        
         System.out.println("");
         System.out.println("El cerebro de este Duende es tan pequeño que se le va el pajaro. (Duende Grande no ataca)");
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
    * Returns the tamanio value. This method is called by the client to determine how many times the client has received a message before it is allowed to send a message.
    * 
    * 
    * @return the tamanio value in the range 0 to #MAX_VALUE ( inclusive ) - 1
    */
    @Override
    public int tamanio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanio'");
    }

    /**
    * Lazo / Aliyun the game. If you don't want to run the game in a different environment you can use this method to determine if it is time to run or not.
    * 
    * 
    * @return true if the game is time to run false otherwise ( in this case this method is called by the game
    */
    @Override
    public boolean lazo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lazo'");
    }

    /**
    * Armadura del mismo encontrado. Unnecesario utiliza la clase Armadura
    * 
    * 
    * @return Numero que tiene el arm
    */
    @Override
    public int armadura() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'armadura'");
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
    * Armadura XVida a partir de um arquivo com sucesso. Ejemplo : Mostrar o este metodo empezifica la vent
    */
    @Override
    public void armaduraXvida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'armaduraXvida'");
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
