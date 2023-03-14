public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // ligando a tv
        smartTv.ligar();

        // diminuindo o volume da tv
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        // mostrando todos status da tv
        System.out.println("Novo status!");
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo status!");
        System.out.println("Tv Ligada? " + smartTv.ligada);

        // mudando canal
        smartTv.mudarCanal(12);
        System.out.println("Novo status!");
        System.out.println("Canal Atual: " + smartTv.canal);

        // mudando um canal para cima
        smartTv.aumentarCanal();
        System.out.println("Novo status!");
        System.out.println("Canal Atual: " + smartTv.canal);

        //diminuir um canal
        smartTv.diminuirCanal();
        System.out.println("Novo status!");
        System.out.println("Canal Atual: " + smartTv.canal);


    }
}
