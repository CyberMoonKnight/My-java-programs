import null.FileNotFoundException;
public class Filenotfound
{
	private static final Logger LOG = Logger.getLogger(Filenotfound.class);
	private String fileName = Double.toString(Math.random());
	
	protected void readFailingFile()
	throws IOException {
		BufferedReader rd = new BufferedReader(newFileReader(newFile(FileName)));
		rd.readLine();
	}
	class BusinessException extends RuntimeException {
		public BusinessException(String string,FilenotfoundException ex) {
			super(string, ex);
		}
	}
}
