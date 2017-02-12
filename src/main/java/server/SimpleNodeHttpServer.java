package server;

import static def.dom.Globals.console;
import static def.node.http.Globals.createServer;
import static jsweet.util.Globals.$map;

import java.util.ArrayList;
import java.util.List;

import def.node.http.Server;
import model.Message;

public class SimpleNodeHttpServer {

	public static final int PORT = 8000;

	public void run() {

		List<Message> messages = new ArrayList<>();
		messages.add(new Message("Hello"));
		messages.add(new Message("Hi"));
		messages.add(new Message("Bonjour"));
		messages.add(new Message("Salut"));
		messages.add(new Message("Boujou"));
		messages.add(new Message("Hola"));
		messages.add(new Message("Добрый день"));
		messages.add(new Message("Hola"));
		messages.add(new Message("Bună ziua"));
		messages.add(new Message("Buongiorno"));
		messages.add(new Message("您好"));

		Server server = createServer((request, response) -> {
			response.writeHead(200, $map("Content-Type", "text/plain; charset=utf-8"));
			console.log("picking one message among " + messages.size());
			int index = (int)Math.ceil(messages.size() * Math.random()) - 1;
			Message message = messages.get(Math.max(0, index));
			response.end("=====================\n" + message.text + "\n=====================\n");
		});

		// Listen on port 8000, IP defaults to 127.0.0.1
		server.listen(PORT);

		// Put a friendly message on the terminal
		console.log("Server running at http://127.0.0.1:" + PORT);
	}

}
