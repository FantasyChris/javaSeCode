package jsonTest;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        RecVo recVo = new RecVo();
        TestData data1 = new TestData();
        ArrayList<TestData> list = new ArrayList<>();
        data1.setArrtibute(11);
        data1.setId("1");
        data1.setSort(111);
        list.add(data1);

        TestData data2 = new TestData();
        data2.setArrtibute(22);
        data2.setId("2");
        data2.setSort(222);
        list.add(data2);

        recVo.setRecVo(list);

        //对象转为String
        String s = JSON.toJSONString(recVo);
        System.out.println(s);

        //数组转为字符串
        String s1 = JSON.toJSONString(list);
        System.out.println(s1);

        //String转为对象
        RecVo recVo1 = JSON.parseObject(s, RecVo.class);
        System.out.println(recVo1.getRecVo().size());

        //字符串转为数组
        List<TestData> list1 = JSON.parseArray(s1, TestData.class);
        System.out.println(list1.get(0).getArrtibute());


    }
}
