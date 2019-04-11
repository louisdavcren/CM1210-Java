//Peter Snook 1842512

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class writeFile {

	private String path;
	private boolean append_to_file = false;

	public writeFile( String file_path ) {
		path = file_path;
	}

	public writeFile( String file_path, boolean append_value) {
		path = file_path;
		append_to_file = append_value;
	}

	public void writeToFile( String data ) throws IOException {

		FileWriter writer = new FileWriter( path, append_to_file );
		PrintWriter print_line = new PrintWriter( writer );

		print_line.printf("%s" + "%n", data );

		print_line.close();
	}
}