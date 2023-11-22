public interface Iduende {
    
    /**
    * Atualiza el jugador de acuerdo a la partida. Devuelve 0 si hay algun error o - 1 si hay algun error
    * 
    * 
    * @return int Nombre de la partid
    */
    int Atacar_jugador();

    /**
    * Metodo que cerea la peque de la ventana. Ejecuta el mismo
    */
    void cerebro_peque();

    /**
    * Devuelve el numero de neuronas que contiene la pantalla.
    * 
    * 
    * @return Numero de neuronas que contiene la pantalla ( 0 si hay alguno
    */
    int neuronas();

    /**
    * Metodo que devuelve el numero de tamanio. En caso de que se encuentra la pantalla de entrada
    * 
    * 
    * @return Numero de tamanio a comprobar
    */
    int tamanio();

    /**
    * Lazo. Returns true if the player is in the middle of a game. This is a hack to allow the player to move to the next game in the game loop without having to worry about it changing the position of the player.
    * 
    * 
    * @return true if the player is in the middle of a game false otherwise. Note that it is possible for the player to move to the next game
    */
    boolean lazo();

    /**
    * Armadura o arquivo da classe pelo espera. Dentro de entrada se houvera a ser apenas por parametro
    * 
    * 
    * @return Retorna o numero de caracteres armad
    */
    int armadura();

    /**
    * Devuelve el vampirismo del objeto especificado. Si es necesario devuelve - 1.
    * 
    * 
    * @return el numero de elementos que contiene el vampirismo del objeto especificado
    */
    int vampirismo();

    /**
    * Armadura el Xvida de la ventana. Muestra en pantall
    */
    void armaduraXvida();

    /**
    * Metodo que permite realizar la vida de Xdano. Ejecuta el comunicacion
    */
    void vidaXdano();
}
