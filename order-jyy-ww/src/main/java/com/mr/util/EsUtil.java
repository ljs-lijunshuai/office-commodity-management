package com.mr.util;

import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.FetchSourceContext;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

@Repository
public class EsUtil {

    @Autowired
    private RestHighLevelClient highClient;


    //删除
    public void deleteTest(Map<String,String> indexMap){
        DeleteRequest dr = new DeleteRequest(indexMap.get("index"), indexMap.get("type"), indexMap.get("id"));
        try {
            DeleteResponse delete = highClient.delete(dr, RequestOptions.DEFAULT);
            System.out.println(delete);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //条件查询,分页
    public void searchTest(String index){
        //创建查询Request
        SearchRequest sr = new SearchRequest(index);
        //创建查询条件
        SearchSourceBuilder ssb = new SearchSourceBuilder();
        ssb.query(QueryBuilders.matchAllQuery());
        ssb.from(0);
        ssb.size(2);
        ssb.sort("postDate", SortOrder.DESC);

        sr.source(ssb);
        try {
            SearchResponse search = highClient.search(sr, RequestOptions.DEFAULT);
            System.out.println(search);
            Iterator<SearchHit> iterator = search.getHits().iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next().getSourceAsString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //修改
    public String updateObj(Map<String,String> indexMap,String param){

        UpdateRequest ur = new UpdateRequest(indexMap.get("index"), indexMap.get("type"), indexMap.get("id"))
                .doc(param, XContentType.JSON);


        try {
            UpdateResponse update = highClient.update(ur, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //排除查询
    public String findByGet(Map<String,String> indexMap,String[] includes,String[] excludes){
        GetRequest gr = new GetRequest(indexMap.get("index"), indexMap.get("type"), indexMap.get("id"));
        FetchSourceContext fs = new FetchSourceContext(true,includes,excludes);
        gr.fetchSourceContext(fs);
        GetResponse gf = null;
        try {
            gf = highClient.get(gr, RequestOptions.DEFAULT);
            System.out.println(gf.getSource().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gf.getSource().toString();
    }

    //添加
    public void addIndex(String param,Map<String,String> indexMap){
        // 构建一个用于添加的对象
        // 创建一个request请求  用来往ES中写入内容
        // 参数分别有索引  类型 以及 id
        // 具体的内容放置在source里面
        IndexRequest indexRequest = new IndexRequest(indexMap.get("index"), indexMap.get("type"), indexMap.get("id"))
                .source(param, XContentType.JSON);
        try {
            // 通过client进行请求的发送
            IndexResponse index = highClient.index(indexRequest, RequestOptions.DEFAULT);
            System.out.println(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addIndexAsy(String param,Map<String,String> indexMap){
        // 构建一个用于添加的对象
        // 创建一个request请求  用来往ES中写入内容
        // 参数分别有索引  类型 以及 id
        // 具体的内容放置在source里面
        IndexRequest indexRequest = new IndexRequest(indexMap.get("index"), indexMap.get("type"), indexMap.get("id"))
                .source(param, XContentType.JSON);
        try {

            ActionListener<IndexResponse> listener = new ActionListener<IndexResponse>() {
                @Override
                public void onResponse(IndexResponse indexResponse) {
                    System.out.println("成功回调");
                    System.out.println(indexRequest);
                }
                @Override
                public void onFailure(Exception e) {
                    System.out.println("失败回调");
                }
            };
            // 通过client进行请求的发送
            highClient.indexAsync(indexRequest, RequestOptions.DEFAULT,listener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
