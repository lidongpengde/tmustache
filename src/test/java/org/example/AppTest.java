//package org.example;
//
//import static org.junit.Assert.assertTrue;
//
//import mustache.Mustache;
//import mustache.Template;
//import old.JsonParseUtil;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//{
//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
//    @Test
//    public void test1() {
//        String a = "{{sss.*.aaa}}";
//        String b = "{{payload.answer.*.questions}}";
//
//        String source = "{\n" +
//                "    \"id\":\"6c688bac-ea14-4018-83d8-eb1ea95e0486\",\n" +
//                "    \"object\":\"Answer\",\n" +
//                "    \"action\":\"answer.create\",\n" +
//                "    \"created_at\":\"2021-07-16 14:26:18\",\n" +
//                "    \"payload\":{\n" +
//                "        \"survey_id\":8861475,\n" +
//                "        \"answer_id\":4,\n" +
//                "        \"qq\":4001515041111,\n" +
//                "        \"openid\":\"\",\n" +
//                "        \"weixin_openid\":\"\",\n" +
//                "        \"started_at\":\"2021-07-16 14:25:22\",\n" +
//                "        \"ended_at\":\"2021-07-16 14:26:18\",\n" +
//                "        \"answer\":[\n" +
//                "            {\n" +
//                "                \"id\":\"1\",\n" +
//                "                \"questions\":[\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-1-sggo\",\n" +
//                "                        \"type\":\"text\",\n" +
//                "                        \"text\":\"u4ed8u9686u5fd7\"\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-2-CeSH\",\n" +
//                "                        \"type\":\"text\",\n" +
//                "                        \"text\":\"28\"\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-3-gsZ8\",\n" +
//                "                        \"type\":\"text\",\n" +
//                "                        \"text\":\"17317239133\"\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-4-xMtm\",\n" +
//                "                        \"type\":\"radio\",\n" +
//                "                        \"options\":[\n" +
//                "                            {\n" +
//                "                                \"id\":\"o-100-ABCD\",\n" +
//                "                                \"checked\":1,\n" +
//                "                                \"text\":\"&lt;p&gt;u7537&lt;/p&gt;n\"\n" +
//                "                            }\n" +
//                "                        ]\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-5-6PKZ\",\n" +
//                "                        \"type\":\"checkbox\",\n" +
//                "                        \"options\":[\n" +
//                "                            {\n" +
//                "                                \"id\":\"o-100-ABCD\",\n" +
//                "                                \"checked\":1,\n" +
//                "                                \"text\":\"&lt;p&gt;u7beeu7403&lt;/p&gt;n\"\n" +
//                "                            },\n" +
//                "                            {\n" +
//                "                                \"id\":\"o-101-EFGH\",\n" +
//                "                                \"checked\":1,\n" +
//                "                                \"text\":\"&lt;p&gt;u8db3u7403&lt;/p&gt;n\"\n" +
//                "                            },\n" +
//                "                            {\n" +
//                "                                \"id\":\"o-2-Wdzj\",\n" +
//                "                                \"checked\":1,\n" +
//                "                                \"text\":\"&lt;p&gt;u7fbdu6bdbu7403&lt;/p&gt;n\"\n" +
//                "                            },\n" +
//                "                            {\n" +
//                "                                \"id\":\"o-3-KZ6D\",\n" +
//                "                                \"checked\":1,\n" +
//                "                                \"text\":\"&lt;p&gt;u6392u7403&lt;/p&gt;n\"\n" +
//                "                            }\n" +
//                "                        ]\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-6-hK5k\",\n" +
//                "                        \"type\":\"chained_selects\",\n" +
//                "                        \"id_list\":[\n" +
//                "                            \"2-JG\",\n" +
//                "                            \"3-U4\",\n" +
//                "                            \"5-ri\"\n" +
//                "                        ],\n" +
//                "                        \"text_list\":[\n" +
//                "                            \"u6e56u5317\",\n" +
//                "                            \"u6b66u6c49\",\n" +
//                "                            \"u6b66u660cu533a\"\n" +
//                "                        ]\n" +
//                "                    },\n" +
//                "                    {\n" +
//                "                        \"id\":\"q-7-AsDY\",\n" +
//                "                        \"type\":\"textarea\",\n" +
//                "                        \"text\":\"aaa\"\n" +
//                "                    }\n" +
//                "                ]\n" +
//                "            }\n" +
//                "        ],\n" +
//                "        \"score\":null,\n" +
//                "        \"country\":\"u4e2du56fd\",\n" +
//                "        \"province\":\"u6e56u5317u7701\",\n" +
//                "        \"city\":\"u6b66u6c49u5e02\"\n" +
//                "    }\n" +
//                "}";
//
//        System.out.println(JsonParseUtil.jsonFormatter(source));
//    }
//    @Test
//    public void test4() {
//        String a = "{{*.aaa}}";
//        Template tmpl = Mustache.compiler().defaultValue("").escapeHTML(false).compile(a);
//
//        List<Map<String,String>> list = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            Map<String,String> map = new HashMap<>();
//            map.put("aaa","bbb"+i);
//            list.add(map);
//        }
//        String temp = tmpl.execute(list);
//        System.out.println(temp);
//    }
//}
