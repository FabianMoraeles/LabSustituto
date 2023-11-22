public class Personaje implements juego{
    protected int vida;
    protected String arma;

    public Personaje() {
        vida = 100;
        arma = "";
    }

    public Personaje(int vida, String arma) {
        this.vida = vida;
        this.arma = arma;
    }

    /**
    * Returns the VIDA of the device. This value is used to determine the type of device that is connected to the USB bus.
    * 
    * 
    * @return The VIDA of the device or - 1 if there is no VIDA assigned to the
    */
    public int getVida() {
        return this.vida;
    }

    /**
    * Set the VIDA of the video. This is used to determine the number of frames that have been transferred to the video in the first frame ( if any )
    * 
    * @param vida - The VIDA of the video
    */
    public void setVida(int vida) {
        this.vida = vida;
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
    * Valor de vida a inserimento del personaje. Entidade : 0 para cada vez de vida 1 para direccionar por vida
    * 
    * 
    * @return this so you can chain calls. Entidade : 0 para cada vez de vida 1 para direccionar por
    */
    public Personaje vida(int vida) {
        setVida(vida);
        return this;
    }

    /**
    * String che rappresenta l'arma del personaje. Entree : arma
    * 
    * 
    * @return reference to this object so that method calls can be chained together. E. g. new Personaje ( name ). arma ( " John Smith "
    */
    public Personaje arma(String arma) {
        setArma(arma);
        return this;
    }

    /**
    * Returns a string representation of this Vida. This is useful for debugging and in unit tests.
    * 
    * 
    * @return a string representation of this Vida with its properties separated by spaces and surrounded by square brackets
    */
    @Override
    public String toString() {
        return "{" +
            " vida='" + getVida() + "'" +
            ", arma='" + getArma() + "'" +
            "}";
    }

    /**
    * Atacar is called when player enters atacar. This method returns the number of times the player has attained a character in the character set.
    * 
    * 
    * @return the number of times the player has attained a character in the character set or - 1 if there is no
    */
    @Override
    public int Atacar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atacar'");
    }
}
