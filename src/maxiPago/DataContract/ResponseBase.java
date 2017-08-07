package maxiPago.DataContract;

import maxiPago.DataContract.NonTransactional.ApiResponse;
import maxiPago.DataContract.Reports.RapiResponse;
import maxiPago.DataContract.Transactional.ErrorResponse;
import maxiPago.DataContract.Transactional.TransactionResponse;

public abstract class ResponseBase {

	// Special methods
	public boolean IsTransactionResponse() {
		return this instanceof TransactionResponse;
	}

	public boolean IsErrorResponse() {
		return this instanceof ErrorResponse;
	}

	public boolean IsApiResponse() {
		return this instanceof ApiResponse;
	}

	public boolean IsReportResponse() {
		return this instanceof RapiResponse;
	}
}
