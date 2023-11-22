import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    /**
    * Metodo que dibuja el programa de cada personaje
    * 
    * @param args - Arreglo de argumentos de la clase
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("BIENVENIDO A FANTASY FIGHT >:D");
        System.out.println("SELECCIONE UN PERSONAJE: >:D");
        int eleccion;
        int personaje;

        do {

            System.out.println("BIENVENIDO A FANTASY FIGHT MODO HISTORIA >:D");
            System.out.println("1. Guerrero");
            System.out.println("2. Arquero");
            System.out.println("3. Mago");
            System.out.println("4. Salir");
            System.out.println("Ingrese un número:");
            eleccion = scanner.nextInt();
            
            // Metodo para eleccion de la cada de la cada.
            switch (eleccion) {
                case 1:
                    System.out.println("1. HA SELECCIONADO GUERRERO | Aumenta su daño por cada ronda");
                    mostrarMenu(1);
                    eleccion = 4;
                    break;
            
                case 2:
                    
                    System.out.println("2. HA SELECCIONADO Arquero | Cada 2 ataques hace daño adicional.");
                    mostrarMenu(2);
                    eleccion = 4;
                    break;
                    
                

                case 3:
                    System.out.println("3. HA SELECCIONADO Mago | Aumenta su vida por cada ataque.");
                    mostrarMenu(3);
                    eleccion = 4;
                    break;

                case 4:
                    System.out.println("Vuelva Pronto querido usuario ;D");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elige un número del 1 al 4.");
                    break;
            }
        } while (eleccion != 4);
    }


        public static void mostrarMenu(int personaje) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            Personaje character = null;

            // Metodo para la personaje de la cambios de la character
            if (personaje == 1) {
                    character = new Guerrero(100, "hacha", 10);
                    
            // Metodo para la personaje de la character de la cada
            } else if(personaje == 2){
                    character = new Arquero(100, "Arco", 15, 0);

            // Metodo para la personaje de la cambios
            } else if(personaje == 3) {
   
                    character = new Mago(100, "Varita magica", 20 , 0);

            }
            Duende duende = new Duende(50, "porro", 5);
    
            int opcion;
            System.out.println("COMIENZA MODO HISTORIA");
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("HAS ESTADO BUSCANDO LA PIEDRA FILOSOFAL QUE, SEGÚN LAS LEYENDAS, OTORGA PODER INFINITO A AQUEL QUE LA PORTE.");
            System.out.println("SOLO PUEDE SER PORTADA POR SERES CON MENTE FUERTE Y CORAZÓN DE ACERO. ES POR ESTO QUE DECIDES EMPRENDER UN VIAJE.");
            System.out.println("PERO NO CUALQUIER VIAJE... SINO, UNO PARA PROBAR TU VALÍA. PARA ASÍ, DEMOSTRAR QUE ERES DIGNO DE PORTAR LA LEGENDARIA PIEDRA.");
            System.out.println("HABLASTE CON UN CANTINERO QUE, AÚN SIENDO UN SER COMÚN, SE ENCUENTRA LLENO DE CONOCIMIENTO Y SABIDURÍA. TE ENVIÓ A ADENTRARTE");
            System.out.println("A TIERRAS DE LOS DUENDES, PUES HA OIDO QUE UNA PIEDRA DE INIMAGINABLE PODER SE ENCUENTRA ALLÍ.");
            System.out.println("");
            System.out.println("Y ASÍ ES COMO LA ENFRENTAS...");
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.println("NARRADOR: Al llegar a la entrada del bosque perdido, te encuentras con un duende común y corriente. ");
            System.out.println("CONSOLA: Comienza enfrentamiento.");
            System.out.println("");
            
            


            
            do {

                int damage;
                System.out.println("CONSOLA: Es tu turno.");
                System.out.println("");

                System.out.println("Duende: " + Integer.toString(duende.getVida()));
                System.out.println("Jugador: " + Integer.toString(character.getVida()));
                System.out.println("");

                //if(duende.getVida() < 0 && character.getVida() < 0){
                System.out.println("1. Atacar");
                System.out.println("2. Pasar Turno");

                System.out.print("Ingresa el número de la opción: ");
    
                opcion = scanner.nextInt();

                //}
                
            
                
    
                // Lón de la opción de la codigo de la codigo.
                switch (opcion) {
                    case 1:
                        //  1
                        System.out.println("CONSOLA: ATACAS CON TU " + character.getArma());
                        System.out.println("");
                        
    
                        damage = character.Atacar();
                        System.out.println("CONSOLA: Duende recibe " + Integer.toString(damage) + " de daño.");
                        //int vidaDuene = duende.getVida();
                        duende.setVida((duende.getVida() - damage));
                        
                        System.out.println("");
                        // Metodo para la ventro de la duende a la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la ventro de la v
                        if (duende.getVida() > 0){
                            
                            System.out.println("CONSOLA: DUENDE ATACA. Recibes " + Integer.toString(duende.getDanio()) + " de daño.");
                            character.setVida((character.getVida() - duende.getDanio()));

                        }
    
                        break;
                    case 2:
                        
                        System.out.println("CONSOLA: Saltar turno. No haces nada.");
                        System.out.println("");
                        // Metodo para la ventro de la duende.
                        if (duende.getVida() > 0){
                            System.out.println("CONSOLA: DUENDE ATACA. Recibes " + Integer.toString(duende.getDanio()) + " de daño.");
                            character.setVida(character.getVida() - duende.getDanio());

                        }
    
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción válida.");
                        break;

                
                    
                } 
            } while ((duende.getVida() > 0) && (character.getVida() > 0));

            if(character.getVida() <= 0){
                System.out.println("");
                System.out.println("########################################");
                System.out.println("GAME OVER");
                System.out.println("########################################");
                System.out.println("");
                Runtime.getRuntime().halt(0);
            }

            System.out.println("CONSOLA: HAS DERROTADO AL DUENDE.");
            System.out.println("NARRADOR: AL ADENTRARTE EN LA INMENSA ARBOLEDA TE TOPAS UN DUENDE GRANDE. PERO TE PARAS CON VALENTIA. ");
            System.out.println("CONSOLA: Comienza enfrentamiento.");
            System.out.println("");

            DuendeGrande Duendote = new DuendeGrande(100, "Porra Grande", 9, 0);

            // DUENDE GRANDE ENFRENTAMIENTO.

             do {

                int damage;
                System.out.println("CONSOLA: Es tu turno.");
                System.out.println("");

                System.out.println("Duende Grande: " + Integer.toString(Duendote.getVida()));
                System.out.println("Jugador: " + Integer.toString(character.getVida()));
                System.out.println("");

                
                System.out.println("1. Atacar");
                System.out.println("2. Pasar Turno");

                System.out.print("Ingresa el número de la opción: ");
    
                opcion = scanner.nextInt();

                //} 
                
            
            
                switch (opcion) {
                    case 1:
                        //  1
                        System.out.println("CONSOLA: ATACAS CON TU " + character.getArma());
                        System.out.println("");
                        
    
                        damage = character.Atacar();
                        System.out.println("CONSOLA: Duende recibe " + Integer.toString(damage) + " de daño.");
                        //int vidaDuene = duende.getVida();
                        Duendote.setVida((Duendote.getVida() - damage));
                        
                        System.out.println("");
                        if (Duendote.getVida() > 0){
                            
                            int numeroAleatorio = random.nextInt(3);

                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Duende Grande ATACA. Recibes " + Integer.toString(Duendote.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - Duendote.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - Duendote.neuronas()));
                                    break;

                                case 2:
                                    Duendote.cerebro_peque();
                                    break;

                            
                            
                            }
                            

                        }
    
                        break;
                    case 2:

                        System.out.println("CONSOLA: Saltar turno. No haces nada.");
                        System.out.println("");
                        if (Duendote.getVida() > 0){
                            int numeroAleatorio = random.nextInt(3);
                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Duende Grande ATACA. Recibes " + Integer.toString(Duendote.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - Duendote.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - Duendote.neuronas()));
                                    break;

                                case 2:
                                    Duendote.cerebro_peque();
                                    break;


                            }

                        }
    
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción válida.");
                        break;

                
                    
                } 
            } while ((Duendote.getVida() > 0) && (character.getVida() > 0));

            if(character.getVida() <= 0){
                System.out.println("");
                System.out.println("########################################");
                System.out.println("GAME OVER");
                System.out.println("########################################");
                System.out.println("");
                Runtime.getRuntime().halt(0);
            }
    
            System.out.println("CONSOLA: DUENDE GRANDE DERROTADO. TU VALOR AUMENTA Y CONTINUAS TU AVENTURA. RECUPERAS TU VIDA.");
            character.setVida(100);

            System.out.println("NARRADOR: Llegas a la entrada de una cueva, cuya simple vista hace estremecer a cualquiera. Inmediatamente UN DUENDE SALE DE LOS ARBUSTOS. ");
            System.out.println("NARRADOR: Al prepararte para el combate, ves el diminuto tamaño del duende. Aún así, decides no subestimarle por su apariencia.");
            System.out.println("CONSOLA: Comienza enfrentamiento.");

            Miniduende minimini = new Miniduende(30, "rama", 4,0);
            //DuendeGrande Duendote = new DuendeGrande(100, "Porra Grande", 9, 0);

            boolean pasarturno = false;
            do {

                if(pasarturno == false){


                
                int damage;
                System.out.println("CONSOLA: Es tu turno.");
                System.out.println("");

                System.out.println("Mini enano: " + Integer.toString(minimini.getVida()));
                System.out.println("Jugador: " + Integer.toString(character.getVida()));
                System.out.println("");

                
                System.out.println("1. Atacar");
                System.out.println("2. Pasar Turno");

                System.out.print("Ingresa el número de la opción: ");
    
                opcion = scanner.nextInt();

                //} 
                
            
            
                switch (opcion) {
                    case 1:

                        System.out.println("CONSOLA: ATACAS CON TU " + character.getArma());
                        System.out.println("");
                        
    
                        damage = character.Atacar();
                        System.out.println("CONSOLA: Duende recibe " + Integer.toString(damage) + " de daño.");
                    
                        minimini.setVida((minimini.getVida() - damage));
                        
                        System.out.println("");
                        if (minimini.getVida() > 0){
                            
                            int numeroAleatorio = random.nextInt(5);

                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Duende Grande ATACA. Recibes " + Integer.toString(minimini.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - minimini.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - minimini.neuronas()));
                                    break;

                                case 2:
                                    minimini.cerebro_peque();
                                    break;

                                case 3:
                                    minimini.setVida(minimini.tamanio());
                                    break;

                                case 4:
                                    System.out.println("CONSOLA: LA MINIATURA LANZA UN LAZO, PIERDES UN TURNO.");
                                    pasarturno = minimini.lazo();


                            
                            
                            }
                            

                        }
    
                        break;
                    case 2:

                        System.out.println("CONSOLA: Saltar turno. No haces nada.");
                        System.out.println("");
                        if (minimini.getVida() > 0){
                            int numeroAleatorio = random.nextInt(5);
                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Duende Grande ATACA. Recibes " + Integer.toString(minimini.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - minimini.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - minimini.neuronas()));
                                    break;

                                case 2:
                                    minimini.cerebro_peque();
                                    break;

                                case 3:
                                    minimini.setVida(minimini.tamanio());
                                    break;


                            }

                        }
    
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción válida.");
                        break;

                
                    
                } 
            } else {
                pasarturno = false;
                int numeroAleatorio = random.nextInt(5);

                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Duende Grande ATACA. Recibes " + Integer.toString(minimini.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - minimini.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - minimini.neuronas()));
                                    break;

                                case 2:
                                    minimini.cerebro_peque();
                                    break;

                                case 3:
                                    minimini.setVida(minimini.tamanio());
                                    break;
                            }
            }
            } while ((minimini.getVida() > 0) && (character.getVida() > 0));

            if(character.getVida() <= 0){
                System.out.println("");
                System.out.println("########################################");
                System.out.println("GAME OVER");
                System.out.println("########################################");
                System.out.println("");
                Runtime.getRuntime().halt(0);
            }

           System.out.println("CONSOLA: COMBATE GANADO. Recuperas tu vida completa.");
           character.setVida(100);
           System.out.println("");
           System.out.println("NARRADOR: Llegas al final de la cueva. Finalmente visualizas la piedra cuyo poder es infinito.");
           System.out.println("NARRADOR: Procedes a ir por ella. Al acercarte, APARECE EL DUENDE JEFE, GUARDIÁN DEL PODER. ");
           System.out.println("NARRADOR: PREPARATE PARA LA BATALLA, PUES AQUI SE DECIDE TODO. ");
           System.out.println("");
           System.out.println("CONSOLA: COMIENZA EL COMBATE.");

           Jefe boss = new Jefe(100, "puño supremo", 10, 0, 30);

            do {

                if(pasarturno == false){


                
                int damage;
                System.out.println("CONSOLA: Es tu turno.");
                System.out.println("");

                System.out.println("Jefe: " + Integer.toString(boss.getVida()) + " Armadura: " + Integer.toString(boss.getArmadura()));
                System.out.println("Jugador: " + Integer.toString(character.getVida()));
                System.out.println("");

                
                System.out.println("1. Atacar");
                System.out.println("2. Pasar Turno");

                System.out.print("Ingresa el número de la opción: ");
    
                opcion = scanner.nextInt();

                //} 
                
            
            
                switch (opcion) {
                    case 1:

                        System.out.println("CONSOLA: ATACAS CON TU " + character.getArma());
                        System.out.println("");
                        
    
                        damage = character.Atacar();
                        System.out.println("CONSOLA: Jefe recibe " + Integer.toString(damage) + " de daño.");
                    
                        boss.setVida((boss.getVida() - (damage - (boss.getArmadura() * (37/100) ))));
                        
                        System.out.println("");
                        if (boss.getVida() > 0){
                            
                            int numeroAleatorio = random.nextInt(7);

                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Jefe ATACA. Recibes " + Integer.toString(boss.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - boss.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - boss.neuronas()));
                                    break;

                                case 2:
                                    boss.cerebro_peque();
                                    break;

                                case 3:
                                    boss.setVida(boss.tamanio());
                                    break;

                                case 4:
                                    System.out.println("CONSOLA: Jefe LANZA UN LAZO, PIERDES UN TURNO.");
                                    pasarturno = boss.lazo();
                                    break;

                                case 5:
                                    boss.setArmadura(boss.armadura());
                                    break;

                                case 6:
                                    boss.armaduraXvida();
                                    break;



                            
                            
                            }
                            

                        }
    
                        break;
                    case 2:

                        System.out.println("CONSOLA: Saltar turno. No haces nada.");
                        System.out.println("");
                        if (boss.getVida() > 0){
                            int numeroAleatorio = random.nextInt(7);
                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Jefe ATACA. Recibes " + Integer.toString(boss.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - boss.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - boss.neuronas()));
                                    break;

                                case 2:
                                    boss.cerebro_peque();
                                    break;

                                case 3:
                                    minimini.setVida(boss.tamanio());
                                    break;

                                case 5:
                                    boss.setArmadura(boss.armadura());
                                    break;

                                case 6:
                                    boss.armaduraXvida();
                                    break;


                            }

                        }
    
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción válida.");
                        break;

                
                    
                } 
            } else {
                pasarturno = false;
                int numeroAleatorio = random.nextInt(6);

                            switch (numeroAleatorio) {
                                case 0:
                                    System.out.println("CONSOLA: Jefe ATACA. Recibes " + Integer.toString(boss.getDanio()) + " de daño.");
                                    character.setVida((character.getVida() - boss.getDanio()));
                                    break;

                                case 1:
                                    character.setVida((character.getVida() - boss.neuronas()));
                                    break;

                                case 2:
                                    boss.cerebro_peque();
                                    break;

                                case 3:
                                    boss.setVida(boss.tamanio());
                                    break;

                                case 4:
                                    boss.setArmadura(boss.armadura());
                                    break;

                                case 5:
                                    boss.armaduraXvida();
                                    break;
                            }
            }
            } while ((boss.getVida() > 0) && (character.getVida() > 0));

            if(character.getVida() <= 0){
                System.out.println("");
                System.out.println("########################################");
                System.out.println("GAME OVER");
                System.out.println("########################################");
                System.out.println("");
                Runtime.getRuntime().halt(0);
            }

            System.out.println("NARRADOR: ERES EL MEJOR AVENTURERO DE TODA LA HISTORIA. OBTIENES LA PIEDRA Y TE VUELVES EN EL PROTECTOR DE TODAS LAS TIERRAS. FELICIDADES");
            System.out.println("FIN DEL JUEGO");

        }

        
    }
