package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import model.PromotionProduct;
import model.SearchPromotionVO;

@Mapper
public interface PromotionMapper {
	List<PromotionProduct> selectActivePromotionProducts(SearchPromotionVO searchPromotionVO);
}
