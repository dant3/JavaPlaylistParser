package wseemann.media.jplaylistparser.exception;

/**
 * Exception thrown when playlist haven't been read within given time,
 * probably when URL is in fact stream not playlist.
 * @author V-master
 */
public class JPlaylistReadTimeoutException extends JPlaylistParserException {

	private static final String MESSAGE = "Reached playlist reading timeout";
	private static final long serialVersionUID = 2L;

	public JPlaylistReadTimeoutException() {
		super (MESSAGE);
	}
	
    public JPlaylistReadTimeoutException(Throwable cause) {
        super(MESSAGE, cause);
    }

    public JPlaylistReadTimeoutException(String msg) {
    	super(msg);
    }
    
    public JPlaylistReadTimeoutException(String msg, Throwable cause) {
    	super(msg, cause);
    }
}
