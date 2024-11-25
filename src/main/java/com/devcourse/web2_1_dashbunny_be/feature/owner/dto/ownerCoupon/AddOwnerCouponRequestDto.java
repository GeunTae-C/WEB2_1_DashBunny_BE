package com.devcourse.web2_1_dashbunny_be.feature.owner.dto.ownerCoupon;

import com.devcourse.web2_1_dashbunny_be.domain.owner.OwnerCoupon;
import com.devcourse.web2_1_dashbunny_be.domain.owner.role.CouponStatus;
import com.devcourse.web2_1_dashbunny_be.domain.owner.role.DiscountType;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 새로운 쿠폰을 생성 정보를 받기 위한 dto.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddOwnerCouponRequestDto {

  private String couponName; //쿠폰명
  private Long discountPrice; //할인금액
  private DiscountType discountType; //할인타입 (정률 ,정액)
  private Long minOrderPrice; //최소 주문금액
  private Long maximumDiscount; //최대 할인 금액
  private LocalDateTime expiredDate; //만료기한
  private String couponDescription; //쿠폰 설명

  /**
   * OwnerCoupon 객체 생성 메서드.
   */
  public OwnerCoupon toEntity() {
    return OwnerCoupon.builder()
            .couponName(couponName)
            .discountPrice(discountPrice)
            .discountType(discountType)
            .minOrderPrice(minOrderPrice)
            .maximumDiscount(maximumDiscount)
            .couponStatus(CouponStatus.ACTIVE)
            .expiredDate(expiredDate)
            .couponDescription(couponDescription)
            .build();

  }


}