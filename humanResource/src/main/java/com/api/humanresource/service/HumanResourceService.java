package com.api.humanresource.service;

import com.api.humanresource.Entity.HumanResource;
import com.api.humanresource.repository.HumanResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanResourceService {

    @Autowired
    private final HumanResourceRepository hmr;

    public HumanResourceService(HumanResourceRepository hmr) {
        this.hmr = hmr;
    }

    public List<HumanResource> getAllHr(){
        return hmr.findAll();
    }

    public HumanResource getHrById(long id){
        return hmr.findById(id).orElse(null);
    }

    public HumanResource getByEmail(String email){
        return hmr.getHumanResourceByEmail(email);
    }
    public HumanResource createHr(HumanResource hr){
        return hmr.save(hr);
    }

    public HumanResource updateHr(HumanResource hr, Long id){
        HumanResource old = hmr.findById(id).orElse(null);
        if(old!=null){
            hr.setId(old.getId());
            return hmr.save(hr);
        }
        return null;
    }

    public HumanResource deleteHr(long id){
        hmr.deleteById(id);
        return null;
    }
}
