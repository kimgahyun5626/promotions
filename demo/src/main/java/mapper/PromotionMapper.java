package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import model.PromotionProduct;

@Mapper
public interface PromotionMapper {
	List<PromotionProduct> selectActivePromotionProducts(String promoName, String prodNm, String startDt, String endDt);
}
