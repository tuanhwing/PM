package manage.process.project.pm.socket;

import android.util.Log;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

/**
 * Created by Tuan on 20/09/2017.
 */

public class Singleton {

    private static final int SERVERPORT = 8080;
//    private static final String SERVERIP = "10.69.227.191";
    private static final String SERVERIP = "192.168.0.107";
    private static String TAG = "socket_tag";
    private static Socket socket;
    {
        try {
            socket  = IO.socket("http://"+SERVERIP + ":" + SERVERPORT);
        } catch(URISyntaxException e){
            Log.d(TAG,String.valueOf(e.getMessage()));
        }
    }
    private static Singleton instance = null;

    private Singleton()
    {
    }

    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
            socket.connect();
            Log.d("lol_AAAAAA","instance null");
        } else Log.d("lol_AAAAAA","instance Notnull");
        return instance;
    }

    public Socket getSocket() {
        return this.socket;
    }

}
