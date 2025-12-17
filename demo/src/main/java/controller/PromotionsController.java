package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.PromotionProduct;
import model.SearchPromotionVO;
import service.PromotionService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/api")
public class PromotionsController {
	
    private PromotionService promotionService;
	
	@GetMapping("/v1/promotions")
	public ResponseEntity<List<PromotionProduct>> promotions(
			@RequestBody SearchPromotionVO searchPromotionVO
			) {
		List<PromotionProduct> promotionProducts = promotionService.getActivePromotionProducts(
				searchPromotionVO
				);
        if (promotionProducts.isEmpty()) {
            return ResponseEntity.noContent().build(); // 프로모션 상품이 없을 경우 204 리턴
        }
		
		return ResponseEntity.ok(promotionProducts);
	}
}
