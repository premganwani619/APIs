package com.interview.demo.service;

import com.interview.demo.entity.Auther;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class AutherService {
    ArrayList<Auther> autherList =  new ArrayList<Auther>();
    public Auther saveAuther(Auther autherObj){
        autherObj.setAutherId(autherList.size()+1);
        autherList.add(autherObj);
        return  autherObj;
    }
    public  Auther getAuther(int id){
        return autherList.get(id);
    }
    public  Auther deleteAuther(int id){
        return autherList.remove(id);
    }
    public Auther updateAuther(int id,Auther autherObj){
        return  autherList.set(id,autherObj);
    }
}
