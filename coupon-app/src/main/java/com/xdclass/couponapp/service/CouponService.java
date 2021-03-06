package com.xdclass.couponapp.service;

import com.xdclass.couponapp.domain.TCoupon;
import com.xdclass.couponapp.domain.TCouponExample;
import com.xdclass.couponapp.mapper.TCouponMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CouponService {

    @Resource
    private TCouponMapper tCouponMapper;

    public void print(){
        System.err.println("enter coupon service");
    }


    public String query(){
        System.out.println("git添加");
        System.out.println("git添加第二次");
        TCouponExample example = new TCouponExample();
        example.createCriteria().andCodeEqualTo("0057da3c-f2ad-42bd-b6d2-8bb58b6dbc90");
        List<TCoupon> tCoupon =  tCouponMapper.selectByExample(example);
        return tCoupon.get(0).toString();
    }


}
