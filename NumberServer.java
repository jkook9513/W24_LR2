import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String str = "";

    public String handleRequest(URI url) {
        if(url.getpath().equals("/")) {
            return str;
        } else if {
            if(url.getPath().contains("/add-message")) {
                String[] parameter = url.getQuery().split("&"); //[0] = s=Hello, [1] = user=jpolitz
                String[] message = parameter[0].split("="); //[0] = s, [1] = Hello
                String[] user = parameter[1].split("="); //[0] = user, [1] = jpolitz

                if(message[0].equals("s") && user[0].equals("user")) {
                    str += String.format("%s: %s \n", user[1], message[1]);
            } else {
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
