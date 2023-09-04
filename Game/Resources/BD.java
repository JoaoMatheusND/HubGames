package Resources;

public class BD {
    static BD instancia = null;

    private BD() {}

    static BD getResources(){
        if(instancia == null){
            instancia = new BD();
        }

        return instancia;
    }
}
