package service;

import java.util.List;

import org.springframework.stereotype.Service;

import mapper.PromotionMapper;
import model.PromotionProduct;

@Service
public class PromotionService {
	
	private final PromotionMapper promotionMapper;
	
    public PromotionService(PromotionMapper promotionMapper) {
        this.promotionMapper = promotionMapper;
    }

    public List<PromotionProduct> getActivePromotionProducts(String promoName, String prodNm, String startDt, String endDt) {
        return promotionMapper.selectActivePromotionProducts(promoName,	prodNm, startDt, endDt);
    }
}
