package ie.gmit.exercise;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException {
			writer.println(formatter.format(msg));
			writer.flush();
			writer.close();

	}
}
