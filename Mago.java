public class Mago extends Personaje implements juego{
    private int danio;
    private int turnos;

    public Mago() {
        super();
        danio = 15;
        turnos = 0;
    }

    public Mago(int vida, String arma, int danio, int turnos) {
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
    * Sets the danio property of the instance. E. g. to set it to 1 you can set it to - 1
    * 
    * 
    * @return this so it is possible to chain calls. E. g. new Mago ( this ). noGrid
    */
    public Mago danio(int danio) {
        setDanio(danio);
        return this;
    }

    /**
    * Valor de turnos a mostrar. Escelerisque el metodo este metodo se quiere utilizar en ese caso contrario
    * 
    * 
    * @return this so it is possible to chain calls. E. g. new Mago ( new Coordinates ()
    */
    public Mago turnos(int turnos) {
        setDanio(turnos);
        return this;
    }

    /**
    * Ata um danio na vida vigente. Escrita o valor da vida
    * 
    * 
    * @return Retorna o valor da vid
    */
    @Override
    public int Atacar() {

        vida += 3;
        return danio;
        
    }
}
