public class Guerrero extends Personaje implements juego {
    private int danio;

    public Guerrero() {
        super();
        danio = 10;
    }

    public Guerrero(int vida, String arma, int danio) {
        super(vida, arma);
        this.danio = danio;
    }

    /**
    * Retorna el danio de la pantalla. Si es necesario devuelve 0.
    * 
    * 
    * @return Danio de la pantalla ( 0 - n ) o - 1 en caso contrario
    */
    public int getDanio() {
        return this.danio;
    }

    /**
    * Set the danio of the player. This is used to prevent the player from moving to a different player during the life cycle of the game.
    * 
    * @param danio - The danio of the player
    */
    public void setDanio(int danio) {
        this.danio = danio;
    }

    /**
    * Danio del Guerrero encontrado. Ejecuta la cantidad de hojas encontrada.
    * 
    * 
    * @return This instance for chaining ( fluent API ). Ejecuta la cantidad de hojas encontrada
    */
    public Guerrero danio(int danio) {
        setDanio(danio);
        return this;
    }

    /**
    * Devuelve la informacion del objeto dentro de la clase. This method is intended to be used for debugging purposes only.
    * 
    * 
    * @return String con la informacion del objeto dentro de la clase en formato " { danio ='' + getDanio () +
    */
    @Override
    public String toString() {
        return "{" +
            " danio='" + getDanio() + "'" +
            "}";
    }

    /**
    * Ata um danio na tabela. Por cada entrada se usara o numero de danios
    * 
    * 
    * @return Retorna o numero de dan
    */
    @Override
    public int Atacar() {
        danio += 1;
        return danio;
        
    }

    
}
