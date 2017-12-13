/**
 * SPI_spcAPP_spcQuery_spcService_spcInfoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package service;


/**
 *  SPI_spcAPP_spcQuery_spcService_spcInfoCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class SPI_spcAPP_spcQuery_spcService_spcInfoCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public SPI_spcAPP_spcQuery_spcService_spcInfoCallbackHandler(
        Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public SPI_spcAPP_spcQuery_spcService_spcInfoCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for validationSatisfactionCode method
     * override this method for handling normal response from validationSatisfactionCode operation
     */
    public void receiveResultvalidationSatisfactionCode(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.ValidationSatisfactionCode_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validationSatisfactionCode operation
     */
    public void receiveErrorvalidationSatisfactionCode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteSRAttachment method
     * override this method for handling normal response from deleteSRAttachment operation
     */
    public void receiveResultdeleteSRAttachment(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.DeleteSRAttachment_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteSRAttachment operation
     */
    public void receiveErrordeleteSRAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validationVersionsNo method
     * override this method for handling normal response from validationVersionsNo operation
     */
    public void receiveResultvalidationVersionsNo(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.ValidationVersionsNo_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validationVersionsNo operation
     */
    public void receiveErrorvalidationVersionsNo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRCharge method
     * override this method for handling normal response from querySRCharge operation
     */
    public void receiveResultquerySRCharge(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRCharge_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRCharge operation
     */
    public void receiveErrorquerySRCharge(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for queryNoBOMPartDetail method
     * override this method for handling normal response from queryNoBOMPartDetail operation
     */
    public void receiveResultqueryNoBOMPartDetail(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QueryNoBOMPartDetail_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from queryNoBOMPartDetail operation
     */
    public void receiveErrorqueryNoBOMPartDetail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRList method
     * override this method for handling normal response from querySRList operation
     */
    public void receiveResultquerySRList(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRList_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRList operation
     */
    public void receiveErrorquerySRList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRBOM method
     * override this method for handling normal response from querySRBOM operation
     */
    public void receiveResultquerySRBOM(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRBOM_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRBOM operation
     */
    public void receiveErrorquerySRBOM(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRPartConsume method
     * override this method for handling normal response from querySRPartConsume operation
     */
    public void receiveResultquerySRPartConsume(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRPartConsume_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRPartConsume operation
     */
    public void receiveErrorquerySRPartConsume(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRNOBOMDetail method
     * override this method for handling normal response from querySRNOBOMDetail operation
     */
    public void receiveResultquerySRNOBOMDetail(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRNOBOMDetail_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRNOBOMDetail operation
     */
    public void receiveErrorquerySRNOBOMDetail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRAttachment method
     * override this method for handling normal response from querySRAttachment operation
     */
    public void receiveResultquerySRAttachment(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRAttachment_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRAttachment operation
     */
    public void receiveErrorquerySRAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getSRAttachment method
     * override this method for handling normal response from getSRAttachment operation
     */
    public void receiveResultgetSRAttachment(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.GetSRAttachment_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getSRAttachment operation
     */
    public void receiveErrorgetSRAttachment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRPartDetail method
     * override this method for handling normal response from querySRPartDetail operation
     */
    public void receiveResultquerySRPartDetail(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRPartDetail_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRPartDetail operation
     */
    public void receiveErrorquerySRPartDetail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for querySRDetail method
     * override this method for handling normal response from querySRDetail operation
     */
    public void receiveResultquerySRDetail(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRDetail_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from querySRDetail operation
     */
    public void receiveErrorquerySRDetail(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateSR method
     * override this method for handling normal response from updateSR operation
     */
    public void receiveResultupdateSR(
        service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.UpdateSR_Output result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateSR operation
     */
    public void receiveErrorupdateSR(java.lang.Exception e) {
    }
}
