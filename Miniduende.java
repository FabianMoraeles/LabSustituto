public class Miniduende extends DuendeGrande implements Iduende{
    public Miniduende() {
        super();

        
    }

    public Miniduende(int Vida, String arma, int danio, int turnos) {
        super(Vida, arma, danio, turnos);
        
    }

    /**
    * Atacar_jugador Consequencia uma tabela de turnos aleatorio
    * 
    * 
    * @return danio si hay turn
    */
    public int Atacar_jugador() {
        turnos += 1;
        
        // Duende realiza un golpe crítico cada 3er.
        if(turnos < 3){
            return danio;

        } else {
            turnos = 0;
            System.out.println("CONSOLA: Duende realiza un golpe crítico cada 3er ataque.");
            return 9;
        }
        
    }

    /**
    * Metodo que cerebra la conexion pensar en el mismo. Se hace nada porque no sabe pens
    */
    @Override
    public void cerebro_peque() {
        
         System.out.println("");
         System.out.println("CONSOLA: Duende Enano Intenta pensar por si mismo. (No hace nada porque no sabe pensar)");
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
    * Metodo que permite realizar el tamanio de la conexion. Ejecuta la cantidad de ventas que haya encontradas
    * 
    * 
    * @return Devuelve la cantidad de ventas que haya encontr
    */
    @Override
    public int tamanio() {
        System.out.println("CONSOLA: DUENDE AUMENTA SU TAMAÑO (GANA UN POCO DE VIDA)");

        return (Vida + 10);

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
