public class Arquero extends Personaje implements juego{
    private int danio;
    private int turnos;

    public Arquero() {
        super();
        danio = 15;
        turnos = 0;
    }

    public Arquero(int vida, String arma, int danio, int turnos) {
        super(vida, arma);
        this.danio = danio;
        this.turnos = turnos;
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
    * Valor de danio a todos los arqueros. Ejemplo : 1 - Nombre de cada carpeta.
    * 
    * 
    * @return Almacenado en el objeto Arquero de la clase establecida por parametro
    */
    public Arquero danio(int danio) {
        setDanio(danio);
        return this;
    }

    /**
    * Valor de turnos a mostrar. Entreziona la clase Arquero en este caso de esperamos que haya dan
    * 
    * 
    * @return Altrimentro de la clase Arquero ( for composicionalizacion
    */
    public Arquero turnos(int turnos) {
        setDanio(turnos);
        return this;
    }

    /**
    * Atacar o jogador a turno. Retorna o danio de jogador
    * 
    * 
    * @return Retorna o danio de
    */
    @Override
    public int Atacar() {

        turnos += 1;
        // Metodo que se encarga de la turnos de la danio
        if (turnos < 2){
            return danio;
        } else {
            turnos = 0;
            return 30;
        }
        
    }
}
