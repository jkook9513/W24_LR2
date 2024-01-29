import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String str = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return str;
        } else {
            ///add-message?s=Hello&user=jpolitz
            //jpolitz: Hello
            if (url.getPath().contains("/add-message")) {
                String[] parameter = url.getQuery().split("&"); //[0] = s=Hello, [1] = user=jpolitz
                String[] message = parameter[0].split("=");
                String[] user = parameter[1].split("=");

                if(message[0]=s && user[0]=user) {
                    str += String.format("%s: %s /n", user[user.length-1], message[nessage.length-1]);
                
            }
            return "404 Not Found!";
        }
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
