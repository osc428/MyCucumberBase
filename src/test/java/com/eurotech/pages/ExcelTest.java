package com.eurotech.pages;

import com.eurotech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class ExcelTest extends BasePage{
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();


        ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTestB5_-Last.xlsx", "Test Data");
        List<Map<String, String>> dataList = excelUtil.getDataList();

    }

}
