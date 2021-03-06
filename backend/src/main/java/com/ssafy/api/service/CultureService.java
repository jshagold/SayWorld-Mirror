package com.ssafy.api.service;

import com.ssafy.api.request.CulturePostReq;
import com.ssafy.api.response.CultureListRes;
import com.ssafy.db.entity.Culture;

import java.util.List;


public interface CultureService {
    List<CultureListRes> getCultureInfo(String email);
    void postCulture(CulturePostReq culturePostReq, String email);
    void deleteCulture(String email, String cultureTitle, char cultureCategory);
}
