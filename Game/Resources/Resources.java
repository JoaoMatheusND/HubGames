package Resources;

public class Resources {

    static Resources resources = null;

    private Resources() {}

    static Resources getResources(){
        if(resources == null){
            resources = new Resources();
        }

        return resources;
    }
    
}
