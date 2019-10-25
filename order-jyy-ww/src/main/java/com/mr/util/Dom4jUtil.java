package com.mr.util;

/**
 * Created by lijunshuai on 2019/9/5.
 */
public class Dom4jUtil {

   /* //创建文档
    public static Document getDocument() {
        Document dom = DocumentHelper.createDocument();
        return dom;
    }

    public static void createList(List<?> city) throws IllegalAccessException {
        Document document = getDocument();

        //跟节点
        String name = city.get(0).getClass().getName().toString();
        System.out.println(name);
        int end = name.lastIndexOf(".");
        String substring = name.substring(end + 1);
        System.out.println(substring);
        Element element = document.addElement(substring + "s");
        for (int i = 0; i < city.size(); i++) {
            //生成子节点
            Element city1 = element.addElement(substring);
            Field[] fields = city.get(i).getClass().getDeclaredFields();
            for (int j = 0; j < fields.length; j++) {
                //设置是否允许访问，不是修改原来的访问权限修饰词。
                fields[j].setAccessible(true);
                System.out.println(fields[j].getName() + ":" + fields[j].get(city.get(i)));
                Element element1 = city1.addAttribute(fields[j].getName(), fields[j].get(city.get(i)) + "");
            }
        }
        createXML("D://", substring + ".xml", document);
    }

    *//*public static void createOne(){

    }*//*


    public static void createXML(String path, String xmlName, Document dom) {

        OutputFormat print = OutputFormat.createPrettyPrint();
        print.setEncoding("UTF-8");
        print.setIndent(true);
        try {
            XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path + "/" + xmlName));
            xmlWriter.write(dom);
            xmlWriter.close();
            dom.clone();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/

}
