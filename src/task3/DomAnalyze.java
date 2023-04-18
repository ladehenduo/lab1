package task3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class DomAnalyze {
    public static void main(String args[]) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("D:\\Java Web\\Project\\test1\\src\\task3\\task3.xml");
        // 获得Document工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // 通过工厂获得DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();
        // 通过Builder获得 Document 对象
        Document document = builder.parse(file);
        /*
        * 1. xml 包括元素、属性、文本
        * 2. 元素定义是递归的，元素可以包含属性、文本，也可以包含若干元素
        * 3. 属性用来描述元素的相关信息qqq
        * */

        // 获取所有名为 major 的元素
        NodeList nodeList = document.getElementsByTagName("major");

        for(int i = 0; i < nodeList.getLength(); i++) {
            Element e = (Element) nodeList.item(i);
            NodeList list = e.getElementsByTagName("class");
//            System.out.println(list.getLength());
            for(int j = 0; j < list.getLength(); j++) {
                Element ele = (Element) list.item(j);
                System.out.println("名字:" + ele.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
                System.out.println("邮箱:" + ele.getElementsByTagName("email").item(0).getFirstChild().getNodeValue());
                System.out.println("专业:" + e.getAttribute("name"));
            }
        }

    }
}
