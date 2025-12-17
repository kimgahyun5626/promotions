package service;

import java.util.List;

import org.springframework.stereotype.Service;

import mapper.PromotionMapper;
import model.PromotionProduct;
import model.SearchPromotionVO;

@Service
public class PromotionService {
	
	private final PromotionMapper promotionMapper;
	
    public PromotionService(PromotionMapper promotionMapper) {
        this.promotionMapper = promotionMapper;
    }

    public List<PromotionProduct> getActivePromotionProducts(SearchPromotionVO searchPromotionVO) {
        return promotionMapper.selectActivePromotionProducts(searchPromotionVO);
    }
}
