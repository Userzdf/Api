package com.ywj.api.excelUtils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class TestExcel {
    @ExcelProperty(value = "姓名")
    private String name;
    @ExcelProperty(value = "年龄")
    private int age;

    public static void main(String[] args) {

    }
    private void exportExcel(){
        List<TestExcel> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TestExcel testExcel = new TestExcel();
            testExcel.setName("张三" + i);
            testExcel.setAge(20 + i);
            dataList.add(testExcel);
        }
        EasyExcel.write("/Users/zhoudafeng/Desktop/easyexcel-user1.xls", TestExcel.class).sheet("用户信息").doWrite(dataList);
    }

    private void importExcel(){
    }
}
