package com.company.project.controller;

import com.company.project.core.Result;
import com.company.project.core.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.SPI_spcAPP_spcQuery_spcService_spcInfoStub;

import java.rmi.Remote;

import static service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRList_Input;
import static service.SPI_spcAPP_spcQuery_spcService_spcInfoStub.QuerySRList_Output;

@RestController
public class QueryService implements Remote {

    @RequestMapping(value = "/querySRList", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    Result querySRList() {
        Result result = new Result();
        try {
            SPI_spcAPP_spcQuery_spcService_spcInfoStub stub = new SPI_spcAPP_spcQuery_spcService_spcInfoStub();
            QuerySRList_Input input;
            input = (QuerySRList_Input) getTestObject(QuerySRList_Input.class);
            QuerySRList_Output querySRList_output = stub.querySRList(input);
            result.setCode(ResultCode.SUCCESS);
            result.setMessage("HelloWorld").setMessage("");
            result.setData(querySRList_output);
        } catch (Exception e) {
            result.setCode(ResultCode.FAIL);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
            java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
