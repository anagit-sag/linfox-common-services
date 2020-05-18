package packageApple;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class service

{
	// ---( internal utility methods )---

	final static service _instance = new service();

	static service _newInstance() { return new service(); }

	static service _cast(Object o) { return (service)o; }

	// ---( server methods )---




	public static final void log (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(log)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inputA
		// [i] field:0:required inputB
		// [o] field:0:required outputC
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		String inputA =  IDataUtil.getString(pipelineCursor, "inputA");
		String inputB =  IDataUtil.getString(pipelineCursor, "inputB");
		pipelineCursor.destroy();
		
		
		int inputAint = Integer.parseInt(inputA);  
		int inputBint = Integer.parseInt(inputB);  
		int output = inputAint + inputBint ;
		String outputC = Integer.toString(output);
		IDataCursor pipelineCursor1 = pipeline.getCursor();	
		
		
		IDataUtil.put(pipelineCursor1, "outputC", outputC);
		
		pipelineCursor1.destroy();
		// --- <<IS-END>> ---

                
	}
}

