public class Duende implements Iduende{
    protected int Vida;
    protected String arma;
    protected int danio;

    public Duende() {
        Vida = 0;
        arma = "";
        danio = 0;
    }

    public Duende(int Vida, String arma, int danio) {
        this.Vida = Vida;
        this.arma = arma;
        this.danio = danio;
    }

    /**
    * Retorna el Vida del tiempo. Dado una posicion se obtiene el valor indicado por parametro
    * 
    * 
    * @return Devuelve el Vida del tiem
    */
    public int getVida() {
        return this.Vida;
    }

    /**
    * Set el valor de la Vida del Servidor. Es el metodo se encarga de realizar el estado de la referencia del Servidor.
    * 
    * @param Vida - El valor de la Vida
    */
    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    /**
    * Returns Arma of the Bayesian network. A value of null indicates that the system is unusable.
    * 
    * 
    * @return Arma of the Bayesian network or null if not set or unusable in any way other than by
    */
    public String getArma() {
        return this.arma;
    }

    /**
    * Sets the Arma value. This is used to determine if the Airbrake server is running in an ARMA environment
    * 
    * @param arma - The String representation of the
    */
    public void setArma(String arma) {
        this.arma = arma;
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
    * Valor de Vida a inserer. Entree : Vida dentro del Duende
    * 
    * 
    * @return das asociativo com os dados da classe Duende que se va a inser
    */
    public Duende Vida(int Vida) {
        setVida(Vida);
        return this;
    }

    /**
    * Le nombre de lignes a partir de la Duende. Entree : arma
    * 
    * 
    * @return This object so you can chain methods together ( one by one ). E. g. new Duende ( name value ). noGrid (). gap (). fill ()
    */
    public Duende arma(String arma) {
        setArma(arma);
        return this;
    }

    /**
    * Danio a la nuova caso. Elimina el numero de cambión enviado por parametro.
    * 
    * 
    * @return this so it is possible to chain calls. E. g. new Duende ( name value ). danio ()
    */
    public Duende danio(int danio) {
        setDanio(danio);
        return this;
    }

    /**
    * Devuelve la informacion del objeto Vida Arma Danio. Retorna un String con el mensaje de texto encontrado.
    * 
    * 
    * @return String con el mensaje de texto encontrado por pantalla Vida Arma Danio
    */
    @Override
    public String toString() {
        return "{" +
            " Vida='" + getVida() + "'" +
            ", arma='" + getArma() + "'" +
            ", danio='" + getDanio() + "'" +
            "}";
    }

    /**
    * Retorna o jugador de atacar. Danio se puede mostrar o danio
    * 
    * 
    * @return int o jugador de atac
    */
    @Override
    public int Atacar_jugador() {
        return danio;
    }

    /**
    * Metodo que permite peeque la ventana de cerebro. Ejecut
    */
    @Override
    public void cerebro_peque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cerebro_peque'");
    }

    /**
    * Returns the number of neuronas in the network. This method is overridden in order to provide support for the NPML protocol.
    * 
    * 
    * @return the number of neuronas in the network or - 1 if there are no neuronas in
    */
    @Override
    public int neuronas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'neuronas'");
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
    * Returns vampirismo of the entity. This method is called by client code to determine if entity is in charge of vampirismo.
    * 
    * 
    * @return 1 if entity is in charge of vampirismo 0 otherwise. Possible values are defined in this
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
